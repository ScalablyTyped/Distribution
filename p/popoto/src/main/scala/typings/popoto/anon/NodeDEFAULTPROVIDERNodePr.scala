package typings.popoto.anon

import org.scalablytyped.runtime.StringDictionary
import typings.popoto.providerMod.Node
import typings.popoto.queryMod.Query.NEO4J_INTERNAL_ID
import typings.std.SVGGElement
import typings.std.SVGPathElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined popoto.popoto/provider.Node & {  DEFAULT_PROVIDER :popoto.popoto/provider.Node,   Provider :{[key: string] : std.Partial<popoto.popoto/provider.Node>}} */
trait NodeDEFAULTPROVIDERNodePr extends StObject {
  
  /**
    * Label provider used by default if none have been defined for a label.
    * This provider can be changed if needed to customize default behavior.
    * If some properties are not found in user customized providers, default
    * values will be extracted from this provider.
    */
  var DEFAULT_PROVIDER: Node
  
  /**
    * Define the different type of rendering of a node for a given label.
    * TEXT: default rendering type, the node will be displayed with an ellipse and a text in it.
    * IMAGE: the node is displayed as an image using the image tag in the svg graph.
    * In this case an image path is required.
    * SVG: the node is displayed using a list of svg path, each path can contain its own color.
    */
  var DisplayTypes: ReadonlyTEXT0IMAGE1SVG2SY
  
  var Provider: StringDictionary[PartialNode]
  
  /**
    * Defines whether this label will automatically expend its relations
    * when displayed on graph.
    * If set to true, once displayed additional request will be sent on
    * the database to retrieve its relations.
    *
    * The default value is false.
    */
  var autoExpandRelations: Boolean
  
  /**
    * Defines the attribute of the node to use in query constraint for
    * nodes of this label.
    * This attribute is used in the generated cypher query to build the
    * constraints with selected values.
    *
    * The default value is the Neo4j internal id.
    * This id is used by default because it is a convenient way to
    * identify a node when nothing is known about its attributes.
    * But you should really consider using your application attributes
    * instead, it is a bad practice to rely on this attribute.
    */
  var constraintAttribute: NEO4J_INTERNAL_ID
  
  /**
    * Defines the attribute of the node to use by default to display the node.
    * This attribute must be present in returnAttributes list.
    *
    * The default value is undefined.
    * If undefined the first attribute of the returnAttributes will be used or
    * constraintAttribute if the list is empty.
    */
  var displayAttribute: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**********************************************************************
    * Results specific parameters:
    *
    * These attributes are specific to result display.
    **********************************************************************/
  /**
    * Generate the result entry content using d3.js mechanisms.
    *
    * The parameter of the function is the &lt;p&gt; selected with d3.js
    *
    * The default behavior is to generate a &lt;table&gt; containing all
    * the return attributes in a &lt;th&gt; and their value in a &lt;td&gt;.
    *
    * @param pElmt the &lt;p&gt; element generated in the result list.
    */
  def displayResults(pElmt: SVGPathElement): Unit
  
  /**
    * Filters the query generated to retrieve the values on a node.
    *
    * @param node
    * @param initialQuery contains the query as an object structure.
    * @returns filtered node count query
    */
  def filterNodeCountQuery(node: Node, initialQuery: Any): Any
  
  /**
    * Filters the query used to retrieve the values on a node.
    *
    * @param node
    * @param initialQuery contains the query as an object structure.
    * @returns filtered node relation  query
    */
  def filterNodeRelationQuery(node: Node, initialQuery: Any): Any
  
  /**
    * Filters the query generated to retrieve the values on a node.
    *
    * @param node
    * @param initialQuery contains the query as an object structure.
    * @returns filtered node value query
    */
  def filterNodeValueQuery(node: Node, initialQuery: Any): Any
  
  /**
    * Filters the query generated to retrieve the queries.
    *
    * @param initialQuery contains the query as an object structure.
    * @returns filtered result query
    */
  def filterResultQuery(initialQuery: Any): Any
  
