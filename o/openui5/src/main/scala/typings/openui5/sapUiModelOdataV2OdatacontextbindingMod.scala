package typings.openui5

import typings.openui5.anon.BatchGroupId
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataV2OdatacontextbindingMod {
  
  @JSImport("sap/ui/model/odata/v2/ODataContextBinding", JSImport.Default)
  @js.native
  open class default protected () extends ODataContextBinding {
    def this(
      /**
      * The OData V2 model
      */
    oModel: typings.openui5.sapUiModelOdataV2OdatamodelMod.default,
      /**
      * The binding path in the model
      */
    sPath: String
    ) = this()
    def this(
      /**
      * The OData V2 model
      */
    oModel: typings.openui5.sapUiModelOdataV2OdatamodelMod.default,
      /**
      * The binding path in the model
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path.
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ) = this()
    def this(
      /**
      * The OData V2 model
      */
    oModel: typings.openui5.sapUiModelOdataV2OdatamodelMod.default,
      /**
      * The binding path in the model
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path.
      */
    oContext: Unit,
      /**
      * A map which contains additional parameters for the binding.
      */
    mParameters: BatchGroupId
    ) = this()
    def this(
      /**
      * The OData V2 model
      */
    oModel: typings.openui5.sapUiModelOdataV2OdatamodelMod.default,
      /**
      * The binding path in the model
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path.
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * A map which contains additional parameters for the binding.
      */
    mParameters: BatchGroupId
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/v2/ODataContextBinding", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.v2.ODataContextBinding with name `sClassName` and
      * enriches it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.ContextBinding.extend}.
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
    oClassInfo: ClassInfo[T, ODataContextBinding]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ODataContextBinding],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.v2.ODataContextBinding.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait ODataContextBinding
    extends typings.openui5.sapUiModelContextBindingMod.default {
    
    def refresh(
      /**
      * Update the bound control even if no data has been changed
      */
    bForceUpdate: Boolean,
      /**
      * The group Id for the refresh
      */
    sGroupId: String
    ): Unit = js.native
    def refresh(
      /**
      * Update the bound control even if no data has been changed
      */
    bForceUpdate: Unit,
      /**
      * The group Id for the refresh
      */
    sGroupId: String
    ): Unit = js.native
  }
}
