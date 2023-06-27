package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.IOverflowToolbarContent
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcActiontoolbarActionToolbarActionMod {
  
  @JSImport("sap/ui/mdc/actiontoolbar/ActionToolbarAction", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ActionToolbarAction.
    *  **Note:**
    *  The control is experimental and the API / behavior is not finalized. It should only be used internally
    * in other mdc controls (e.g. chart/table).
    *
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ActionToolbarAction {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ActionToolbarActionSettings) = this()
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
    mSettings: ActionToolbarActionSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ActionToolbarActionSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_m_IOverflowToolbarContent: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/actiontoolbar/ActionToolbarAction", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.mdc.actiontoolbar.ActionToolbarAction with name `sClassName` and
      * enriches it with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, ActionToolbarAction]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ActionToolbarAction],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.actiontoolbar.ActionToolbarAction.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ActionToolbarAction
    extends typings.openui5.sapUiCoreControlMod.default
       with IOverflowToolbarContent {
    
    /**
      * Destroys the action in the aggregation {@link #getAction action}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyAction(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getAction action}.
      *
      * Action
      */
    def getAction(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Gets current value of property {@link #getLayoutInformation layoutInformation}.
      *
      * Layout information
      *
      * Default value is `...see text or source`.
      *
      * @returns Value of property `layoutInformation`
      */
    def getLayoutInformation(): js.Object = js.native
    
    /**
      * Sets the aggregated {@link #getAction action}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAction(/**
      * The action to set
      */
    oAction: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLayoutInformation layoutInformation}.
      *
      * Layout information
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `...see text or source`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLayoutInformation(): this.type = js.native
    def setLayoutInformation(/**
      * New value for property `layoutInformation`
      */
    oLayoutInformation: js.Object): this.type = js.native
  }
  
  trait ActionToolbarActionSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Action
      */
    var action: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
    
    /**
      * Layout information
      */
    var layoutInformation: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ActionToolbarActionSettings {
    
    inline def apply(): ActionToolbarActionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionToolbarActionSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionToolbarActionSettings] (val x: Self) extends AnyVal {
      
      inline def setAction(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setLayoutInformation(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "layoutInformation", value.asInstanceOf[js.Any])
      
      inline def setLayoutInformationUndefined: Self = StObject.set(x, "layoutInformation", js.undefined)
    }
  }
}
