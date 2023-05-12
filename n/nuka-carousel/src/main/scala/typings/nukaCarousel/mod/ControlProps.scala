package typings.nukaCarousel.mod

import typings.nukaCarousel.nukaCarouselStrings.auto
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<nuka-carousel.nuka-carousel.InternalCarouselProps, 'cellAlign' | 'cellSpacing' | 'defaultControlsConfig' | 'onUserNavigation' | 'scrollMode' | 'slidesToScroll' | 'slidesToShow' | 'vertical' | 'wrapAround'> */
trait ControlProps extends StObject {
  
  var cellAlign: CellAlign
  
  var cellSpacing: Double
  
  /**
    * Current slide index
    */
  var currentSlide: Double
  
  var defaultControlsConfig: DefaultControlsConfig
  
  /**
    * Go to a specific slide
    * @param targetIndex Index to go to
    */
  def goToSlide(targetIndex: Double): Unit
  
  /**
    * Whether the "next" button should be disabled or not
    */
  var nextDisabled: Boolean
  
  /**
    * Go to the next slide
    */
  def nextSlide(): Unit
  
  var onUserNavigation: js.Function1[
    /* e */ TouchEvent[Element] | (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], 
    Unit
  ]
  
  /**
    * The indices for the paging dots
    */
  var pagingDotsIndices: js.Array[Double]
  
  /**
    * Whether the "previous" button should be disabled or not
    */
  var previousDisabled: Boolean
  
  /**
    * Go to the previous slide
    */
  def previousSlide(): Unit
  
  var scrollMode: ScrollMode
  
  /**
    * Total number of slides
    */
  var slideCount: Double
  
  var slidesToScroll: Double | auto
  
  var slidesToShow: Double
  
  var vertical: Boolean
  
  var wrapAround: Boolean
}
object ControlProps {
  
  inline def apply(
    cellAlign: CellAlign,
    cellSpacing: Double,
    currentSlide: Double,
    defaultControlsConfig: DefaultControlsConfig,
    goToSlide: Double => Unit,
    nextDisabled: Boolean,
    nextSlide: () => Unit,
    onUserNavigation: /* e */ TouchEvent[Element] | (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element] => Unit,
    pagingDotsIndices: js.Array[Double],
    previousDisabled: Boolean,
    previousSlide: () => Unit,
    scrollMode: ScrollMode,
    slideCount: Double,
    slidesToScroll: Double | auto,
    slidesToShow: Double,
    vertical: Boolean,
    wrapAround: Boolean
  ): ControlProps = {
    val __obj = js.Dynamic.literal(cellAlign = cellAlign.asInstanceOf[js.Any], cellSpacing = cellSpacing.asInstanceOf[js.Any], currentSlide = currentSlide.asInstanceOf[js.Any], defaultControlsConfig = defaultControlsConfig.asInstanceOf[js.Any], goToSlide = js.Any.fromFunction1(goToSlide), nextDisabled = nextDisabled.asInstanceOf[js.Any], nextSlide = js.Any.fromFunction0(nextSlide), onUserNavigation = js.Any.fromFunction1(onUserNavigation), pagingDotsIndices = pagingDotsIndices.asInstanceOf[js.Any], previousDisabled = previousDisabled.asInstanceOf[js.Any], previousSlide = js.Any.fromFunction0(previousSlide), scrollMode = scrollMode.asInstanceOf[js.Any], slideCount = slideCount.asInstanceOf[js.Any], slidesToScroll = slidesToScroll.asInstanceOf[js.Any], slidesToShow = slidesToShow.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], wrapAround = wrapAround.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControlProps] (val x: Self) extends AnyVal {
    
    inline def setCellAlign(value: CellAlign): Self = StObject.set(x, "cellAlign", value.asInstanceOf[js.Any])
    
    inline def setCellSpacing(value: Double): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
    
    inline def setCurrentSlide(value: Double): Self = StObject.set(x, "currentSlide", value.asInstanceOf[js.Any])
    
    inline def setDefaultControlsConfig(value: DefaultControlsConfig): Self = StObject.set(x, "defaultControlsConfig", value.asInstanceOf[js.Any])
    
    inline def setGoToSlide(value: Double => Unit): Self = StObject.set(x, "goToSlide", js.Any.fromFunction1(value))
    
    inline def setNextDisabled(value: Boolean): Self = StObject.set(x, "nextDisabled", value.asInstanceOf[js.Any])
    
    inline def setNextSlide(value: () => Unit): Self = StObject.set(x, "nextSlide", js.Any.fromFunction0(value))
    
    inline def setOnUserNavigation(
      value: /* e */ TouchEvent[Element] | (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element] => Unit
    ): Self = StObject.set(x, "onUserNavigation", js.Any.fromFunction1(value))
    
    inline def setPagingDotsIndices(value: js.Array[Double]): Self = StObject.set(x, "pagingDotsIndices", value.asInstanceOf[js.Any])
    
    inline def setPagingDotsIndicesVarargs(value: Double*): Self = StObject.set(x, "pagingDotsIndices", js.Array(value*))
    
    inline def setPreviousDisabled(value: Boolean): Self = StObject.set(x, "previousDisabled", value.asInstanceOf[js.Any])
    
    inline def setPreviousSlide(value: () => Unit): Self = StObject.set(x, "previousSlide", js.Any.fromFunction0(value))
    
    inline def setScrollMode(value: ScrollMode): Self = StObject.set(x, "scrollMode", value.asInstanceOf[js.Any])
    
    inline def setSlideCount(value: Double): Self = StObject.set(x, "slideCount", value.asInstanceOf[js.Any])
    
    inline def setSlidesToScroll(value: Double | auto): Self = StObject.set(x, "slidesToScroll", value.asInstanceOf[js.Any])
    
    inline def setSlidesToShow(value: Double): Self = StObject.set(x, "slidesToShow", value.asInstanceOf[js.Any])
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setWrapAround(value: Boolean): Self = StObject.set(x, "wrapAround", value.asInstanceOf[js.Any])
  }
}
