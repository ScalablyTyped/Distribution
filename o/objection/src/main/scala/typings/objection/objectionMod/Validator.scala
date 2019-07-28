package typings.objection.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("objection", "Validator")
@js.native
class Validator () extends js.Object {
  def afterValidate(args: ValidatorArgs): Unit = js.native
  def beforeValidate(args: ValidatorArgs): Unit = js.native
  def validate(args: ValidatorArgs): Pojo = js.native
}

