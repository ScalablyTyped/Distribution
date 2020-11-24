package typings.ol.scaleLineMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Units extends js.Object
@JSImport("ol/control/ScaleLine", "Units")
@js.native
object Units extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Units with String] = js.native
  
  @js.native
  sealed trait DEGREES extends Units
  /* "degrees" */ @js.native
  object DEGREES extends TopLevel[DEGREES with String]
  
  @js.native
  sealed trait IMPERIAL extends Units
  /* "imperial" */ @js.native
  object IMPERIAL extends TopLevel[IMPERIAL with String]
  
  @js.native
  sealed trait METRIC extends Units
  /* "metric" */ @js.native
  object METRIC extends TopLevel[METRIC with String]
  
  @js.native
  sealed trait NAUTICAL extends Units
  /* "nautical" */ @js.native
  object NAUTICAL extends TopLevel[NAUTICAL with String]
  
  @js.native
  sealed trait US extends Units
  /* "us" */ @js.native
  object US extends TopLevel[US with String]
}
