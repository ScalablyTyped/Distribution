package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMListMod.ListSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMGrowingListMod {
  
  @JSImport("sap/m/GrowingList", JSImport.Default)
  @js.native
  /**
    * Constructor for a new GrowingList.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends GrowingList {
    def this(/**
      * initial settings for the new control
      */
    mSettings: GrowingListSettings) = this()
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
    mSettings: GrowingListSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: GrowingListSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/GrowingList", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.GrowingList with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.List.extend}.
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
    oClassInfo: ClassInfo[T, GrowingList]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, GrowingList],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.GrowingList.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait GrowingList
    extends typings.openui5.sapMListMod.default {
    
    /**
      * @SINCE 1.16
      *
      * Gets current value of property {@link #getScrollToLoad scrollToLoad}.
      *
      * If you set this property to true then user needs to scroll end to trigger loading a new page. Default
      * value is false which means user needs to scroll end and then click button to load new page. NOTE: This
      * property can be set true, if growing property is set "true" and if you only have one instance of this
      * control inside the scroll container(e.g Page).
      *
      * Default value is `false`.
      *
      * @returns Value of property `scrollToLoad`
      */
    def getScrollToLoad(): Boolean = js.native
    
    /**
      * @SINCE 1.16
      *
      * Gets current value of property {@link #getThreshold threshold}.
      *
      * Number of items requested from the server. To activate this you should set growing property to "true"
      *
      * Default value is `20`.
      *
      * @returns Value of property `threshold`
      */
    def getThreshold(): int = js.native
    
    /**
      * @SINCE 1.16
      *
      * Gets current value of property {@link #getTriggerText triggerText}.
      *
      * Text which is displayed on the trigger at the end of the list. The default is a translated text ("Load
      * More Data") coming from the messagebundle properties. This property can be used only if growing property
      * is set "true" and scrollToLoad property is set "false".
      *
      * @returns Value of property `triggerText`
      */
    def getTriggerText(): String = js.native
    
    /**
      * @SINCE 1.16
      *
      * Sets a new value for property {@link #getScrollToLoad scrollToLoad}.
      *
      * If you set this property to true then user needs to scroll end to trigger loading a new page. Default
      * value is false which means user needs to scroll end and then click button to load new page. NOTE: This
      * property can be set true, if growing property is set "true" and if you only have one instance of this
      * control inside the scroll container(e.g Page).
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setScrollToLoad(): this.type = js.native
    def setScrollToLoad(/**
      * New value for property `scrollToLoad`
      */
    bScrollToLoad: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.16
      *
      * Sets a new value for property {@link #getThreshold threshold}.
      *
      * Number of items requested from the server. To activate this you should set growing property to "true"
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `20`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setThreshold(): this.type = js.native
    def setThreshold(/**
      * New value for property `threshold`
      */
    iThreshold: int): this.type = js.native
    
    /**
      * @SINCE 1.16
      *
      * Sets a new value for property {@link #getTriggerText triggerText}.
      *
      * Text which is displayed on the trigger at the end of the list. The default is a translated text ("Load
      * More Data") coming from the messagebundle properties. This property can be used only if growing property
      * is set "true" and scrollToLoad property is set "false".
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTriggerText(): this.type = js.native
    def setTriggerText(/**
      * New value for property `triggerText`
      */
    sTriggerText: String): this.type = js.native
  }
  
  trait GrowingListSettings
    extends StObject
       with ListSettings {
    
    /**
      * @SINCE 1.16
      *
      * If you set this property to true then user needs to scroll end to trigger loading a new page. Default
      * value is false which means user needs to scroll end and then click button to load new page. NOTE: This
      * property can be set true, if growing property is set "true" and if you only have one instance of this
      * control inside the scroll container(e.g Page).
      */
    var scrollToLoad: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.16
      *
      * Number of items requested from the server. To activate this you should set growing property to "true"
      */
    var threshold: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * @SINCE 1.16
      *
      * Text which is displayed on the trigger at the end of the list. The default is a translated text ("Load
      * More Data") coming from the messagebundle properties. This property can be used only if growing property
      * is set "true" and scrollToLoad property is set "false".
      */
    var triggerText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object GrowingListSettings {
    
    inline def apply(): GrowingListSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GrowingListSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GrowingListSettings] (val x: Self) extends AnyVal {
      
      inline def setScrollToLoad(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "scrollToLoad", value.asInstanceOf[js.Any])
      
      inline def setScrollToLoadUndefined: Self = StObject.set(x, "scrollToLoad", js.undefined)
      
      inline def setThreshold(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setTriggerText(value: String | PropertyBindingInfo): Self = StObject.set(x, "triggerText", value.asInstanceOf[js.Any])
      
      inline def setTriggerTextUndefined: Self = StObject.set(x, "triggerText", js.undefined)
    }
  }
}