  /**
    * Customize, in query, the generated negative constraint for the node.
    *
    * If undefined use default negative constraint generation.
    */
  var generateNegativeNodeValueConstraints: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Customize, in query, the generated constraint for the node.
    *
    * If undefined use default constraint generation.
    */
  var generateNodeValueConstraints: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Generate a CSS class for the node depending on its type.
    *
    * @param node
    * @param element
    * @return string
    */
  def getCSSClass(node: Node, element: SVGGElement): String
  
  /**
    * Return a color for the node.
    *
    * @param node
    * @returns node's color
    */
  def getColor(node: Node): String
  
  /**
    * Return the attribute to use as constraint attribute for a node defined in its label provider.
    *
    * @param label
    * @returns constraint attributes
    */
  def getConstraintAttribute(label: String): Any
  
  def getDisplayAttribute(label: String): Any
  
  /**
    * Return the displayResults function defined in label parameter's provider.
    *
    * @param label
    * @returns display results
    */
  def getDisplayResults(label: String): Any
  
  /**********************************************************************
    * Node specific parameters:
    *
    * These attributes are specific to nodes (in graph or query viewer)
    * for a given label.
    * But they can be customized for nodes of the same label.
    * The parameters are defined by a function that will be called with
    * the node as parameter.
    * In this function the node internal attributes can be used to
    * customize the value to return.
    **********************************************************************/
  /**
    * Function returning the display type of a node.
    * This type defines how the node will be drawn in the graph.
    *
    * The result must be one of the following values:
    *
    * provider.node.DisplayTypes.IMAGE
    *  In this case the node will be drawn as an image and "getImagePath"
    *  function is required to return the node image path.
    *
    * provider.node.DisplayTypes.SVG
    *  In this case the node will be drawn as SVG paths and "getSVGPaths"
    *
    * provider.node.DisplayTypes.TEXT
    *  In this case the node will be drawn as a simple circle.
    *
    * Default value is TEXT.
    *
    * @param node the node to extract its type.
    * @returns one value from provider.node.DisplayTypes
    */
  def getDisplayType(node: Node): Double
  
  def getGenerateNegativeNodeValueConstraints(node: Node): js.Array[String]
  
  def getGenerateNodeValueConstraints(node: Node): Any
  
  /**
    * Function returning the image height of the node.
    * This function is only used for provider.node.DisplayTypes.IMAGE
    * type nodes.
    *
    * @param node
    * @returns image height
    */
  def getImageHeight(node: Node): Double
  
  /**
    * Function returning the image file path to use for a node.
    * This function is only used for provider.node.DisplayTypes.IMAGE
    * type nodes.
    *
    * @param node
    * @returns image paths
    */
  def getImagePath(node: Node): String
  
  /**
    * Function returning the image width of the node.
    * This function is only used for provider.node.DisplayTypes.IMAGE
    * type nodes.
    *
    * @param node
    * @returns image width
    */
  def getImageWidth(node: Node): Double
  
  /**
    * Return the "autoExpandRelations" property for the node label provider.
    * Auto expand relations defines whether the label will automatically add its relations when displayed on graph.
    *
    * @param label
    * @returns boolean
    */
  def getIsAutoExpandRelations(label: String): Boolean
  
  /**
    *
    * @param label
    */
  def getIsAutoLoadValue(label: String): Boolean
  
  /**
    * Function defining whether the node is a group node.
    * In this case no count are displayed and no value can be selected on
    * the node.
    *
    * Default value is false.
    */
  def getIsGroup(node: Node): Boolean
  
  /**
    * Return the "isSearchable" property for the node label provider.
    * Is Searchable defines whether the label can be used as graph query builder root.
    * If true the label can be displayed in the taxonomy filter.
    *
    * @param label
    * @returns boolean
    */
  def getIsSearchable(label: String): Boolean
  
