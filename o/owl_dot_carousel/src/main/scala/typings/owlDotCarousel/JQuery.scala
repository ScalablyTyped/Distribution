package typings.owlDotCarousel

import typings.owlDotCarousel.OwlCarousel.HandlerCallback
import typings.owlDotCarousel.OwlCarousel.OnEvent
import typings.owlDotCarousel.OwlCarousel.Options
import typings.owlDotCarousel.OwlCarousel.TriggerEvent
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

