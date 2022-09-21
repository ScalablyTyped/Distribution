package typings.nukaCarousel.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlProps extends StObject {
  
  /**
    * When displaying more than one slide, sets which position to anchor the current slide to.
    */
  var cellAlign: Alignment
  
  /**
    * Space between slides, as an integer, but reflected as px
    */
  var cellSpacing: Double
  
  /**
    * Current slide index
    */
  var currentSlide: Double
  
  /**
    * This prop lets you apply custom classes and styles to the default Next, Previous, and Paging Dots controls
    */
  var defaultControlsConfig: DefaultControlsConfig
  
  /**
    * Go to X slide method
    * @param index Slide's index to go
    */
  def goToSlide(index: Double): Unit
  
  /**
    * Go to the next slide method
    */
  def nextSlide(): Unit
  
  /**
    * Go to the previous slide method
    */
  def previousSlide(): Unit
  
  var scrollMode: ScrollMode
  
  /**
    * Total amount of slides
    */
  var slideCount: Double
  
  /**
    * Slides to scroll at once
    */
  var slidesToScroll: Double
  
  /**
    * Slides to show at once
    */
  var slidesToShow: Double
  
  /**
    * Enable the slides to transition vertically
    */
  var vertical: Boolean
  
  /**
    * Sets infinite wrapAround mode
    * @default false
    */
  var wrapAround: Boolean
}
object ControlProps {
  
  inline def apply(
    cellAlign: Alignment,
    cellSpacing: Double,
    currentSlide: Double,
    defaultControlsConfig: DefaultControlsConfig,
    goToSlide: Double => Unit,
    nextSlide: () => Unit,
    previousSlide: () => Unit,
    scrollMode: ScrollMode,
    slideCount: Double,
    slidesToScroll: Double,
    slidesToShow: Double,
    vertical: Boolean,
    wrapAround: Boolean
  ): ControlProps = {
    val __obj = js.Dynamic.literal(cellAlign = cellAlign.asInstanceOf[js.Any], cellSpacing = cellSpacing.asInstanceOf[js.Any], currentSlide = currentSlide.asInstanceOf[js.Any], defaultControlsConfig = defaultControlsConfig.asInstanceOf[js.Any], goToSlide = js.Any.fromFunction1(goToSlide), nextSlide = js.Any.fromFunction0(nextSlide), previousSlide = js.Any.fromFunction0(previousSlide), scrollMode = scrollMode.asInstanceOf[js.Any], slideCount = slideCount.asInstanceOf[js.Any], slidesToScroll = slidesToScroll.asInstanceOf[js.Any], slidesToShow = slidesToShow.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any], wrapAround = wrapAround.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlProps]
  }
  
  extension [Self <: ControlProps](x: Self) {
    
    inline def setCellAlign(value: Alignment): Self = StObject.set(x, "cellAlign", value.asInstanceOf[js.Any])
    
    inline def setCellSpacing(value: Double): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
    
    inline def setCurrentSlide(value: Double): Self = StObject.set(x, "currentSlide", value.asInstanceOf[js.Any])
    
    inline def setDefaultControlsConfig(value: DefaultControlsConfig): Self = StObject.set(x, "defaultControlsConfig", value.asInstanceOf[js.Any])
    
    inline def setGoToSlide(value: Double => Unit): Self = StObject.set(x, "goToSlide", js.Any.fromFunction1(value))
    
    inline def setNextSlide(value: () => Unit): Self = StObject.set(x, "nextSlide", js.Any.fromFunction0(value))
    
    inline def setPreviousSlide(value: () => Unit): Self = StObject.set(x, "previousSlide", js.Any.fromFunction0(value))
    
    inline def setScrollMode(value: ScrollMode): Self = StObject.set(x, "scrollMode", value.asInstanceOf[js.Any])
    
    inline def setSlideCount(value: Double): Self = StObject.set(x, "slideCount", value.asInstanceOf[js.Any])
    
    inline def setSlidesToScroll(value: Double): Self = StObject.set(x, "slidesToScroll", value.asInstanceOf[js.Any])
    
    inline def setSlidesToShow(value: Double): Self = StObject.set(x, "slidesToShow", value.asInstanceOf[js.Any])
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setWrapAround(value: Boolean): Self = StObject.set(x, "wrapAround", value.asInstanceOf[js.Any])
  }
}
