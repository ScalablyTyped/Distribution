package typings
package atNivoLineLib.atNivoLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineLayerType extends js.Object

@JSImport("@nivo/line", "LineLayerType")
@js.native
object LineLayerType extends js.Object {
  @js.native
  sealed trait Areas
    extends atNivoLineLib.atNivoLineMod.LineLayerType
  
  @js.native
  sealed trait Axes
    extends atNivoLineLib.atNivoLineMod.LineLayerType
  
  @js.native
  sealed trait Dots
    extends atNivoLineLib.atNivoLineMod.LineLayerType
  
  @js.native
  sealed trait Grid
    extends atNivoLineLib.atNivoLineMod.LineLayerType
  
  @js.native
  sealed trait Legends
    extends atNivoLineLib.atNivoLineMod.LineLayerType
  
  @js.native
  sealed trait Lines
    extends atNivoLineLib.atNivoLineMod.LineLayerType
  
  @js.native
  sealed trait Markers
    extends atNivoLineLib.atNivoLineMod.LineLayerType
  
  @js.native
  sealed trait Slices
    extends atNivoLineLib.atNivoLineMod.LineLayerType
  
  /* "areas" */ val Areas: Areas with java.lang.String = js.native
  /* "axes" */ val Axes: Axes with java.lang.String = js.native
  /* "dots" */ val Dots: Dots with java.lang.String = js.native
  /* "grid" */ val Grid: Grid with java.lang.String = js.native
  /* "legends" */ val Legends: Legends with java.lang.String = js.native
  /* "lines" */ val Lines: Lines with java.lang.String = js.native
  /* "markers" */ val Markers: Markers with java.lang.String = js.native
  /* "slices" */ val Slices: Slices with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[atNivoLineLib.atNivoLineMod.LineLayerType with java.lang.String] = js.native
}

