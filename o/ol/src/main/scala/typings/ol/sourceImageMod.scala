package typings.ol

import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.objectEventTypeMod.Types
import typings.ol.objectMod.ObjectEvent
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.sourceSourceMod.State
import typings.ol.viewMod.ViewStateAndExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceImageMod {
  
  @JSImport("ol/source/Image", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types, import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<ImageSourceEventTypes, ImageSourceEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types
    *     |ImageSourceEventTypes, Return>} ImageSourceOnSignature
    */
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection.
    * @property {Array<number>} [resolutions] Resolutions.
    * @property {import("./Source.js").State} [state] State.
    */
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for sources providing a single image.
    * @abstract
    * @fires module:ol/source/Image.ImageSourceEvent
    * @api
    */
  @JSImport("ol/source/Image", JSImport.Default)
  @js.native
  open class default protected () extends ImageSource {
    /**
      * @param {Options} options Single image source options.
      */
    def this(options: Options) = this()
  }
  
  @JSImport("ol/source/Image", "ImageSourceEvent")
  @js.native
  open class ImageSourceEvent protected ()
    extends typings.ol.eventsEventMod.default {
    /**
      * @param {string} type Type.
      * @param {import("../Image.js").default} image The image.
      */
    def this(`type`: String, image: typings.ol.styleImageMod.default) = this()
    
    /**
      * The image related to the event.
      * @type {import("../Image.js").default}
      * @api
      */
    var image: typings.ol.styleImageMod.default = js.native
  }
  
  object ImageSourceEventType {
    
    @JSImport("ol/source/Image", "ImageSourceEventType.IMAGELOADEND")
    @js.native
    val IMAGELOADEND: String = js.native
    
    @JSImport("ol/source/Image", "ImageSourceEventType.IMAGELOADERROR")
    @js.native
    val IMAGELOADERROR: String = js.native
    
    @JSImport("ol/source/Image", "ImageSourceEventType.IMAGELOADSTART")
    @js.native
    val IMAGELOADSTART: String = js.native
  }
  type ImageSourceEventType = String
  
  inline def defaultImageLoadFunction(image: typings.ol.styleImageMod.default, src: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultImageLoadFunction")(image.asInstanceOf[js.Any], src.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types, import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<ImageSourceEventTypes, ImageSourceEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types
    *     |ImageSourceEventTypes, Return>} ImageSourceOnSignature
    */
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection.
    * @property {Array<number>} [resolutions] Resolutions.
    * @property {import("./Source.js").State} [state] State.
    */
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for sources providing a single image.
    * @abstract
    * @fires module:ol/source/Image.ImageSourceEvent
    * @api
    */
  @js.native
  trait ImageSource
    extends typings.ol.sourceSourceMod.default {
    
    /**
      * @protected
      * @param {number} resolution Resolution.
      * @return {number} Resolution.
      */
    /* protected */ def findNearestResolution(resolution: Double): Double = js.native
    
    /**
      * @param {import("../extent.js").Extent} extent Extent.
      * @param {number} resolution Resolution.
      * @param {number} pixelRatio Pixel ratio.
      * @param {import("../proj/Projection.js").default} projection Projection.
      * @return {import("../ImageBase.js").default} Single image.
      */
    def getImage(
      extent: Extent,
      resolution: Double,
      pixelRatio: Double,
      projection: typings.ol.projProjectionMod.default
    ): typings.ol.imageBaseMod.default = js.native
    
    /**
      * @abstract
      * @param {import("../extent.js").Extent} extent Extent.
      * @param {number} resolution Resolution.
      * @param {number} pixelRatio Pixel ratio.
      * @param {import("../proj/Projection.js").default} projection Projection.
      * @return {import("../ImageBase.js").default} Single image.
      * @protected
      */
    /* protected */ def getImageInternal(
      extent: Extent,
      resolution: Double,
      pixelRatio: Double,
      projection: typings.ol.projProjectionMod.default
    ): typings.ol.imageBaseMod.default = js.native
    
    /**
      * Handle image change events.
      * @param {import("../events/Event.js").default} event Event.
      * @protected
      */
    /* protected */ def handleImageChange(event: typings.ol.eventsEventMod.default): Unit = js.native
    
    /***
      * @type {ImageSourceOnSignature<import("../events").EventsKey>}
      */
    @JSName("on")
    var on_ImageSource: ImageSourceOnSignature[EventsKey] = js.native
    
    /***
      * @type {ImageSourceOnSignature<import("../events").EventsKey>}
      */
    @JSName("once")
    var once_ImageSource: ImageSourceOnSignature[EventsKey] = js.native
    
    /**
      * @private
      * @type {import("../reproj/Image.js").default}
      */
    /* private */ var reprojectedImage_ : Any = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var reprojectedRevision_ : Any = js.native
    
    /**
      * @private
      * @type {Array<number>|null}
      */
    /* private */ var resolutions_ : Any = js.native
    
    /**
      * @param {Array<number>|null} resolutions Resolutions.
      */
    def setResolutions(): Unit = js.native
    def setResolutions(resolutions: js.Array[Double]): Unit = js.native
    
    /***
      * @type {ImageSourceOnSignature<void>}
      */
    @JSName("un")
    var un_ImageSource: ImageSourceOnSignature[Unit] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ol.olStrings.imageloadend
    - typings.ol.olStrings.imageloaderror
    - typings.ol.olStrings.imageloadstart
  */
  trait ImageSourceEventTypes extends StObject
  object ImageSourceEventTypes {
    
    inline def imageloadend: typings.ol.olStrings.imageloadend = "imageloadend".asInstanceOf[typings.ol.olStrings.imageloadend]
    
    inline def imageloaderror: typings.ol.olStrings.imageloaderror = "imageloaderror".asInstanceOf[typings.ol.olStrings.imageloaderror]
    
    inline def imageloadstart: typings.ol.olStrings.imageloadstart = "imageloadstart".asInstanceOf[typings.ol.olStrings.imageloadstart]
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait ImageSourceOnSignature[Return]
    extends OnSignature[
          EventTypes | ImageSourceEventTypes | Types, 
          ImageSourceEvent | ObjectEvent | typings.ol.eventsEventMod.default, 
          Return
        ]
  
  trait Options extends StObject {
    
    /**
      * Attributions.
      */
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    /**
      * Use interpolated values when resampling.  By default,
      * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
      */
    var interpolate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Projection.
      */
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * Resolutions.
      */
    var resolutions: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * State.
      */
    var state: js.UndefOr[State] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      inline def setAttributionsFunction1(value: /* arg0 */ ViewStateAndExtent => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      inline def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value*))
      
      inline def setInterpolate(value: Boolean): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
      
      inline def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
      
      inline def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value*))
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
