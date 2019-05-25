package typings
package olLib.controlScaleLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Units extends js.Object

@JSImport("ol/control/ScaleLine", "Units")
@js.native
object Units extends js.Object {
  @js.native
  sealed trait DEGREES
    extends olLib.controlScaleLineMod.Units
  
  @js.native
  sealed trait IMPERIAL
    extends olLib.controlScaleLineMod.Units
  
  @js.native
  sealed trait METRIC
    extends olLib.controlScaleLineMod.Units
  
  @js.native
  sealed trait NAUTICAL
    extends olLib.controlScaleLineMod.Units
  
  @js.native
  sealed trait US
    extends olLib.controlScaleLineMod.Units
  
  /* "degrees" */ val DEGREES: DEGREES with java.lang.String = js.native
  /* "imperial" */ val IMPERIAL: IMPERIAL with java.lang.String = js.native
  /* "metric" */ val METRIC: METRIC with java.lang.String = js.native
  /* "nautical" */ val NAUTICAL: NAUTICAL with java.lang.String = js.native
  /* "us" */ val US: US with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[olLib.controlScaleLineMod.Units with java.lang.String] = js.native
}

