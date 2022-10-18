package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.IScale
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMResponsiveScaleMod {
  
  @JSImport("sap/m/ResponsiveScale", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `ResponsiveScale`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ResponsiveScale {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ResponsiveScaleSettings) = this()
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
    mSettings: ResponsiveScaleSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ResponsiveScaleSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_m_IScale: Boolean = js.native
    
    /**
      * Returns how many tickmarks would be drawn on the screen.
      *
      * **Note:** There would always be a tickmark in the beginning and in the end of the slider, regardless
      * of the value this method returns. The start and the end tickmark are taken into account for the later
      * calculations.
      *
      * @returns The number of tickmarks
      */
    /* CompleteClass */
    override def calcNumberOfTickmarks(
      /**
      * Size of the scale. This is the distance between the start and end point i.e. 0..100
      */
    fSize: float,
      /**
      * The step walking from start to end.
      */
    fStep: float,
      /**
      * Limits the number of tickmarks.
      */
    iTickmarksThreshold: int
    ): int = js.native
    
    /**
      * Returns the number of tickmarks, which should be placed between labels.
      *
      * **Note:** There would always be a tickmark in the beginning and in the end of the slider, regardless
      * of the value that this method returns.
      *
      * @returns The number of tickmarks
      */
    /* CompleteClass */
    override def getTickmarksBetweenLabels(/**
      * The option array
      */
    mOptions: js.Object): int = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ResponsiveScale", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ResponsiveScale with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, ResponsiveScale]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ResponsiveScale],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ResponsiveScale.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ResponsiveScale
    extends typings.openui5.sapUiCoreElementMod.default
       with IScale {
    
    /**
      * Gets current value of property {@link #getTickmarksBetweenLabels tickmarksBetweenLabels}.
      *
      * Put a label on every N-th tickmark.
      *
      * Default value is `0`.
      *
      * @returns Value of property `tickmarksBetweenLabels`
      */
    def getTickmarksBetweenLabels(): int = js.native
    
    /**
      * Sets a new value for property {@link #getTickmarksBetweenLabels tickmarksBetweenLabels}.
      *
      * Put a label on every N-th tickmark.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTickmarksBetweenLabels(): this.type = js.native
    def setTickmarksBetweenLabels(/**
      * New value for property `tickmarksBetweenLabels`
      */
    iTickmarksBetweenLabels: int): this.type = js.native
  }
  
  trait ResponsiveScaleSettings
    extends StObject
       with ElementSettings {
    
    /**
      * Put a label on every N-th tickmark.
      */
    var tickmarksBetweenLabels: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object ResponsiveScaleSettings {
    
    inline def apply(): ResponsiveScaleSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveScaleSettings]
    }
    
    extension [Self <: ResponsiveScaleSettings](x: Self) {
      
      inline def setTickmarksBetweenLabels(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "tickmarksBetweenLabels", value.asInstanceOf[js.Any])
      
      inline def setTickmarksBetweenLabelsUndefined: Self = StObject.set(x, "tickmarksBetweenLabels", js.undefined)
    }
  }
}
