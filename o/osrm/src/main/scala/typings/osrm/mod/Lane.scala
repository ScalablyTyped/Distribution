package typings.osrm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Lane represents a turn lane at the corresponding turn location.
  *
  * https://github.com/Project-OSRM/osrm-backend/blob/master/docs/http.md#lane-object
  */
trait Lane extends js.Object {
  var indications: js.Array[Indication]
  var valid: Boolean
}

object Lane {
  @scala.inline
  def apply(indications: js.Array[Indication], valid: Boolean): Lane = {
    val __obj = js.Dynamic.literal(indications = indications.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lane]
  }
}

