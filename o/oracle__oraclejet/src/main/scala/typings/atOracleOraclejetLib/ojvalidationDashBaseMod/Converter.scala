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

object Converter {
  @scala.inline
  def apply[V](
    format: js.Function1[V, java.lang.String | scala.Null],
    parse: js.Function1[java.lang.String, V | scala.Null],
    getHint: js.Function0[java.lang.String | scala.Null] = null,
    getOptions: js.Function0[js.Object] = null,
    resolvedOptions: js.Function0[js.Object] = null
  ): Converter[V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("parse")(parse)
    if (getHint != null) __obj.updateDynamic("getHint")(getHint)
    if (getOptions != null) __obj.updateDynamic("getOptions")(getOptions)
    if (resolvedOptions != null) __obj.updateDynamic("resolvedOptions")(resolvedOptions)
    __obj.asInstanceOf[Converter[V]]
  }
}

