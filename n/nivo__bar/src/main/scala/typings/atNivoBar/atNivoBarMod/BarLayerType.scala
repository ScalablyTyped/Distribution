package typings.atNivoBar.atNivoBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BarLayerType extends js.Object

@JSImport("@nivo/bar", "BarLayerType")
@js.native
object BarLayerType extends js.Object {
  @js.native
  sealed trait Axes extends BarLayerType
  
  @js.native
  sealed trait Bars extends BarLayerType
  
  @js.native
  sealed trait Grid extends BarLayerType
  
  @js.native
  sealed trait Legends extends BarLayerType
  
  @js.native
  sealed trait Markers extends BarLayerType
  
  /* "axes" */ val Axes: typings.atNivoBar.atNivoBarMod.BarLayerType.Axes with String = js.native
  /* "bars" */ val Bars: typings.atNivoBar.atNivoBarMod.BarLayerType.Bars with String = js.native
  /* "grid" */ val Grid: typings.atNivoBar.atNivoBarMod.BarLayerType.Grid with String = js.native
  /* "legends" */ val Legends: typings.atNivoBar.atNivoBarMod.BarLayerType.Legends with String = js.native
  /* "markers" */ val Markers: typings.atNivoBar.atNivoBarMod.BarLayerType.Markers with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BarLayerType with String] = js.native
}

