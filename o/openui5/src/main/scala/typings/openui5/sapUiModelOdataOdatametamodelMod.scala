package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataOdatametamodelMod {
  
  @JSImport("sap/ui/model/odata/ODataMetaModel", JSImport.Default)
  @js.native
  open class default protected () extends ODataMetaModel {
    /**
      * DO NOT CALL this private constructor for a new `ODataMetaModel`, but rather use {@link sap.ui.model.odata.v2.ODataModel#getMetaModel
      * getMetaModel} instead!
      */
    def this(
      /**
      * the OData model's metadata object
      */
    oMetadata: typings.openui5.sapUiModelOdataOdatametadataMod.default,
      /**
      * the data model instance
      */
    oDataModel: typings.openui5.sapUiModelOdataV2OdatamodelMod.default
    ) = this()
    /**
      * DO NOT CALL this private constructor for a new `ODataMetaModel`, but rather use {@link sap.ui.model.odata.v2.ODataModel#getMetaModel
      * getMetaModel} instead!
      */
    def this(
      /**
      * the OData model's metadata object
      */
    oMetadata: typings.openui5.sapUiModelOdataOdatametadataMod.default,
      /**
      * the OData model's annotations object
      */
    oAnnotations: typings.openui5.sapUiModelOdataOdataannotationsMod.default,
      /**
      * the data model instance
      */
    oDataModel: typings.openui5.sapUiModelOdataV2OdatamodelMod.default
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/ODataMetaModel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.ODataMetaModel with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.MetaModel.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ODataMetaModel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ODataMetaModel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.ODataMetaModel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait ODataMetaModel
    extends typings.openui5.sapUiModelMetaModelMod.default {
    
    /**
      * Returns the OData meta model context corresponding to the given OData model path.
      *
      * @returns the context for the corresponding metadata object, i.e. an entity type or its property, or `null`
      * in case no path is given
      */
    def getMetaContext(): typings.openui5.sapUiModelContextMod.default | Null = js.native
    def getMetaContext(
      /**
      * an absolute path pointing to an entity or property, e.g. "/ProductSet(1)/ToSupplier/BusinessPartnerID";
      * this equals the
      * resource path component of a URI according to OData V2 URI conventions
      */
    sPath: String
    ): typings.openui5.sapUiModelContextMod.default | Null = js.native
    
    /**
      * Returns the OData association end corresponding to the given entity type's navigation property of given
      * name.
      *
      * @returns the OData association end or `null` if no such association end is found
      */
    def getODataAssociationEnd(
      /**
      * an entity type as returned by {@link #getODataEntityType getODataEntityType}
      */
    oEntityType: js.Object,
      /**
      * the name of a navigation property within this entity type
      */
    sName: String
    ): js.Object | Null = js.native
    
    /**
      * Returns the OData association ***set*** end corresponding to the given entity type's navigation property
      * of given name.
      *
      * @returns the OData association set end or `null` if no such association set end is found
      */
    def getODataAssociationSetEnd(
      /**
      * an entity type as returned by {@link #getODataEntityType getODataEntityType}
      */
    oEntityType: js.Object,
      /**
      * the name of a navigation property within this entity type
      */
    sName: String
    ): js.Object | Null = js.native
    
    /**
      * Returns the OData complex type with the given qualified name, either as a path or as an object, as indicated.
      *
      * @returns (the path to) the complex type with the given qualified name; `undefined` (for a path) or `null`
      * (for an object) if no such type is found
      */
    def getODataComplexType(/**
      * a qualified name, e.g. "ACME.Address"
      */
    sQualifiedName: String): js.UndefOr[js.Object | String | Null] = js.native
    def getODataComplexType(
      /**
      * a qualified name, e.g. "ACME.Address"
      */
    sQualifiedName: String,
      /**
      * determines whether the complex type is returned as a path or as an object
      */
    bAsPath: Boolean
    ): js.UndefOr[js.Object | String | Null] = js.native
    
    /**
      * Returns the OData default entity container. If there is only a single schema with a single entity container,
      * the entity container does not need to be marked as default explicitly.
      *
      * @returns (the path to) the default entity container; `undefined` (for a path) or `null` (for an object)
      * if no such container is found
      */
    def getODataEntityContainer(): js.UndefOr[js.Object | String | Null] = js.native
    def getODataEntityContainer(
      /**
      * determines whether the entity container is returned as a path or as an object
      */
    bAsPath: Boolean
    ): js.UndefOr[js.Object | String | Null] = js.native
    
    /**
      * Returns the OData entity set with the given simple name from the default entity container.
      *
      * @returns (the path to) the entity set with the given simple name; `undefined` (for a path) or `null`
      * (for an object) if no such set is found
      */
    def getODataEntitySet(/**
      * a simple name, e.g. "ProductSet"
      */
    sName: String): js.UndefOr[js.Object | String | Null] = js.native
    def getODataEntitySet(
      /**
      * a simple name, e.g. "ProductSet"
      */
    sName: String,
      /**
      * determines whether the entity set is returned as a path or as an object
      */
    bAsPath: Boolean
    ): js.UndefOr[js.Object | String | Null] = js.native
    
    /**
      * Returns the OData entity type with the given qualified name, either as a path or as an object, as indicated.
      *
      * @returns (the path to) the entity type with the given qualified name; `undefined` (for a path) or `null`
      * (for an object) if no such type is found
      */
    def getODataEntityType(/**
      * a qualified name, e.g. "ACME.Product"
      */
    sQualifiedName: String): js.UndefOr[js.Object | String | Null] = js.native
    def getODataEntityType(
      /**
      * a qualified name, e.g. "ACME.Product"
      */
    sQualifiedName: String,
      /**
      * determines whether the entity type is returned as a path or as an object
      */
    bAsPath: Boolean
    ): js.UndefOr[js.Object | String | Null] = js.native
    
    /**
      * @SINCE 1.29.0
      *
      * Returns the OData function import with the given simple or qualified name from the default entity container
      * or the respective entity container specified in the qualified name.
      *
      * @returns (the path to) the function import with the given simple name; `undefined` (for a path) or `null`
      * (for an object) if no such function import is found
      */
    def getODataFunctionImport(/**
      * a simple or qualified name, e.g. "Save" or "MyService.Entities/Save"
      */
    sName: String): js.UndefOr[js.Object | String | Null] = js.native
    def getODataFunctionImport(
      /**
      * a simple or qualified name, e.g. "Save" or "MyService.Entities/Save"
      */
    sName: String,
      /**
      * determines whether the function import is returned as a path or as an object
      */
    bAsPath: Boolean
    ): js.UndefOr[js.Object | String | Null] = js.native
    
    /**
      * Returns the given OData type's property (not navigation property!) of given name.
      *
      * If an array is given instead of a single name, it is consumed (via `Array.prototype.shift`) piece by
      * piece. Each element is interpreted as a property name of the current type, and the current type is replaced
      * by that property's type. This is repeated until an element is encountered which cannot be resolved as
      * a property name of the current type anymore; in this case, the last property found is returned and `vName`
      * contains only the remaining names, with `vName[0]` being the one which was not found.
      *
      * Examples:
      * 	 Get address property of business partner:
      * ```javascript
      *
      * var oEntityType = oMetaModel.getODataEntityType("GWSAMPLE_BASIC.BusinessPartner"),
      *     oAddressProperty = oMetaModel.getODataProperty(oEntityType, "Address");
      * oAddressProperty.name === "Address";
      * oAddressProperty.type === "GWSAMPLE_BASIC.CT_Address";
      * ```
      *    Get street property of address type:
      * ```javascript
      *
      * var oComplexType = oMetaModel.getODataComplexType("GWSAMPLE_BASIC.CT_Address"),
      *     oStreetProperty = oMetaModel.getODataProperty(oComplexType, "Street");
      * oStreetProperty.name === "Street";
      * oStreetProperty.type === "Edm.String";
      * ```
      *    Get address' street property directly from business partner:
      * ```javascript
      *
      * var aParts = ["Address", "Street"];
      * oMetaModel.getODataProperty(oEntityType, aParts) === oStreetProperty;
      * aParts.length === 0;
      * ```
      *    Trying to get address' foo property directly from business partner:
      * ```javascript
      *
      * aParts = ["Address", "foo"];
      * oMetaModel.getODataProperty(oEntityType, aParts) === oAddressProperty;
      * aParts.length === 1;
      * aParts[0] === "foo";
      * ```
      *
      *
      * @returns (the path to) the last OData property found; `undefined` (for a path) or `null` (for an object)
      * if no property was found at all
      */
    def getODataProperty(
      /**
      * a complex type as returned by {@link #getODataComplexType getODataComplexType}, or an entity type as
      * returned by {@link #getODataEntityType getODataEntityType}
      */
    oType: js.Object,
      /**
      * the name of a property within this type (e.g. "Address"), or an array of such names (e.g. `["Address",
      * "Street"]`) in order to drill-down into complex types; **BEWARE** that this array is modified by removing
      * each part which is understood!
      */
    vName: String
    ): js.UndefOr[js.Object | String | Null] = js.native
    def getODataProperty(
      /**
      * a complex type as returned by {@link #getODataComplexType getODataComplexType}, or an entity type as
      * returned by {@link #getODataEntityType getODataEntityType}
      */
    oType: js.Object,
      /**
      * the name of a property within this type (e.g. "Address"), or an array of such names (e.g. `["Address",
      * "Street"]`) in order to drill-down into complex types; **BEWARE** that this array is modified by removing
      * each part which is understood!
      */
    vName: String,
      /**
      * determines whether the property is returned as a path or as an object
      */
    bAsPath: Boolean
    ): js.UndefOr[js.Object | String | Null] = js.native
    def getODataProperty(
      /**
      * a complex type as returned by {@link #getODataComplexType getODataComplexType}, or an entity type as
      * returned by {@link #getODataEntityType getODataEntityType}
      */
    oType: js.Object,
      /**
      * the name of a property within this type (e.g. "Address"), or an array of such names (e.g. `["Address",
      * "Street"]`) in order to drill-down into complex types; **BEWARE** that this array is modified by removing
      * each part which is understood!
      */
    vName: js.Array[String]
    ): js.UndefOr[js.Object | String | Null] = js.native
    def getODataProperty(
      /**
      * a complex type as returned by {@link #getODataComplexType getODataComplexType}, or an entity type as
      * returned by {@link #getODataEntityType getODataEntityType}
      */
    oType: js.Object,
      /**
      * the name of a property within this type (e.g. "Address"), or an array of such names (e.g. `["Address",
      * "Street"]`) in order to drill-down into complex types; **BEWARE** that this array is modified by removing
      * each part which is understood!
      */
    vName: js.Array[String],
      /**
      * determines whether the property is returned as a path or as an object
      */
    bAsPath: Boolean
    ): js.UndefOr[js.Object | String | Null] = js.native
    
    /**
      * @SINCE 1.29.1
      *
      * Returns a `Promise` which is resolved with a map representing the `com.sap.vocabularies.Common.v1.ValueList`
      * annotations of the given property or rejected with an error. The key in the map provided on successful
      * resolution is the qualifier of the annotation or the empty string if no qualifier is defined. The value
      * in the map is the JSON object for the annotation. The map is empty if the property has no `com.sap.vocabularies.Common.v1.ValueList`
      * annotations.
      *
      * @returns a Promise that gets resolved as soon as the value lists as well as the required model elements
      * have been loaded
      */
    def getODataValueLists(
      /**
      * a model context for a structural property of an entity type or a complex type, as returned by {@link
      * #getMetaContext getMetaContext}
      */
    oPropertyContext: typings.openui5.sapUiModelContextMod.default
    ): js.Promise[Any] = js.native
    
    /**
      * Returns a promise which is fulfilled once the meta model data is loaded and can be used.
      *
      * @returns a Promise
      */
    def loaded(): js.Promise[Any] = js.native
  }
}
