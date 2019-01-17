package typings
package atOracleOraclejetLib.ojvalidationDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Validator[V] extends js.Object {
  var getHint: js.UndefOr[js.Function0[java.lang.String | scala.Null]] = js.undefined
  def validate(value: V): scala.Unit
}

