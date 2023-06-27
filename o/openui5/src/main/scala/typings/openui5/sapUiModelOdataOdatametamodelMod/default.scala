package typings.openui5.sapUiModelOdataOdatametamodelMod

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sap/ui/model/odata/ODataMetaModel", JSImport.Default)
@js.native
open class default protected () extends ODataMetaModel {
  /**
    * DO NOT CALL this private constructor for a new `ODataMetaModel`, but rather use {@link sap.ui.model.odata.v2.ODataModel#getMetaModel getMetaModel }
    * instead!
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
    * DO NOT CALL this private constructor for a new `ODataMetaModel`, but rather use {@link sap.ui.model.odata.v2.ODataModel#getMetaModel getMetaModel }
    * instead!
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
