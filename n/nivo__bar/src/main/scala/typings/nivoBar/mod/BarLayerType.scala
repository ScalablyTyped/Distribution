package typings.nivoBar.mod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[BarLayerType with String] = js.native
  /* "axes" */ @js.native
  object Axes extends TopLevel[Axes with String]
  
  /* "bars" */ @js.native
  object Bars extends TopLevel[Bars with String]
  
  /* "grid" */ @js.native
  object Grid extends TopLevel[Grid with String]
  
  /* "legends" */ @js.native
  object Legends extends TopLevel[Legends with String]
  
  /* "markers" */ @js.native
  object Markers extends TopLevel[Markers with String]
  
}

