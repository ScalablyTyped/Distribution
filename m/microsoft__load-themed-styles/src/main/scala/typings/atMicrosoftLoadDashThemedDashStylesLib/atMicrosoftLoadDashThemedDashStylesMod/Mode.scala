package typings
package atMicrosoftLoadDashThemedDashStylesLib.atMicrosoftLoadDashThemedDashStylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Mode extends js.Object

@JSImport("@microsoft/load-themed-styles", "Mode")
@js.native
object Mode extends js.Object {
  @js.native
  sealed trait async
    extends atMicrosoftLoadDashThemedDashStylesLib.atMicrosoftLoadDashThemedDashStylesMod.Mode
  
  @js.native
  sealed trait sync
    extends atMicrosoftLoadDashThemedDashStylesLib.atMicrosoftLoadDashThemedDashStylesMod.Mode
  
  /* 1 */ val async: async with scala.Double = js.native
  /* 0 */ val sync: sync with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atMicrosoftLoadDashThemedDashStylesLib.atMicrosoftLoadDashThemedDashStylesMod.Mode with scala.Double
  ] = js.native
}

