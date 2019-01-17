package typings
package atOracleOraclejetLib.ojvalidationDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncValidator[V] extends js.Object {
  var hint: js.Promise[java.lang.String | scala.Null]
  def validate(value: V): js.Promise[scala.Boolean]
}

