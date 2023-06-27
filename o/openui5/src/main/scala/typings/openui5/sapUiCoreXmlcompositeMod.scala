package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreXmlcompositeMod {
  
  @JSImport("sap/ui/core/XMLComposite", JSImport.Default)
  @js.native
  /**
    * XMLComposite is the base class for composite controls that use a XML fragment representation for their
    * visual parts. From a user perspective such controls appear as any other control, but internally the rendering
    * part is added as a fragment. The fragment that is used should appear in the same folder as the control's
    * JS implementation with the file extension `.control.xml`. The fragment's content can access the interface
    * data from the XMLComposite control via bindings. Currently only aggregations and properties can be used
    * with bindings inside a fragment. The exposed model that is used for internal bindings in the fragment
    * has the default name `$this`. The name will always start with an `$`. The metadata of the derived control
    * can define the alias with its metadata. A code example can be found below.
    *
    * As XMLComposites compose other controls, they are only invalidated and re-rendered if explicitly defined.
    * Additional metadata for invalidation can be given for properties and aggregation. The default invalidation
    * is `"none"`. Setting invalidate to `true` for properties and aggregations sets the complete XMLComposite
    * to invalidate and rerender.
    *
    * Example:
    * ```javascript
    *
    * XMLComposite.extend("sap.mylib.MyXMLComposite", {
    *   metadata : {
    *     library: "sap.mylib",
    *     properties : {
    *       text: { //changing this property will not re-render the XMLComposite
    *          type: "string",
    *          defaultValue: ""
    *       },
    *       title: { //changing this property will re-render the XMLComposite as it defines invalidate: true
    *          type: "string",
    *          defaultValue: "",
    *          invalidate: true
    *       },
    *       value: { //changing this property will re-render the XMLComposite as it defines invalidate: true
    *          type: "string",
    *          defaultValue: "",
    *          invalidate: true
    *       }
    *     },
    *     defaultProperty : "text",
    *     aggregations : {
    *       items : {
    *          type: "sap.ui.core.Control",
    *          invalidate: true
    *       },
    *       header : {
    *          type: "sap.mylib.FancyHeader",
    *          multiple : false
    *       }
    *     },
    *     defaultAggregation : "items"
    *     events: {
    *       outerEvent : {
    *         parameters : {
    *           opener : "sap.ui.core.Control"
    *         }
    *       }
    *     }
    *   },
    *   //alias defaults to "this"
    *   alias: "mycontrolroot" //inner bindings will use model name $mycontrolroot
    *   //fragment defaults to {control name}.control.xml in this case sap.mylib.MyXMLComposite.control.xml
    *   fragment: "sap.mylib.MyXMLCompositeOther.control.xml" //the name of the fragment
    * });
    * ```
    *
    *
    * Internally the XMLComposite instantiates and initializes the given fragment and stores the resulting
    * control in a hidden aggregation named `_content`. The fragment should only include one root element.
    *
    * Bindings of inner controls to the interface of the XMLComposite can be done with normal binding syntax.
    * Here properties are used as property bindings and aggregations are used as list bindings. Currently it
    * is not possible to bind associations in a fragment.
    *
    * Example:
    * ```javascript
    *
    *    <core:FragmentDefinition xmlns:m="sap.m" xmlns:core="sap.ui.core">
    *       <m:Text text="{$this>text}" visible="{= ${$this>text} !== ""}" />
    *    </core:FragmentDefinition>
    * ```
    *
    * ```javascript
    *
    *    <core:FragmentDefinition xmlns:m="sap.m" xmlns:core="sap.ui.core">
    *       <m:VBox items="{path:"$this>texts", filters:{path:"text", operator:"Contains", value1:"Text"}, sorter:{path:"text", descending:true}}">
    *           <m:Text text="{$this>text}" />
    *       </m:VBox>
    *    </core:FragmentDefinition>
    * ```
    *
    * ```javascript
    *
    *    <core:FragmentDefinition xmlns:m="sap.m" xmlns:core="sap.ui.core">
    *       <m:Button text="Press Me" press="handlePress"/>
    *    </core:FragmentDefinition>
    * ```
    *
    *
    * All events handled within the fragment will be dispatched to the XMLComposite control. It is recommended
    * to follow this paradigm to allow reuse of a XMLComposite without any dependency to controller code of
    * the current embedding view.
    *
    *
    * ```javascript
    *
    *    MyXMLComposite.prototype.handlePress = function() {
    *        this.fireOuterEvent(); // passing on the event to the outer view
    *    }
    * ```
    *
    *
    * **Note:** {@link https://ui5.sap.com/#/topic/b11d853a8e784db6b2d210ef57b0f7d7 Requiring modules in XML }
    * will result in side effects that might cause the XMLComposite to not work properly. We suggest you require
    * the needed modules inside the JavaScript coding of the class extending the XMLComposite.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	sap.ui.core.Control
    * 	sap.ui.core.Fragment
    * 	{@link https://ui5.sap.com/#/topic/b83a4dcb7d0e46969027345b8d32fd44 XML Composite Controls}
    */
  open class default () extends XMLComposite
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/XMLComposite", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.XMLComposite with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, XMLComposite]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, XMLComposite],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.XMLComposite.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait XMLComposite
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns an element by its ID in the context of the XMLComposite.
      *
      * May only be used by the implementation of a specific XMLComposite, not by an application using a XMLComposite.
      *
      * @returns element by its ID or `undefined`
      */
    def byId(/**
      * XMLComposite-local ID of the inner element
      */
    sId: String): js.UndefOr[typings.openui5.sapUiCoreElementMod.default] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * This method is a hook for the RenderManager that gets called during the rendering of child Controls.
      * It allows to add, remove and update existing accessibility attributes (ARIA) of those controls.
      */
    def enhanceAccessibilityState(
      /**
      * The Control that gets rendered by the RenderManager
      */
    oElement: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The mapping of "aria-" prefixed attributes
      */
    mAriaProps: js.Object
    ): Unit = js.native
    
    /**
      * Gets current value of property {@link #getDisplayBlock displayBlock}.
      *
      * Whether the CSS display should be set to "block".
      *
      * Default value is `true`.
      *
      * @returns Value of property `displayBlock`
      */
    def getDisplayBlock(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * The height
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * Returns the resource bundle of the resource model
      *
      * Sample: this.getResourceBundle().then(function(oBundle) {oBundle.getText()})
      *
      * @returns loaded resource bundle or ECMA Script 6 Promise in asynchronous case
      */
    def getResourceBundle(): typings.openui5.sapBaseI18nResourceBundleMod.default | js.Promise[Any] = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * The width
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Sets a new value for property {@link #getDisplayBlock displayBlock}.
      *
      * Whether the CSS display should be set to "block".
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplayBlock(): this.type = js.native
    def setDisplayBlock(/**
      * New value for property `displayBlock`
      */
    bDisplayBlock: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * The height
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * The width
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
  
  trait XMLCompositeSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Whether the CSS display should be set to "block".
      */
    var displayBlock: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The height
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The width
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object XMLCompositeSettings {
    
    inline def apply(): XMLCompositeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XMLCompositeSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XMLCompositeSettings] (val x: Self) extends AnyVal {
      
      inline def setDisplayBlock(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "displayBlock", value.asInstanceOf[js.Any])
      
      inline def setDisplayBlockUndefined: Self = StObject.set(x, "displayBlock", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
