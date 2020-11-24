package typings.popmotion.interpolateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("popmotion/lib/utils/interpolate", "interpolate")
@js.native
object interpolate extends js.Object {
  
  def apply[T](input: js.Array[Double], output: js.Array[T]): js.Function1[/* v */ Double, T] = js.native
  def apply[T](input: js.Array[Double], output: js.Array[T], hasClampEaseMixer: InterpolateOptions[T]): js.Function1[/* v */ Double, T] = js.native
}
