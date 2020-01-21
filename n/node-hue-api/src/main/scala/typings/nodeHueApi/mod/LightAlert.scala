package typings.nodeHueApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeHueApi.nodeHueApiStrings.none
  - typings.nodeHueApi.nodeHueApiStrings.select
  - typings.nodeHueApi.nodeHueApiStrings.lselect
*/
trait LightAlert extends js.Object

object LightAlert {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def lselect: typings.nodeHueApi.nodeHueApiStrings.lselect = this.cast("lselect")
  @scala.inline
  def none: typings.nodeHueApi.nodeHueApiStrings.none = this.cast("none")
  @scala.inline
  def select: typings.nodeHueApi.nodeHueApiStrings.select = this.cast("select")
}

