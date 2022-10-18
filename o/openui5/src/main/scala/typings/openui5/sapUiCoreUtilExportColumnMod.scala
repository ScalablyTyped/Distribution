package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreUtilExportColumnMod {
  
  @JSImport("sap/ui/core/util/ExportColumn", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ExportColumn.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ExportColumn {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ExportColumnSettings) = this()
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
    mSettings: ExportColumnSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ExportColumnSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/util/ExportColumn", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.util.ExportColumn with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.ManagedObject.extend}.
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
    oClassInfo: ClassInfo[T, ExportColumn]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ExportColumn],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.util.ExportColumn.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait ExportColumn
    extends typings.openui5.sapUiBaseManagedObjectMod.default {
    
    /**
      * Destroys the template in the aggregation {@link #getTemplate template}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyTemplate(): this.type = js.native
    
    /**
      * Gets current value of property {@link #getName name}.
      *
      * Column name.
      *
      * @returns Value of property `name`
      */
    def getName(): String = js.native
    
    /**
      * Gets content of aggregation {@link #getTemplate template}.
      *
      * Cell template for column.
      */
    def getTemplate(): typings.openui5.sapUiCoreUtilExportCellMod.default = js.native
    
    /**
      * Sets a new value for property {@link #getName name}.
      *
      * Column name.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setName(/**
      * New value for property `name`
      */
    sName: String): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getTemplate template}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTemplate(/**
      * The template to set
      */
    oTemplate: typings.openui5.sapUiCoreUtilExportCellMod.default): this.type = js.native
  }
  
  trait ExportColumnSettings
    extends StObject
       with ManagedObjectSettings {
    
    /**
      * Column name.
      */
    var name: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Cell template for column.
      */
    var template: js.UndefOr[typings.openui5.sapUiCoreUtilExportCellMod.default] = js.undefined
  }
  object ExportColumnSettings {
    
    inline def apply(): ExportColumnSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportColumnSettings]
    }
    
    extension [Self <: ExportColumnSettings](x: Self) {
      
      inline def setName(value: String | PropertyBindingInfo): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTemplate(value: typings.openui5.sapUiCoreUtilExportCellMod.default): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
}
