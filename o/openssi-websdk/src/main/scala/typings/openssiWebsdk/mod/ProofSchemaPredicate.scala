package typings.openssiWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProofSchemaPredicate extends js.Object {
  var name: String
  var p_type: String
  var p_value: Double
  var restrictions: js.Array[Restriction]
}

object ProofSchemaPredicate {
  @scala.inline
  def apply(name: String, p_type: String, p_value: Double, restrictions: js.Array[Restriction]): ProofSchemaPredicate = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], p_type = p_type.asInstanceOf[js.Any], p_value = p_value.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProofSchemaPredicate]
  }
}

