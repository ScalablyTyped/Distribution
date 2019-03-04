package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatorArgs extends js.Object {
  var ctx: ValidatorContext
  var json: Pojo
  var model: Model
  var options: ModelOptions
}

object ValidatorArgs {
  @scala.inline
  def apply(ctx: ValidatorContext, json: Pojo, model: Model, options: ModelOptions): ValidatorArgs = {
    val __obj = js.Dynamic.literal(ctx = ctx, json = json, model = model, options = options)
  
    __obj.asInstanceOf[ValidatorArgs]
  }
}

