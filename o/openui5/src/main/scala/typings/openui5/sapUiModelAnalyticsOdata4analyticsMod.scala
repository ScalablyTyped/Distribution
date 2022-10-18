package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.sapUiModelFilterOperatorMod.FilterOperator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelAnalyticsOdata4analyticsMod extends Shortcut {
  
  @JSImport("sap/ui/model/analytics/odata4analytics", JSImport.Default)
  @js.native
  val default: odata4analytics = js.native
  
  @JSImport("sap/ui/model/analytics/odata4analytics", "Dimension")
  @js.native
  open class Dimension protected () extends StObject {
    /**
      * Create a representation of a dimension provided by an analytic query. Do not create your own instances.
      */
    def this(
      /**
      * The query result containing this dimension
      */
    oQueryResult: QueryResult,
      /**
      * The datajs object object representing the dimension
      */
    oProperty: js.Object
    ) = this()
    
    /**
      * Find attribute by name
      *
      * @returns The dimension attribute object with this name or null if it does not exist
      */
    def findAttributeByName(/**
      * Attribute name
      */
    sName: String): Dimension = js.native
    
    /**
      * Get the names of all attributes included in this dimension
      *
      * @returns List of all attribute names
      */
    def getAllAttributeNames(): js.Array[String] = js.native
    
    /**
      * Get all attributes of this dimension
      *
      * @returns An object with individual JS properties for each attribute of this dimension. The JS object
      * properties all are objects of type odata4analytics.DimensionAttribute. The names of the JS object properties
      * are given by the OData entity type property names representing the dimension attribute keys.
      */
    def getAllAttributes(): js.Object = js.native
    
    /**
      * Get query result containing this dimension
      *
      * @returns The query result object
      */
    def getContainingQueryResult(): QueryResult = js.native
    
    /**
      * Get associated hierarchy
      *
      * @returns The hierarchy object or null if there is none. It can be an instance of class odata4analytics.RecursiveHierarchy
      * (TODO later: or a leveled hierarchy). Use methods isLeveledHierarchy and isRecursiveHierarchy to determine
      * object type.
      */
    def getHierarchy(): js.Object = js.native
    
    /**
      * Get the key property
      *
      * @returns The datajs object representing the property for the dimension key
      */
    def getKeyProperty(): js.Object = js.native
    
    /**
      * Get label
      *
      * @returns The (possibly language-dependent) label text for this dimension
      */
    def getLabelText(): String = js.native
    
    /**
      * Get master data entity set for this dimension
      *
      * @returns The master data entity set for this dimension, or null, if it does not exist
      */
    def getMasterDataEntitySet(): EntitySet = js.native
    
    /**
      * Get the name of the dimension
      *
      * @returns The name of this dimension, which is identical to the name of the dimension key property in
      * the entity type
      */
    def getName(): String = js.native
    
    /**
      * Get super-ordinate dimension
      *
      * @returns The super-ordinate dimension or null if there is none
      */
    def getSuperOrdinateDimension(): js.Object = js.native
    
    /**
      * Get text property related to this dimension
      *
      * @returns The datajs object representing the text property or null if it does not exist
      */
    def getTextProperty(): js.Object = js.native
    
    /**
      * Get indicator whether or not master data is available for this dimension
      *
      * @returns True iff master data is available
      */
    def hasMasterData(): Boolean = js.native
  }
  
  @JSImport("sap/ui/model/analytics/odata4analytics", "DimensionAttribute")
  @js.native
  open class DimensionAttribute protected () extends StObject {
    /**
      * Create a representation of a dimension attribute provided by an analytic query. Do not create your own
      * instances.
      */
    def this(
      /**
      * The query result containing this dimension attribute
      */
    oQueryResult: QueryResult,
      /**
      * The datajs object object representing the dimension attribute
      */
    oProperty: js.Object
    ) = this()
    
    /**
      * Get dimension
      *
      * @returns The dimension object containing this attribute
      */
    def getDimension(): Dimension = js.native
    
    /**
      * Get the key property
      *
      * @returns The datajs object representing the property for the key of this dimension attribute
      */
    def getKeyProperty(): js.Object = js.native
    
    /**
      * Get label
      *
      * @returns The (possibly language-dependent) label text for this dimension attribute
      */
    def getLabelText(): String = js.native
    
    /**
      * Get the name of the dimension attribute
      *
      * @returns The name of the dimension attribute, which is identical to the name of the property in the entity
      * type holding the attribute value
      */
    def getName(): String = js.native
    
    /**
      * Get text property related to this dimension attribute
      *
      * @returns The datajs object representing the text property or null if it does not exist
      */
    def getTextProperty(): js.Object = js.native
  }
  
  @JSImport("sap/ui/model/analytics/odata4analytics", "DimensionMemberSetRequest")
  @js.native
  open class DimensionMemberSetRequest protected () extends StObject {
    /**
      * Create a request object for interaction with a dimension value help. Such a value help is served by either
      * the query result entity set, in which case the returned dimension members are limited to those also used
      * in the query result data. Or, the value help is populated by a master data entity set, if made available
      * by the service. In this case, the result will include all valid members for that dimension.
      */
    def this(
      /**
      * Description of a dimension
      */
    oDimension: Dimension,
      /**
      * (optional) Request object for interactions with the parameterization of the query result or (not yet
      * supported) master data entity set Such an object is required if the entity set holding the dimension
      * members includes parameters.
      */
    oParameterizationRequest: ParameterizationRequest,
      /**
      * (optional) Indicates use of master data for determining the dimension members.
      */
    bUseMasterData: Boolean
    ) = this()
    
    /**
      * Get the filter expression for this request.
      *
      * Expressions are represented by separate objects. If none exists so far, a new expression object gets
      * created.
      *
      * @returns The filter object associated to this request.
      */
    def getFilterExpression(): FilterExpression = js.native
    
    /**
      * Returns the current page boundaries as object with properties `start` and `end`. If the end of the page
      * is unbounded, `end` is null.
      *
      * @returns the current page boundaries as object
      */
    def getResultPageBoundaries(): js.Object = js.native
    
    /**
      * Get the sort expression for this request.
      *
      * Expressions are represented by separate objects. If none exists so far, a new expression object gets
      * created.
      *
      * @returns The sort object associated to this request.
      */
    def getSortExpression(): SortExpression = js.native
    
    /**
      * Get the value of a query option for the OData request URI corresponding to this request.
      *
      * @returns The value of the requested query option or null, if this option is not used for the OData request.
      */
    def getURIQueryOptionValue(
      /**
      * Identifies the query option: $select, $filter,... or any custom query option
      */
    sQueryOptionName: String
    ): String = js.native
    
    /**
      * Get the URI to locate the entity set for the dimension memebers.
      *
      * @returns The resource path of the URI pointing to the entity set. It is a relative URI unless a service
      * root is given, which would then prefixed in order to return a complete URL.
      */
    def getURIToDimensionMemberEntitySet(/**
      * (optional) Identifies the root of the OData service
      */
    sServiceRootURI: String): String = js.native
    
    /**
      * Get the unescaped URI to fetch the dimension members, optionally augmented by text and attributes.
      *
      * @returns The unescaped URI that contains the OData resource path and OData system query options to express
      * the request for the parameter value set..
      */
    def getURIToDimensionMemberEntries(/**
      * (optional) Identifies the root of the OData service
      */
    sServiceRootURI: String): String = js.native
    
    /**
      * Set the filter expression for this request.
      *
      * Expressions are represented by separate objects. Calling this method replaces the filter object maintained
      * by this request.
      */
    def setFilterExpression(/**
      * The filter object to be associated with this request.
      */
    oFilter: FilterExpression): Unit = js.native
    
    /**
      * Set the parameterization request required for retrieving dimension members directly from the query result,
      * if it is parameterized.
      */
    def setParameterizationRequest(
      /**
      * Request object for interactions with the parameterization of this query result
      */
    oParameterizationRequest: Unit
    ): Unit = js.native
    
    /**
      * Set further options to be applied for the OData request
      */
    def setRequestOptions(
      /**
      * Indicates whether or not the result shall include a count for the returned entities. Default is not to
      * include it. Pass null to keep current setting.
      */
    bIncludeCount: Boolean
    ): Unit = js.native
    
    /**
      * Specify that only a page of the query result shall be returned. A page is described by its boundaries,
      * that are row numbers for the first and last rows in the query result to be returned.
      */
    def setResultPageBoundaries(
      /**
      * The first row of the query result to be returned. Numbering starts at 1. Passing null is equivalent to
      * start with the first row.
      */
    start: int,
      /**
      * The last row of the query result to be returned. Passing null is equivalent to get all rows up to the
      * end of the query result.
      */
    end: int
    ): Unit = js.native
    
    /**
      * Set the sort expression for this request.
      *
      * Expressions are represented by separate objects. Calling this method replaces the sort object maintained
      * by this request.
      */
    def setSortExpression(/**
      * The sort object to be associated with this request.
      */
    oSorter: SortExpression): Unit = js.native
  }
  
  @JSImport("sap/ui/model/analytics/odata4analytics", "EntitySet")
  @js.native
  open class EntitySet protected () extends StObject {
    /**
      * Create a representation of an OData entity set in the context of an analytic query. Do not create your
      * own instances.
      */
    def this(
      /**
      * datajs object for the OData model containing this entity set
      */
    oModel: js.Object,
      /**
      * datajs object for the schema surrounding the container of this entity set
      */
    oSchema: js.Object,
      /**
      * datajs object for the container holding this entity set
      */
    oContainer: js.Object,
      /**
      * datajs object for the entity set
      */
    oEntitySet: js.Object,
      /**
      * datajs object for the entity type
      */
    oEntityType: js.Object
    ) = this()
    
    /**
      * Get entity type used for this entity set
      *
      * @returns The datajs object representing the entity type
      */
    def getEntityType(): js.Object = js.native
    
    /**
      * Get the fully qualified name for this entity type
      *
      * @returns The fully qualified name
      */
    def getQName(): String = js.native
    
    /**
      * Get full description for this entity set
      *
      * @returns The datajs object representing the entity set
      */
    def getSetDescription(): js.Object = js.native
    
    /**
      * Get names of properties in this entity set that can be updated
      *
      * @returns An object with individual JS properties for each updatable property. For testing whether propertyName
      * is the name of an updatable property, use `getUpdatablePropertyNameSet()[propertyName]`. The included
      * JS object properties are all set to true.
      */
    def getUpdatablePropertyNameSet(): js.Object = js.native
  }
  
  @JSImport("sap/ui/model/analytics/odata4analytics", "EntityType")
  @js.native
  open class EntityType protected () extends StObject {
    /**
      * Create a representation of an OData entity type in the context of an analytic query. Do not create your
      * own instances.
      */
    def this(
      /**
      * datajs object for the OData model containing this entity type
      */
    oModel: js.Object,
      /**
      * datajs object for the schema containing this entity type
      */
    oSchema: js.Object,
      /**
      * datajs object for the entity type
      */
    oEntityType: js.Object
    ) = this()
    
    /**
      * Find property by name
      *
      * @returns The datajs object representing the property or null if it does not exist
      */
    def findPropertyByName(/**
      * Property name
      */
    sPropertyName: String): js.Object = js.native
    
    /**
      * Get the names of all properties with an associated hierarchy
      *
      * @returns List of all property names
      */
    def getAllHierarchyPropertyNames(): js.Array[String] = js.native
    
    /**
      * Get names of properties that can be filtered, that is they can be used in $filter expressions
      *
      * @returns Array with names of properties that can be filtered.
      */
    def getFilterablePropertyNames(): js.Array[String] = js.native
    
    /**
      * Get heading of the property with specified name (identified by property metadata annotation sap:heading)
      *
      * @returns The heading string
      */
    def getHeadingOfProperty(/**
      * Property name
      */
    sPropertyName: String): String = js.native
    
    /**
      * Get the hierarchy associated to a given property Based on the current specification, hierarchies are
      * always recursive. TODO: Extend behavior when leveled hierarchies get in scope
      *
      * @returns The hierarchy object or null if it does not exist
      */
    def getHierarchy(/**
      * Parameter name
      */
    sName: String): RecursiveHierarchy = js.native
    
    /**
      * Get key properties of this type
      *
      * @returns The list of key property names
      */
    def getKeyProperties(): js.Array[String] = js.native
    
    /**
      * Get label of the property with specified name (identified by property metadata annotation sap:label)
      *
      * @returns The label string
      */
    def getLabelOfProperty(/**
      * Property name
      */
    sPropertyName: String): String = js.native
    
    /**
      * Get all properties
      *
      * @returns Object with (JavaScript) properties, one for each (OData entity type) property. These (JavaScript)
      * properties hold the datajs object representing the property
      */
    def getProperties(): js.Object = js.native
    
    /**
      * Get properties for which filter restrictions have been specified
      *
      * @returns Object with (JavaScript) properties, one for each (OData entity type) property. The property
      * value is from odata4analytics.EntityType.propertyFilterRestriction and indicates the filter restriction
      * for this property.
      */
    def getPropertiesWithFilterRestrictions(): js.Object = js.native
    
    /**
      * Get the fully qualified name for this entity type
      *
      * @returns The fully qualified name
      */
    def getQName(): String = js.native
    
    /**
      * Get quick info of the property with specified name (identified by property metadata annotation sap:quickinfo)
      *
      * @returns The quick info string
      */
    def getQuickInfoOfProperty(/**
      * Property name
      */
    sPropertyName: String): String = js.native
    
    /**
      * Get names of properties that must be filtered, that is they must appear in every $filter expression
      *
      * @returns Array with names of properties that must be filtered.
      */
    def getRequiredFilterPropertyNames(): js.Array[String] = js.native
    
    /**
      * Get names of properties that can be sorted, that is they can be used in $orderby expressions
      *
      * @returns Array with names of properties that can be sorted.
      */
    def getSortablePropertyNames(): js.Array[String] = js.native
    
    /**
      * Get the super-ordinate property related to the property with specified name (identified by property metadata
      * annotation sap:super-ordinate)
      *
      * @returns The datajs object representing the super-ordinate property or null if it does not exist
      */
    def getSuperOrdinatePropertyOfProperty(/**
      * Property name
      */
    sPropertyName: String): js.Object = js.native
    
    /**
      * Get the text property related to the property with specified name (identified by property metadata annotation
      * sap:text)
      *
      * @returns The datajs object representing the text property or null if it does not exist
      */
    def getTextPropertyOfProperty(/**
      * Property name
      */
    sPropertyName: String): js.Object = js.native
    
    /**
      * Get full description for this entity type
      *
      * @returns The datajs object representing the entity type
      */
    def getTypeDescription(): js.Object = js.native
  }
  
  @JSImport("sap/ui/model/analytics/odata4analytics", "FilterExpression")
  @js.native
  open class FilterExpression protected () extends StObject {
    /**
      * Create a representation of a filter expression for a given entity type. It can be rendered as value for
      * the $filter system query option.
      */
    def this(
      /**
      * datajs object for the OData model containing this entity type
      */
    oModel: js.Object,
      /**
      * datajs object for the schema containing this entity type
      */
    oSchema: js.Object,
      /**
      * object for the entity type
      */
    oEntityType: EntityType
    ) = this()
    
    def addCondition(
      /**
      * The name of the property bound in the condition
      */
    sPropertyName: String,
      /**
      * operator used for the condition
      */
    sOperator: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FilterOperator * / any */ String,
      /**
      * value to be used for this condition
      */
    oValue: js.Object,
      /**
      * (optional) as second value to be used for this condition
      */
    oValue2: js.Object
    ): FilterExpression = js.native
    /**
      * Add a condition to the filter expression.
      *
      * Multiple conditions on the same property are combined with a logical OR first, and in a second step conditions
      * for different properties are combined with a logical AND.
      *
      * @returns This object for method chaining
      */
    def addCondition(
      /**
      * The name of the property bound in the condition
      */
    sPropertyName: String,
      /**
      * operator used for the condition
      */
    sOperator: FilterOperator,
      /**
      * value to be used for this condition
      */
    oValue: js.Object,
      /**
      * (optional) as second value to be used for this condition
      */
    oValue2: js.Object
    ): FilterExpression = js.native
    
    /**
      * Add a set condition to the filter expression.
      *
      * A set condition tests if the value of a property is included in a set of given values. It is a convenience
      * method for this particular use case eliminating the need for multiple API calls.
      *
      * @returns This object for method chaining
      */
    def addSetCondition(
      /**
      * The name of the property bound in the condition
      */
    sPropertyName: String,
      /**
      * values defining the set
      */
    aValues: js.Array[Any]
    ): FilterExpression = js.native
    
    /**
      * Add an array of UI5 filter conditions to the filter expression.
      *
      * The UI5 filter condition is combined with the other given conditions using a logical AND. This method
      * is particularly useful for passing forward already created UI5 filter arrays.
      *
      * @returns This object for method chaining
      */
    def addUI5FilterConditions(
      /**
      * Array of UI5 filter objects
      */
    aUI5Filter: js.Array[typings.openui5.sapUiModelFilterMod.default]
    ): FilterExpression = js.native
    
    /**
      * Check if request is compliant with basic filter constraints expressed in metadata:
      *
      * (a) all properties required in the filter expression have been referenced (b) the single-value filter
      * restrictions have been obeyed
      *
      * @returns The value true. In case the expression violates some of the rules, an exception with some explanatory
      * message is thrown
      */
    def checkValidity(): Boolean = js.native
    
    /**
      * Clear expression from any conditions that may have been set previously
      */
    def clear(): Unit = js.native
    
    /**
      * Get description for this entity type
      *
      * @returns The object representing the entity type
      */
    def getEntityType(): EntityType = js.native
    
    /**
      * Get an array of SAPUI5 Filter objects corresponding to this expression.
      *
      * @returns List of filter objects representing this expression
      */
    def getExpressionAsUI5FilterArray(): js.Array[typings.openui5.sapUiModelFilterMod.default] = js.native
    
    /**
      * Get the value for the OData system query option $filter corresponding to this expression.
      *
      * @returns The $filter value for the filter expression
      */
    def getURIFilterOptionValue(): String = js.native
    
    /**
      * Remove all conditions for some property from the filter expression.
      *
      * All previously set conditions for some property are removed from the filter expression.
      *
      * @returns This object for method chaining
      */
    def removeConditions(/**
      * The name of the property bound in the condition
      */
    sPropertyName: String): FilterExpression = js.native
  }
  
  @JSImport("sap/ui/model/analytics/odata4analytics", "Measure")
  @js.native
  open class Measure protected () extends StObject {
    /**
      * Create a representation of a measure provided by an analytic query. Do not create your own instances.
      */
    def this(
      /**
      * The query result containing this measure
      */
    oQueryResult: QueryResult,
      /**
      * The datajs object object representing the measure
      */
    oProperty: js.Object
    ) = this()
    
    /**
      * Get the text property associated to the raw value property holding the formatted value related to this
      * measure
      *
      * @returns The datajs object representing the property holding the formatted value text of this measure
      * or null if this measure does not have a unit
      */
    def getFormattedValueProperty(): js.Object = js.native
    
    /**
      * Get label
      *
      * @returns The (possibly language-dependent) label text for this measure
      */
    def getLabelText(): String = js.native
    
    /**
      * Get the name of the measure
      *
      * @returns The name of the measure, which is identical to the name of the measure raw value property in
      * the entity type
      */
    def getName(): String = js.native
    
    /**
      * Get the raw value property
      *
      * @returns The datajs object representing the property holding the raw value of this measure
      */
    def getRawValueProperty(): js.Object = js.native
    
    /**
      * Get the unit property related to this measure
      *
      * @returns The datajs object representing the unit property or null if this measure does not have a unit
      */
    def getUnitProperty(): js.Object = js.native
    
    /**
      * Get indicator whether or not the measure is updatable
      *
      * @returns True iff the measure is updatable
      */
    def isUpdatable(): Boolean = js.native
  }
  
  @JSImport("sap/ui/model/analytics/odata4analytics", "Model")
  @js.native
  open class Model protected () extends StObject {
    /**
      * Create a representation of the analytical semantics of OData service metadata
      */
    def this(/**
      * An instance of {@link sap.ui.model.analytics.odata4analytics.Model.ReferenceByModel} or {@link sap.ui.model.analytics.odata4analytics.Model.ReferenceWithWorkaround}
      * for locating the OData service. {@link sap.ui.model.analytics.odata4analytics.Model.ReferenceByURI} is
      * deprecated.
      */
    oModelReference: js.Object) = this()
    def this(
      /**
      * An instance of {@link sap.ui.model.analytics.odata4analytics.Model.ReferenceByModel} or {@link sap.ui.model.analytics.odata4analytics.Model.ReferenceWithWorkaround}
      * for locating the OData service. {@link sap.ui.model.analytics.odata4analytics.Model.ReferenceByURI} is
      * deprecated.
      */
    oModelReference: js.Object,
      /**
      * Additional parameters for controlling the model construction. Currently supported are:
      * 	 -  sAnnotationJSONDoc - A JSON document providing extra annotations to the elements of the structure
      * 			of the given service
      * 	 -  modelVersion (deprecated) - Parameter to define which ODataModel version should be used if you use
      * 			{@link sap.ui.model.analytics.odata4analytics.Model.ReferenceByURI}; supported values are: 1 (default),
      * 			2
      */
    mParameter: js.Object
    ) = this()
    
    /**
      * Find analytic query result by name
      *
      * @returns The query result object with this name or null if it does not exist
      */
    def findQueryResultByName(/**
      * Fully qualified name of query result entity set
      */
    sName: String): QueryResult = js.native
    
    /**
      * Get the names of all query results (entity sets) offered by the model
      *
      * @returns List of all query result names
      */
    def getAllQueryResultNames(): js.Array[String] = js.native
    
    /**
      * Get all query results offered by the model
      *
      * @returns An object with individual JS properties for each query result included in the model. The JS
      * object properties all are objects of type odata4analytics.QueryResult. The names of the JS object properties
      * are given by the entity set names representing the query results.
      */
    def getAllQueryResults(): js.Object = js.native
    
    /**
      * Get underlying OData model provided by SAPUI5
      *
      * @returns The SAPUI5 representation of the model.
      */
    def getODataModel(): js.Object = js.native
  }
  object Model {
    
    /**
      * Handle to an already instantiated SAPUI5 OData model.
      */
    @JSImport("sap/ui/model/analytics/odata4analytics", "Model.ReferenceByModel")
    @js.native
    open class ReferenceByModel protected () extends StObject {
      /**
        * Create a reference to an OData model already loaded elsewhere with the help of SAPUI5.
        */
      def this(/**
        * holding the OData model.
        */
      oModel: js.Object) = this()
    }
    
    /**
      * @deprecated (since 1.94) - use {@link sap.ui.model.analytics.odata4analytics.Model.ReferenceByModel}
      * instead
      *
      * Handle to an OData model by the URI pointing to it.
      */
    @JSImport("sap/ui/model/analytics/odata4analytics", "Model.ReferenceByURI")
    @js.native
    open class ReferenceByURI protected () extends StObject {
      /**
        * Create a reference to an OData model by the URI of the related OData service.
        */
      def this(/**
        * holding the URI.
        */
      sURI: String) = this()
    }
    
    /**
      * Handle to an already instantiated SAPUI5 OData model.
      */
    @JSImport("sap/ui/model/analytics/odata4analytics", "Model.ReferenceWithWorkaround")
    @js.native
    open class ReferenceWithWorkaround protected () extends StObject {
      /**
        * Create a reference to an OData model having certain workarounds activated. A workaround is an implementation
        * that changes the standard behavior of the API to overcome some gap or restriction in the OData provider.
        * The workaround implementation can be conditionally activated by passing the identifier in the constructor.
        *
        * Known workaround identifiers are:
        *
        *
        * 	 - "CreateLabelsFromTechnicalNames" - If a property has no label text, it gets generated from the property
        * 			name.
        *
        *
        * 	 - "IdentifyTextPropertiesByName" -If a dimension property has no text and another property with the
        * 			same name and an appended "Name", "Text" etc. exists, they are linked via annotation.
        */
      def this(
        /**
        * Holds a reference to the OData model, obtained by {@link sap.ui.model.analytics.odata4analytics.Model.ReferenceByModel},
        * or by {@link sap.ui.model.analytics.odata4analytics.Model.ReferenceByURI} which is deprecated.
        */
      oModel: js.Object,
        /**
        * All workarounds to be applied.
        */
      aWorkaroundID: js.Array[String]
      ) = this()
    }
  }
  
  @JSImport("sap/ui/model/analytics/odata4analytics", "Parameter")
  @js.native
  open class Parameter protected () extends StObject {
    /**
      * Create a representation of a single parameter contained in a parameterization. Do not create your own
      * instances.
      */
    def this(
      /**
      * The parameterization containing this parameter
      */
    oParameterization: Parameterization,
      /**
      * The datajs object object representing the text property
      */
    oProperty: js.Object
    ) = this()
    
    /**
      * Get parameterization containing this parameter
      *
      * @returns The parameterization object
      */
    def getContainingParameterization(): Parameterization = js.native
    
    /**
      * Get label
      *
      * @returns The (possibly language-dependent) label text for this parameter
      */
    def getLabelText(): String = js.native
    
    /**
      * Get the name of the parameter
      *
      * @returns The name of the parameter, which is identical with the name of the property representing the
      * parameter in the parameterization entity type
      */
    def getName(): String = js.native
    
    /**
      * Get property for the parameter representing the peer boundary of the same interval
      *
      * @returns The parameter representing the peer boundary of the same interval. This means that if *this*
      * parameter is a lower boundary, the returned object
      */
    def getPeerIntervalBoundaryParameter(): Parameter = js.native
    
    /**
      * Get property
      *
      * @returns The datajs object representing the property of this parameter
      */
    def getProperty(): js.Object = js.native
    
    /**
      * Get text property related to this parameter
      *
      * @returns The datajs object representing the text property or null if it does not exist
      */
    def getTextProperty(): js.Object = js.native
    
    /**
      * Get the URI to locate the entity set holding the value set, if it is available.
      *
      * @returns The resource path of the URI pointing to the entity set. It is a relative URI unless a service
      * root is given, which would then prefixed in order to return a complete URL.
      */
    def getURIToValueEntitySet(/**
      * (optional) Identifies the root of the OData service
      */
    sServiceRootURI: String): Unit = js.native
    
    /**
      * Get indicator if the parameter represents an interval boundary
      *
      * @returns True iff it represents an interval boundary, otherwise false
      */
    def isIntervalBoundary(): Boolean = js.native
    
    /**
      * Get indicator if the parameter represents the lower boundary of an interval
      *
      * @returns True iff it represents the lower boundary of an interval, otherwise false
      */
    def isLowerIntervalBoundary(): Boolean = js.native
    
    /**
      * Get indicator whether or not the parameter is optional
      *
      * @returns True iff the parameter is optional
      */
    def isOptional(): Boolean = js.native
    
    /**
      * Get indicator if a set of values is available for this parameter. Typically, this is true for parameters
      * with a finite set of known values such as products, business partners in different roles, organization
      * units, and false for integer or date parameters
      *
      * @returns True iff a value set is available, otherwise false
      */
    def isValueSetAvailable(): Boolean = js.native
  }
  
  @JSImport("sap/ui/model/analytics/odata4analytics", "ParameterValueSetRequest")
  @js.native
  open class ParameterValueSetRequest protected () extends StObject {
    /**
      * Create a request object for interaction with a query parameter value help.
      */
    def this(/**
      * Description of a query parameter
      */
    oParameter: Parameter) = this()
    
    /**
      * Get the filter expression for this request.
      *
      * Expressions are represented by separate objects. If none exists so far, a new expression object gets
      * created.
      *
      * @returns The filter object associated to this request.
      */
    def getFilterExpression(): FilterExpression = js.native
    
    /**
      * Get the sort expression for this request.
      *
      * Expressions are represented by separate objects. If none exists so far, a new expression object gets
      * created.
      *
      * @returns The sort object associated to this request.
      */
    def getSortExpression(): SortExpression = js.native
    
    /**
      * Get the value of a query option for the OData request URI corresponding to this request.
      *
      * @returns The value of the requested query option or null, if this option is not used for the OData request.
      */
    def getURIQueryOptionValue(
      /**
      * Identifies the query option: $select, $filter,... or any custom query option
      */
    sQueryOptionName: String
    ): String = js.native
    
    /**
      * Get the unescaped URI to fetch the parameter value set.
      *
      * @returns The unescaped URI that contains the OData resource path and OData system query options to express
      * the request for the parameter value set..
      */
    def getURIToParameterValueSetEntries(/**
      * (optional) Identifies the root of the OData service
      */
    sServiceRootURI: String): String = js.native
    
    /**
      * Specify which components of the parameter shall be included in the value set.
      */
    def includeParameterText(
      /**
      * Indicator whether or not to include the parameter text (if available) in the value set. Pass null to
      * keep current setting.
      */
    bIncludeText: Boolean
    ): Unit = js.native
    
    /**
      * Set the filter expression for this request.
      *
      * Expressions are represented by separate objects. Calling this method replaces the filter object maintained
      * by this request.
      */
    def setFilterExpression(/**
      * The filter object to be associated with this request.
      */
    oFilter: FilterExpression): Unit = js.native
    
    /**
      * Set the sort expression for this request.
      *
      * Expressions are represented by separate objects. Calling this method replaces the sort object maintained
      * by this request.
      */
    def setSortExpression(/**
      * The sort object to be associated with this request.
      */
    oSorter: SortExpression): Unit = js.native
  }
  
  @JSImport("sap/ui/model/analytics/odata4analytics", "Parameterization")
  @js.native
  open class Parameterization protected () extends StObject {
    /**
      * Create a representation of a parameterization for an analytic query. Do not create your own instances.
      */
    def this(
      /**
      * The OData entity type for this parameterization
      */
    oEntityType: EntityType,
      /**
      * The OData entity set for this parameterization offered by the OData service
      */
    oEntitySet: EntitySet
    ) = this()
    
    /**
      * Find parameter by name
      *
      * @returns The parameter object with this name or null if it does not exist
      */
    def findParameterByName(/**
      * Parameter name
      */
    sName: String): Parameter = js.native
    
    /**
      * Get the names of all parameters part of the parameterization
      *
      * @returns List of all parameter names
      */
    def getAllParameterNames(): js.Array[String] = js.native
    
    /**
      * Get all parameters included in this parameterization
      *
      * @returns An object with individual JS properties for each parameter included in the query result. The
      * JS object properties all are objects of type odata4analytics.Parameter. The names of the JS object properties
      * are given by the OData entity type property names representing the parameter keys.
      */
    def getAllParameters(): js.Object = js.native
    
    /**
      * Get the entity set representing this query result in the OData model
      *
      * @returns The OData entity set representing this query result
      */
    def getEntitySet(): EntitySet = js.native
    
    /**
      * Get the entity type defining the type of this query result in the OData model
      *
      * @returns The OData entity type for this query result
      */
    def getEntityType(): EntityType = js.native
    
    /**
      * Get the name of the parameter
      *
      * @returns The name of the parameterization, which is identical with the name of the entity set representing
      * the parameterization in the OData service
      */
    def getName(): String = js.native
    
    /**
      * Get navigation property to query result
      *
      * @returns The parameter object with this name or null if it does not exist
      */
    def getNavigationPropertyToQueryResult(): QueryResult = js.native
  }
  
  @JSImport("sap/ui/model/analytics/odata4analytics", "ParameterizationRequest")
  @js.native
  open class ParameterizationRequest protected () extends StObject {
    /**
      * Create a request object for interaction with a query parameterization.
      */
    def this(/**
      * Description of a query parameterization
      */
    oParameterization: Parameterization) = this()
    
    /**
      * Get the description of the parameterization on which this request operates on
      *
      * @returns Description of a query parameterization
      */
    def getParameterization(): Parameterization = js.native
    
    /**
      * Get the URI to locate the entity set for the query parameterization.
      *
      * @returns The resource path of the URI pointing to the entity set. It is a relative URI unless a service
      * root is given, which would then prefixed in order to return a complete URL.
      */
    def getURIToParameterizationEntitySet(/**
      * (optional) Identifies the root of the OData service
      */
    sServiceRootURI: String): Unit = js.native
    
    /**
      * Get the URI to locate the parameterization entity for the values assigned to all parameters beforehand.
      * Notice that a value must be supplied for every parameter including those marked as optional. For optional
      * parameters, assign the special value that the service provider uses as an "omitted" value. For example,
      * for services based on BW Easy Queries, this would be an empty string.
      *
      * @returns The resource path of the URI pointing to the entity set. It is a relative URI unless a service
      * root is given, which would then prefixed in order to return a complete URL.
      */
    def getURIToParameterizationEntry(/**
      * (optional) Identifies the root of the OData service
      */
    sServiceRootURI: String): Unit = js.native
    
    /**
      * Assign a value to a parameter
      */
    def setParameterValue(
      /**
      * Name of the parameter. In case of a range value, provide the name of the lower boundary parameter.
      */
    sParameterName: String,
      /**
      * Assigned value. Pass null to remove a value assignment.
      */
    sValue: String,
      /**
      * Omit it or set it to null for single values. If set, it will be assigned to the upper boundary parameter
      */
    sToValue: String
    ): Unit = js.native
  }
  
  @JSImport("sap/ui/model/analytics/odata4analytics", "QueryResult")
  @js.native
  open class QueryResult protected () extends StObject {
    /**
      * Create a representation of an analytic query. Do not create your own instances.
      */
    def this(
      /**
      * The analytical model containing this query result entity set
      */
    oModel: Model,
      /**
      * The OData entity type for this query
      */
    oEntityType: EntityType,
      /**
      * The OData entity set for this query offered by the OData service
      */
    oEntitySet: EntitySet,
      /**
      * The parameterization of this query, if any
      */
    oParameterization: Parameterization
    ) = this()
    
    /**
      * Find dimension by name
      *
      * @returns The dimension object with this name or null if it does not exist
      */
    def findDimensionByName(/**
      * Dimension name
      */
    sName: String): Dimension = js.native
    
    /**
      * Find dimension by property name
      *
      * @returns The dimension object to which the given property name is related, because the property holds
      * the dimension key, its text, or is an attribute of this dimension. If no such dimension exists, null
      * is returned.
      */
    def findDimensionByPropertyName(/**
      * Property name
      */
    sName: String): Dimension = js.native
    
    /**
      * Find measure by name
      *
      * @returns The measure object with this name or null if it does not exist
      */
    def findMeasureByName(/**
      * Measure name
      */
    sName: String): Measure = js.native
    
    /**
      * Find measure by property name
      *
      * @returns The measure object to which the given property name is related, because the property holds the
      * raw measure value or its formatted value. If no such measure exists, null is returned.
      */
    def findMeasureByPropertyName(/**
      * Property name
      */
    sName: String): Measure = js.native
    
    /**
      * Get the names of all dimensions included in the query result
      *
      * @returns List of all dimension names
      */
    def getAllDimensionNames(): js.Array[String] = js.native
    
    /**
      * Get all dimensions included in this query result
      *
      * @returns An object with individual JS properties for each dimension included in the query result. The
      * JS object properties all are objects of type odata4analytics.Dimension. The names of the JS object properties
      * are given by the OData entity type property names representing the dimension keys.
      */
    def getAllDimensions(): js.Object = js.native
    
    /**
      * Get the names of all measures included in the query result
      *
      * @returns List of all measure names
      */
    def getAllMeasureNames(): js.Array[String] = js.native
    
    /**
      * Get all measures included in this query result
      *
      * @returns An object with individual JS properties for each measure included in the query result. The JS
      * object properties all are objects of type odata4analytics.Measure. The names of the JS object properties
      * are given by the OData entity type property names representing the measure raw values.
      */
    def getAllMeasures(): js.Object = js.native
    
    /**
      * Get the entity set representing this query result in the OData model
      *
      * @returns The OData entity set representing this query result
      */
    def getEntitySet(): EntitySet = js.native
    
    /**
      * Get the entity type defining the type of this query result in the OData model
      *
      * @returns The OData entity type for this query result
      */
    def getEntityType(): EntityType = js.native
    
    /**
      * Get the analytical model containing the entity set for this query result
      *
      * @returns The analytical representation of the OData model
      */
    def getModel(): js.Object = js.native
    
    /**
      * Get the name of the query result
      *
      * @returns The fully qualified name of the query result, which is identical with the name of the entity
      * set representing the query result in the OData service
      */
    def getName(): String = js.native
    
    /**
      * Get the parameterization of this query result
      *
      * @returns The object for the parameterization or null if the query result is not parameterized
      */
    def getParameterization(): Parameterization = js.native
    
    /**
      * Get property holding the totaled property list
      *
      * @returns The datajs object representing this property
      */
    def getTotaledPropertiesListProperty(): js.Object = js.native
  }
  
  @JSImport("sap/ui/model/analytics/odata4analytics", "QueryResultRequest")
  @js.native
  open class QueryResultRequest protected () extends StObject {
    /**
      * Create a request object for interaction with a query result.
      */
    def this(/**
      * Description of a query parameterization
      */
    oQueryResult: QueryResult) = this()
    def this(
      /**
      * Description of a query parameterization
      */
    oQueryResult: QueryResult,
      /**
      * Request object for interactions with the parameterization of this query. Only required if the query service
      * includes parameters.
      */
    oParameterizationRequest: ParameterizationRequest
    ) = this()
    
    /**
      * Adds a recursive hierarchy to the aggregation level.
      */
    def addRecursiveHierarchy(
      /**
      * Name of dimension whose hierarchy shall be part of the aggregation level
      */
    sHierarchyDimensionName: String,
      /**
      * Indicator whether or not to include the external node key (if available) in the query result
      */
    bIncludeExternalKey: Boolean,
      /**
      * Indicator whether or not to include the node text (if available) in the query result
      */
    bIncludeText: Boolean
    ): Unit = js.native
    
    /**
      * Add one or more dimensions to the aggregation level
      */
    def addToAggregationLevel(
      /**
      * Array of dimension names to be added to the already defined aggregation level.
      */
    aDimensionName: Unit
    ): Unit = js.native
    
    /**
      * Get the names of the dimensions included in the aggregation level
      *
      * @returns The dimension names included in the aggregation level
      */
    def getAggregationLevel(): js.Array[Any] = js.native
    
    /**
      * Get details about a dimensions included in the aggregation level
      *
      * @returns An object with three properties named key and text, both with Boolean values indicating whether
      * the key and text of this dimension are included in this request. The third property named attributes
      * is an array of attribute names of this dimension included in this request, or null, if there are none.
      */
    def getAggregationLevelDetails(
      /**
      * Name of a dimension included in the aggregation level of this request, for which details shall be returned
      */
    sDImensionName: Unit
    ): js.Object = js.native
    
    /**
      * Get the filter expression for this request.
      *
      * Expressions are represented by separate objects. If none exists so far, a new expression object gets
      * created.
      *
      * @returns The filter object associated to this request.
      */
    def getFilterExpression(): FilterExpression = js.native
    
    /**
      * Get the names of the measures included in the query result request
      *
      * @returns The measure names included in the query result request
      */
    def getMeasureNames(): js.Array[Any] = js.native
    
    /**
      * Retrieves the current parametrization request
      */
    def getParameterizationRequest(): ParameterizationRequest = js.native
    
    /**
      * Get the description of the query result on which this request operates on
      *
      * @returns Description of a query result
      */
    def getQueryResult(): QueryResult = js.native
    
    /**
      * Returns the current page boundaries as object with properties `start` and `end`. If the end of the page
      * is unbounded, `end` is null.
      *
      * @returns the current page boundaries as object
      */
    def getResultPageBoundaries(): js.Object = js.native
    
    /**
      * Get the sort expression for this request.
      *
      * Expressions are represented by separate objects. If none exists so far, a new expression object gets
      * created.
      *
      * @returns The sort object associated to this request.
      */
    def getSortExpression(): SortExpression = js.native
    
    /**
      * Get the value of a query option for the OData request URI corresponding to this request.
      *
      * @returns The value of the requested query option or null, if this option is not used for the OData request.
      */
    def getURIQueryOptionValue(
      /**
      * Identifies the query option: $select, $filter,$orderby ... or any custom query option
      */
    sQueryOptionName: String
    ): String = js.native
    
    /**
      * Get the URI to locate the entity set for the query result.
      *
      * @returns The resource path of the URI pointing to the entity set. It is a relative URI unless a service
      * root is given, which would then prefixed in order to return a complete URL.
      */
    def getURIToQueryResultEntitySet(/**
      * (optional) Identifies the root of the OData service
      */
    sServiceRootURI: String): String = js.native
    
    /**
      * Get the unescaped URI to fetch the query result.
      *
      * @returns The unescaped URI that contains the OData resource path and OData system query options to express
      * the aggregation level, filter expression and further options.
      */
    def getURIToQueryResultEntries(
      /**
      * (optional) Identifies the root of the OData service
      */
    sServiceRootURI: String,
      /**
      * (optional) OData resource path to be considered. If provided, it overwrites any parameterization object
      * that might have been specified separately.
      */
    sResourcePath: String
    ): String = js.native
    
    /**
      * Specify which dimension components shall be included in the query result. The settings get applied to
      * the currently defined aggregation level.
      */
    def includeDimensionKeyTextAttributes(
      /**
      * Name of the dimension for which the settings get applied. Specify null to apply the settings to all dimensions
      * in the aggregation level.
      */
    sDimensionName: String,
      /**
      * Indicator whether or not to include the dimension key in the query result. Pass null to keep current
      * setting.
      */
    bIncludeKey: Boolean,
      /**
      * Indicator whether or not to include the dimension text (if available) in the query result. Pass null
      * to keep current setting.
      */
    bIncludeText: Boolean,
      /**
      * Array of dimension attribute names to be included in the result. Pass null to keep current setting. This
      * argument is ignored if sDimensionName is null.
      */
    aAttributeName: Unit
    ): Unit = js.native
    
    /**
      * Specify which measure components shall be included in the query result. The settings get applied to the
      * currently set measures.
      */
    def includeMeasureRawFormattedValueUnit(
      /**
      * Name of the measure for which the settings get applied. Specify null to apply the settings to all currently
      * set measures.
      */
    sMeasureName: String,
      /**
      * Indicator whether or not to include the raw value in the query result. Pass null to keep current setting.
      */
    bIncludeRawValue: Boolean,
      /**
      * Indicator whether or not to include the formatted value (if available) in the query result. Pass null
      * to keep current setting.
      */
    bIncludeFormattedValue: Boolean,
      /**
      * Indicator whether or not to include the unit (if available) in the query result. Pass null to keep current
      * setting.
      */
    bIncludeUnit: Boolean
    ): Unit = js.native
    
    /**
      * Remove one or more dimensions from the aggregation level. The method also removed a potential sort expression
      * on the dimension.
      */
    def removeFromAggregationLevel(
      /**
      * Array of dimension names to be removed from the already defined aggregation level.
      */
    aDimensionName: Unit
    ): Unit = js.native
    
    /**
      * Set the aggregation level for the query result request. By default, the query result will include the
      * properties holding the keys of the given dimensions. This setting can be changed using includeDimensionKeyTextAttributes.
      */
    def setAggregationLevel(
      /**
      * Array of dimension names to be part of the aggregation level. If null, the aggregation level includes
      * all dimensions, if empty, no dimension is included.
      */
    aDimensionName: Unit
    ): Unit = js.native
    
    /**
      * Set the filter expression for this request.
      *
      * Expressions are represented by separate objects. Calling this method replaces the filter object maintained
      * by this request.
      */
    def setFilterExpression(/**
      * The filter object to be associated with this request.
      */
    oFilter: FilterExpression): Unit = js.native
    
    /**
      * Set the measures to be included in the query result request. By default, the query result will include
      * the properties holding the raw values of the given measures. This setting can be changed using includeMeasureRawFormattedValueUnit.
      */
    def setMeasures(
      /**
      * Array of measure names to be part of the query result request. If null, the request includes all measures,
      * if empty, no measure is included.
      */
    aMeasureName: Unit
    ): Unit = js.native
    
    /**
      * Set the parameterization request required for interactions with the query result of parameterized queries.
      * This method provides an alternative way to assign a parameterization request to a query result request.
      */
    def setParameterizationRequest(
      /**
      * Request object for interactions with the parameterization of this query
      */
    oParameterizationRequest: Unit
    ): Unit = js.native
    
    /**
      * Set further options to be applied for the OData request to fetch the query result
      */
    def setRequestOptions(
      /**
      * Indicates whether or not the entity key should be returned for every entry in the query result. Default
      * is not to include it. Pass null to keep current setting.
      */
    bIncludeEntityKey: Boolean,
      /**
      * Indicates whether or not the result shall include a count for the returned entities. Default is not to
      * include it. Pass null to keep current setting.
      */
    bIncludeCount: Boolean,
      /**
      * Indicates whether or not the result shall be empty. This will translate to $top=0 in the OData request
      * and override any setting done with setResultPageBoundaries. The default is not to suppress entities in
      * the result. Pass null to keep current setting. The main use case for this option is to create a request
      * with $inlinecount returning an entity count.
      */
    bReturnNoEntities: Boolean
    ): Unit = js.native
    
    /**
      * Set the resource path to be considered for the OData request URI of this query request object. This method
      * provides an alternative way to assign a path comprising a parameterization. If a path is provided, it
      * overwrites any parameterization object that might have been specified separately.
      */
    def setResourcePath(
      /**
      * Resource path pointing to the entity set of the query result. Must include a valid parameterization if
      * query contains parameters.
      */
    sResourcePath: String
    ): Unit = js.native
    
    /**
      * Specify that only a page of the query result shall be returned. A page is described by its boundaries,
      * that are row numbers for the first and last rows in the query result to be returned.
      */
    def setResultPageBoundaries(
      /**
      * The first row of the query result to be returned. Numbering starts at 1. Passing null is equivalent to
      * start with the first row.
      */
    start: int,
      /**
      * The last row of the query result to be returned. Passing null is equivalent to get all rows up to the
      * end of the query result.
      */
    end: int
    ): Unit = js.native
    
    /**
      * Set the sort expression for this request.
      *
      * Expressions are represented by separate objects. Calling this method replaces the sort object maintained
      * by this request.
      */
    def setSortExpression(/**
      * The sort object to be associated with this request.
      */
    oSorter: SortExpression): Unit = js.native
  }
  
  @JSImport("sap/ui/model/analytics/odata4analytics", "RecursiveHierarchy")
  @js.native
  open class RecursiveHierarchy protected () extends StObject {
    /**
      * Create a representation of a recursive hierarchy defined on one multiple properties in an OData entity
      * type query. Do not create your own instances.
      */
    def this(
      /**
      * object for the entity type
      */
    oEntityType: EntityType,
      /**
      * datajs object for the property holding the hierarchy node ID identifying the hierarchy node to which
      * the OData entry belongs
      */
    oNodeIDProperty: js.Object,
      /**
      * datajs object for the property holding the node ID of the parent of the hierarchy node pointed to by
      * the value of oNodeIDProperty
      */
    oParentNodeIDProperty: js.Object,
      /**
      * datajs object for the property holding the level number for the of the hierarchy node pointed to by the
      * value of oNodeIDProperty
      */
    oNodeLevelProperty: js.Object,
      /**
      * datajs object for the property holding the data value for the of the hierarchy node pointed to by the
      * value of oNodeIDProperty
      */
    oNodeValueProperty: js.Object,
      /**
      * datajs object for the property holding the node external key of the hierarchy node. The external key
      * is a human-readable identification of a node. The value of the `hierarchy-node-external-key-for` attribute
      * is always the name of another property in the same type. It points to the related property holding the
      * hierarchy node ID.
      */
    oNodeExternalKeyProperty: js.Object
    ) = this()
    
    /**
      * Get the property holding the node external key of the hierarchy node
      *
      * @returns The datajs object representing this property
      */
    def getNodeExternalKeyProperty(): js.Object = js.native
    
    /**
      * Get the property holding the node ID of the hierarchy node
      *
      * @returns The datajs object representing this property
      */
    def getNodeIDProperty(): js.Object = js.native
    
    /**
      * Get the property holding the level of the hierarchy node
      *
      * @returns The datajs object representing this property
      */
    def getNodeLevelProperty(): js.Object = js.native
    
    /**
      * Get the property holding the value that is structurally organized by the hierarchy
      *
      * @returns The datajs object representing this property
      */
    def getNodeValueProperty(): js.Object = js.native
    
    /**
      * Get the property holding the parent node ID of the hierarchy node
      *
      * @returns The datajs object representing this property
      */
    def getParentNodeIDProperty(): js.Object = js.native
    
    /**
      * Get indicator if this is a leveled hierarchy
      *
      * @returns False
      */
    def isLeveledHierarchy(): Boolean = js.native
    
    /**
      * Get indicator if this is a recursive hierarchy
      *
      * @returns True
      */
    def isRecursiveHierarchy(): Boolean = js.native
  }
  
  @JSImport("sap/ui/model/analytics/odata4analytics", "SortExpression")
  @js.native
  open class SortExpression protected () extends StObject {
    /**
      * Create a representation of an order by expression for a given entity type. It can be rendered as value
      * for the $orderby system query option.
      */
    def this(
      /**
      * datajs object for the OData model containing this entity type
      */
    oModel: js.Object,
      /**
      * datajs object for the schema containing this entity type
      */
    oSchema: js.Object,
      /**
      * object for the entity type
      */
    oEntityType: EntityType
    ) = this()
    
    /**
      * Add a condition to the order by expression. It replaces any previously specified sort order for the property.
      *
      * @returns This object for method chaining
      */
    def addSorter(
      /**
      * The name of the property bound in the condition
      */
    sPropertyName: String,
      /**
      * sorting order used for the condition
      */
    sSortOrder: SortOrder
    ): SortExpression = js.native
    
    /**
      * Clear expression from any sort conditions that may have been set previously
      */
    def clear(): Unit = js.native
    
    /**
      * Get description for this entity type
      *
      * @returns The object representing the entity type
      */
    def getEntityType(): EntityType = js.native
    
    /**
      * Get the first SAPUI5 Sorter object.
      *
      * @returns first sorter object or null if empty
      */
    def getExpressionAsUI5Sorter(): typings.openui5.sapUiModelSorterMod.default = js.native
    
    /**
      * Get an array of SAPUI5 Sorter objects corresponding to this expression.
      *
      * @returns List of sorter objects representing this expression
      */
    def getExpressionsAsUI5SorterArray(): js.Array[typings.openui5.sapUiModelSorterMod.default] = js.native
    
    /**
      * Get the value for the OData system query option $orderby corresponding to this expression.
      *
      * @returns The $orderby value for the sort expressions
      */
    def getURIOrderByOptionValue(/**
      * Object with properties requested for $select
      */
    oSelectedPropertyNames: js.Object): String = js.native
    
    /**
      * Removes the order by expression for the given property name from the list of order by expression. If
      * no order by expression with this property name exists the method does nothing.
      */
    def removeSorter(/**
      * The name of the property to be removed from the condition
      */
    sPropertyName: String): Unit = js.native
  }
  
  @js.native
  sealed trait SortOrder extends StObject
  @JSImport("sap/ui/model/analytics/odata4analytics", "SortOrder")
  @js.native
  object SortOrder extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SortOrder & String] = js.native
    
    /**
      * Sort Order: ascending.
      */
    @js.native
    sealed trait Ascending
      extends StObject
         with SortOrder
    /* "asc" */ val Ascending: typings.openui5.sapUiModelAnalyticsOdata4analyticsMod.SortOrder.Ascending & String = js.native
    
    /**
      * Sort Order: descending.
      */
    @js.native
    sealed trait Descending
      extends StObject
         with SortOrder
    /* "desc" */ val Descending: typings.openui5.sapUiModelAnalyticsOdata4analyticsMod.SortOrder.Descending & String = js.native
  }
  
  type _To = odata4analytics
  
  /* This means you don't have to write `default`, but can instead just say `sapUiModelAnalyticsOdata4analyticsMod.foo` */
  override def _to: odata4analytics = default
  
  /**
    * @EXPERIMENTAL
    *
    * The OData4Analytics API is purely experimental, not yet functionally complete and not meant for productive
    * usage. At present, its only purpose is to demonstrate how easy analytical extensions of OData4SAP can
    * be consumed.
    *
    * ***USE OBJECTS VIA METHODS ONLY - DO NOT ACCESS JAVASCRIPT OBJECT PROPERTIES DIRECTLY !***
    *
    * Lazy initialization of attributes will cause unexpected values when you access object attributes directly.
    */
  trait odata4analytics extends StObject {
    
    /**
      * Specify which components of the dimension shall be included in the value set.
      */
    def includeDimensionTextAttributes(
      /**
      * Indicator whether or not to include the dimension text (if available) in the value set.
      */
    bIncludeText: Boolean,
      /**
      * Indicator whether or not to include all dimension attributes (if available) in the value set.
      */
    bIncludeAttributes: Boolean
    ): Unit
  }
  object odata4analytics {
    
    inline def apply(includeDimensionTextAttributes: (Boolean, Boolean) => Unit): odata4analytics = {
      val __obj = js.Dynamic.literal(includeDimensionTextAttributes = js.Any.fromFunction2(includeDimensionTextAttributes))
      __obj.asInstanceOf[odata4analytics]
    }
    
    extension [Self <: odata4analytics](x: Self) {
      
      inline def setIncludeDimensionTextAttributes(value: (Boolean, Boolean) => Unit): Self = StObject.set(x, "includeDimensionTextAttributes", js.Any.fromFunction2(value))
    }
  }
}
