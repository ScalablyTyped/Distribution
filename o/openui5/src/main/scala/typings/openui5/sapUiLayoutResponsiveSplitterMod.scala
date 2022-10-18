package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutResponsiveSplitterMod {
  
  @JSImport("sap/ui/layout/ResponsiveSplitter", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ResponsiveSplitter.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:https://experience.sap.com/fiori-design-web/responsive-splitter/ Responsive Splitter}
    */
  open class default () extends ResponsiveSplitter {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ResponsiveSplitterSettings) = this()
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
    mSettings: ResponsiveSplitterSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ResponsiveSplitterSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/ResponsiveSplitter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.ResponsiveSplitter with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
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
    oClassInfo: ClassInfo[T, ResponsiveSplitter]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ResponsiveSplitter],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.ResponsiveSplitter.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ResponsiveSplitter
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Destroys the rootPaneContainer in the aggregation {@link #getRootPaneContainer rootPaneContainer}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyRootPaneContainer(): this.type = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getDefaultPane defaultPane},
      * or `null`.
      */
    def getDefaultPane(): ID = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * The height of the control
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Gets content of aggregation {@link #getRootPaneContainer rootPaneContainer}.
      *
      * The root PaneContainer of the ResponsiveSplitter
      */
    def getRootPaneContainer(): typings.openui5.sapUiLayoutPaneContainerMod.default = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * The width of the control
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Sets the associated {@link #getDefaultPane defaultPane}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDefaultPane(
      /**
      * ID of an element which becomes the new target of this defaultPane association; alternatively, an element
      * instance may be given
      */
    oDefaultPane: ID
    ): this.type = js.native
    def setDefaultPane(
      /**
      * ID of an element which becomes the new target of this defaultPane association; alternatively, an element
      * instance may be given
      */
    oDefaultPane: typings.openui5.sapUiLayoutSplitPaneMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * The height of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'100%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets the aggregated {@link #getRootPaneContainer rootPaneContainer}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRootPaneContainer(
      /**
      * The rootPaneContainer to set
      */
    oRootPaneContainer: typings.openui5.sapUiLayoutPaneContainerMod.default
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * The width of the control
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'100%'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait ResponsiveSplitterSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines which pane is displayed initially. If there is no defaultPane specified, the first pane is considered
      * as default pane.
      */
    var defaultPane: js.UndefOr[typings.openui5.sapUiLayoutSplitPaneMod.default | String] = js.undefined
    
    /**
      * The height of the control
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The root PaneContainer of the ResponsiveSplitter
      */
    var rootPaneContainer: js.UndefOr[typings.openui5.sapUiLayoutPaneContainerMod.default] = js.undefined
    
    /**
      * The width of the control
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ResponsiveSplitterSettings {
    
    inline def apply(): ResponsiveSplitterSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveSplitterSettings]
    }
    
    extension [Self <: ResponsiveSplitterSettings](x: Self) {
      
      inline def setDefaultPane(value: typings.openui5.sapUiLayoutSplitPaneMod.default | String): Self = StObject.set(x, "defaultPane", value.asInstanceOf[js.Any])
      
      inline def setDefaultPaneUndefined: Self = StObject.set(x, "defaultPane", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setRootPaneContainer(value: typings.openui5.sapUiLayoutPaneContainerMod.default): Self = StObject.set(x, "rootPaneContainer", value.asInstanceOf[js.Any])
      
      inline def setRootPaneContainerUndefined: Self = StObject.set(x, "rootPaneContainer", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
