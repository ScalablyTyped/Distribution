package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreTmplTemplateControlMod {
  
  @JSImport("sap/ui/core/tmpl/TemplateControl", JSImport.Default)
  @js.native
  /**
    * Constructor for a new tmpl/TemplateControl.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends TemplateControl {
    def this(/**
      * initial settings for the new control
      */
    mSettings: TemplateControlSettings) = this()
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
    mSettings: TemplateControlSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: TemplateControlSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/tmpl/TemplateControl", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.tmpl.TemplateControl with name `sClassName` and enriches
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
    oClassInfo: ClassInfo[T, TemplateControl]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, TemplateControl],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.tmpl.TemplateControl.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait TemplateControl
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterRendering afterRendering} event of this
      * `sap.ui.core.tmpl.TemplateControl`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.tmpl.TemplateControl` itself.
      *
      * Fired when the Template Control has been (re-)rendered and its HTML is present in the DOM.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterRendering(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAfterRendering(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.tmpl.TemplateControl` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:afterRendering afterRendering} event of this
      * `sap.ui.core.tmpl.TemplateControl`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.tmpl.TemplateControl` itself.
      *
      * Fired when the Template Control has been (re-)rendered and its HTML is present in the DOM.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAfterRendering(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachAfterRendering(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.tmpl.TemplateControl` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeRendering beforeRendering} event of this
      * `sap.ui.core.tmpl.TemplateControl`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.tmpl.TemplateControl` itself.
      *
      * Fired before this Template Control is re-rendered. Use to unbind event handlers from HTML elements etc.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeRendering(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBeforeRendering(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.tmpl.TemplateControl` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:beforeRendering beforeRendering} event of this
      * `sap.ui.core.tmpl.TemplateControl`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.tmpl.TemplateControl` itself.
      *
      * Fired before this Template Control is re-rendered. Use to unbind event handlers from HTML elements etc.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBeforeRendering(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachBeforeRendering(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.tmpl.TemplateControl` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Creates a pseudo binding for an aggregation to get notified once the property changes to invalidate the
      * control and trigger a re-rendering.
      *
      * @returns the value of the path
      */
    def bindList(/**
      * the binding path
      */
    sPath: String): Any = js.native
    
    /**
      * Creates a pseudo binding for a property to get notified once the property changes to invalidate the control
      * and trigger a re-rendering.
      *
      * @returns the value of the path
      */
    def bindProp(/**
      * the binding path
      */
    sPath: String): Any = js.native
    
    /**
      * compiles (creates and registers) a new control
      *
      * @returns new control instance
      */
    def createControl(
      /**
      * the settings for the new control
      */
    mSettings: js.Object,
      /**
      * if true, then the control will not be added to the _controls aggregation
      */
    bDoNotAdd: Boolean,
      oView: typings.openui5.sapUiCoreMvcViewMod.default
    ): typings.openui5.sapUiCoreControlMod.default = js.native
    /**
      * compiles (creates and registers) a new control
      *
      * @returns new control instance
      */
    def createControl(
      /**
      * the settings for the new control
      */
    mSettings: js.Object,
      oView: typings.openui5.sapUiCoreMvcViewMod.default
    ): typings.openui5.sapUiCoreControlMod.default = js.native
    /**
      * compiles (creates and registers) a new control
      *
      * @returns new control instance
      */
    def createControl(
      /**
      * the settings for the new control
      */
    mSettings: js.Object,
      /**
      * the parent path for the control
      */
    sParentPath: String,
      /**
      * if true, then the control will not be added to the _controls aggregation
      */
    bDoNotAdd: Boolean,
      oView: typings.openui5.sapUiCoreMvcViewMod.default
    ): typings.openui5.sapUiCoreControlMod.default = js.native
    /**
      * compiles (creates and registers) a new control
      *
      * @returns new control instance
      */
    def createControl(
      /**
      * the settings for the new control
      */
    mSettings: js.Object,
      /**
      * the parent path for the control
      */
    sParentPath: String,
      oView: typings.openui5.sapUiCoreMvcViewMod.default
    ): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * compiles (creates and registers) a new DOM element
      *
      * @returns new DOM element instance
      */
    def createDOMElement(/**
      * the settings for the new DOM element
      */
    mSettings: js.Object): typings.openui5.sapUiCoreControlMod.default = js.native
    def createDOMElement(
      /**
      * the settings for the new DOM element
      */
    mSettings: js.Object,
      /**
      * the parent path for the DOM element
      */
    sParentPath: String
    ): typings.openui5.sapUiCoreControlMod.default = js.native
    def createDOMElement(
      /**
      * the settings for the new DOM element
      */
    mSettings: js.Object,
      /**
      * the parent path for the DOM element
      */
    sParentPath: String,
      /**
      * if true, then the control will not be added to the _controls aggregation
      */
    bDoNotAdd: Boolean
    ): typings.openui5.sapUiCoreControlMod.default = js.native
    def createDOMElement(
      /**
      * the settings for the new DOM element
      */
    mSettings: js.Object,
      /**
      * the parent path for the DOM element
      */
    sParentPath: Unit,
      /**
      * if true, then the control will not be added to the _controls aggregation
      */
    bDoNotAdd: Boolean
    ): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:afterRendering afterRendering} event of this
      * `sap.ui.core.tmpl.TemplateControl`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAfterRendering(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachAfterRendering(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:beforeRendering beforeRendering} event of
      * this `sap.ui.core.tmpl.TemplateControl`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBeforeRendering(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachBeforeRendering(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Fires event {@link #event:afterRendering afterRendering} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireAfterRendering(): this.type = js.native
    def fireAfterRendering(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:beforeRendering beforeRendering} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireBeforeRendering(): this.type = js.native
    def fireBeforeRendering(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getContext context}.
      *
      * The context is a data object. It can be used for default template expressions. A change of the context
      * object leads to a re-rendering whereas a change of a nested property of the context object doesn't. By
      * default the context is an empty object.
      *
      * @returns Value of property `context`
      */
    def getContext(): js.Object = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getTemplate template}, or `null`.
      */
    def getTemplate(): ID = js.native
    
    /**
      * Returns the instance specific renderer for an anonymous template control.
      *
      * @returns the instance specific renderer function
      */
    def getTemplateRenderer(): js.Function = js.native
    
    /**
      * checks whether the control is inline or not
      *
      * @returns flag, whether to control is inline or not
      */
    def isInline(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getContext context}.
      *
      * The context is a data object. It can be used for default template expressions. A change of the context
      * object leads to a re-rendering whereas a change of a nested property of the context object doesn't. By
      * default the context is an empty object.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContext(): this.type = js.native
    def setContext(/**
      * New value for property `context`
      */
    oContext: js.Object): this.type = js.native
    
    /**
      * Sets the associated {@link #getTemplate template}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTemplate(
      /**
      * ID of an element which becomes the new target of this template association; alternatively, an element
      * instance may be given
      */
    oTemplate: ID
    ): this.type = js.native
    def setTemplate(
      /**
      * ID of an element which becomes the new target of this template association; alternatively, an element
      * instance may be given
      */
    oTemplate: typings.openui5.sapUiCoreTmplTemplateMod.default
    ): this.type = js.native
    
    /**
      * Sets the instance specific renderer for an anonymous template control.
      *
      * @returns `this` to allow method chaining
      */
    def setTemplateRenderer(/**
      * the instance specific renderer function
      */
    fnRenderer: js.Function): this.type = js.native
  }
  
  trait TemplateControlSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Fired when the Template Control has been (re-)rendered and its HTML is present in the DOM.
      */
    var afterRendering: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Fired before this Template Control is re-rendered. Use to unbind event handlers from HTML elements etc.
      */
    var beforeRendering: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * The context is a data object. It can be used for default template expressions. A change of the context
      * object leads to a re-rendering whereas a change of a nested property of the context object doesn't. By
      * default the context is an empty object.
      */
    var context: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The template on which the template control is based on.
      */
    var template: js.UndefOr[typings.openui5.sapUiCoreTmplTemplateMod.default | String] = js.undefined
  }
  object TemplateControlSettings {
    
    inline def apply(): TemplateControlSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateControlSettings]
    }
    
    extension [Self <: TemplateControlSettings](x: Self) {
      
      inline def setAfterRendering(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "afterRendering", js.Any.fromFunction1(value))
      
      inline def setAfterRenderingUndefined: Self = StObject.set(x, "afterRendering", js.undefined)
      
      inline def setBeforeRendering(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "beforeRendering", js.Any.fromFunction1(value))
      
      inline def setBeforeRenderingUndefined: Self = StObject.set(x, "beforeRendering", js.undefined)
      
      inline def setContext(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setTemplate(value: typings.openui5.sapUiCoreTmplTemplateMod.default | String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
}
