package typings.openui5.global.sap.ui.model

import typings.openui5.anon.TypeofFilterOperator
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object analytics {
  
  @JSGlobal("sap.ui.model.analytics")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("sap.ui.model.analytics.AnalyticalBinding")
  @js.native
  class AnalyticalBinding ()
    extends StObject
       with typings.openui5.sap.ui.model.analytics.AnalyticalBinding
  
  @JSGlobal("sap.ui.model.analytics.AnalyticalTreeBindingAdapter")
  @js.native
  class AnalyticalTreeBindingAdapter ()
    extends StObject
       with typings.openui5.sap.ui.model.analytics.AnalyticalTreeBindingAdapter {
    
    /**
      * Retrieves the currently set number of expanded levels from the Binding (commonly an
      * AnalyticalBinding).
      * @returns the number of expanded levels
      */
    /* CompleteClass */
    override def getNumberOfExpandedLevels(): Double = js.native
    
    /**
      * Checks if the AnalyticalBinding has totaled measures available.Used for rendering sum rows.
      * @returns wether the binding has totaled measures or not
      */
    /* CompleteClass */
    override def hasTotaledMeasures(): Boolean = js.native
    
    /**
      * Sets the number of expanded levels on the TreeBinding (commonly an AnalyticalBinding).This is NOT
      * the same as AnalyticalTreeBindingAdapter#collapse or AnalyticalTreeBindingAdapter#expand.Setting the
      * number of expanded levels leads to different requests.This function is used by the AnalyticalTable
      * for the ungroup/ungroup-all feature.
      * @param iLevels the number of levels which should be expanded, minimum is 0
      */
    /* CompleteClass */
    override def setNumberOfExpandedLevels(iLevels: Double): Unit = js.native
  }
  
  @JSGlobal("sap.ui.model.analytics.BatchResponseCollector")
  @js.native
  class BatchResponseCollector protected ()
    extends StObject
       with typings.openui5.sap.ui.model.analytics.BatchResponseCollector {
    /**
      * Constructor for a batch response collecting component.
      * @param mParams optional Setup-Parameter, @see BatchResponseCollector#setup
      */
    def this(mParams: js.Any) = this()
  }
  
  /**
    * If called on an instance of an (v1/v2) ODataModel it will enrich it with analytics capabilities.
    */
  inline def ODataModelAdapter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ODataModelAdapter")().asInstanceOf[Unit]
  
  object odata4analytics {
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.Dimension")
    @js.native
    class Dimension protected ()
      extends StObject
         with typings.openui5.sap.ui.model.analytics.odata4analytics.Dimension {
      /**
        * Create a representation of a dimension provided by an analytic query. Do not create your own
        * instances.
        * @param oQueryResult The query result containing this dimension
        * @param oProperty The DataJS object object representing the dimension
        */
      def this(
        oQueryResult: typings.openui5.sap.ui.model.analytics.odata4analytics.QueryResult,
        oProperty: js.Any
      ) = this()
      
      /**
        * Find attribute by name
        * @param sName Attribute name
        * @returns The dimension attribute         object with this name or null if it does not exist
        */
      /* CompleteClass */
      override def findAttributeByName(sName: String): typings.openui5.sap.ui.model.analytics.odata4analytics.Dimension = js.native
      
      /**
        * Get the names of all attributes included in this dimension
        * @returns List of all attribute names
        */
      /* CompleteClass */
      override def getAllAttributeNames(): js.Array[String] = js.native
      
      /**
        * Get all attributes of this dimension
        * @returns An object with individual JS properties for each         attribute of this dimension. The
        * JS object properties all are         objects of type odata4analytics.DimensionAttribute. The        
        * names of the JS object properties are given by the OData entity         type property names
        * representing the dimension attribute keys.
        */
      /* CompleteClass */
      override def getAllAttributes(): js.Any = js.native
      
      /**
        * Get query result containing this dimension
        * @returns The query result object
        */
      /* CompleteClass */
      override def getContainingQueryResult(): typings.openui5.sap.ui.model.analytics.odata4analytics.QueryResult = js.native
      
      /**
        * Get associated hierarchy
        * @returns The hierarchy object or null if there is none. It can         be an instance of class      
        *   odata4analytics.RecursiveHierarchy (TODO later: or a         leveled hierarchy). Use methods
        * isLeveledHierarchy and         isRecursiveHierarchy to determine object type.
        */
      /* CompleteClass */
      override def getHierarchy(): js.Any = js.native
      
      /**
        * Get the key property
        * @returns The DataJS object representing the property for the         dimension key
        */
      /* CompleteClass */
      override def getKeyProperty(): js.Any = js.native
      
      /**
        * Get label
        * @returns The (possibly language-dependent) label text for this         dimension
        */
      /* CompleteClass */
      override def getLabelText(): String = js.native
      
      /**
        * Get master data entity set for this dimension
        * @returns The master data entity set        for this dimension, or null, if it does not exist
        */
      /* CompleteClass */
      override def getMasterDataEntitySet(): typings.openui5.sap.ui.model.analytics.odata4analytics.EntitySet = js.native
      
      /**
        * Get the name of the dimension
        * @returns The name of this dimension, which is identical to the         name of the dimension key
        * property in the entity type
        */
      /* CompleteClass */
      override def getName(): String = js.native
      
      /**
        * Get super-ordinate dimension
        * @returns The super-ordinate dimension or null if there is none
        */
      /* CompleteClass */
      override def getSuperOrdinateDimension(): js.Any = js.native
      
      /**
        * Get text property related to this dimension
        * @returns The DataJS object representing the text property or         null if it does not exist
        */
      /* CompleteClass */
      override def getTextProperty(): js.Any = js.native
      
      /**
        * Get indicator whether or not master data is available for this dimension
        * @returns True iff master data is available
        */
      /* CompleteClass */
      override def hasMasterData(): Boolean = js.native
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.DimensionAttribute")
    @js.native
    class DimensionAttribute protected ()
      extends StObject
         with typings.openui5.sap.ui.model.analytics.odata4analytics.DimensionAttribute {
      /**
        * Create a representation of a dimension attribute provided by an analyticquery. Do not create your
        * own instances.
        * @param oQueryResult The query result containing this dimension attribute
        * @param oProperty The DataJS object object representing the dimension           attribute
        */
      def this(
        oQueryResult: typings.openui5.sap.ui.model.analytics.odata4analytics.QueryResult,
        oProperty: js.Any
      ) = this()
      
      /**
        * Get dimension
        * @returns The dimension object         containing this attribute
        */
      /* CompleteClass */
      override def getDimension(): typings.openui5.sap.ui.model.analytics.odata4analytics.Dimension = js.native
      
      /**
        * Get the key property
        * @returns The DataJS object representing the property for the key         of this dimension attribute
        */
      /* CompleteClass */
      override def getKeyProperty(): js.Any = js.native
      
      /**
        * Get label
        * @returns The (possibly language-dependent) label text for this         dimension attribute
        */
      /* CompleteClass */
      override def getLabelText(): String = js.native
      
      /**
        * Get the name of the dimension attribute
        * @returns The name of the dimension attribute, which is identical         to the name of the property
        * in the entity type holding the         attribute value
        */
      /* CompleteClass */
      override def getName(): String = js.native
      
      /**
        * Get text property related to this dimension attribute
        * @returns The DataJS object representing the text property or         null if it does not exist
        */
      /* CompleteClass */
      override def getTextProperty(): js.Any = js.native
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.DimensionMemberSetRequest")
    @js.native
    class DimensionMemberSetRequest protected ()
      extends StObject
         with typings.openui5.sap.ui.model.analytics.odata4analytics.DimensionMemberSetRequest {
      /**
        * Create a request object for interaction with a dimension value help. Such avalue help is served by
        * either the query result entity set, in which case thereturned dimension members are limited to those
        * also used in the query resultdata. Or, the value help is populated by a master data entity set, if
        * madeavailable by the service. In this case, the result will include all validmembers for that
        * dimension.
        * @param oDimension Description of a dimension
        * @param oParameterizationRequest (optional) Request object for           interactions with the
        * parameterization of the query result or (not           yet supported) master data entity set Such an
        * object is required           if the entity set holding the dimension members includes          
        * parameters.
        * @param bUseMasterData (optional) Indicates use of master data for           determining the
        * dimension members.
        */
      def this(
        oDimension: typings.openui5.sap.ui.model.analytics.odata4analytics.Dimension,
        oParameterizationRequest: typings.openui5.sap.ui.model.analytics.odata4analytics.ParameterizationRequest,
        bUseMasterData: Boolean
      ) = this()
      
      /**
        * Get the filter expression for this request.Expressions are represented by separate objects. If none
        * exists so far, anew expression object gets created.
        * @returns The filter object         associated to this request.
        */
      /* CompleteClass */
      override def getFilterExpression(): typings.openui5.sap.ui.model.analytics.odata4analytics.FilterExpression = js.native
      
      /**
        * Returns the current page boundaries as object with properties<code>start</code> and
        * <code>end</code>. If the end of the page isunbounded, <code>end</code> is null.
        * @returns the current page boundaries as object
        */
      /* CompleteClass */
      override def getResultPageBoundaries(): js.Any = js.native
      
      /**
        * Get the sort expression for this request.Expressions are represented by separate objects. If none
        * exists so far, anew expression object gets created.
        * @returns The sort object         associated to this request.
        */
      /* CompleteClass */
      override def getSortExpression(): typings.openui5.sap.ui.model.analytics.odata4analytics.SortExpression = js.native
      
      /**
        * Get the value of an query option for the OData request URI correspondingto this request.
        * @param sQueryOptionName Identifies the query option: $select,           $filter,... or any custom
        * query option
        * @returns The value of the requested query option or null, if         this option is not used for the
        * OData request.
        */
      /* CompleteClass */
      override def getURIQueryOptionValue(sQueryOptionName: String): String = js.native
      
      /**
        * Get the URI to locate the entity set for the dimension memebers.
        * @param sServiceRootURI (optional) Identifies the root of the OData           service
        * @returns The resource path of the URI pointing to the entity         set. It is a relative URI
        * unless a service root is given, which         would then prefixed in order to return a complete URL.
        */
      /* CompleteClass */
      override def getURIToDimensionMemberEntitySet(sServiceRootURI: String): String = js.native
      
      /**
        * Get the unescaped URI to fetch the dimension members, optionallyaugmented by text and attributes.
        * @param sServiceRootURI (optional) Identifies the root of the OData           service
        * @returns The unescaped URI that contains the OData resource path         and OData system query
        * options to express the request for the         parameter value set..
        */
      /* CompleteClass */
      override def getURIToDimensionMemberEntries(sServiceRootURI: String): String = js.native
      
      /**
        * Set the filter expression for this request.Expressions are represented by separate objects. Calling
        * this methodreplaces the filter object maintained by this request.
        * @param oFilter The filter object to be associated with this request.
        */
      /* CompleteClass */
      override def setFilterExpression(oFilter: typings.openui5.sap.ui.model.analytics.odata4analytics.FilterExpression): Unit = js.native
      
      /**
        * Set the parameterization request required for retrieving dimensionmembers directly from the query
        * result, if it is parameterized.
        * @param oParameterizationRequest Request object for interactions with the parameterization of        
        *   this query result
        */
      /* CompleteClass */
      override def setParameterizationRequest(oParameterizationRequest: js.Any): Unit = js.native
      
      /**
        * Set further options to be applied for the OData request
        * @param bIncludeCount Indicates whether or not the result shall           include a count for the
        * returned entities. Default is not to           include it. Pass null to keep current setting.
        */
      /* CompleteClass */
      override def setRequestOptions(bIncludeCount: Boolean): Unit = js.native
      
      /**
        * Specify that only a page of the query result shall be returned. A page isdescribed by its
        * boundaries, that are row numbers for the first and lastrows in the query result to be returned.
        * @param start The first row of the query result to be returned.           Numbering starts at 1.
        * Passing null is equivalent to start           with the first row.
        * @param end The last row of the query result to be returned. Passing           null is equivalent to
        * get all rows up to the end of the query           result.
        */
      /* CompleteClass */
      override def setResultPageBoundaries(start: Number, end: Number): Unit = js.native
      
      /**
        * Set the sort expression for this request.Expressions are represented by separate objects. Calling
        * this methodreplaces the sort object maintained by this request.
        * @param oSorter The sort object to be associated with this request.
        */
      /* CompleteClass */
      override def setSortExpression(oSorter: typings.openui5.sap.ui.model.analytics.odata4analytics.SortExpression): Unit = js.native
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.EntitySet")
    @js.native
    class EntitySet protected ()
      extends StObject
         with typings.openui5.sap.ui.model.analytics.odata4analytics.EntitySet {
      /**
        * Create a representation of an OData entity set in the context of an analyticquery. Do not create
        * your own instances.
        * @param oModel DataJS object for the OData model containing this entity           set
        * @param oSchema DataJS object for the schema surrounding the container of           this entity set
        * @param oContainer DataJS object for the container holding this entity set
        * @param oEntitySet DataJS object for the entity set
        * @param oEntityType DataJS object for the entity type
        */
      def this(oModel: js.Any, oSchema: js.Any, oContainer: js.Any, oEntitySet: js.Any, oEntityType: js.Any) = this()
      
      /**
        * Get entity type used for this entity set
        * @returns The DataJS object representing the entity type
        */
      /* CompleteClass */
      override def getEntityType(): js.Any = js.native
      
      /**
        * Get the fully qualified name for this entity type
        * @returns The fully qualified name
        */
      /* CompleteClass */
      override def getQName(): String = js.native
      
      /**
        * Get full description for this entity set
        * @returns The DataJS object representing the entity set
        */
      /* CompleteClass */
      override def getSetDescription(): js.Any = js.native
      
      /**
        * Get names of properties in this entity set that can be updated
        * @returns An object with individual JS properties for each         updatable property. For testing
        * whether propertyName is the name         of an updatable property, use        
        * <code>getUpdatablePropertyNameSet()[propertyName]</code>. The         included JS object properties
        * are all set to true.
        */
      /* CompleteClass */
      override def getUpdatablePropertyNameSet(): js.Any = js.native
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.EntityType")
    @js.native
    class EntityType protected ()
      extends StObject
         with typings.openui5.sap.ui.model.analytics.odata4analytics.EntityType {
      /**
        * Create a representation of an OData entity type in the context of an analyticquery. Do not create
        * your own instances.
        * @param oModel DataJS object for the OData model containing this entity           type
        * @param oSchema DataJS object for the schema containing this entity type
        * @param oEntityType DataJS object for the entity type
        */
      def this(oModel: js.Any, oSchema: js.Any, oEntityType: js.Any) = this()
      
      /**
        * Find property by name
        * @param sPropertyName Property name
        * @returns The DataJS object representing the property or null if         it does not exist
        */
      /* CompleteClass */
      override def findPropertyByName(sPropertyName: String): js.Any = js.native
      
      /**
        * Get the names of all properties with an associated hierarchy
        * @returns List of all property names
        */
      /* CompleteClass */
      override def getAllHierarchyPropertyNames(): js.Array[String] = js.native
      
      /**
        * Get names of properties that can be filtered, that is they can be used in$filter expressions
        * @returns Array with names of properties that can be         filtered.
        */
      /* CompleteClass */
      override def getFilterablePropertyNames(): js.Array[String] = js.native
      
      /**
        * Get heading of the property with specified name (identified by propertymetadata annotation
        * sap:heading)
        * @param sPropertyName Property name
        * @returns The heading string
        */
      /* CompleteClass */
      override def getHeadingOfProperty(sPropertyName: String): String = js.native
      
      /**
        * Get the hierarchy associated to a given property Based on the currentspecification, hierarchies are
        * always recursive. TODO: Extend behaviorwhen leveled hierarchies get in scope
        * @param sName Parameter name
        * @returns The hierarchy         object or null if it does not exist
        */
      /* CompleteClass */
      override def getHierarchy(sName: String): typings.openui5.sap.ui.model.analytics.odata4analytics.RecursiveHierarchy = js.native
      
      /**
        * Get key properties of this type
        * @returns The list of key property names
        */
      /* CompleteClass */
      override def getKeyProperties(): js.Array[String] = js.native
      
      /**
        * Get label of the property with specified name (identified by propertymetadata annotation sap:label)
        * @param sPropertyName Property name
        * @returns The label string
        */
      /* CompleteClass */
      override def getLabelOfProperty(sPropertyName: String): String = js.native
      
      /**
        * Get all properties
        * @returns Object with (JavaScript) properties, one for each (OData        entity type) property.
        * These (JavaScript) properties hold the        DataJS object representing the property
        */
      /* CompleteClass */
      override def getProperties(): js.Any = js.native
      
      /**
        * Get properties for which filter restrictions have been specified
        * @returns Object with (JavaScript) properties, one for each         (OData entity type) property. The
        * property value is from         odata4analytics.EntityType.propertyFilterRestriction and        
        * indicates the filter restriction for this property.
        */
      /* CompleteClass */
      override def getPropertiesWithFilterRestrictions(): js.Any = js.native
      
      /**
        * Get the fully qualified name for this entity type
        * @returns The fully qualified name
        */
      /* CompleteClass */
      override def getQName(): String = js.native
      
      /**
        * Get quick info of the property with specified name (identified by propertymetadata annotation
        * sap:quickinfo)
        * @param sPropertyName Property name
        * @returns The quick info string
        */
      /* CompleteClass */
      override def getQuickInfoOfProperty(sPropertyName: String): String = js.native
      
      /**
        * Get names of properties that must be filtered, that is they must appearin every $filter expression
        * @returns Array with names of properties that must be         filtered.
        */
      /* CompleteClass */
      override def getRequiredFilterPropertyNames(): js.Array[String] = js.native
      
      /**
        * Get names of properties that can be sorted, that is they can be used in$orderby expressions
        * @returns Array with names of properties that can be         sorted.
        */
      /* CompleteClass */
      override def getSortablePropertyNames(): js.Array[String] = js.native
      
      /**
        * Get the super-ordinate property related to the property with specifiedname (identified by property
        * metadata annotation sap:super-ordinate)
        * @param sPropertyName Property name
        * @returns The DataJS object representing the super-ordinate         property or null if it does not
        * exist
        */
      /* CompleteClass */
      override def getSuperOrdinatePropertyOfProperty(sPropertyName: String): js.Any = js.native
      
      /**
        * Get the text property related to the property with specified name(identified by property metadata
        * annotation sap:text)
        * @param sPropertyName Property name
        * @returns The DataJS object representing the text property or         null if it does not exist
        */
      /* CompleteClass */
      override def getTextPropertyOfProperty(sPropertyName: String): js.Any = js.native
      
      /**
        * Get full description for this entity type
        * @returns The DataJS object representing the entity type
        */
      /* CompleteClass */
      override def getTypeDescription(): js.Any = js.native
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.FilterExpression")
    @js.native
    class FilterExpression protected ()
      extends StObject
         with typings.openui5.sap.ui.model.analytics.odata4analytics.FilterExpression {
      /**
        * Create a representation of a filter expression for a given entity type. It can be rendered as value
        * for the $filter systemquery option.
        * @param oModel DataJS object for the OData model containing this entity type
        * @param oSchema DataJS object for the schema containing this entity type
        * @param oEntityType object for the entity type
        */
      def this(
        oModel: js.Any,
        oSchema: js.Any,
        oEntityType: typings.openui5.sap.ui.model.analytics.odata4analytics.EntityType
      ) = this()
      
      /**
        * Add a condition to the filter expression.Multiple conditions on the same property are combined with
        * a logical OR first, and in a second step conditions fordifferent properties are combined with a
        * logical AND.
        * @param sPropertyName The name of the property bound in the condition
        * @param sOperator operator used for the condition
        * @param oValue value to be used for this condition
        * @param oValue2 (optional) as second value to be used for this condition
        * @returns This object for method chaining
        */
      /* CompleteClass */
      override def addCondition(sPropertyName: String, sOperator: TypeofFilterOperator, oValue: js.Any, oValue2: js.Any): typings.openui5.sap.ui.model.analytics.odata4analytics.FilterExpression = js.native
      
      /**
        * Add a set condition to the filter expression.A set condition tests if the value of a property is
        * included in a set of given values. It is a convenience method forthis particular use case
        * eliminating the need for multiple API calls.
        * @param sPropertyName The name of the property bound in the condition
        * @param aValues values defining the set
        * @returns This object for method chaining
        */
      /* CompleteClass */
      override def addSetCondition(sPropertyName: String, aValues: js.Array[js.Any]): typings.openui5.sap.ui.model.analytics.odata4analytics.FilterExpression = js.native
      
      /**
        * Add an array of UI5 filter conditions to the filter expression.The UI5 filter condition is combined
        * with the other given conditions using a logical AND. This methodis particularly useful for passing
        * forward already created UI5 filter arrays.
        * @param aUI5Filter Array of UI5 filter objects
        * @returns This object for method chaining
        */
      /* CompleteClass */
      override def addUI5FilterConditions(aUI5Filter: js.Array[typings.openui5.sap.ui.model.Filter]): typings.openui5.sap.ui.model.analytics.odata4analytics.FilterExpression = js.native
      
      /**
        * Check if request is compliant with basic filter constraints expressed in metadata:(a) all properties
        * required in the filter expression have been referenced (b) the single-value filter restrictions have
        * been obeyed
        * @returns The value true. In case the expression violates some of the rules, an exception with some
        * explanatory         message is thrown
        */
      /* CompleteClass */
      override def checkValidity(): Boolean = js.native
      
      /**
        * Clear expression from any conditions that may have been set previously
        */
      /* CompleteClass */
      override def clear(): Unit = js.native
      
      /**
        * Get description for this entity type
        * @returns The object representing the entity type
        */
      /* CompleteClass */
      override def getEntityType(): typings.openui5.sap.ui.model.analytics.odata4analytics.EntityType = js.native
      
      /**
        * Get an array of SAPUI5 Filter objects corresponding to this expression.
        * @returns List of filter objects representing this expression
        */
      /* CompleteClass */
      override def getExpressionAsUI5FilterArray(): js.Array[typings.openui5.sap.ui.model.Filter] = js.native
      
      /**
        * Get the value for the OData system query option $filter corresponding to this expression.
        * @returns The $filter value for the filter expression
        */
      /* CompleteClass */
      override def getURIFilterOptionValue(): String = js.native
      
      /**
        * Remove all conditions for some property from the filter expression.All previously set conditions for
        * some property are removed from the filter expression.
        * @param sPropertyName The name of the property bound in the condition
        * @returns This object for method chaining
        */
      /* CompleteClass */
      override def removeConditions(sPropertyName: String): typings.openui5.sap.ui.model.analytics.odata4analytics.FilterExpression = js.native
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.Measure")
    @js.native
    class Measure protected ()
      extends StObject
         with typings.openui5.sap.ui.model.analytics.odata4analytics.Measure {
      /**
        * Create a representation of a measure provided by an analytic query. Do not create your own
        * instances.
        * @param oQueryResult The query result containing this measure
        * @param oProperty The DataJS object object representing the measure
        */
      def this(
        oQueryResult: typings.openui5.sap.ui.model.analytics.odata4analytics.QueryResult,
        oProperty: js.Any
      ) = this()
      
      /**
        * Get the text property associated to the raw value property holding theformatted value related to
        * this measure
        * @returns The DataJS object representing the property holding the         formatted value text of
        * this measure or null if this measure         does not have a unit
        */
      /* CompleteClass */
      override def getFormattedValueProperty(): js.Any = js.native
      
      /**
        * Get label
        * @returns The (possibly language-dependent) label text for this         measure
        */
      /* CompleteClass */
      override def getLabelText(): String = js.native
      
      /**
        * Get the name of the measure
        * @returns The name of the measure, which is identical to the name         of the measure raw value
        * property in the entity type
        */
      /* CompleteClass */
      override def getName(): String = js.native
      
      /**
        * Get the raw value property
        * @returns The DataJS object representing the property holding the         raw value of this measure
        */
      /* CompleteClass */
      override def getRawValueProperty(): js.Any = js.native
      
      /**
        * Get the unit property related to this measure
        * @returns The DataJS object representing the unit property or         null if this measure does not
        * have a unit
        */
      /* CompleteClass */
      override def getUnitProperty(): js.Any = js.native
      
      /**
        * Get indicator whether or not the measure is updatable
        * @returns True iff the measure is updatable
        */
      /* CompleteClass */
      override def isUpdatable(): Boolean = js.native
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.Model")
    @js.native
    class Model protected ()
      extends StObject
         with typings.openui5.sap.ui.model.analytics.odata4analytics.Model {
      /**
        * Create a representation of the analytical semantics of OData service metadata
        * @param oModelReference An instance of ReferenceByURI, ReferenceByModel or          
        * ReferenceWithWorkaround for locating the OData service.
        * @param mParameter Additional parameters for controlling the model construction. Currently supported
        * are:           <li> sAnnotationJSONDoc - A JSON document providing extra annotations to the elements
        * of the                structure of the given service           </li>           <li> modelVersion -
        * Parameter to define which ODataModel version should be used, in you use               
        * 'odata4analytics.Model.ReferenceByURI': 1 (default), 2                see also:
        * AnalyticalVersionInfo constants           </li>
        */
      def this(oModelReference: js.Any) = this()
      def this(oModelReference: js.Any, mParameter: js.Any) = this()
      
      /**
        * Find analytic query result by name
        * @param sName Fully qualified name of query result entity set
        * @returns The query result object         with this name or null if it does not exist
        */
      /* CompleteClass */
      override def findQueryResultByName(sName: String): typings.openui5.sap.ui.model.analytics.odata4analytics.QueryResult = js.native
      
      /**
        * Get the names of all query results (entity sets) offered by the model
        * @returns List of all query result names
        */
      /* CompleteClass */
      override def getAllQueryResultNames(): js.Array[String] = js.native
      
      /**
        * Get all query results offered by the model
        * @returns An object with individual JS properties for each query         result included in the
        * model. The JS object properties all are         objects of type odata4analytics.QueryResult. The
        * names         of the JS object properties are given by the entity set names         representing the
        * query results.
        */
      /* CompleteClass */
      override def getAllQueryResults(): js.Any = js.native
      
      /**
        * Get underlying OData model provided by SAP UI5
        * @returns The SAP UI5 representation of the model.
        */
      /* CompleteClass */
      override def getODataModel(): js.Any = js.native
    }
    object Model {
      
      @JSGlobal("sap.ui.model.analytics.odata4analytics.Model.ReferenceByModel")
      @js.native
      class ReferenceByModel protected ()
        extends StObject
           with typings.openui5.sap.ui.model.analytics.odata4analytics.Model.ReferenceByModel {
        /**
          * Create a reference to an OData model already loaded elsewhere with the helpof SAP UI5.
          * @param oModel holding the OData model.
          */
        def this(oModel: js.Any) = this()
      }
      
      @JSGlobal("sap.ui.model.analytics.odata4analytics.Model.ReferenceByURI")
      @js.native
      class ReferenceByURI protected ()
        extends StObject
           with typings.openui5.sap.ui.model.analytics.odata4analytics.Model.ReferenceByURI {
        /**
          * Create a reference to an OData model by the URI of the related OData service.
          * @param sURI holding the URI.
          */
        def this(sURI: String) = this()
      }
      
      @JSGlobal("sap.ui.model.analytics.odata4analytics.Model.ReferenceWithWorkaround")
      @js.native
      class ReferenceWithWorkaround protected ()
        extends StObject
           with typings.openui5.sap.ui.model.analytics.odata4analytics.Model.ReferenceWithWorkaround {
        /**
          * Create a reference to an OData model having certain workarounds activated. Aworkaround is an
          * implementation that changes the standard behavior of the APIto overcome some gap or limitation in
          * the OData provider. The workaroundimplementation can be conditionally activated by passing the
          * identifier inthe contructor.Known workaround identifiers are:<li>"CreateLabelsFromTechnicalNames" -
          * If a property has no label text, itgets generated from the property
          * name.</li><li>"IdentifyTextPropertiesByName" -If a dimension property has no text andanother
          * property with the same name and an appended "Name", "Text" etc.exists, they are linked via
          * annotation.</li>
          * @param oModel holding a reference to the OData model, obtained           by
          * odata4analytics.Model.ReferenceByModel or by           sap.odata4analytics.Model.ReferenceByURI.
          * @param aWorkaroundID listing all workarounds to be applied.
          */
        def this(oModel: js.Any, aWorkaroundID: js.Array[String]) = this()
      }
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.Parameter")
    @js.native
    class Parameter protected ()
      extends StObject
         with typings.openui5.sap.ui.model.analytics.odata4analytics.Parameter {
      /**
        * Create a representation of a single parameter contained in a parameterization. Do not create your
        * own instances.
        * @param oParameterization The parameterization containing this parameter
        * @param oProperty The DataJS object object representing the text property
        */
      def this(
        oParameterization: typings.openui5.sap.ui.model.analytics.odata4analytics.Parameterization,
        oProperty: js.Any
      ) = this()
      
      /**
        * Get parameterization containing this parameter
        * @returns The parameterization        object
        */
      /* CompleteClass */
      override def getContainingParameterization(): typings.openui5.sap.ui.model.analytics.odata4analytics.Parameterization = js.native
      
      /**
        * Get label
        * @returns The (possibly language-dependent) label text for this         parameter
        */
      /* CompleteClass */
      override def getLabelText(): String = js.native
      
      /**
        * Get the name of the parameter
        * @returns The name of the parameter, which is identical with the         name of the property
        * representing the parameter in the         parameterization entity type
        */
      /* CompleteClass */
      override def getName(): String = js.native
      
      /**
        * Get property for the parameter representing the peer boundary of the sameinterval
        * @returns The parameter representing         the peer boundary of the same interval. This means that
        * if         *this* parameter is a lower boundary, the returned object
        */
      /* CompleteClass */
      override def getPeerIntervalBoundaryParameter(): typings.openui5.sap.ui.model.analytics.odata4analytics.Parameter = js.native
      
      /**
        * Get property
        */
      /* CompleteClass */
      override def getProperty(): js.Any = js.native
      
      /**
        * Get text property related to this parameter
        * @returns The DataJS object representing the text property or         null if it does not exist
        */
      /* CompleteClass */
      override def getTextProperty(): js.Any = js.native
      
      /**
        * Get the URI to locate the entity set holding the value set, if it isavailable.
        * @param sServiceRootURI (optional) Identifies the root of the OData           service
        */
      /* CompleteClass */
      override def getURIToValueEntitySet(sServiceRootURI: String): Unit = js.native
      
      /**
        * Get indicator if the parameter represents an interval boundary
        * @returns True iff it represents an interval boundary, otherwise         false
        */
      /* CompleteClass */
      override def isIntervalBoundary(): Boolean = js.native
      
      /**
        * Get indicator if the parameter represents the lower boundary of aninterval
        * @returns True iff it represents the lower boundary of an         interval, otherwise false
        */
      /* CompleteClass */
      override def isLowerIntervalBoundary(): Boolean = js.native
      
      /**
        * Get indicator whether or not the parameter is optional
        * @returns True iff the parameter is optional
        */
      /* CompleteClass */
      override def isOptional(): Boolean = js.native
      
      /**
        * Get indicator if a set of values is available for this parameter.Typically, this is true for
        * parameters with a finite set of known valuessuch as products, business partners in different roles,
        * organizationunits, and false for integer or date parameters
        * @returns True iff a value set is available, otherwise false
        */
      /* CompleteClass */
      override def isValueSetAvailable(): Boolean = js.native
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.ParameterValueSetRequest")
    @js.native
    class ParameterValueSetRequest protected ()
      extends StObject
         with typings.openui5.sap.ui.model.analytics.odata4analytics.ParameterValueSetRequest {
      /**
        * Create a request object for interaction with a query parameter value help.
        * @param oParameter Description of a query parameter
        */
      def this(oParameter: typings.openui5.sap.ui.model.analytics.odata4analytics.Parameter) = this()
      
      /**
        * Get the filter expression for this request.Expressions are represented by separate objects. If none
        * exists so far, anew expression object gets created.
        * @returns The filter object         associated to this request.
        */
      /* CompleteClass */
      override def getFilterExpression(): typings.openui5.sap.ui.model.analytics.odata4analytics.FilterExpression = js.native
      
      /**
        * Get the sort expression for this request.Expressions are represented by separate objects. If none
        * exists so far, anew expression object gets created.
        * @returns The sort object         associated to this request.
        */
      /* CompleteClass */
      override def getSortExpression(): typings.openui5.sap.ui.model.analytics.odata4analytics.SortExpression = js.native
      
      /**
        * Get the value of an query option for the OData request URI correspondingto this request.
        * @param sQueryOptionName Identifies the query option: $select,           $filter,... or any custom
        * query option
        * @returns The value of the requested query option or null, if         this option is not used for the
        * OData request.
        */
      /* CompleteClass */
      override def getURIQueryOptionValue(sQueryOptionName: String): String = js.native
      
      /**
        * Get the unescaped URI to fetch the parameter value set.
        * @param sServiceRootURI (optional) Identifies the root of the OData           service
        * @returns The unescaped URI that contains the OData resource path         and OData system query
        * options to express the request for the         parameter value set..
        */
      /* CompleteClass */
      override def getURIToParameterValueSetEntries(sServiceRootURI: String): String = js.native
      
      /**
        * Specify which components of the parameter shall be included in the valueset.
        * @param bIncludeText Indicator whether or not to include the parameter text (if           available)
        * in the value set. Pass null to keep current           setting.
        */
      /* CompleteClass */
      override def includeParameterText(bIncludeText: js.Any): Unit = js.native
      
      /**
        * Set the filter expression for this request.Expressions are represented by separate objects. Calling
        * this methodreplaces the filter object maintained by this request.
        * @param oFilter The filter object to be associated with this request.
        */
      /* CompleteClass */
      override def setFilterExpression(oFilter: typings.openui5.sap.ui.model.analytics.odata4analytics.FilterExpression): Unit = js.native
      
      /**
        * Set the sort expression for this request.Expressions are represented by separate objects. Calling
        * this methodreplaces the sort object maintained by this request.
        * @param oSorter The sort object to be associated with this request.
        */
      /* CompleteClass */
      override def setSortExpression(oSorter: typings.openui5.sap.ui.model.analytics.odata4analytics.SortExpression): Unit = js.native
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.Parameterization")
    @js.native
    class Parameterization protected ()
      extends StObject
         with typings.openui5.sap.ui.model.analytics.odata4analytics.Parameterization {
      /**
        * Create a representation of a parameterization for an analytic query. Do not create your own
        * instances.
        * @param oEntityType The OData entity type for this parameterization
        * @param oEntitySet The OData entity set for this parameterization offered           by the OData
        * service
        */
      def this(
        oEntityType: typings.openui5.sap.ui.model.analytics.odata4analytics.EntityType,
        oEntitySet: typings.openui5.sap.ui.model.analytics.odata4analytics.EntitySet
      ) = this()
      
      /**
        * Find parameter by name
        * @param sName Parameter name
        * @returns The parameter object with         this name or null if it does not exist
        */
      /* CompleteClass */
      override def findParameterByName(sName: String): typings.openui5.sap.ui.model.analytics.odata4analytics.Parameter = js.native
      
      /**
        * Get the names of all parameters part of the parameterization
        * @returns List of all parameter names
        */
      /* CompleteClass */
      override def getAllParameterNames(): js.Array[String] = js.native
      
      /**
        * Get all parameters included in this parameterization
        * @returns An object with individual JS properties for each         parameter included in the query
        * result. The JS object properties         all are objects of type odata4analytics.Parameter. The     
        *    names of the JS object properties are given by the OData entity         type property names
        * representing the parameter keys.
        */
      /* CompleteClass */
      override def getAllParameters(): js.Any = js.native
      
      /**
        * Get the entity set representing this query result in the OData model
        * @returns The OData entity set         representing this query result
        */
      /* CompleteClass */
      override def getEntitySet(): typings.openui5.sap.ui.model.analytics.odata4analytics.EntitySet = js.native
      
      /**
        * Get the entity type defining the type of this query result in the ODatamodel
        * @returns The OData entity type for         this query result
        */
      /* CompleteClass */
      override def getEntityType(): typings.openui5.sap.ui.model.analytics.odata4analytics.EntityType = js.native
      
      /**
        * Get the name of the parameter
        * @returns The name of the parameterization, which is identical         with the name of the entity
        * set representing the         parameterization in the OData service
        */
      /* CompleteClass */
      override def getName(): String = js.native
      
      /**
        * Get navigation property to query result
        * @returns The parameter object with         this name or null if it does not exist
        */
      /* CompleteClass */
      override def getNavigationPropertyToQueryResult(): typings.openui5.sap.ui.model.analytics.odata4analytics.QueryResult = js.native
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.ParameterizationRequest")
    @js.native
    class ParameterizationRequest protected ()
      extends StObject
         with typings.openui5.sap.ui.model.analytics.odata4analytics.ParameterizationRequest {
      /**
        * Create a request object for interaction with a query parameterization.
        * @param oParameterization Description of a query parameterization
        */
      def this(oParameterization: typings.openui5.sap.ui.model.analytics.odata4analytics.Parameterization) = this()
      
      /**
        * Get the description of the parameterization on which this requestoperates on
        * @returns Description of a         query parameterization
        */
      /* CompleteClass */
      override def getParameterization(): typings.openui5.sap.ui.model.analytics.odata4analytics.Parameterization = js.native
      
      /**
        * Get the URI to locate the entity set for the query parameterization.
        * @param sServiceRootURI (optional) Identifies the root of the OData           service
        */
      /* CompleteClass */
      override def getURIToParameterizationEntitySet(sServiceRootURI: String): Unit = js.native
      
      /**
        * Get the URI to locate the parameterization entity for the values assignedto all parameters
        * beforehand. Notice that a value must be supplied forevery parameter including those marked as
        * optional. For optionalparameters, assign the special value that the service provider uses as
        * an"omitted" value. For example, for services based on BW Easy Queries, thiswould be an empty string.
        * @param sServiceRootURI (optional) Identifies the root of the OData           service
        */
      /* CompleteClass */
      override def getURIToParameterizationEntry(sServiceRootURI: String): Unit = js.native
      
      /**
        * Assign a value to a parameter
        * @param sParameterName Name of the parameter. In case of a range           value, provide the name of
        * the lower boundary parameter.
        * @param sValue Assigned value. Pass null to remove a value assignment.
        * @param sToValue Omit it or set it to null for single values. If set,           it will be assigned
        * to the upper boundary parameter
        */
      /* CompleteClass */
      override def setParameterValue(sParameterName: String, sValue: String, sToValue: String): Unit = js.native
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.QueryResult")
    @js.native
    class QueryResult protected ()
      extends StObject
         with typings.openui5.sap.ui.model.analytics.odata4analytics.QueryResult {
      /**
        * Create a representation of an analytic query. Do not create your own instances.
        * @param oModel The analytical model containing this query result entity           set
        * @param oEntityType The OData entity type for this query
        * @param oEntitySet The OData entity set for this query offered by the           OData service
        * @param oParameterization The parameterization of this query, if any
        */
      def this(
        oModel: typings.openui5.sap.ui.model.analytics.odata4analytics.Model,
        oEntityType: typings.openui5.sap.ui.model.analytics.odata4analytics.EntityType,
        oEntitySet: typings.openui5.sap.ui.model.analytics.odata4analytics.EntitySet,
        oParameterization: typings.openui5.sap.ui.model.analytics.odata4analytics.Parameterization
      ) = this()
      
      /**
        * Find dimension by name
        * @param sName Dimension name
        * @returns The dimension object with         this name or null if it does not exist
        */
      /* CompleteClass */
      override def findDimensionByName(sName: String): typings.openui5.sap.ui.model.analytics.odata4analytics.Dimension = js.native
      
      /**
        * Find dimension by property name
        * @param sName Property name
        * @returns The dimension object to         which the given property name is related, because the
        * property         holds the dimension key, its text, or is an attribute of this         dimension. If
        * no such dimension exists, null is returned.
        */
      /* CompleteClass */
      override def findDimensionByPropertyName(sName: String): typings.openui5.sap.ui.model.analytics.odata4analytics.Dimension = js.native
      
      /**
        * Find measure by name
        * @param sName Measure name
        * @returns The measure object with this         name or null if it does not exist
        */
      /* CompleteClass */
      override def findMeasureByName(sName: String): typings.openui5.sap.ui.model.analytics.odata4analytics.Measure = js.native
      
      /**
        * Find measure by property name
        * @param sName Property name
        * @returns The measure object to which         the given property name is related, because the
        * property holds         the raw measure value or its formatted value. If no such measure        
        * exists, null is returned.
        */
      /* CompleteClass */
      override def findMeasureByPropertyName(sName: String): typings.openui5.sap.ui.model.analytics.odata4analytics.Measure = js.native
      
      /**
        * Get the names of all dimensions included in the query result
        * @returns List of all dimension names
        */
      /* CompleteClass */
      override def getAllDimensionNames(): js.Array[String] = js.native
      
      /**
        * Get all dimensions included in this query result
        * @returns An object with individual JS properties for each         dimension included in the query
        * result. The JS object properties         all are objects of type odata4analytics.Dimension. The     
        *    names of the JS object properties are given by the OData entity         type property names
        * representing the dimension keys.
        */
      /* CompleteClass */
      override def getAllDimensions(): js.Any = js.native
      
      /**
        * Get the names of all measures included in the query result
        * @returns List of all measure names
        */
      /* CompleteClass */
      override def getAllMeasureNames(): js.Array[String] = js.native
      
      /**
        * Get all measures included in this query result
        * @returns An object with individual JS properties for each         measure included in the query
        * result. The JS object properties         all are objects of type odata4analytics.Measure. The       
        *  names of the JS object properties are given by the OData entity         type property names
        * representing the measure raw values.
        */
      /* CompleteClass */
      override def getAllMeasures(): js.Any = js.native
      
      /**
        * Get the entity set representing this query result in the OData model
        * @returns The OData entity set         representing this query result
        */
      /* CompleteClass */
      override def getEntitySet(): typings.openui5.sap.ui.model.analytics.odata4analytics.EntitySet = js.native
      
      /**
        * Get the entity type defining the type of this query result in the ODatamodel
        * @returns The OData entity type for         this query result
        */
      /* CompleteClass */
      override def getEntityType(): typings.openui5.sap.ui.model.analytics.odata4analytics.EntityType = js.native
      
      /**
        * Get the analytical model containing the entity set for this query result
        * @returns The analytical representation of the OData model
        */
      /* CompleteClass */
      override def getModel(): js.Any = js.native
      
      /**
        * Get the name of the query result
        * @returns The fully qualified name of the query result, which is         identical with the name of
        * the entity set representing the query         result in the OData service
        */
      /* CompleteClass */
      override def getName(): String = js.native
      
      /**
        * Get the parameterization of this query result
        * @returns The object for the         parameterization or null if the query result is not        
        * parameterized
        */
      /* CompleteClass */
      override def getParameterization(): typings.openui5.sap.ui.model.analytics.odata4analytics.Parameterization = js.native
      
      /**
        * Get property holding the totaled property list
        * @returns The DataJS object representing this property
        */
      /* CompleteClass */
      override def getTotaledPropertiesListProperty(): js.Any = js.native
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.QueryResultRequest")
    @js.native
    class QueryResultRequest protected ()
      extends StObject
         with typings.openui5.sap.ui.model.analytics.odata4analytics.QueryResultRequest {
      /**
        * Create a request object for interaction with a query result.
        * @param oQueryResult Description of a query parameterization
        * @param oParameterizationRequest Request object for           interactions with the parameterization
        * of this query. Only           required if the query service includes parameters.
        */
      def this(oQueryResult: typings.openui5.sap.ui.model.analytics.odata4analytics.QueryResult) = this()
      def this(
        oQueryResult: typings.openui5.sap.ui.model.analytics.odata4analytics.QueryResult,
        oParameterizationRequest: typings.openui5.sap.ui.model.analytics.odata4analytics.ParameterizationRequest
      ) = this()
      
      /**
        * Add one or more dimensions to the aggregation level
        * @param aDimensionName Array of dimension names to be added to the already defined          
        * aggregation level.
        */
      /* CompleteClass */
      override def addToAggregationLevel(aDimensionName: js.Any): Unit = js.native
      
      /**
        * Get the names of the dimensions included in the aggregation level
        * @returns The dimension names included in the aggregation level
        */
      /* CompleteClass */
      override def getAggregationLevel(): js.Array[js.Any] = js.native
      
      /**
        * Get details about a dimensions included in the aggregation level
        * @param sDImensionName Name of a dimension included in the aggregation level of this          
        * request, for which details shall be returned
        * @returns An object with three properties named key and text,         both with Boolean values
        * indicating whether the key and text of         this dimension are included in this request. The
        * third property         named attributes is an array of attribute names of this         dimension
        * included in this request, or null, if there are none.
        */
      /* CompleteClass */
      override def getAggregationLevelDetails(sDImensionName: js.Any): js.Any = js.native
      
      /**
        * Get the filter expression for this request.Expressions are represented by separate objects. If none
        * exists so far, anew expression object gets created.
        * @returns The filter object         associated to this request.
        */
      /* CompleteClass */
      override def getFilterExpression(): typings.openui5.sap.ui.model.analytics.odata4analytics.FilterExpression = js.native
      
      /**
        * Get the names of the measures included in the query result request
        * @returns The measure names included in the query result request
        */
      /* CompleteClass */
      override def getMeasureNames(): js.Array[js.Any] = js.native
      
      /**
        * Retrieves the current parametrization request
        */
      /* CompleteClass */
      override def getParameterizationRequest(): js.Any = js.native
      
      /**
        * Get the description of the query result on which this request operates on
        * @returns Description of a query         result
        */
      /* CompleteClass */
      override def getQueryResult(): typings.openui5.sap.ui.model.analytics.odata4analytics.QueryResult = js.native
      
      /**
        * Returns the current page boundaries as object with properties<code>start</code> and
        * <code>end</code>. If the end of the page isunbounded, <code>end</code> is null.
        * @returns the current page boundaries as object
        */
      /* CompleteClass */
      override def getResultPageBoundaries(): js.Any = js.native
      
      /**
        * Get the sort expression for this request.Expressions are represented by separate objects. If none
        * exists so far, anew expression object gets created.
        * @returns The sort object         associated to this request.
        */
      /* CompleteClass */
      override def getSortExpression(): typings.openui5.sap.ui.model.analytics.odata4analytics.SortExpression = js.native
      
      /**
        * Get the value of an query option for the OData request URI correspondingto this request.
        * @param sQueryOptionName Identifies the query option: $select,           $filter,$orderby ... or any
        * custom query option
        * @returns The value of the requested query option or null, if         this option is not used for the
        * OData request.
        */
      /* CompleteClass */
      override def getURIQueryOptionValue(sQueryOptionName: String): String = js.native
      
      /**
        * Get the URI to locate the entity set for the query result.
        * @param sServiceRootURI (optional) Identifies the root of the OData           service
        * @returns The resource path of the URI pointing to the entity         set. It is a relative URI
        * unless a service root is given, which         would then prefixed in order to return a complete URL.
        */
      /* CompleteClass */
      override def getURIToQueryResultEntitySet(sServiceRootURI: String): String = js.native
      
      /**
        * Get the unescaped URI to fetch the query result.
        * @param sServiceRootURI (optional) Identifies the root of the OData           service
        * @param sResourcePath (optional) OData resource path to be considered.           If provided, it
        * overwrites any parameterization object that           might have been specified separately.
        * @returns The unescaped URI that contains the OData resource path         and OData system query
        * options to express the aggregation level,         filter expression and further options.
        */
      /* CompleteClass */
      override def getURIToQueryResultEntries(sServiceRootURI: String, sResourcePath: String): String = js.native
      
      /**
        * Specify which dimension components shall be included in the query result.The settings get applied to
        * the currently defined aggregation level.
        * @param sDimensionName Name of the dimension for which the settings get applied.           Specify
        * null to apply the settings to all dimensions in the           aggregation level.
        * @param bIncludeKey Indicator whether or not to include the dimension key in the           query
        * result. Pass null to keep current setting.
        * @param bIncludeText Indicator whether or not to include the dimension text (if           available)
        * in the query result. Pass null to keep current           setting.
        * @param aAttributeName Array of dimension attribute names to be included in the           result.
        * Pass null to keep current setting. This argument is           ignored if sDimensionName is null.
        */
      /* CompleteClass */
      override def includeDimensionKeyTextAttributes(sDimensionName: js.Any, bIncludeKey: js.Any, bIncludeText: js.Any, aAttributeName: js.Any): Unit = js.native
      
      /**
        * Specify which measure components shall be included in the query result.The settings get applied to
        * the currently set measures.
        * @param sMeasureName Name of the measure for which the settings get applied.           Specify null
        * to apply the settings to all currently set           measures.
        * @param bIncludeRawValue Indicator whether or not to include the raw value in the query          
        * result. Pass null to keep current setting.
        * @param bIncludeFormattedValue Indicator whether or not to include the formatted value (if          
        * available) in the query result. Pass null to keep current           setting.
        * @param bIncludeUnit Indicator whether or not to include the unit (if available) in           the
        * query result. Pass null to keep current setting.
        */
      /* CompleteClass */
      override def includeMeasureRawFormattedValueUnit(
        sMeasureName: js.Any,
        bIncludeRawValue: js.Any,
        bIncludeFormattedValue: js.Any,
        bIncludeUnit: js.Any
      ): Unit = js.native
      
      /**
        * Remove one or more dimensions from the aggregation level. The method alsoremoved a potential sort
        * expression on the dimension.
        * @param aDimensionName Array of dimension names to be removed from the already           defined
        * aggregation level.
        */
      /* CompleteClass */
      override def removeFromAggregationLevel(aDimensionName: js.Any): Unit = js.native
      
      /**
        * Set the aggregation level for the query result request. By default, thequery result will include the
        * properties holding the keys of the givendimensions. This setting can be changed
        * usingincludeDimensionKeyTextAttributes.
        * @param aDimensionName Array of dimension names to be part of the aggregation level.           If
        * null, the aggregation level includes all dimensions, if           empty, no dimension is included.
        */
      /* CompleteClass */
      override def setAggregationLevel(aDimensionName: js.Any): Unit = js.native
      
      /**
        * Set the filter expression for this request.Expressions are represented by separate objects. Calling
        * this methodreplaces the filter object maintained by this request.
        * @param oFilter The filter object to be associated with this request.
        */
      /* CompleteClass */
      override def setFilterExpression(oFilter: typings.openui5.sap.ui.model.analytics.odata4analytics.FilterExpression): Unit = js.native
      
      /**
        * Set the measures to be included in the query result request. By default,the query result will
        * include the properties holding the raw values ofthe given measures. This setting can be changed
        * usingincludeMeasureRawFormattedValueUnit.
        * @param aMeasureName Array of measure names to be part of the query result request.           If
        * null, the request includes all measures, if empty, no           measure is included.
        */
      /* CompleteClass */
      override def setMeasures(aMeasureName: js.Any): Unit = js.native
      
      /**
        * Set the parameterization request required for interactions with the queryresult of parameterized
        * queries. This method provides an alternative wayto assign a parameterization request to a query
        * result request.
        * @param oParameterizationRequest Request object for interactions with the parameterization of        
        *   this query
        */
      /* CompleteClass */
      override def setParameterizationRequest(oParameterizationRequest: js.Any): Unit = js.native
      
      /**
        * Set further options to be applied for the OData request to fetch thequery result
        * @param bIncludeEntityKey Indicates whether or not the entity key           should be returned for
        * every entry in the query result.           Default is not to include it. Pass null to keep current  
        *         setting.
        * @param bIncludeCount Indicates whether or not the result shall           include a count for the
        * returned entities. Default is not to           include it. Pass null to keep current setting.
        * @param bReturnNoEntities Indicates whether or not the result shall           be empty. This will
        * translate to $top=0 in the OData request and override           any setting done with
        * setResultPageBoundaries. The default is not to           suppress entities in the result. Pass null
        * to keep current setting.           The main use case for this option is to create a request         
        *  with $inlinecount returning an entity count.
        */
      /* CompleteClass */
      override def setRequestOptions(bIncludeEntityKey: Boolean, bIncludeCount: Boolean, bReturnNoEntities: Boolean): Unit = js.native
      
      /**
        * Set the resource path to be considered for the OData request URI of thisquery request object. This
        * method provides an alternative way to assign apath comprising a parameterization. If a path is
        * provided, it overwritesany parameterization object that might have been specified separately.
        * @param sResourcePath Resource path pointing to the entity set of the query result.           Must
        * include a valid parameterization if query contains           parameters.
        */
      /* CompleteClass */
      override def setResourcePath(sResourcePath: js.Any): Unit = js.native
      
      /**
        * Specify that only a page of the query result shall be returned. A page isdescribed by its
        * boundaries, that are row numbers for the first and lastrows in the query result to be returned.
        * @param start The first row of the query result to be returned.           Numbering starts at 1.
        * Passing null is equivalent to start           with the first row.
        * @param end The last row of the query result to be returned. Passing           null is equivalent to
        * get all rows up to the end of the query           result.
        */
      /* CompleteClass */
      override def setResultPageBoundaries(start: Number, end: Number): Unit = js.native
      
      /**
        * Set the sort expression for this request.Expressions are represented by separate objects. Calling
        * this methodreplaces the sort object maintained by this request.
        * @param oSorter The sort object to be associated with this request.
        */
      /* CompleteClass */
      override def setSortExpression(oSorter: typings.openui5.sap.ui.model.analytics.odata4analytics.SortExpression): Unit = js.native
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.RecursiveHierarchy")
    @js.native
    class RecursiveHierarchy protected ()
      extends StObject
         with typings.openui5.sap.ui.model.analytics.odata4analytics.RecursiveHierarchy {
      /**
        * Create a representation of a recursive hierarchy defined on one multipleproperties in an OData
        * entity type query. Do not create your own instances.
        * @param oEntityType object for the entity type
        * @param oNodeIDProperty DataJS object for the property holding the           hierarchy node ID
        * identifying the hierarchy node to which the           OData entry belongs
        * @param oParentNodeIDProperty DataJS object for the property holding the           node ID of the
        * parent of the hierarchy node pointed to by the           value of oNodeIDProperty
        * @param oNodeLevelProperty DataJS object for the property holding the           level number for the
        * of the hierarchy node pointed to by the value           of oNodeIDProperty
        * @param oNodeValueProperty DataJS object for the property holding the data           value for the of
        * the hierarchy node pointed to by the value of           oNodeIDProperty
        */
      def this(
        oEntityType: typings.openui5.sap.ui.model.analytics.odata4analytics.EntityType,
        oNodeIDProperty: js.Any,
        oParentNodeIDProperty: js.Any,
        oNodeLevelProperty: js.Any,
        oNodeValueProperty: js.Any
      ) = this()
      
      /**
        * Get the property holding the node ID of the hierarchy node
        * @returns The DataJS object representing this property
        */
      /* CompleteClass */
      override def getNodeIDProperty(): js.Any = js.native
      
      /**
        * Get the property holding the level of the hierarchy node
        * @returns The DataJS object representing this property
        */
      /* CompleteClass */
      override def getNodeLevelProperty(): js.Any = js.native
      
      /**
        * Get the property holding the value that is structurally organized by thehierarchy
        * @returns The DataJS object representing this property
        */
      /* CompleteClass */
      override def getNodeValueProperty(): js.Any = js.native
      
      /**
        * Get the property holding the parent node ID of the hierarchy node
        * @returns The DataJS object representing this property
        */
      /* CompleteClass */
      override def getParentNodeIDProperty(): js.Any = js.native
      
      /**
        * Get indicator if this is a leveled hierarchy
        * @returns False
        */
      /* CompleteClass */
      override def isLeveledHierarchy(): Boolean = js.native
      
      /**
        * Get indicator if this is a recursive hierarchy
        * @returns True
        */
      /* CompleteClass */
      override def isRecursiveHierarchy(): Boolean = js.native
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.SortExpression")
    @js.native
    class SortExpression protected ()
      extends StObject
         with typings.openui5.sap.ui.model.analytics.odata4analytics.SortExpression {
      /**
        * Create a representation of an order by expression for a given entity type. Itcan be rendered as
        * value for the $orderby system query option.
        * @param oModel DataJS object for the OData model containing this entity           type
        * @param oSchema DataJS object for the schema containing this entity type
        * @param oEntityType object for the entity type
        */
      def this(
        oModel: js.Any,
        oSchema: js.Any,
        oEntityType: typings.openui5.sap.ui.model.analytics.odata4analytics.EntityType
      ) = this()
      
      /**
        * Add a condition to the order by expression. It replaces any previously specifiedsort order for the
        * property.
        * @param sPropertyName The name of the property bound in the condition
        * @param sSortOrder sorting order used for the condition
        * @returns This object for method         chaining
        */
      /* CompleteClass */
      override def addSorter(sPropertyName: String, sSortOrder: js.Any): typings.openui5.sap.ui.model.analytics.odata4analytics.SortExpression = js.native
      
      /**
        * Clear expression from any sort conditions that may have been setpreviously
        */
      /* CompleteClass */
      override def clear(): Unit = js.native
      
      /**
        * Get description for this entity type
        * @returns The object representing the         entity type
        */
      /* CompleteClass */
      override def getEntityType(): typings.openui5.sap.ui.model.analytics.odata4analytics.EntityType = js.native
      
      /**
        * Get the first SAPUI5 Sorter object.
        * @returns first sorter object or null if empty
        */
      /* CompleteClass */
      override def getExpressionAsUI5Sorter(): typings.openui5.sap.ui.model.Sorter = js.native
      
      /**
        * Get an array of SAPUI5 Sorter objects corresponding to this expression.
        * @returns List of sorter objects representing         this expression
        */
      /* CompleteClass */
      override def getExpressionsAsUI5SorterArray(): js.Array[typings.openui5.sap.ui.model.Sorter] = js.native
      
      /**
        * Get the value for the OData system query option $orderby corresponding tothis expression.
        * @param oSelectedPropertyNames Object with properties requested for $select
        * @returns The $orderby value for the sort expressions
        */
      /* CompleteClass */
      override def getURIOrderByOptionValue(oSelectedPropertyNames: js.Any): String = js.native
      
      /**
        * Removes the order by expression for the given property name from the listof order by expression. If
        * no order by expression with this property nameexists the method does nothing.
        * @param sPropertyName The name of the property to be removed from the           condition
        */
      /* CompleteClass */
      override def removeSorter(sPropertyName: String): Unit = js.native
    }
    
    /**
      * Specify which components of the dimension shall be included in the valueset.
      * @param bIncludeText Indicator whether or not to include the dimension text (if           available)
      * in the value set.
      * @param bIncludeAttributes Indicator whether or not to include all dimension attributes           (if
      * available) in the value set.
      */
    inline def includeDimensionTextAttributes(bIncludeText: js.Any, bIncludeAttributes: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("includeDimensionTextAttributes")(bIncludeText.asInstanceOf[js.Any], bIncludeAttributes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
