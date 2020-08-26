package typings.meteor.meteorMod.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("meteor/meteor", "Meteor.Error")
@js.native
class ErrorCls protected () extends Error {
  def this(error: String) = this()
  def this(error: Double) = this()
  def this(error: String, reason: String) = this()
  def this(error: Double, reason: String) = this()
  def this(error: String, reason: js.UndefOr[scala.Nothing], details: String) = this()
  def this(error: String, reason: String, details: String) = this()
  def this(error: Double, reason: js.UndefOr[scala.Nothing], details: String) = this()
  def this(error: Double, reason: String, details: String) = this()
}

