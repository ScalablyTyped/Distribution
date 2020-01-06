package typings.ospec.ospecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Spy[Args /* <: js.Array[_] */, Returns] extends js.Object {
  /** The arguments that were passed to the function in the last time it was called */
  val args: Args = js.native
  /** The number of times the function has been called */
  val callCount: Double = js.native
  /** List of arguments that were passed to the function each tine it was called */
  val calls: js.Array[Args] = js.native
  def apply(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): Returns = js.native
}

