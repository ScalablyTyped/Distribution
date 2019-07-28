package typings.owlDotCarousel

import typings.owlDotCarousel.OwlCarouselNs.HandlerCallback
import typings.owlDotCarousel.OwlCarouselNs.OnEvent
import typings.owlDotCarousel.OwlCarouselNs.Options
import typings.owlDotCarousel.OwlCarouselNs.TriggerEvent
import typings.owlDotCarousel.owlDotCarouselStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def on(event: OnEvent, handler: HandlerCallback): JQuery = js.native
  def owlCarousel(): JQuery = js.native
  def owlCarousel(options: Options): JQuery = js.native
  @JSName("owlCarousel")
  def owlCarousel_destroy(options: destroy): JQuery = js.native
  def trigger(event: TriggerEvent): JQuery = js.native
}

