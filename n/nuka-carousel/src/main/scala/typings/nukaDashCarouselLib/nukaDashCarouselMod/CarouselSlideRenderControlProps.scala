package typings
package nukaDashCarouselLib.nukaDashCarouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CarouselSlideRenderControlProps extends js.Object {
  /**
     * Space between slides, as an integer, but reflected as px
     */
  var cellSpacing: scala.Double
  /**
     * Current slide index
     */
  var currentSlide: scala.Double
  /**
     * Current frame width (px)
     */
  var frameWidth: scala.Double
  /**
     * Total amount of slides
     */
  var slideCount: scala.Double
  /**
     * Current slide width (px)
     */
  var slideWidth: scala.Double
  /**
     * Slides to scroll at once
     */
  var slidesToScroll: scala.Double
  /**
     * Slides to show at once
     */
  var slidesToShow: scala.Double
  /**
     * Infinite mode enabled
     */
  var wrapAround: scala.Boolean
  /**
     * Go to X slide method
     * @param index Slide's index to go
     */
  def goToSlide(index: scala.Double): scala.Unit
  /**
     * Go to the next slide method
     */
  def nextSlide(): scala.Unit
  /**
     * Go to the previous slide method
     */
  def previousSlide(): scala.Unit
}