  /**
    * Function defining whether the node text representation must be
    * displayed on graph.
    * If true the value returned for getTextValue on node will be displayed
    * on graph.
    *
    * This text will be added in addition to the getDisplayType
    * representation.
    * It can be displayed on all type of node display, images, SVG or text.
    *
    * Default value is true
    *
    * @param node the node to display on graph.
    * @returns true if text must be displayed on graph for the
    * node.
    */
  def getIsTextDisplayed(node: Node): Boolean
  
  /**
    * Return the node display type.
    * can be TEXT, IMAGE, SVG or GROUP.
    *
    * @param node
    * @returns node display type
    */
  def getNodeDisplayType(node: Node): Any
  
  /**
    * Return the list of predefined constraints to add for the given label.
    * These constraints will be added in every generated Cypher query.
    *
    * For example if the returned list contain ["$identifier.born > 1976"]
    * for "Person" nodes everywhere in popoto.js the generated Cypher
    * query will add the constraint "WHERE person.born > 1976"
    *
    * @returns
    */
  var getPredefinedConstraints: js.Array[Any]
  
  /**
    * Get the property or function defined in node label provider.
    * If the property is not found search is done in parents.
    * If not found in parent, property defined in provider.node.DEFAULT_PROVIDER is returned.
    * If not found in default provider, defaultValue is set and returned.
    *
    * @param label node label to get the property in its provider.
    * @param name name of the property to retrieve.
    * @returns node property defined in its label provider.
    */
  def getProperty(label: String, name: String): Any
  
  /**
    * Get the label provider for the given label.
    * If no provider is defined for the label:
    * First search in parent provider.
    * Then if not found will create one from default provider.
    *
    * @param label to retrieve the corresponding label provider.
    * @returns corresponding label provider.
    */
  def getProvider(label: String): Node
  
  def getResultOrderByAttribute(label: String): Any
  
  /**
    * Return the list of attributes defined in node label provider.
    * Parents return attributes are also returned.
    *
    * @param label used to retrieve parent attributes.
    * @returns list of return attributes for a node.
    */
  def getReturnAttributes(label: String): js.Array[Any]
  
  /**
    * Function returning a array of path objects to display in the node.
    *
    * @param node
    * @returns svg paths
    */
  def getSVGPaths(node: Node): js.Array[Any]
  
  def getSchema(label: String): Any
  
  /**
    * Function used to return a descriptive text representation of a link.
    * This representation should be more complete than getTextValue and can
    * contain semantic data.
    * This function is used for example to generate the label in the query
    * viewer.
    *
    * The default behavior is to return the getTextValue not truncated.
    *
    * @param node the node to represent as text.
    * @returns the text semantic representation of the node.
    */
  def getSemanticValue(node: Node): String
  
  /**
    * Function defining the size of the node in graph.
    *
    * The size define the radius of the circle defining the node.
    * other elements (menu, counts...) will scale on this size.
    *
    * Default value is 50.
    *
    * @param node
    */
  def getSize(node: Node): Double
  
  /**
    * Function used to return the text representation of a node.
    *
    * The default behavior is to return the label of the node
    * or the value of constraint attribute of the node if it contains
    * value.
    *
    * The returned value is truncated using
    * graph.node.NODE_MAX_CHARS property.
    *
    * @param node the node to represent as text.
    * @param maxLength used to truncate the text.
    * @returns the text representation of the node.
    */
  def getTextValue(node: Node, maxLength: Double): String
  
  def getValueOrderByAttribute(label: String): Any
  
  /**
    * Defines whether this label will automatically load its available
    * data displayed on graph.
    * If set to true, once displayed additional request will be sent on
    * the database to retrieve its possible values.
    *
    * The default value is false.
    */
  var isAutoLoadValue: Boolean
  
  /**
    * Defines whether the result query order by is ascending, if false
    * order by will be descending.
    * It can be a boolean value or a list of boolean to match the resultOrderByAttribute.
    * If size of isResultOrderAscending < size of resultOrderByAttribute last value is used.
    *
    * Default value is true (ascending)
    */
  var isResultOrderAscending: Boolean
  
  /**
    * Defines whether this label can be used as root element of the graph
    * query builder.
    * This property is also used to determine whether the label can be
    * displayed in the taxonomy filter.
    *
    * The default value is true.
    */
  var isSearchable: Boolean
  
