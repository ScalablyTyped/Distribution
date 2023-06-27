package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.BadgeAnimationType
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreCustomDataMod.CustomDataSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMBadgeCustomDataMod {
  
  @JSImport("sap/m/BadgeCustomData", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `BadgeCustomData` element.
    */
  open class default () extends BadgeCustomData {
    def this(/**
      * Initial settings for the new element
      */
    mSettings: BadgeCustomDataSettings) = this()
    def this(/**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new element
      */
    mSettings: BadgeCustomDataSettings
    ) = this()
    def this(
      /**
      * ID for the new element, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new element
      */
    mSettings: BadgeCustomDataSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/BadgeCustomData", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.BadgeCustomData with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.CustomData.extend}.
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
    oClassInfo: ClassInfo[T, BadgeCustomData]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, BadgeCustomData],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.BadgeCustomData.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait BadgeCustomData
    extends typings.openui5.sapUiCoreCustomDataMod.default {
    
    /**
      * @since 1.87
      *
      * Gets current value of property {@link #getAnimation animation}.
      *
      * Determines the type of animation to be performed by the Badge DOM element.
      *
      * Default value is `Full`.
      *
      * @returns Value of property `animation`
      */
    def getAnimation(): BadgeAnimationType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BadgeAnimationType * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getVisible visible}.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visible`
      */
    def getVisible(): Boolean = js.native
    
    /**
      * @since 1.87
      *
      * Sets a new value for property {@link #getAnimation animation}.
      *
      * Determines the type of animation to be performed by the Badge DOM element.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Full`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAnimation(): this.type = js.native
    def setAnimation(
      /**
      * New value for property `animation`
      */
    sAnimation: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BadgeAnimationType * / any */ String
    ): this.type = js.native
    def setAnimation(/**
      * New value for property `animation`
      */
    sAnimation: BadgeAnimationType): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisible visible}.
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
  
  trait BadgeCustomDataSettings
    extends StObject
       with CustomDataSettings {
    
    /**
      * @since 1.87
      *
      * Determines the type of animation to be performed by the Badge DOM element.
      */
    var animation: js.UndefOr[
        BadgeAnimationType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BadgeAnimationType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    var visible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object BadgeCustomDataSettings {
    
    inline def apply(): BadgeCustomDataSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BadgeCustomDataSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BadgeCustomDataSettings] (val x: Self) extends AnyVal {
      
      inline def setAnimation(
        value: BadgeAnimationType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BadgeAnimationType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      inline def setVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
