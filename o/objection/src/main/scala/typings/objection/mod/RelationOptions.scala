package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationOptions extends js.Object {
  var alias: Boolean | String
}

object RelationOptions {
  @scala.inline
  def apply(alias: Boolean | String): RelationOptions = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RelationOptions]
  }
}