  /**
    * Check in label provider if text must be displayed with images nodes.
    * @param node
    * @returns wether or not text is displayed
    */
  def isTextDisplayed(node: Node): Boolean
  
  /**
    * Defines whether the value query order by is ascending, if false order
    * by will be descending.
    *
    * Default value is false (descending)
    */
  var isValueOrderAscending: Boolean
  
  /**
    * Defines the attributes used to order the results.
    * It can be an attribute name or a list of attribute names.
    *
    * Default value is "null" to disable order by.
    */
  var resultOrderByAttribute: Null | String
  
  /**
    * Defines the list of attribute to return for node of this label.
    * All the attributes listed here will be added in generated cypher
    * queries and available in result list and in node provider's
    * functions.
    *
    * The default value contains only the Neo4j internal id.
    * This id is used by default because it is a convenient way to identify
    * a node when nothing is known about its attributes.
    * But you should really consider using your application attributes
    * instead, it is a bad practice to rely on this attribute.
    */
  var returnAttributes: js.Array[Any]
  
  /**
    * Defines the attribute used to order the value displayed on node.
    *
    * Default value is "count" attribute.
    */
  var valueOrderByAttribute: String
}
object NodeDEFAULTPROVIDERNodePr {
  
  inline def apply(
    DEFAULT_PROVIDER: Node,
    DisplayTypes: ReadonlyTEXT0IMAGE1SVG2SY,
    Provider: StringDictionary[PartialNode],
    autoExpandRelations: Boolean,
    constraintAttribute: NEO4J_INTERNAL_ID,
    displayResults: SVGPathElement => Unit,
    filterNodeCountQuery: (Node, Any) => Any,
    filterNodeRelationQuery: (Node, Any) => Any,
    filterNodeValueQuery: (Node, Any) => Any,
    filterResultQuery: Any => Any,
    getCSSClass: (Node, SVGGElement) => String,
    getColor: Node => String,
    getConstraintAttribute: String => Any,
    getDisplayAttribute: String => Any,
    getDisplayResults: String => Any,
    getDisplayType: Node => Double,
    getGenerateNegativeNodeValueConstraints: Node => js.Array[String],
    getGenerateNodeValueConstraints: Node => Any,
    getImageHeight: Node => Double,
    getImagePath: Node => String,
    getImageWidth: Node => Double,
    getIsAutoExpandRelations: String => Boolean,
    getIsAutoLoadValue: String => Boolean,
    getIsGroup: Node => Boolean,
    getIsSearchable: String => Boolean,
    getIsTextDisplayed: Node => Boolean,
    getNodeDisplayType: Node => Any,
    getPredefinedConstraints: js.Array[Any],
    getProperty: (String, String) => Any,
    getProvider: String => Node,
    getResultOrderByAttribute: String => Any,
    getReturnAttributes: String => js.Array[Any],
    getSVGPaths: Node => js.Array[Any],
    getSchema: String => Any,
    getSemanticValue: Node => String,
    getSize: Node => Double,
    getTextValue: (Node, Double) => String,
    getValueOrderByAttribute: String => Any,
    isAutoLoadValue: Boolean,
    isResultOrderAscending: Boolean,
    isSearchable: Boolean,
    isTextDisplayed: Node => Boolean,
    isValueOrderAscending: Boolean,
    returnAttributes: js.Array[Any],
    valueOrderByAttribute: String
  ): NodeDEFAULTPROVIDERNodePr = {
    val __obj = js.Dynamic.literal(DEFAULT_PROVIDER = DEFAULT_PROVIDER.asInstanceOf[js.Any], DisplayTypes = DisplayTypes.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any], autoExpandRelations = autoExpandRelations.asInstanceOf[js.Any], constraintAttribute = constraintAttribute.asInstanceOf[js.Any], displayResults = js.Any.fromFunction1(displayResults), filterNodeCountQuery = js.Any.fromFunction2(filterNodeCountQuery), filterNodeRelationQuery = js.Any.fromFunction2(filterNodeRelationQuery), filterNodeValueQuery = js.Any.fromFunction2(filterNodeValueQuery), filterResultQuery = js.Any.fromFunction1(filterResultQuery), getCSSClass = js.Any.fromFunction2(getCSSClass), getColor = js.Any.fromFunction1(getColor), getConstraintAttribute = js.Any.fromFunction1(getConstraintAttribute), getDisplayAttribute = js.Any.fromFunction1(getDisplayAttribute), getDisplayResults = js.Any.fromFunction1(getDisplayResults), getDisplayType = js.Any.fromFunction1(getDisplayType), getGenerateNegativeNodeValueConstraints = js.Any.fromFunction1(getGenerateNegativeNodeValueConstraints), getGenerateNodeValueConstraints = js.Any.fromFunction1(getGenerateNodeValueConstraints), getImageHeight = js.Any.fromFunction1(getImageHeight), getImagePath = js.Any.fromFunction1(getImagePath), getImageWidth = js.Any.fromFunction1(getImageWidth), getIsAutoExpandRelations = js.Any.fromFunction1(getIsAutoExpandRelations), getIsAutoLoadValue = js.Any.fromFunction1(getIsAutoLoadValue), getIsGroup = js.Any.fromFunction1(getIsGroup), getIsSearchable = js.Any.fromFunction1(getIsSearchable), getIsTextDisplayed = js.Any.fromFunction1(getIsTextDisplayed), getNodeDisplayType = js.Any.fromFunction1(getNodeDisplayType), getPredefinedConstraints = getPredefinedConstraints.asInstanceOf[js.Any], getProperty = js.Any.fromFunction2(getProperty), getProvider = js.Any.fromFunction1(getProvider), getResultOrderByAttribute = js.Any.fromFunction1(getResultOrderByAttribute), getReturnAttributes = js.Any.fromFunction1(getReturnAttributes), getSVGPaths = js.Any.fromFunction1(getSVGPaths), getSchema = js.Any.fromFunction1(getSchema), getSemanticValue = js.Any.fromFunction1(getSemanticValue), getSize = js.Any.fromFunction1(getSize), getTextValue = js.Any.fromFunction2(getTextValue), getValueOrderByAttribute = js.Any.fromFunction1(getValueOrderByAttribute), isAutoLoadValue = isAutoLoadValue.asInstanceOf[js.Any], isResultOrderAscending = isResultOrderAscending.asInstanceOf[js.Any], isSearchable = isSearchable.asInstanceOf[js.Any], isTextDisplayed = js.Any.fromFunction1(isTextDisplayed), isValueOrderAscending = isValueOrderAscending.asInstanceOf[js.Any], returnAttributes = returnAttributes.asInstanceOf[js.Any], valueOrderByAttribute = valueOrderByAttribute.asInstanceOf[js.Any], resultOrderByAttribute = null)
    __obj.asInstanceOf[NodeDEFAULTPROVIDERNodePr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeDEFAULTPROVIDERNodePr] (val x: Self) extends AnyVal {
    
    inline def setAutoExpandRelations(value: Boolean): Self = StObject.set(x, "autoExpandRelations", value.asInstanceOf[js.Any])
    
    inline def setConstraintAttribute(value: NEO4J_INTERNAL_ID): Self = StObject.set(x, "constraintAttribute", value.asInstanceOf[js.Any])
    
    inline def setDEFAULT_PROVIDER(value: Node): Self = StObject.set(x, "DEFAULT_PROVIDER", value.asInstanceOf[js.Any])
    
    inline def setDisplayAttribute(value: js.Array[Any]): Self = StObject.set(x, "displayAttribute", value.asInstanceOf[js.Any])
    
    inline def setDisplayAttributeUndefined: Self = StObject.set(x, "displayAttribute", js.undefined)
    
    inline def setDisplayAttributeVarargs(value: Any*): Self = StObject.set(x, "displayAttribute", js.Array(value*))
    
    inline def setDisplayResults(value: SVGPathElement => Unit): Self = StObject.set(x, "displayResults", js.Any.fromFunction1(value))
    
    inline def setDisplayTypes(value: ReadonlyTEXT0IMAGE1SVG2SY): Self = StObject.set(x, "DisplayTypes", value.asInstanceOf[js.Any])
    
    inline def setFilterNodeCountQuery(value: (Node, Any) => Any): Self = StObject.set(x, "filterNodeCountQuery", js.Any.fromFunction2(value))
    
    inline def setFilterNodeRelationQuery(value: (Node, Any) => Any): Self = StObject.set(x, "filterNodeRelationQuery", js.Any.fromFunction2(value))
    
    inline def setFilterNodeValueQuery(value: (Node, Any) => Any): Self = StObject.set(x, "filterNodeValueQuery", js.Any.fromFunction2(value))
    
    inline def setFilterResultQuery(value: Any => Any): Self = StObject.set(x, "filterResultQuery", js.Any.fromFunction1(value))
    
    inline def setGenerateNegativeNodeValueConstraints(value: js.Array[Any]): Self = StObject.set(x, "generateNegativeNodeValueConstraints", value.asInstanceOf[js.Any])
    
    inline def setGenerateNegativeNodeValueConstraintsUndefined: Self = StObject.set(x, "generateNegativeNodeValueConstraints", js.undefined)
    
    inline def setGenerateNegativeNodeValueConstraintsVarargs(value: Any*): Self = StObject.set(x, "generateNegativeNodeValueConstraints", js.Array(value*))
    
    inline def setGenerateNodeValueConstraints(value: js.Array[Any]): Self = StObject.set(x, "generateNodeValueConstraints", value.asInstanceOf[js.Any])
    
    inline def setGenerateNodeValueConstraintsUndefined: Self = StObject.set(x, "generateNodeValueConstraints", js.undefined)
    
    inline def setGenerateNodeValueConstraintsVarargs(value: Any*): Self = StObject.set(x, "generateNodeValueConstraints", js.Array(value*))
    
    inline def setGetCSSClass(value: (Node, SVGGElement) => String): Self = StObject.set(x, "getCSSClass", js.Any.fromFunction2(value))
    
    inline def setGetColor(value: Node => String): Self = StObject.set(x, "getColor", js.Any.fromFunction1(value))
    
    inline def setGetConstraintAttribute(value: String => Any): Self = StObject.set(x, "getConstraintAttribute", js.Any.fromFunction1(value))
    
    inline def setGetDisplayAttribute(value: String => Any): Self = StObject.set(x, "getDisplayAttribute", js.Any.fromFunction1(value))
    
    inline def setGetDisplayResults(value: String => Any): Self = StObject.set(x, "getDisplayResults", js.Any.fromFunction1(value))
    
    inline def setGetDisplayType(value: Node => Double): Self = StObject.set(x, "getDisplayType", js.Any.fromFunction1(value))
    
    inline def setGetGenerateNegativeNodeValueConstraints(value: Node => js.Array[String]): Self = StObject.set(x, "getGenerateNegativeNodeValueConstraints", js.Any.fromFunction1(value))
    
    inline def setGetGenerateNodeValueConstraints(value: Node => Any): Self = StObject.set(x, "getGenerateNodeValueConstraints", js.Any.fromFunction1(value))
    
    inline def setGetImageHeight(value: Node => Double): Self = StObject.set(x, "getImageHeight", js.Any.fromFunction1(value))
    
    inline def setGetImagePath(value: Node => String): Self = StObject.set(x, "getImagePath", js.Any.fromFunction1(value))
    
    inline def setGetImageWidth(value: Node => Double): Self = StObject.set(x, "getImageWidth", js.Any.fromFunction1(value))
    
    inline def setGetIsAutoExpandRelations(value: String => Boolean): Self = StObject.set(x, "getIsAutoExpandRelations", js.Any.fromFunction1(value))
    
    inline def setGetIsAutoLoadValue(value: String => Boolean): Self = StObject.set(x, "getIsAutoLoadValue", js.Any.fromFunction1(value))
    
    inline def setGetIsGroup(value: Node => Boolean): Self = StObject.set(x, "getIsGroup", js.Any.fromFunction1(value))
    
    inline def setGetIsSearchable(value: String => Boolean): Self = StObject.set(x, "getIsSearchable", js.Any.fromFunction1(value))
    
    inline def setGetIsTextDisplayed(value: Node => Boolean): Self = StObject.set(x, "getIsTextDisplayed", js.Any.fromFunction1(value))
    
    inline def setGetNodeDisplayType(value: Node => Any): Self = StObject.set(x, "getNodeDisplayType", js.Any.fromFunction1(value))
    
    inline def setGetPredefinedConstraints(value: js.Array[Any]): Self = StObject.set(x, "getPredefinedConstraints", value.asInstanceOf[js.Any])
    
    inline def setGetPredefinedConstraintsVarargs(value: Any*): Self = StObject.set(x, "getPredefinedConstraints", js.Array(value*))
    
    inline def setGetProperty(value: (String, String) => Any): Self = StObject.set(x, "getProperty", js.Any.fromFunction2(value))
    
    inline def setGetProvider(value: String => Node): Self = StObject.set(x, "getProvider", js.Any.fromFunction1(value))
    
    inline def setGetResultOrderByAttribute(value: String => Any): Self = StObject.set(x, "getResultOrderByAttribute", js.Any.fromFunction1(value))
    
    inline def setGetReturnAttributes(value: String => js.Array[Any]): Self = StObject.set(x, "getReturnAttributes", js.Any.fromFunction1(value))
    
    inline def setGetSVGPaths(value: Node => js.Array[Any]): Self = StObject.set(x, "getSVGPaths", js.Any.fromFunction1(value))
    
    inline def setGetSchema(value: String => Any): Self = StObject.set(x, "getSchema", js.Any.fromFunction1(value))
    
    inline def setGetSemanticValue(value: Node => String): Self = StObject.set(x, "getSemanticValue", js.Any.fromFunction1(value))
    
    inline def setGetSize(value: Node => Double): Self = StObject.set(x, "getSize", js.Any.fromFunction1(value))
    
    inline def setGetTextValue(value: (Node, Double) => String): Self = StObject.set(x, "getTextValue", js.Any.fromFunction2(value))
    
    inline def setGetValueOrderByAttribute(value: String => Any): Self = StObject.set(x, "getValueOrderByAttribute", js.Any.fromFunction1(value))
    
    inline def setIsAutoLoadValue(value: Boolean): Self = StObject.set(x, "isAutoLoadValue", value.asInstanceOf[js.Any])
    
    inline def setIsResultOrderAscending(value: Boolean): Self = StObject.set(x, "isResultOrderAscending", value.asInstanceOf[js.Any])
    
    inline def setIsSearchable(value: Boolean): Self = StObject.set(x, "isSearchable", value.asInstanceOf[js.Any])
    
    inline def setIsTextDisplayed(value: Node => Boolean): Self = StObject.set(x, "isTextDisplayed", js.Any.fromFunction1(value))
    
    inline def setIsValueOrderAscending(value: Boolean): Self = StObject.set(x, "isValueOrderAscending", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: StringDictionary[PartialNode]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    
    inline def setResultOrderByAttribute(value: String): Self = StObject.set(x, "resultOrderByAttribute", value.asInstanceOf[js.Any])
    
    inline def setResultOrderByAttributeNull: Self = StObject.set(x, "resultOrderByAttribute", null)
    
    inline def setReturnAttributes(value: js.Array[Any]): Self = StObject.set(x, "returnAttributes", value.asInstanceOf[js.Any])
    
    inline def setReturnAttributesVarargs(value: Any*): Self = StObject.set(x, "returnAttributes", js.Array(value*))
    
    inline def setValueOrderByAttribute(value: String): Self = StObject.set(x, "valueOrderByAttribute", value.asInstanceOf[js.Any])
  }
}
