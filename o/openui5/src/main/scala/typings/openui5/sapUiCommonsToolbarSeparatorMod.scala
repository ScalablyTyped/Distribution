package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsLibraryMod.ToolbarItem
import typings.openui5.sapUiCommonsLibraryMod.ToolbarSeparatorDesign
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsToolbarSeparatorMod {
  
  @JSImport("sap/ui/commons/ToolbarSeparator", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ToolbarSeparator.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ToolbarSeparator {
    def this(/**
      * initial settings for the new control
      */
    mSettings: ToolbarSeparatorSettings) = this()
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
    mSettings: ToolbarSeparatorSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: ToolbarSeparatorSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_commons_ToolbarItem: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/ToolbarSeparator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.ToolbarSeparator with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, ToolbarSeparator]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ToolbarSeparator],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.ToolbarSeparator.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ToolbarSeparator
    extends typings.openui5.sapUiCoreElementMod.default
       with ToolbarItem {
    
    /**
      * Gets current value of property {@link #getDesign design}.
      *
      * Design of the Separator.
      *
      * @returns Value of property `design`
      */
    def getDesign(): ToolbarSeparatorDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ToolbarSeparatorDesign * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getDisplayVisualSeparator displayVisualSeparator}.
      *
      * When set to false, there is no visual indication of separation by a vertical line but by a wider space.
      *
      * Default value is `true`.
      *
      * @returns Value of property `displayVisualSeparator`
      */
    def getDisplayVisualSeparator(): Boolean = js.native
    
    /**
      * Sets a new value for property {@link #getDesign design}.
      *
      * Design of the Separator.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDesign(): this.type = js.native
    def setDesign(
      /**
      * New value for property `design`
      */
    sDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ToolbarSeparatorDesign * / any */ String
    ): this.type = js.native
    def setDesign(/**
      * New value for property `design`
      */
    sDesign: ToolbarSeparatorDesign): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getDisplayVisualSeparator displayVisualSeparator}.
      *
      * When set to false, there is no visual indication of separation by a vertical line but by a wider space.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDisplayVisualSeparator(): this.type = js.native
    def setDisplayVisualSeparator(/**
      * New value for property `displayVisualSeparator`
      */
    bDisplayVisualSeparator: Boolean): this.type = js.native
  }
  
  trait ToolbarSeparatorSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Design of the Separator.
      */
    var design: js.UndefOr[
        ToolbarSeparatorDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ToolbarSeparatorDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * When set to false, there is no visual indication of separation by a vertical line but by a wider space.
      */
    var displayVisualSeparator: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ToolbarSeparatorSettings {
    
    inline def apply(): ToolbarSeparatorSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarSeparatorSettings]
    }
    
    extension [Self <: ToolbarSeparatorSettings](x: Self) {
      
      inline def setDesign(
        value: ToolbarSeparatorDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ToolbarSeparatorDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "design", value.asInstanceOf[js.Any])
      
      inline def setDesignUndefined: Self = StObject.set(x, "design", js.undefined)
      
      inline def setDisplayVisualSeparator(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "displayVisualSeparator", value.asInstanceOf[js.Any])
      
      inline def setDisplayVisualSeparatorUndefined: Self = StObject.set(x, "displayVisualSeparator", js.undefined)
    }
  }
}
