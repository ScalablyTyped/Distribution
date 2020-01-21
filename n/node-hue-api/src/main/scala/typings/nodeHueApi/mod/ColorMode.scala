package typings.nodeHueApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeHueApi.nodeHueApiStrings.xy
  - typings.nodeHueApi.nodeHueApiStrings.ct
  - typings.nodeHueApi.nodeHueApiStrings.hs
*/
trait ColorMode extends js.Object

object ColorMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ct: typings.nodeHueApi.nodeHueApiStrings.ct = this.cast("ct")
  @scala.inline
  def hs: typings.nodeHueApi.nodeHueApiStrings.hs = this.cast("hs")
  @scala.inline
  def xy: typings.nodeHueApi.nodeHueApiStrings.xy = this.cast("xy")
}

