package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMToolbarLayoutDataMod {
  
  @JSImport("sap/m/ToolbarLayoutData", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ToolbarLayoutData`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ToolbarLayoutData {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ToolbarLayoutDataSettings) = this()
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
    mSettings: ToolbarLayoutDataSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ToolbarLayoutDataSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ToolbarLayoutData", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ToolbarLayoutData with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, ToolbarLayoutData]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ToolbarLayoutData],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ToolbarLayoutData.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ToolbarLayoutData
    extends typings.openui5.sapUiCoreLayoutDataMod.default {
    
    /**
      * Gets current value of property {@link #getMaxWidth maxWidth}.
      *
      * Sets the maximum width of the toolbar item.
      *
      * @returns Value of property `maxWidth`
      */
    def getMaxWidth(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getMinWidth minWidth}.
      *
      * Sets the minimum width of the toolbar item.
      *
      * @returns Value of property `minWidth`
      */
    def getMinWidth(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getShrinkable shrinkable}.
      *
      * Determines whether the control, when in a toolbar, is shrinkable or not. For controls with fixed width
      * (100px, 5rem, etc...) this property is ignored.
      *
      * **Notes:**
      * 	 - Nested layout controls should not be shrinkable.
      * 	 - This property has no effect on `sap.m.Breadcrumbs` as it is shrinkable by default.
      *
      * Default value is `false`.
      *
      * @returns Value of property `shrinkable`
      */
    def getShrinkable(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getMaxWidth maxWidth}.
      *
      * Sets the maximum width of the toolbar item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxWidth(): this.type = js.native
    def setMaxWidth(/**
      * New value for property `maxWidth`
      */
    sMaxWidth: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMinWidth minWidth}.
      *
      * Sets the minimum width of the toolbar item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMinWidth(): this.type = js.native
    def setMinWidth(/**
      * New value for property `minWidth`
      */
    sMinWidth: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShrinkable shrinkable}.
      *
      * Determines whether the control, when in a toolbar, is shrinkable or not. For controls with fixed width
      * (100px, 5rem, etc...) this property is ignored.
      *
      * **Notes:**
      * 	 - Nested layout controls should not be shrinkable.
      * 	 - This property has no effect on `sap.m.Breadcrumbs` as it is shrinkable by default.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShrinkable(): this.type = js.native
    def setShrinkable(/**
      * New value for property `shrinkable`
      */
    bShrinkable: Boolean): this.type = js.native
  }
  
  trait ToolbarLayoutDataSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Sets the maximum width of the toolbar item.
      */
    var maxWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Sets the minimum width of the toolbar item.
      */
    var minWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Determines whether the control, when in a toolbar, is shrinkable or not. For controls with fixed width
      * (100px, 5rem, etc...) this property is ignored.
      *
      * **Notes:**
      * 	 - Nested layout controls should not be shrinkable.
      * 	 - This property has no effect on `sap.m.Breadcrumbs` as it is shrinkable by default.
      */
    var shrinkable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ToolbarLayoutDataSettings {
    
    inline def apply(): ToolbarLayoutDataSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarLayoutDataSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolbarLayoutDataSettings] (val x: Self) extends AnyVal {
      
      inline def setMaxWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setShrinkable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "shrinkable", value.asInstanceOf[js.Any])
      
      inline def setShrinkableUndefined: Self = StObject.set(x, "shrinkable", js.undefined)
    }
  }
}
