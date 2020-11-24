package typings.pacResolver

import typings.pacResolver.mod.GMT
import typings.pacResolver.mod.Weekday
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pac-resolver/dist/weekdayRange", JSImport.Namespace)
@js.native
object weekdayRangeMod extends js.Object {
  
  def default(wd1: Weekday): Boolean = js.native
  def default(wd1: Weekday, wd2: js.UndefOr[scala.Nothing], gmt: GMT): Boolean = js.native
  def default(wd1: Weekday, wd2: GMT): Boolean = js.native
  def default(wd1: Weekday, wd2: GMT, gmt: GMT): Boolean = js.native
  def default(wd1: Weekday, wd2: Weekday): Boolean = js.native
  def default(wd1: Weekday, wd2: Weekday, gmt: GMT): Boolean = js.native
}
