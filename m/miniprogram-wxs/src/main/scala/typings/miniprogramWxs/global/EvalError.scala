package typings.miniprogramWxs.global

import org.scalablytyped.runtime.TopLevel
import typings.miniprogramWxs.EvalErrorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("EvalError")
@js.native
class EvalError ()
  extends typings.std.Error {
  def this(message: String) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

@JSGlobal("EvalError")
@js.native
object EvalError extends TopLevel[EvalErrorConstructor]

