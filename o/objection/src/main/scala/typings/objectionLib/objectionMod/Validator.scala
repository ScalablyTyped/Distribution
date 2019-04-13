package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("objection", "Validator")
@js.native
class Validator () extends js.Object {
  def afterValidate(args: ValidatorArgs): scala.Unit = js.native
  def beforeValidate(args: ValidatorArgs): scala.Unit = js.native
  def validate(args: ValidatorArgs): Pojo = js.native
}

