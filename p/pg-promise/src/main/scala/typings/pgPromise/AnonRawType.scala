package typings.pgPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRawType extends js.Object {
  var rawType: js.Symbol
  var toPostgres: js.Symbol
}

object AnonRawType {
  @scala.inline
  def apply(rawType: js.Symbol, toPostgres: js.Symbol): AnonRawType = {
    val __obj = js.Dynamic.literal(rawType = rawType.asInstanceOf[js.Any], toPostgres = toPostgres.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRawType]
  }
}

