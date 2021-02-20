package typings.ol

import typings.ol.eventsMod.EventsKey
import typings.ol.extentMod.Extent
import typings.ol.olStrings.imageloadend
import typings.ol.olStrings.imageloaderror
import typings.ol.olStrings.imageloadstart
import typings.ol.pluggableMapMod.FrameState
import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.stateMod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceImageMod {
  
  @JSImport("ol/source/Image", JSImport.Default)
  @js.native
  abstract class default protected () extends ImageSource {
    def this(options: Options) = this()
  }
  
  @JSImport("ol/source/Image", "ImageSourceEvent")
  @js.native
  class ImageSourceEvent protected ()
    extends typings.ol.eventMod.default {
    def this(`type`: String, image: typings.ol.olImageMod.default) = this()
    
    /**
      * The image related to the event.
      */
    var image: typings.ol.olImageMod.default = js.native
  }
  
  @js.native
  sealed trait ImageSourceEventType extends StObject
  @JSImport("ol/source/Image", "ImageSourceEventType")
  @js.native
  object ImageSourceEventType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ImageSourceEventType with String] = js.native
    
    @js.native
    sealed trait IMAGELOADEND extends ImageSourceEventType
    /* "imageloadend" */ val IMAGELOADEND: typings.ol.sourceImageMod.ImageSourceEventType.IMAGELOADEND with String = js.native
    
    @js.native
    sealed trait IMAGELOADERROR extends ImageSourceEventType
    /* "imageloaderror" */ val IMAGELOADERROR: typings.ol.sourceImageMod.ImageSourceEventType.IMAGELOADERROR with String = js.native
    
    @js.native
    sealed trait IMAGELOADSTART extends ImageSourceEventType
    /* "imageloadstart" */ val IMAGELOADSTART: typings.ol.sourceImageMod.ImageSourceEventType.IMAGELOADSTART with String = js.native
  }
  
  @JSImport("ol/source/Image", "defaultImageLoadFunction")
  @js.native
  def defaultImageLoadFunction(image: typings.ol.olImageMod.default, src: String): Unit = js.native
  
  @js.native
  trait ImageSource
    extends typings.ol.sourceSourceMod.default {
    
    /* protected */ def findNearestResolution(resolution: Double): Double = js.native
    
    def getImage(
      extent: Extent,
      resolution: Double,
      pixelRatio: Double,
      projection: typings.ol.projectionMod.default
    ): typings.ol.imageBaseMod.default = js.native
    
    /* protected */ def getImageInternal(
      extent: Extent,
      resolution: Double,
      pixelRatio: Double,
      projection: typings.ol.projectionMod.default
    ): typings.ol.imageBaseMod.default = js.native
    
    /**
      * Handle image change events.
      */
    /* protected */ def handleImageChange(event: typings.ol.eventMod.default): Unit = js.native
    
    @JSName("on")
    def on_imageloadend(`type`: imageloadend, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_imageloaderror(`type`: imageloaderror, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
    @JSName("on")
    def on_imageloadstart(`type`: imageloadstart, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_imageloadend(`type`: imageloadend, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_imageloaderror(`type`: imageloaderror, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_imageloadstart(`type`: imageloadstart, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
    
    @JSName("un")
    def un_imageloadend(`type`: imageloadend, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_imageloaderror(`type`: imageloaderror, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): Unit = js.native
    @JSName("un")
    def un_imageloadstart(`type`: imageloadstart, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var attributions: js.UndefOr[AttributionLike] = js.native
    
    var imageSmoothing: js.UndefOr[Boolean] = js.native
    
    var projection: js.UndefOr[ProjectionLike] = js.native
    
    var resolutions: js.UndefOr[js.Array[Double]] = js.native
    
    var state: js.UndefOr[State] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      @scala.inline
      def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value :_*))
      
      @scala.inline
      def setImageSmoothing(value: Boolean): Self = StObject.set(x, "imageSmoothing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSmoothingUndefined: Self = StObject.set(x, "imageSmoothing", js.undefined)
      
      @scala.inline
      def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      @scala.inline
      def setResolutions(value: js.Array[Double]): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
      
      @scala.inline
      def setResolutionsVarargs(value: Double*): Self = StObject.set(x, "resolutions", js.Array(value :_*))
      
      @scala.inline
      def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
