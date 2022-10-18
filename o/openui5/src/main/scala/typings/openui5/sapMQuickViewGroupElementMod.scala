package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.QuickViewGroupElementType
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMQuickViewGroupElementMod {
  
  @JSImport("sap/m/QuickViewGroupElement", JSImport.Default)
  @js.native
  /**
    * Constructor for a new QuickViewGroupElement.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends QuickViewGroupElement {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: QuickViewGroupElementSettings) = this()
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
    mSettings: QuickViewGroupElementSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: QuickViewGroupElementSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/QuickViewGroupElement", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.QuickViewGroupElement with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, QuickViewGroupElement]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, QuickViewGroupElement],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.QuickViewGroupElement.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait QuickViewGroupElement
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Gets current value of property {@link #getEmailSubject emailSubject}.
      *
      * The subject of the email. Works only with QuickViewGroupElement of type email.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `emailSubject`
      */
    def getEmailSubject(): String = js.native
    
    /**
      * Gets current value of property {@link #getLabel label}.
      *
      * Specifies the text displayed below the associated label.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `label`
      */
    def getLabel(): String = js.native
    
    /**
      * Gets current value of property {@link #getPageLinkId pageLinkId}.
      *
      * Specifies the ID of the QuickViewPage, which is opened from the link in the QuickViewGroupElement. Works
      * only with QuickViewGroupElement of type pageLink.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `pageLinkId`
      */
    def getPageLinkId(): String = js.native
    
    /**
      * Gets current value of property {@link #getTarget target}.
      *
      * Specifies the target of the link - it works like the target property of the HTML  tag. Works only
      * with QuickViewGroupElement of type link.
      *
      * Default value is `"_blank"`.
      *
      * @returns Value of property `target`
      */
    def getTarget(): String = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * Specifies the type of the displayed information - phone number, mobile number, e-mail, link, text or
      * a link to another QuickViewPage. Default value is 'text'.
      *
      * Default value is `text`.
      *
      * @returns Value of property `type`
      */
    def getType(): QuickViewGroupElementType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof QuickViewGroupElementType * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getUrl url}.
      *
      * Specifies the address of the QuickViewGroupElement link. Works only with QuickViewGroupElement of type
      * link.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `url`
      */
    def getUrl(): String = js.native
    
    /**
      * Gets current value of property {@link #getValue value}.
      *
      * Specifies the text of the control that associates with the label.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `value`
      */
    def getValue(): String = js.native
    
    /**
      * Gets current value of property {@link #getVisible visible}.
      *
      * Determines whether the element should be visible on the screen.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visible`
      */
    def getVisible(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getEmailSubject emailSubject}.
      *
      * The subject of the email. Works only with QuickViewGroupElement of type email.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEmailSubject(): this.type = js.native
    def setEmailSubject(/**
      * New value for property `emailSubject`
      */
    sEmailSubject: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getLabel label}.
      *
      * Specifies the text displayed below the associated label.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setLabel(): this.type = js.native
    def setLabel(/**
      * New value for property `label`
      */
    sLabel: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getPageLinkId pageLinkId}.
      *
      * Specifies the ID of the QuickViewPage, which is opened from the link in the QuickViewGroupElement. Works
      * only with QuickViewGroupElement of type pageLink.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setPageLinkId(): this.type = js.native
    def setPageLinkId(/**
      * New value for property `pageLinkId`
      */
    sPageLinkId: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTarget target}.
      *
      * Specifies the target of the link - it works like the target property of the HTML  tag. Works only
      * with QuickViewGroupElement of type link.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"_blank"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTarget(): this.type = js.native
    def setTarget(/**
      * New value for property `target`
      */
    sTarget: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getType type}.
      *
      * Specifies the type of the displayed information - phone number, mobile number, e-mail, link, text or
      * a link to another QuickViewPage. Default value is 'text'.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `text`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(): this.type = js.native
    def setType(
      /**
      * New value for property `type`
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof QuickViewGroupElementType * / any */ String
    ): this.type = js.native
    def setType(/**
      * New value for property `type`
      */
    sType: QuickViewGroupElementType): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUrl url}.
      *
      * Specifies the address of the QuickViewGroupElement link. Works only with QuickViewGroupElement of type
      * link.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUrl(): this.type = js.native
    def setUrl(/**
      * New value for property `url`
      */
    sUrl: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getValue value}.
      *
      * Specifies the text of the control that associates with the label.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setValue(): this.type = js.native
    def setValue(/**
      * New value for property `value`
      */
    sValue: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisible visible}.
      *
      * Determines whether the element should be visible on the screen.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisible(): this.type = js.native
    def setVisible(/**
      * New value for property `visible`
      */
    bVisible: Boolean): this.type = js.native
  }
  
  trait QuickViewGroupElementSettings
    extends StObject
       with ElementSettings {
    
    /**
      * The subject of the email. Works only with QuickViewGroupElement of type email.
      */
    var emailSubject: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies the text displayed below the associated label.
      */
    var label: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies the ID of the QuickViewPage, which is opened from the link in the QuickViewGroupElement. Works
      * only with QuickViewGroupElement of type pageLink.
      */
    var pageLinkId: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies the target of the link - it works like the target property of the HTML  tag. Works only
      * with QuickViewGroupElement of type link.
      */
    var target: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies the type of the displayed information - phone number, mobile number, e-mail, link, text or
      * a link to another QuickViewPage. Default value is 'text'.
      */
    var `type`: js.UndefOr[
        QuickViewGroupElementType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof QuickViewGroupElementType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Specifies the address of the QuickViewGroupElement link. Works only with QuickViewGroupElement of type
      * link.
      */
    var url: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Specifies the text of the control that associates with the label.
      */
    var value: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines whether the element should be visible on the screen.
      */
    var visible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object QuickViewGroupElementSettings {
    
    inline def apply(): QuickViewGroupElementSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuickViewGroupElementSettings]
    }
    
    extension [Self <: QuickViewGroupElementSettings](x: Self) {
      
      inline def setEmailSubject(value: String | PropertyBindingInfo): Self = StObject.set(x, "emailSubject", value.asInstanceOf[js.Any])
      
      inline def setEmailSubjectUndefined: Self = StObject.set(x, "emailSubject", js.undefined)
      
      inline def setLabel(value: String | PropertyBindingInfo): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setPageLinkId(value: String | PropertyBindingInfo): Self = StObject.set(x, "pageLinkId", value.asInstanceOf[js.Any])
      
      inline def setPageLinkIdUndefined: Self = StObject.set(x, "pageLinkId", js.undefined)
      
      inline def setTarget(value: String | PropertyBindingInfo): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(
        value: QuickViewGroupElementType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof QuickViewGroupElementType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String | PropertyBindingInfo): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setValue(value: String | PropertyBindingInfo): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
