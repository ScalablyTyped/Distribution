package typings.popoto.anon

import org.scalablytyped.runtime.StringDictionary
import typings.popoto.graphLinkMod.Link
import typings.popoto.graphNodeMod.Node
import typings.popoto.queryMod.QueryStructure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofQuery extends StObject {
  
  val COLLECT_RELATIONS_WITH_VALUES: Boolean
  
  /**
    * Define the number of results displayed in result list.
    */
  val MAX_RESULTS_COUNT: Double
  
  val RETURN_LABELS: Boolean
  
  val USE_PARENT_RELATION: Boolean
  
  val USE_RELATION_DIRECTION: Boolean
  
  val VALUE_QUERY_LIMIT: Double
  
  def applyPrefilters(queryStructure: QueryStructure): /* import warning: importer.ImportType#apply Failed type conversion: typeof queryStructure */ js.Any
  
  /**
    * Function used to filter returned relations
    * return false if the result should be filtered out.
    *
    * @param d relation returned object
    * @returns boolean
    */
  def filterRelation(d: Link): Boolean
  
  def generateNegativeQueryElements(): PickQueryStructurewhereEl
  
  /**
    * Generate a cypher query to the get the node count, set as parameter matching the current graph.
    *
    * @param countedNode the counted node
    * @returns the node count cypher query
    */
  def generateNodeCountQuery(countedNode: Node): String
  
  /**
    * Generate a Cypher query to retrieve all the relation available for a given node.
    *
    * @param targetNode
    * @returns node relation query
    */
  def generateNodeRelationQuery(targetNode: Node): String
  
  /**
    * Generate the where and parameter statements for the nodes with value
    *
    * @param node the node to generate value constraints
    * @param useCustomConstraints define whether to use custom generation in popoto config
    */
  def generateNodeValueConstraints(node: Node, useCustomConstraints: Boolean): PickQueryStructurewhereEl
  
  /**
    * Generate a Cypher query from the graph model to get all the possible values for the targetNode element.
    *
    * @param targetNode node in the graph to get the values.
    * @returns the query to execute to get all the values of targetNode corresponding to the graph.
    */
  def generateNodeValueQuery(targetNode: Node): String
  
  /**
    * Generate Cypher query match and where elements from root node, selected node and a set of the graph links.
    *
    * @param rootNode root node in the graph.
    * @param selectedNode graph target node.
    * @param links list of links subset of the graph.
    * @returns list of match and where elements.
    * @param isConstraintNeeded (used only for relation query)
    * @param useCustomConstraints define whether to use the custom constraints (actually it is used only for results)
    */
  def generateQueryElements(
    rootNode: Node,
    selectedNode: Node,
    links: js.Array[Link],
    isConstraintNeeded: Boolean,
    useCustomConstraints: Boolean
  ): QueryStructure
  
  /**
    * Generate a Cypher query to retrieve the results matching the current graph.
    *
    * @param isGraph
    * @returns query structure
    */
  def generateResultQuery(isGraph: Boolean): QueryStructure
  
  /**
    * Generate the query to count nodes of a label.
    * If the label is defined as distinct in configuration the query will count only distinct values on constraint attribute.
    */
  def generateTaxonomyCountQuery(label: String): String
  
  /**
    * Get the list of link defining the complete path from node to root.
    * All other links are ignored.
    *
    * @param node The node where to start in the graph.
    * @param links
    */
  def getLinksToRoot(node: Node, links: js.Array[Link]): js.Array[Link]
  
  /**
    * Filter links to get only paths from root to leaf containing a value or being the selectedNode.
    * All other paths in the graph containing no value are ignored.
    *
    * @param rootNode root node of the graph.
    * @param targetNode node in the graph target of the query.
    * @param initialLinks list of links representing the graph to filter.
    * @returns list of relevant links.
    */
  def getRelevantLinks(rootNode: Node, targetNode: Node, initialLinks: js.Array[Link]): js.Array[Link]
  
  val prefilter: String
  
  val prefilterParameters: StringDictionary[Any]
}
object TypeofQuery {
  
