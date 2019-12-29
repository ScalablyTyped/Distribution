package typings.node.inspectorMod.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of the protocol domain.
  */
trait Domain extends js.Object {
  /**
    * Domain name.
    */
  var name: String
  /**
    * Domain version.
    */
  var version: String
}

object Domain {
  @scala.inline
  def apply(name: String, version: String): Domain = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Domain]
  }
}

