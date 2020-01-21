package typings.nodeHueApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeHueApi.nodeHueApiStrings.none
  - typings.nodeHueApi.nodeHueApiStrings.colorloop
*/
trait LightEffect extends js.Object

object LightEffect {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def colorloop: typings.nodeHueApi.nodeHueApiStrings.colorloop = this.cast("colorloop")
  @scala.inline
  def none: typings.nodeHueApi.nodeHueApiStrings.none = this.cast("none")
}

