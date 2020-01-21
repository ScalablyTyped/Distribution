package typings.nodeHueApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.nodeHueApi.nodeHueApiStrings.LightGroup
  - typings.nodeHueApi.nodeHueApiStrings.Room
  - typings.nodeHueApi.nodeHueApiStrings.Luminaire
  - typings.nodeHueApi.nodeHueApiStrings.LightSource
*/
trait LightGroupType extends js.Object

object LightGroupType {
  @scala.inline
  def LightGroup: typings.nodeHueApi.nodeHueApiStrings.LightGroup = this.cast("LightGroup")
  @scala.inline
  def LightSource: typings.nodeHueApi.nodeHueApiStrings.LightSource = this.cast("LightSource")
  @scala.inline
  def Luminaire: typings.nodeHueApi.nodeHueApiStrings.Luminaire = this.cast("Luminaire")
  @scala.inline
  def Room: typings.nodeHueApi.nodeHueApiStrings.Room = this.cast("Room")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

