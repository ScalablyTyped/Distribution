package typings
package nukaDashCarouselLib.nukaDashCarouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CarouselState extends js.Object {
  /**
    * Current slide index
    */
  var currentSlide: scala.Double
  /**
    * Is dragging enabled
    */
  var dragging: scala.Boolean
  /**
    * Easing function name
    */
  var easing: java.lang.String
  /**
    * Current frame width
    */
  var frameWidth: scala.Double
  /**
    * Current left value
    */
  var isWrappingAround: scala.Boolean
  var left: scala.Double
  var pauseOnHover: scala.Boolean
  var resetWrapAroundPosition: scala.Boolean
  /**
    * Total amount of slides
    */
  var slideCount: scala.Double
  /**
    * Current slide width
    */
  var slideWidth: CarouselSlideWidthProp
  /**
    * Slides to scroll at once
    */
  var slidesToScroll: scala.Double
  /**
    * Current top value
    */
  var top: scala.Double
  /**
    * Is infinite mode enabled
    */
  var wrapToIndex: scala.Boolean
}

