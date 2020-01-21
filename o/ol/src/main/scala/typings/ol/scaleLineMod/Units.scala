package typings.ol.scaleLineMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Units extends js.Object

@JSImport("ol/control/ScaleLine", "Units")
@js.native
object Units extends js.Object {
  @js.native
  sealed trait DEGREES extends Units
  
  @js.native
  sealed trait IMPERIAL extends Units
  
  @js.native
  sealed trait METRIC extends Units
  
  @js.native
  sealed trait NAUTICAL extends Units
  
  @js.native
  sealed trait US extends Units
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Units with String] = js.native
  /* "degrees" */ @js.native
  object DEGREES extends TopLevel[DEGREES with String]
  
  /* "imperial" */ @js.native
  object IMPERIAL extends TopLevel[IMPERIAL with String]
  
  /* "metric" */ @js.native
  object METRIC extends TopLevel[METRIC with String]
  
  /* "nautical" */ @js.native
  object NAUTICAL extends TopLevel[NAUTICAL with String]
  
  /* "us" */ @js.native
  object US extends TopLevel[US with String]
  
}

