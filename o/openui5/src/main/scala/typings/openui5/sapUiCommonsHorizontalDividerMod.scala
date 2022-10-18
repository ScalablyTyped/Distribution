package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsLibraryMod.HorizontalDividerHeight
import typings.openui5.sapUiCommonsLibraryMod.HorizontalDividerType
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsHorizontalDividerMod {
  
  @JSImport("sap/ui/commons/HorizontalDivider", JSImport.Default)
  @js.native
  /**
    * Constructor for a new HorizontalDivider.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends HorizontalDivider {
    def this(/**
      * initial settings for the new control
      */
    mSettings: HorizontalDividerSettings) = this()
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
    mSettings: HorizontalDividerSettings
    ) = this()
    def this(
      /**
      * id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * initial settings for the new control
      */
    mSettings: HorizontalDividerSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/HorizontalDivider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.HorizontalDivider with name `sClassName` and enriches
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
    oClassInfo: ClassInfo[T, HorizontalDivider]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, HorizontalDivider],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.HorizontalDivider.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait HorizontalDivider
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Defines the height of the divider.
      *
      * Default value is `Medium`.
      *
      * @returns Value of property `height`
      */
    def getHeight(): HorizontalDividerHeight | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalDividerHeight * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * Defines the type of the divider.
      *
      * Default value is `Area`.
      *
      * @returns Value of property `type`
      */
    def getType(): HorizontalDividerType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalDividerType * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Defines the width of the divider.
      *
      * Default value is `'100%'`.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Defines the height of the divider.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Medium`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(
      /**
      * New value for property `height`
      */
    sHeight: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalDividerHeight * / any */ String
    ): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: HorizontalDividerHeight): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getType type}.
      *
      * Defines the type of the divider.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Area`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(): this.type = js.native
    def setType(
      /**
      * New value for property `type`
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalDividerType * / any */ String
    ): this.type = js.native
    def setType(/**
      * New value for property `type`
      */
    sType: HorizontalDividerType): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Defines the width of the divider.
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
  
  trait HorizontalDividerSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the height of the divider.
      */
    var height: js.UndefOr[
        HorizontalDividerHeight | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalDividerHeight * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the type of the divider.
      */
    var `type`: js.UndefOr[
        HorizontalDividerType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalDividerType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines the width of the divider.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object HorizontalDividerSettings {
    
    inline def apply(): HorizontalDividerSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalDividerSettings]
    }
    
    extension [Self <: HorizontalDividerSettings](x: Self) {
      
      inline def setHeight(
        value: HorizontalDividerHeight | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalDividerHeight * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setType(
        value: HorizontalDividerType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof HorizontalDividerType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
