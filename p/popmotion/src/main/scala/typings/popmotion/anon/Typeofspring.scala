package typings.popmotion.anon

import typings.popmotion.typesMod.Animation
import typings.popmotion.typesMod.SpringOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofspring extends js.Object {
  
  def apply(hasFromToRestSpeedRestDeltaOptions: SpringOptions): Animation[Double] = js.native
  
  def needsInterpolation(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("needsInterpolation")
  var needsInterpolation_Original: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
}
