package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreUtilExportTypeMod.ExportTypeSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreUtilExportTypeCSVMod {
  
  @JSImport("sap/ui/core/util/ExportTypeCSV", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ExportTypeCSV.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ExportTypeCSV {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ExportTypeCSVSettings) = this()
    def this(/**
      * id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * initial settings for the new control
      */
    mSettings: ExportTypeCSVSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ExportTypeCSVSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/util/ExportTypeCSV", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.util.ExportTypeCSV with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.util.ExportType.extend}.
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
    oClassInfo: ClassInfo[T, ExportTypeCSV]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ExportTypeCSV],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.util.ExportTypeCSV.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait ExportTypeCSV
    extends typings.openui5.sapUiCoreUtilExportTypeMod.default {
    
    /**
      * Gets current value of property {@link #getSeparatorChar separatorChar}.
      *
      * Separator char.
      *
      * Value needs to be exactly one character or empty for default.
      *
      * Default value is `','`.
      *
      * @returns Value of property `separatorChar`
      */
    def getSeparatorChar(): String = js.native
    
    /**
      * Setter for property `separatorChar`.
      *
      * Value needs to be exactly one character or empty for default. Default value is ','.
      *
      * @returns `this` to allow method chaining
      */
    def setSeparatorChar(/**
      * new value for property `separatorChar`
      */
    sSeparatorChar: String): this.type = js.native
  }
  
  trait ExportTypeCSVSettings
    extends StObject
       with ExportTypeSettings {
    
    /**
      * Separator char.
      *
      * Value needs to be exactly one character or empty for default.
      */
    var separatorChar: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object ExportTypeCSVSettings {
    
    inline def apply(): ExportTypeCSVSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportTypeCSVSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExportTypeCSVSettings] (val x: Self) extends AnyVal {
      
      inline def setSeparatorChar(value: String | PropertyBindingInfo): Self = StObject.set(x, "separatorChar", value.asInstanceOf[js.Any])
      
      inline def setSeparatorCharUndefined: Self = StObject.set(x, "separatorChar", js.undefined)
    }
  }
}
