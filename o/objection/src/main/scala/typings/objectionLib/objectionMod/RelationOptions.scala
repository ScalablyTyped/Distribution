package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelationOptions extends js.Object {
  var alias: scala.Boolean | java.lang.String
}

object RelationOptions {
  @scala.inline
  def apply(alias: scala.Boolean | java.lang.String): RelationOptions = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RelationOptions]
  }
}

