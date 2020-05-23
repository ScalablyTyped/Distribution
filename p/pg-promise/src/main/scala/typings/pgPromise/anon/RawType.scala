package typings.pgPromise.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawType extends js.Object {
  var rawType: js.Symbol
  var toPostgres: js.Symbol
}

object RawType {
  @scala.inline
  def apply(rawType: js.Symbol, toPostgres: js.Symbol): RawType = {
    val __obj = js.Dynamic.literal(rawType = rawType.asInstanceOf[js.Any], toPostgres = toPostgres.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawType]
  }
}

