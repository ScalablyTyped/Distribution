package typings
package atNivoBarLib.atNivoBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BarLayerType extends js.Object

@JSImport("@nivo/bar", "BarLayerType")
@js.native
object BarLayerType extends js.Object {
  @js.native
  sealed trait Axes
    extends atNivoBarLib.atNivoBarMod.BarLayerType
  
  @js.native
  sealed trait Bars
    extends atNivoBarLib.atNivoBarMod.BarLayerType
  
  @js.native
  sealed trait Grid
    extends atNivoBarLib.atNivoBarMod.BarLayerType
  
  @js.native
  sealed trait Legends
    extends atNivoBarLib.atNivoBarMod.BarLayerType
  
  @js.native
  sealed trait Markers
    extends atNivoBarLib.atNivoBarMod.BarLayerType
  
  /* "axes" */ val Axes: Axes with java.lang.String = js.native
  /* "bars" */ val Bars: Bars with java.lang.String = js.native
  /* "grid" */ val Grid: Grid with java.lang.String = js.native
  /* "legends" */ val Legends: Legends with java.lang.String = js.native
  /* "markers" */ val Markers: Markers with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[atNivoBarLib.atNivoBarMod.BarLayerType with java.lang.String] = js.native
}

