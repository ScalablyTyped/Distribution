package typings
package onsenuiLib.onsenuiMod.onsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
   * @description Carousel component
   */
@js.native
trait OnsCarouselElement
  extends stdLib.HTMLElement {
  /**
       * @description true if auto scroll is enabled.
       **/
  var autoScroll: scala.Boolean = js.native
  /**
       * @description The current auto scroll ratio.
       **/
  var autoScrollRatio: scala.Double = js.native
  /**
       * @description Whether the carousel is centered or not.
       **/
  var centered: scala.Boolean = js.native
  /**
       * @description Whether the carousel is disabled or not.
       **/
  var disabled: scala.Boolean = js.native
  /**
       * @description The number of carousel items.
       **/
  var itemCount: scala.Double = js.native
  /**
       * @param {Number} index Decimal index of the current swipe.
       * @param {Object} animationOptions Object containing duration and timing.
       * @description Hook called whenever the user slides the carousel.
       **/
  var onSwipe: js.UndefOr[coreDashJsLib.Function] = js.native
  /**
       * @description Whether the carousel is overscrollable or not.
       **/
  var overscrollable: scala.Boolean = js.native
  /**
       * @description true if the carousel is swipeable.
       **/
  var swipeable: scala.Boolean = js.native
  /**
       * @description Show first ons-carousel item
       * @Resolves to the carousel element
       */
  def first(): js.Promise[stdLib.HTMLElement] = js.native
  /**
      * @description Returns the index of the currently visible `<ons-carousel-item>`.
      * @return The current carousel item index.
      */
  def getActiveIndex(): scala.Unit = js.native
  /**
       * @description Show last ons-carousel item
       * @return Resolves to the carousel element
       */
  def last(): js.Promise[stdLib.HTMLElement] = js.native
  /**
       * @description Show next ons-carousel item
       * @return Resolves to the carousel element
       */
  def next(): js.Promise[stdLib.HTMLElement] = js.native
  /**
       * @description Show next ons-carousel item
       * @return Resolves to the carousel element
       */
  def next(options: onsenuiLib.onsenuiMod.CarouselOptions): js.Promise[stdLib.HTMLElement] = js.native
  /**
       * @description Show previous ons-carousel item
       * @return Resolves to the carousel element
       */
  def prev(): js.Promise[stdLib.HTMLElement] = js.native
  /**
       * @description Show previous ons-carousel item
       * @return Resolves to the carousel element
       */
  def prev(options: onsenuiLib.onsenuiMod.CarouselOptions): js.Promise[stdLib.HTMLElement] = js.native
  /**
       * @description Update the layout of the carousel. Used when adding ons-carousel-items dynamically or to automatically adjust the size.
       */
  def refresh(): scala.Unit = js.native
  /**
      * @description Specify the index of the `<ons-carousel-item>` to show.
      * @return Resolves to the carousel element.
      */
  def setActiveIndex(index: scala.Double): js.Promise[stdLib.HTMLElement] = js.native
  /**
      * @description Specify the index of the `<ons-carousel-item>` to show.
      * @return Resolves to the carousel element.
      */
  def setActiveIndex(index: scala.Double, options: onsenuiLib.onsenuiMod.CarouselOptions): js.Promise[stdLib.HTMLElement] = js.native
}

