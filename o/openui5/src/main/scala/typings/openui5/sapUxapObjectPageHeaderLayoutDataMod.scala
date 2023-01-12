package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUxapObjectPageHeaderLayoutDataMod {
  
  @JSImport("sap/uxap/ObjectPageHeaderLayoutData", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ObjectPageHeaderLayoutData`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ObjectPageHeaderLayoutData {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ObjectPageHeaderLayoutDataSettings) = this()
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
    mSettings: ObjectPageHeaderLayoutDataSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ObjectPageHeaderLayoutDataSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/uxap/ObjectPageHeaderLayoutData", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.uxap.ObjectPageHeaderLayoutData with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.LayoutData.extend}.
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
    oClassInfo: ClassInfo[T, ObjectPageHeaderLayoutData]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ObjectPageHeaderLayoutData],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.uxap.ObjectPageHeaderLayoutData.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ObjectPageHeaderLayoutData
    extends typings.openui5.sapUiCoreLayoutDataMod.default {
    
    /**
      * Gets current value of property {@link #getShowSeparatorAfter showSeparatorAfter}.
      *
      * If this property is set the control will display a separator after it.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showSeparatorAfter`
      */
    def getShowSeparatorAfter(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getShowSeparatorBefore showSeparatorBefore}.
      *
      * If this property is set the control will display a separator before it.
      *
      * Default value is `false`.
      *
      * @returns Value of property `showSeparatorBefore`
      */
    def getShowSeparatorBefore(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getVisibleL visibleL}.
      *
      * If this property is set the control will be visible (or not) in a large sized layout.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visibleL`
      */
    def getVisibleL(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getVisibleM visibleM}.
      *
      * If this property is set the control will be visible (or not) in a medium sized layout.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visibleM`
      */
    def getVisibleM(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getVisibleS visibleS}.
      *
      * If this property is set the control will be visible (or not) in a small sized layout.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visibleS`
      */
    def getVisibleS(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * If this property is set the control will take the provided size.
      *
      * Default value is `'auto'`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Sets a new value for property {@link #getShowSeparatorAfter showSeparatorAfter}.
      *
      * If this property is set the control will display a separator after it.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowSeparatorAfter(): this.type = js.native
    def setShowSeparatorAfter(/**
      * New value for property `showSeparatorAfter`
      */
    bShowSeparatorAfter: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowSeparatorBefore showSeparatorBefore}.
      *
      * If this property is set the control will display a separator before it.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowSeparatorBefore(): this.type = js.native
    def setShowSeparatorBefore(/**
      * New value for property `showSeparatorBefore`
      */
    bShowSeparatorBefore: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisibleL visibleL}.
      *
      * If this property is set the control will be visible (or not) in a large sized layout.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisibleL(): this.type = js.native
    def setVisibleL(/**
      * New value for property `visibleL`
      */
    bVisibleL: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisibleM visibleM}.
      *
      * If this property is set the control will be visible (or not) in a medium sized layout.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisibleM(): this.type = js.native
    def setVisibleM(/**
      * New value for property `visibleM`
      */
    bVisibleM: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisibleS visibleS}.
      *
      * If this property is set the control will be visible (or not) in a small sized layout.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisibleS(): this.type = js.native
    def setVisibleS(/**
      * New value for property `visibleS`
      */
    bVisibleS: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * If this property is set the control will take the provided size.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `'auto'`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait ObjectPageHeaderLayoutDataSettings
    extends StObject
       with ElementSettings {
    
    /**
      * If this property is set the control will display a separator after it.
      */
    var showSeparatorAfter: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If this property is set the control will display a separator before it.
      */
    var showSeparatorBefore: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If this property is set the control will be visible (or not) in a large sized layout.
      */
    var visibleL: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If this property is set the control will be visible (or not) in a medium sized layout.
      */
    var visibleM: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If this property is set the control will be visible (or not) in a small sized layout.
      */
    var visibleS: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * If this property is set the control will take the provided size.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ObjectPageHeaderLayoutDataSettings {
    
    inline def apply(): ObjectPageHeaderLayoutDataSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ObjectPageHeaderLayoutDataSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectPageHeaderLayoutDataSettings] (val x: Self) extends AnyVal {
      
      inline def setShowSeparatorAfter(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSeparatorAfter", value.asInstanceOf[js.Any])
      
      inline def setShowSeparatorAfterUndefined: Self = StObject.set(x, "showSeparatorAfter", js.undefined)
      
      inline def setShowSeparatorBefore(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showSeparatorBefore", value.asInstanceOf[js.Any])
      
      inline def setShowSeparatorBeforeUndefined: Self = StObject.set(x, "showSeparatorBefore", js.undefined)
      
      inline def setVisibleL(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visibleL", value.asInstanceOf[js.Any])
      
      inline def setVisibleLUndefined: Self = StObject.set(x, "visibleL", js.undefined)
      
      inline def setVisibleM(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visibleM", value.asInstanceOf[js.Any])
      
      inline def setVisibleMUndefined: Self = StObject.set(x, "visibleM", js.undefined)
      
      inline def setVisibleS(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visibleS", value.asInstanceOf[js.Any])
      
      inline def setVisibleSUndefined: Self = StObject.set(x, "visibleS", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