  inline def apply(
    COLLECT_RELATIONS_WITH_VALUES: Boolean,
    MAX_RESULTS_COUNT: Double,
    RETURN_LABELS: Boolean,
    USE_PARENT_RELATION: Boolean,
    USE_RELATION_DIRECTION: Boolean,
    VALUE_QUERY_LIMIT: Double,
    applyPrefilters: QueryStructure => /* import warning: importer.ImportType#apply Failed type conversion: typeof queryStructure */ js.Any,
    filterRelation: Link => Boolean,
    generateNegativeQueryElements: () => PickQueryStructurewhereEl,
    generateNodeCountQuery: Node => String,
    generateNodeRelationQuery: Node => String,
    generateNodeValueConstraints: (Node, Boolean) => PickQueryStructurewhereEl,
    generateNodeValueQuery: Node => String,
    generateQueryElements: (Node, Node, js.Array[Link], Boolean, Boolean) => QueryStructure,
    generateResultQuery: Boolean => QueryStructure,
    generateTaxonomyCountQuery: String => String,
    getLinksToRoot: (Node, js.Array[Link]) => js.Array[Link],
    getRelevantLinks: (Node, Node, js.Array[Link]) => js.Array[Link],
    prefilter: String,
    prefilterParameters: StringDictionary[Any]
  ): TypeofQuery = {
    val __obj = js.Dynamic.literal(COLLECT_RELATIONS_WITH_VALUES = COLLECT_RELATIONS_WITH_VALUES.asInstanceOf[js.Any], MAX_RESULTS_COUNT = MAX_RESULTS_COUNT.asInstanceOf[js.Any], RETURN_LABELS = RETURN_LABELS.asInstanceOf[js.Any], USE_PARENT_RELATION = USE_PARENT_RELATION.asInstanceOf[js.Any], USE_RELATION_DIRECTION = USE_RELATION_DIRECTION.asInstanceOf[js.Any], VALUE_QUERY_LIMIT = VALUE_QUERY_LIMIT.asInstanceOf[js.Any], applyPrefilters = js.Any.fromFunction1(applyPrefilters), filterRelation = js.Any.fromFunction1(filterRelation), generateNegativeQueryElements = js.Any.fromFunction0(generateNegativeQueryElements), generateNodeCountQuery = js.Any.fromFunction1(generateNodeCountQuery), generateNodeRelationQuery = js.Any.fromFunction1(generateNodeRelationQuery), generateNodeValueConstraints = js.Any.fromFunction2(generateNodeValueConstraints), generateNodeValueQuery = js.Any.fromFunction1(generateNodeValueQuery), generateQueryElements = js.Any.fromFunction5(generateQueryElements), generateResultQuery = js.Any.fromFunction1(generateResultQuery), generateTaxonomyCountQuery = js.Any.fromFunction1(generateTaxonomyCountQuery), getLinksToRoot = js.Any.fromFunction2(getLinksToRoot), getRelevantLinks = js.Any.fromFunction3(getRelevantLinks), prefilter = prefilter.asInstanceOf[js.Any], prefilterParameters = prefilterParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofQuery]
  }
  
  extension [Self <: TypeofQuery](x: Self) {
    
    inline def setApplyPrefilters(
      value: QueryStructure => /* import warning: importer.ImportType#apply Failed type conversion: typeof queryStructure */ js.Any
    ): Self = StObject.set(x, "applyPrefilters", js.Any.fromFunction1(value))
    
    inline def setCOLLECT_RELATIONS_WITH_VALUES(value: Boolean): Self = StObject.set(x, "COLLECT_RELATIONS_WITH_VALUES", value.asInstanceOf[js.Any])
    
    inline def setFilterRelation(value: Link => Boolean): Self = StObject.set(x, "filterRelation", js.Any.fromFunction1(value))
    
    inline def setGenerateNegativeQueryElements(value: () => PickQueryStructurewhereEl): Self = StObject.set(x, "generateNegativeQueryElements", js.Any.fromFunction0(value))
    
    inline def setGenerateNodeCountQuery(value: Node => String): Self = StObject.set(x, "generateNodeCountQuery", js.Any.fromFunction1(value))
    
    inline def setGenerateNodeRelationQuery(value: Node => String): Self = StObject.set(x, "generateNodeRelationQuery", js.Any.fromFunction1(value))
    
    inline def setGenerateNodeValueConstraints(value: (Node, Boolean) => PickQueryStructurewhereEl): Self = StObject.set(x, "generateNodeValueConstraints", js.Any.fromFunction2(value))
    
    inline def setGenerateNodeValueQuery(value: Node => String): Self = StObject.set(x, "generateNodeValueQuery", js.Any.fromFunction1(value))
    
    inline def setGenerateQueryElements(value: (Node, Node, js.Array[Link], Boolean, Boolean) => QueryStructure): Self = StObject.set(x, "generateQueryElements", js.Any.fromFunction5(value))
    
    inline def setGenerateResultQuery(value: Boolean => QueryStructure): Self = StObject.set(x, "generateResultQuery", js.Any.fromFunction1(value))
    
    inline def setGenerateTaxonomyCountQuery(value: String => String): Self = StObject.set(x, "generateTaxonomyCountQuery", js.Any.fromFunction1(value))
    
    inline def setGetLinksToRoot(value: (Node, js.Array[Link]) => js.Array[Link]): Self = StObject.set(x, "getLinksToRoot", js.Any.fromFunction2(value))
    
    inline def setGetRelevantLinks(value: (Node, Node, js.Array[Link]) => js.Array[Link]): Self = StObject.set(x, "getRelevantLinks", js.Any.fromFunction3(value))
    
    inline def setMAX_RESULTS_COUNT(value: Double): Self = StObject.set(x, "MAX_RESULTS_COUNT", value.asInstanceOf[js.Any])
    
    inline def setPrefilter(value: String): Self = StObject.set(x, "prefilter", value.asInstanceOf[js.Any])
    
    inline def setPrefilterParameters(value: StringDictionary[Any]): Self = StObject.set(x, "prefilterParameters", value.asInstanceOf[js.Any])
    
    inline def setRETURN_LABELS(value: Boolean): Self = StObject.set(x, "RETURN_LABELS", value.asInstanceOf[js.Any])
    
    inline def setUSE_PARENT_RELATION(value: Boolean): Self = StObject.set(x, "USE_PARENT_RELATION", value.asInstanceOf[js.Any])
    
    inline def setUSE_RELATION_DIRECTION(value: Boolean): Self = StObject.set(x, "USE_RELATION_DIRECTION", value.asInstanceOf[js.Any])
    
    inline def setVALUE_QUERY_LIMIT(value: Double): Self = StObject.set(x, "VALUE_QUERY_LIMIT", value.asInstanceOf[js.Any])
  }
}
