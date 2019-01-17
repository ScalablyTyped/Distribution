package typings
package atOracleOraclejetLib.ojvalidationDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Converter[V] extends js.Object {
  var getHint: js.UndefOr[js.Function0[java.lang.String | scala.Null]] = js.undefined
  var getOptions: js.UndefOr[js.Function0[js.Object]] = js.undefined
  var resolvedOptions: js.UndefOr[js.Function0[js.Object]] = js.undefined
  def format(value: V): java.lang.String | scala.Null
  def parse(value: java.lang.String): V | scala.Null
}

