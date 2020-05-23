package typings.meteor.global.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Meteor.Error")
@js.native
class ErrorCls protected ()
  extends typings.meteor.Meteor.Error {
  def this(error: String) = this()
  def this(error: Double) = this()
  def this(error: String, reason: String) = this()
  def this(error: Double, reason: String) = this()
  def this(error: String, reason: String, details: String) = this()
  def this(error: Double, reason: String, details: String) = this()
  /* CompleteClass */
  override var error: String | Double = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

