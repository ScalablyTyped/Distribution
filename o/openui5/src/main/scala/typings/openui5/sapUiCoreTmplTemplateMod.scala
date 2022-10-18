package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Element
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreTmplTemplateMod {
  
  @JSImport("sap/ui/core/tmpl/Template", JSImport.Default)
  @js.native
  /**
    * Creates and initializes a new template with the given `sId` and settings.
    *
    * The set of allowed entries in the `mSettings` object depends on the concrete subclass and is described
    * there.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Template {
    def this(/**
      * optional map/JSON-object with initial settings for the new component instance
      */
    mSettings: TemplateSettings) = this()
    def this(/**
      * optional id for the new template; generated automatically if no non-empty id is given Note: this can
      * be omitted, no matter whether `mSettings` will be given or not!
      */
    sId: String) = this()
    def this(
      /**
      * optional id for the new template; generated automatically if no non-empty id is given Note: this can
      * be omitted, no matter whether `mSettings` will be given or not!
      */
    sId: String,
      /**
      * optional map/JSON-object with initial settings for the new component instance
      */
    mSettings: TemplateSettings
    ) = this()
    def this(
      /**
      * optional id for the new template; generated automatically if no non-empty id is given Note: this can
      * be omitted, no matter whether `mSettings` will be given or not!
      */
    sId: Unit,
      /**
      * optional map/JSON-object with initial settings for the new component instance
      */
    mSettings: TemplateSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/tmpl/Template", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the registered template for the given ID, if any.
      *
      * @returns the template for the given ID
      */
    inline def byId(sId: String): Template = ^.asInstanceOf[js.Dynamic].applyDynamic("byId")(sId.asInstanceOf[js.Any]).asInstanceOf[Template]
    
    /**
      * Creates a new subclass of class sap.ui.core.tmpl.Template with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, Template]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Template],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.tmpl.Template.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
    
    /**
      * parses the given path and extracts the model and path
      */
    @JSImport("sap/ui/core/tmpl/Template", "default.parsePath")
    @js.native
    def parsePath: /* undefined */ Any = js.native
    inline def parsePath_=(x: /* undefined */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parsePath")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Template
    extends typings.openui5.sapUiBaseManagedObjectMod.default {
    
    /**
      * Creates an anonymous TemplateControl for the Template.
      *
      * @returns the created control instance
      */
    def createControl(
      /**
      * the control ID
      */
    sId: String,
      /**
      * the context for the renderer/templating
      */
    oContext: js.Object,
      oView: typings.openui5.sapUiCoreMvcViewMod.default
    ): typings.openui5.sapUiCoreTmplTemplateControlMod.default = js.native
    /**
      * Creates an anonymous TemplateControl for the Template.
      *
      * @returns the created control instance
      */
    def createControl(/**
      * the control ID
      */
    sId: String, oView: typings.openui5.sapUiCoreMvcViewMod.default): typings.openui5.sapUiCoreTmplTemplateControlMod.default = js.native
    
    /**
      * Declares a new control based on this template and returns the created class / constructor function. The
      * class is based on the information coming from the abstract functions `createMetadata` and `createRenderer`.
      *
      * @returns the created class / constructor function
      */
    def declareControl(/**
      * the fully qualified name of the control
      */
    sControl: String): js.Function = js.native
    
    /**
      * Gets current value of property {@link #getContent content}.
      *
      * The Template definition as a String.
      *
      * @returns Value of property `content`
      */
    def getContent(): String = js.native
    
    /**
      * Creates an anonymous TemplateControl for the Template and places the control into the specified DOM element.
      *
      * @returns the created control instance
      */
    def placeAt(
      /**
      * the id or the DOM reference where to render the template
      */
    oRef: String,
      bInline: Boolean
    ): typings.openui5.sapUiCoreTmplTemplateControlMod.default = js.native
    /**
      * Creates an anonymous TemplateControl for the Template and places the control into the specified DOM element.
      *
      * @returns the created control instance
      */
    def placeAt(
      /**
      * the id or the DOM reference where to render the template
      */
    oRef: String,
      /**
      * The context to use to evaluate the Template. It will be applied as value for the context property of
      * the created control.
      */
    oContext: js.Object,
      bInline: Boolean
    ): typings.openui5.sapUiCoreTmplTemplateControlMod.default = js.native
    /**
      * Creates an anonymous TemplateControl for the Template and places the control into the specified DOM element.
      *
      * @returns the created control instance
      */
    def placeAt(
      /**
      * the id or the DOM reference where to render the template
      */
    oRef: String,
      /**
      * The context to use to evaluate the Template. It will be applied as value for the context property of
      * the created control.
      */
    oContext: js.Object,
      /**
      * Describes the position where the control should be put into the container
      */
    vPosition: String,
      bInline: Boolean
    ): typings.openui5.sapUiCoreTmplTemplateControlMod.default = js.native
    def placeAt(
      /**
      * the id or the DOM reference where to render the template
      */
    oRef: String,
      /**
      * The context to use to evaluate the Template. It will be applied as value for the context property of
      * the created control.
      */
    oContext: js.Object,
      /**
      * Describes the position where the control should be put into the container
      */
    vPosition: int,
      bInline: Boolean
    ): typings.openui5.sapUiCoreTmplTemplateControlMod.default = js.native
    /**
      * Creates an anonymous TemplateControl for the Template and places the control into the specified DOM element.
      *
      * @returns the created control instance
      */
    def placeAt(
      /**
      * the id or the DOM reference where to render the template
      */
    oRef: String,
      /**
      * Describes the position where the control should be put into the container
      */
    vPosition: String,
      bInline: Boolean
    ): typings.openui5.sapUiCoreTmplTemplateControlMod.default = js.native
    def placeAt(
      /**
      * the id or the DOM reference where to render the template
      */
    oRef: String,
      /**
      * Describes the position where the control should be put into the container
      */
    vPosition: int,
      bInline: Boolean
    ): typings.openui5.sapUiCoreTmplTemplateControlMod.default = js.native
    def placeAt(
      /**
      * the id or the DOM reference where to render the template
      */
    oRef: typings.openui5.sapUiCoreControlMod.default,
      bInline: Boolean
    ): typings.openui5.sapUiCoreTmplTemplateControlMod.default = js.native
    def placeAt(
      /**
      * the id or the DOM reference where to render the template
      */
    oRef: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The context to use to evaluate the Template. It will be applied as value for the context property of
      * the created control.
      */
    oContext: js.Object,
      bInline: Boolean
    ): typings.openui5.sapUiCoreTmplTemplateControlMod.default = js.native
    def placeAt(
      /**
      * the id or the DOM reference where to render the template
      */
    oRef: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The context to use to evaluate the Template. It will be applied as value for the context property of
      * the created control.
      */
    oContext: js.Object,
      /**
      * Describes the position where the control should be put into the container
      */
    vPosition: String,
      bInline: Boolean
    ): typings.openui5.sapUiCoreTmplTemplateControlMod.default = js.native
    def placeAt(
      /**
      * the id or the DOM reference where to render the template
      */
    oRef: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The context to use to evaluate the Template. It will be applied as value for the context property of
      * the created control.
      */
    oContext: js.Object,
      /**
      * Describes the position where the control should be put into the container
      */
    vPosition: int,
      bInline: Boolean
    ): typings.openui5.sapUiCoreTmplTemplateControlMod.default = js.native
    def placeAt(
      /**
      * the id or the DOM reference where to render the template
      */
    oRef: typings.openui5.sapUiCoreControlMod.default,
      /**
      * Describes the position where the control should be put into the container
      */
    vPosition: String,
      bInline: Boolean
    ): typings.openui5.sapUiCoreTmplTemplateControlMod.default = js.native
    def placeAt(
      /**
      * the id or the DOM reference where to render the template
      */
    oRef: typings.openui5.sapUiCoreControlMod.default,
      /**
      * Describes the position where the control should be put into the container
      */
    vPosition: int,
      bInline: Boolean
    ): typings.openui5.sapUiCoreTmplTemplateControlMod.default = js.native
    def placeAt(
      /**
      * the id or the DOM reference where to render the template
      */
    oRef: Element,
      bInline: Boolean
    ): typings.openui5.sapUiCoreTmplTemplateControlMod.default = js.native
    def placeAt(
      /**
      * the id or the DOM reference where to render the template
      */
    oRef: Element,
      /**
      * The context to use to evaluate the Template. It will be applied as value for the context property of
      * the created control.
      */
    oContext: js.Object,
      bInline: Boolean
    ): typings.openui5.sapUiCoreTmplTemplateControlMod.default = js.native
    def placeAt(
      /**
      * the id or the DOM reference where to render the template
      */
    oRef: Element,
      /**
      * The context to use to evaluate the Template. It will be applied as value for the context property of
      * the created control.
      */
    oContext: js.Object,
      /**
      * Describes the position where the control should be put into the container
      */
    vPosition: String,
      bInline: Boolean
    ): typings.openui5.sapUiCoreTmplTemplateControlMod.default = js.native
    def placeAt(
      /**
      * the id or the DOM reference where to render the template
      */
    oRef: Element,
      /**
      * The context to use to evaluate the Template. It will be applied as value for the context property of
      * the created control.
      */
    oContext: js.Object,
      /**
      * Describes the position where the control should be put into the container
      */
    vPosition: int,
      bInline: Boolean
    ): typings.openui5.sapUiCoreTmplTemplateControlMod.default = js.native
    def placeAt(
      /**
      * the id or the DOM reference where to render the template
      */
    oRef: Element,
      /**
      * Describes the position where the control should be put into the container
      */
    vPosition: String,
      bInline: Boolean
    ): typings.openui5.sapUiCoreTmplTemplateControlMod.default = js.native
    def placeAt(
      /**
      * the id or the DOM reference where to render the template
      */
    oRef: Element,
      /**
      * Describes the position where the control should be put into the container
      */
    vPosition: int,
      bInline: Boolean
    ): typings.openui5.sapUiCoreTmplTemplateControlMod.default = js.native
    
    /**
      * Sets a new value for property {@link #getContent content}.
      *
      * The Template definition as a String.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContent(): this.type = js.native
    def setContent(/**
      * New value for property `content`
      */
    sContent: String): this.type = js.native
  }
  
  trait TemplateSettings
    extends StObject
       with ManagedObjectSettings {
    
    /**
      * The Template definition as a String.
      */
    var content: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object TemplateSettings {
    
    inline def apply(): TemplateSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TemplateSettings]
    }
    
    extension [Self <: TemplateSettings](x: Self) {
      
      inline def setContent(value: String | PropertyBindingInfo): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
}
