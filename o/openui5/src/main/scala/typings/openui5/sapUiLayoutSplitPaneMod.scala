package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiLayoutSplitPaneMod {
  
  @JSImport("sap/ui/layout/SplitPane", JSImport.Default)
  @js.native
  /**
    * Constructor for a new SplitPane.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends SplitPane {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: SplitPaneSettings) = this()
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
    mSettings: SplitPaneSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: SplitPaneSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/layout/SplitPane", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.layout.SplitPane with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, SplitPane]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SplitPane],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.layout.SplitPane.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SplitPane
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Destroys the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Content of the SplitPane
      */
    def getContent(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getDemandPane demandPane}.
      *
      * Determines whether the pane will be moved to the pagination
      *
      * Default value is `true`.
      *
      * @returns Value of property `demandPane`
      */
    def getDemandPane(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getRequiredParentWidth requiredParentWidth}.
      *
      * Determines the minimum width of the ResponsiveSplitter(in pixels). When it is reached the pane will be
      * hidden from the screen.
      *
      * When you are calculating the required parent width to fit your panes, you should also include the width
      * of all split bars between these panes.
      *
      * Default value is `800`.
      *
      * @returns Value of property `requiredParentWidth`
      */
    def getRequiredParentWidth(): int = js.native
    
    /**
      * Sets the aggregated {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContent(/**
      * The content to set
      */
    oContent: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDemandPane demandPane}.
      *
      * Determines whether the pane will be moved to the pagination
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDemandPane(): this.type = js.native
    def setDemandPane(/**
      * New value for property `demandPane`
      */
    bDemandPane: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getRequiredParentWidth requiredParentWidth}.
      *
      * Determines the minimum width of the ResponsiveSplitter(in pixels). When it is reached the pane will be
      * hidden from the screen.
      *
      * When you are calculating the required parent width to fit your panes, you should also include the width
      * of all split bars between these panes.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `800`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setRequiredParentWidth(): this.type = js.native
    def setRequiredParentWidth(/**
      * New value for property `requiredParentWidth`
      */
    iRequiredParentWidth: int): this.type = js.native
  }
  
  trait SplitPaneSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Content of the SplitPane
      */
    var content: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Determines whether the pane will be moved to the pagination
      */
    var demandPane: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines the minimum width of the ResponsiveSplitter(in pixels). When it is reached the pane will be
      * hidden from the screen.
      *
      * When you are calculating the required parent width to fit your panes, you should also include the width
      * of all split bars between these panes.
      */
    var requiredParentWidth: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object SplitPaneSettings {
    
    inline def apply(): SplitPaneSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SplitPaneSettings]
    }
    
    extension [Self <: SplitPaneSettings](x: Self) {
      
      inline def setContent(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDemandPane(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "demandPane", value.asInstanceOf[js.Any])
      
      inline def setDemandPaneUndefined: Self = StObject.set(x, "demandPane", js.undefined)
      
      inline def setRequiredParentWidth(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "requiredParentWidth", value.asInstanceOf[js.Any])
      
      inline def setRequiredParentWidthUndefined: Self = StObject.set(x, "requiredParentWidth", js.undefined)
    }
  }
}
