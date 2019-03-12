package typings
package atMicrosoftLoadDashThemedDashStylesLib.atMicrosoftLoadDashThemedDashStylesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClearStyleOptions extends js.Object

@JSImport("@microsoft/load-themed-styles", "ClearStyleOptions")
@js.native
object ClearStyleOptions extends js.Object {
  /** both themable and non-themable styles will be cleared */
  @js.native
  sealed trait all
    extends atMicrosoftLoadDashThemedDashStylesLib.atMicrosoftLoadDashThemedDashStylesMod.ClearStyleOptions
  
  /** only non-themable styles will be cleared */
  @js.native
  sealed trait onlyNonThemable
    extends atMicrosoftLoadDashThemedDashStylesLib.atMicrosoftLoadDashThemedDashStylesMod.ClearStyleOptions
  
  /** only themable styles will be cleared */
  @js.native
  sealed trait onlyThemable
    extends atMicrosoftLoadDashThemedDashStylesLib.atMicrosoftLoadDashThemedDashStylesMod.ClearStyleOptions
  
  /* 3 */ val all: all with scala.Double = js.native
  /* 2 */ val onlyNonThemable: onlyNonThemable with scala.Double = js.native
  /* 1 */ val onlyThemable: onlyThemable with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atMicrosoftLoadDashThemedDashStylesLib.atMicrosoftLoadDashThemedDashStylesMod.ClearStyleOptions with scala.Double
  ] = js.native
}

