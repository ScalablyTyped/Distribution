package typings.miniprogramWxs.global

import org.scalablytyped.runtime.TopLevel
import typings.miniprogramWxs.ErrorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Error")
@js.native
class Error ()
  extends typings.miniprogramWxs.Error {
  def this(message: String) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

@JSGlobal("Error")
@js.native
object Error extends TopLevel[ErrorConstructor]

