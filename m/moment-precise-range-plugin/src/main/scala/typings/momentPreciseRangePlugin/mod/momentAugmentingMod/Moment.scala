package typings.momentPreciseRangePlugin.mod.momentAugmentingMod

import typings.momentPreciseRangePlugin.momentPreciseRangePluginBooleans.`false`
import typings.momentPreciseRangePlugin.momentPreciseRangePluginBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Moment extends js.Object {
  
  def preciseDiff(d2: Moment): String = js.native
  @JSName("preciseDiff")
  def preciseDiff_false(d2: Moment, returnValueObject: `false`): String = js.native
  @JSName("preciseDiff")
  def preciseDiff_true(d2: Moment, returnValueObject: `true`): PreciseRangeValueObject = js.native
}
