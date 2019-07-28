package typings.node.inspectorMod.SchemaNs

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
  var name: java.lang.String
  /**
    * Domain version.
    */
  var version: java.lang.String
}

object Domain {
  @scala.inline
  def apply(name: java.lang.String, version: java.lang.String): Domain = {
    val __obj = js.Dynamic.literal(name = name, version = version)
  
    __obj.asInstanceOf[Domain]
  }
}

