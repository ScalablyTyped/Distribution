package typings.node.inspectorMod.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainsReturnType extends js.Object {
  /**
    * List of supported domains.
    */
  var domains: js.Array[Domain]
}

object GetDomainsReturnType {
  @scala.inline
  def apply(domains: js.Array[Domain]): GetDomainsReturnType = {
    val __obj = js.Dynamic.literal(domains = domains)
  
    __obj.asInstanceOf[GetDomainsReturnType]
  }
}

