package typings.nodal.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var as: String
  var multiple: Boolean
  var name: String
  var via: String
}

object IOptions {
  @scala.inline
  def apply(as: String, multiple: Boolean, name: String, via: String): IOptions = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

