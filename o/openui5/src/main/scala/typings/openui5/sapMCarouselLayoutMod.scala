package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMCarouselLayoutMod {
  
  @JSImport("sap/m/CarouselLayout", JSImport.Default)
  @js.native
  /**
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends CarouselLayout {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: CarouselLayoutSettings) = this()
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
    mSettings: CarouselLayoutSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: CarouselLayoutSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/CarouselLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.CarouselLayout with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, CarouselLayout]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, CarouselLayout],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.CarouselLayout.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
  }
  
  @js.native
  trait CarouselLayout
    extends typings.openui5.sapUiBaseManagedObjectMod.default {
    
    /**
      * Gets current value of property {@link #getVisiblePagesCount visiblePagesCount}.
      *
      * Defines how many pages are displayed in the visible area of the `Carousel` control. Value should be a
      * positive number.
      *
      * **Note:** When this property is set to something different than the default value, the `loop` property
      * of `Carousel` is ignored.
      *
      * Default value is `1`.
      *
      * @returns Value of property `visiblePagesCount`
      */
    def getVisiblePagesCount(): int = js.native
    
    /**
      * Sets a new value for property {@link #getVisiblePagesCount visiblePagesCount}.
      *
      * Defines how many pages are displayed in the visible area of the `Carousel` control. Value should be a
      * positive number.
      *
      * **Note:** When this property is set to something different than the default value, the `loop` property
      * of `Carousel` is ignored.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisiblePagesCount(): this.type = js.native
    def setVisiblePagesCount(/**
      * New value for property `visiblePagesCount`
      */
    iVisiblePagesCount: int): this.type = js.native
  }
  
  trait CarouselLayoutSettings
    extends StObject
       with ManagedObjectSettings {
    
    /**
      * Defines how many pages are displayed in the visible area of the `Carousel` control. Value should be a
      * positive number.
      *
      * **Note:** When this property is set to something different than the default value, the `loop` property
      * of `Carousel` is ignored.
      */
    var visiblePagesCount: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object CarouselLayoutSettings {
    
    inline def apply(): CarouselLayoutSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselLayoutSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CarouselLayoutSettings] (val x: Self) extends AnyVal {
      
      inline def setVisiblePagesCount(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visiblePagesCount", value.asInstanceOf[js.Any])
      
      inline def setVisiblePagesCountUndefined: Self = StObject.set(x, "visiblePagesCount", js.undefined)
    }
  }
}
