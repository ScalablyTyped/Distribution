package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Validator extends js.Object {
  def afterValidate(args: ValidatorArgs): scala.Unit
  def beforeValidate(args: ValidatorArgs): scala.Unit
  def validate(args: ValidatorArgs): Pojo
}

