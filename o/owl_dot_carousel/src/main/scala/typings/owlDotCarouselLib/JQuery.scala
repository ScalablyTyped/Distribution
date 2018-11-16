package typings
package owlDotCarouselLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def on(
    event: owlDotCarouselLib.OwlCarouselNs.OnEvent,
    handler: owlDotCarouselLib.OwlCarouselNs.HandlerCallback
  ): JQuery = js.native
  def owlCarousel(): JQuery = js.native
  def owlCarousel(options: owlDotCarouselLib.OwlCarouselNs.Options): JQuery = js.native
  @JSName("owlCarousel")
  def owlCarousel_destroy(options: owlDotCarouselLib.owlDotCarouselLibStrings.destroy): JQuery = js.native
  def trigger(event: owlDotCarouselLib.OwlCarouselNs.TriggerEvent): JQuery = js.native
}

