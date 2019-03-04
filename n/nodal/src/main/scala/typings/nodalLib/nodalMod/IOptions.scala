package typings
package nodalLib.nodalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  var as: java.lang.String
  var multiple: scala.Boolean
  var name: java.lang.String
  var via: java.lang.String
}

object IOptions {
  @scala.inline
  def apply(as: java.lang.String, multiple: scala.Boolean, name: java.lang.String, via: java.lang.String): IOptions = {
    val __obj = js.Dynamic.literal(as = as, multiple = multiple, name = name, via = via)
  
    __obj.asInstanceOf[IOptions]
  }
}

