package typings.meteor.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Meteor.TypedError")
@js.native
class TypedErrorCls protected () extends TypedError {
  def this(message: String, errorType: String) = this()
  /* CompleteClass */
  override var errorType: String = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

