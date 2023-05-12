package typings.openui5

import typings.openui5.jQuery.Event
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiLayoutLibraryMod.cssgrid.IGridConfigurable
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutCssgridGridLayoutBaseMod {
  
  @JSImport("sap/ui/layout/cssgrid/GridLayoutBase", JSImport.Default)
  @js.native
  /**
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    *
    * This class does not have its own settings, but all settings applicable to the base type {@link sap.ui.base.ManagedObject#constructor
    * sap.ui.base.ManagedObject} can be used.
    */
  open class default () extends GridLayoutBase {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: GridLayoutBaseSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: GridLayoutBaseSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: GridLayoutBaseSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/cssgrid/GridLayoutBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.cssgrid.GridLayoutBase with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, GridLayoutBase]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, GridLayoutBase],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.cssgrid.GridLayoutBase.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait GridLayoutBase
    extends typings.openui5.sapUiBaseManagedObjectMod.default {
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Removes all display:grid styles from the provided HTML element
      */
    def _removeGridLayout(/**
      * The element from which to remove the grid styles
      */
    oElement: HTMLElement): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Sets all display:grid styles to the provided HTML element
      */
    def _setGridLayout(
      /**
      * The element to which to apply the grid styles
      */
    oElement: HTMLElement,
      /**
      * The grid settings to apply
      */
    oGridSettings: typings.openui5.sapUiLayoutCssgridGridSettingsMod.default
    ): Unit = js.native
    
    /**
      * Apply styles to the provided array of HTML elements or controls based on the currently active GridSettings
      */
    def applyGridLayout(
      /**
      * The elements or controls on which to apply the display:grid styles
      */
    aElements: js.Array[HTMLElement | typings.openui5.sapUiCoreControlMod.default]
    ): Unit = js.native
    
    /**
      * Should return the active GridSettings. Must be implemented by child classes.
      */
    def getActiveGridSettings(): typings.openui5.sapUiLayoutCssgridGridSettingsMod.default = js.native
    
    /**
      *
      * @returns If the Grid Layout is responsive.
      */
    def isResponsive(): Boolean = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Hook function for the Grid's onAfterRendering
      */
    def onGridAfterRendering(/**
      * The grid
      */
    oGrid: IGridConfigurable): Unit = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Hook function for the Grid's resize. Will be called if the grid layout is responsive.
      */
    def onGridResize(/**
      * The event passed by the resize handler
      */
    oEvent: Event): Unit = js.native
  }
  
  type GridLayoutBaseSettings = ManagedObjectSettings
}
