package typings.openui5.global.sap.ui.model

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object analytics {
  
  @JSGlobal("sap.ui.model.analytics.AnalyticalBinding")
  @js.native
  class AnalyticalBinding ()
    extends typings.openui5.sap.ui.model.analytics.AnalyticalBinding
  
  @JSGlobal("sap.ui.model.analytics.AnalyticalTreeBindingAdapter")
  @js.native
  class AnalyticalTreeBindingAdapter ()
    extends typings.openui5.sap.ui.model.analytics.AnalyticalTreeBindingAdapter
  
  @JSGlobal("sap.ui.model.analytics.BatchResponseCollector")
  @js.native
  class BatchResponseCollector protected ()
    extends typings.openui5.sap.ui.model.analytics.BatchResponseCollector {
    /**
      * Constructor for a batch response collecting component.
      * @param mParams optional Setup-Parameter, @see BatchResponseCollector#setup
      */
    def this(mParams: js.Any) = this()
  }
  
  /**
    * If called on an instance of an (v1/v2) ODataModel it will enrich it with analytics capabilities.
    */
  @JSGlobal("sap.ui.model.analytics.ODataModelAdapter")
  @js.native
  def ODataModelAdapter(): Unit = js.native
  
  object odata4analytics {
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.Dimension")
    @js.native
    class Dimension protected ()
      extends typings.openui5.sap.ui.model.analytics.odata4analytics.Dimension {
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
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.DimensionAttribute")
    @js.native
    class DimensionAttribute protected ()
      extends typings.openui5.sap.ui.model.analytics.odata4analytics.DimensionAttribute {
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
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.DimensionMemberSetRequest")
    @js.native
    class DimensionMemberSetRequest protected ()
      extends typings.openui5.sap.ui.model.analytics.odata4analytics.DimensionMemberSetRequest {
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
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.EntitySet")
    @js.native
    class EntitySet protected ()
      extends typings.openui5.sap.ui.model.analytics.odata4analytics.EntitySet {
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
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.EntityType")
    @js.native
    class EntityType protected ()
      extends typings.openui5.sap.ui.model.analytics.odata4analytics.EntityType {
      /**
        * Create a representation of an OData entity type in the context of an analyticquery. Do not create
        * your own instances.
        * @param oModel DataJS object for the OData model containing this entity           type
        * @param oSchema DataJS object for the schema containing this entity type
        * @param oEntityType DataJS object for the entity type
        */
      def this(oModel: js.Any, oSchema: js.Any, oEntityType: js.Any) = this()
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.FilterExpression")
    @js.native
    class FilterExpression protected ()
      extends typings.openui5.sap.ui.model.analytics.odata4analytics.FilterExpression {
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
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.Measure")
    @js.native
    class Measure protected ()
      extends typings.openui5.sap.ui.model.analytics.odata4analytics.Measure {
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
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.Model")
    @js.native
    class Model protected ()
      extends typings.openui5.sap.ui.model.analytics.odata4analytics.Model {
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
    }
    object Model {
      
      @JSGlobal("sap.ui.model.analytics.odata4analytics.Model.ReferenceByModel")
      @js.native
      class ReferenceByModel protected ()
        extends typings.openui5.sap.ui.model.analytics.odata4analytics.Model.ReferenceByModel {
        /**
          * Create a reference to an OData model already loaded elsewhere with the helpof SAP UI5.
          * @param oModel holding the OData model.
          */
        def this(oModel: js.Any) = this()
      }
      
      @JSGlobal("sap.ui.model.analytics.odata4analytics.Model.ReferenceByURI")
      @js.native
      class ReferenceByURI protected ()
        extends typings.openui5.sap.ui.model.analytics.odata4analytics.Model.ReferenceByURI {
        /**
          * Create a reference to an OData model by the URI of the related OData service.
          * @param sURI holding the URI.
          */
        def this(sURI: String) = this()
      }
      
      @JSGlobal("sap.ui.model.analytics.odata4analytics.Model.ReferenceWithWorkaround")
      @js.native
      class ReferenceWithWorkaround protected ()
        extends typings.openui5.sap.ui.model.analytics.odata4analytics.Model.ReferenceWithWorkaround {
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
      extends typings.openui5.sap.ui.model.analytics.odata4analytics.Parameter {
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
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.ParameterValueSetRequest")
    @js.native
    class ParameterValueSetRequest protected ()
      extends typings.openui5.sap.ui.model.analytics.odata4analytics.ParameterValueSetRequest {
      /**
        * Create a request object for interaction with a query parameter value help.
        * @param oParameter Description of a query parameter
        */
      def this(oParameter: typings.openui5.sap.ui.model.analytics.odata4analytics.Parameter) = this()
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.Parameterization")
    @js.native
    class Parameterization protected ()
      extends typings.openui5.sap.ui.model.analytics.odata4analytics.Parameterization {
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
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.ParameterizationRequest")
    @js.native
    class ParameterizationRequest protected ()
      extends typings.openui5.sap.ui.model.analytics.odata4analytics.ParameterizationRequest {
      /**
        * Create a request object for interaction with a query parameterization.
        * @param oParameterization Description of a query parameterization
        */
      def this(oParameterization: typings.openui5.sap.ui.model.analytics.odata4analytics.Parameterization) = this()
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.QueryResult")
    @js.native
    class QueryResult protected ()
      extends typings.openui5.sap.ui.model.analytics.odata4analytics.QueryResult {
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
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.QueryResultRequest")
    @js.native
    class QueryResultRequest protected ()
      extends typings.openui5.sap.ui.model.analytics.odata4analytics.QueryResultRequest {
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
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.RecursiveHierarchy")
    @js.native
    class RecursiveHierarchy protected ()
      extends typings.openui5.sap.ui.model.analytics.odata4analytics.RecursiveHierarchy {
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
    }
    
    @JSGlobal("sap.ui.model.analytics.odata4analytics.SortExpression")
    @js.native
    class SortExpression protected ()
      extends typings.openui5.sap.ui.model.analytics.odata4analytics.SortExpression {
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
    }
    
    /**
      * Specify which components of the dimension shall be included in the valueset.
      * @param bIncludeText Indicator whether or not to include the dimension text (if           available)
      * in the value set.
      * @param bIncludeAttributes Indicator whether or not to include all dimension attributes           (if
      * available) in the value set.
      */
    @JSGlobal("sap.ui.model.analytics.odata4analytics.includeDimensionTextAttributes")
    @js.native
    def includeDimensionTextAttributes(bIncludeText: js.Any, bIncludeAttributes: js.Any): Unit = js.native
  }
}
