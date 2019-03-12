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
    format: V => java.lang.String | scala.Null,
    parse: java.lang.String => V | scala.Null,
    getHint: () => java.lang.String | scala.Null = null,
    getOptions: () => js.Object = null,
    resolvedOptions: () => js.Object = null
  ): Converter[V] = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction1(format), parse = js.Any.fromFunction1(parse))
    if (getHint != null) __obj.updateDynamic("getHint")(js.Any.fromFunction0(getHint))
    if (getOptions != null) __obj.updateDynamic("getOptions")(js.Any.fromFunction0(getOptions))
    if (resolvedOptions != null) __obj.updateDynamic("resolvedOptions")(js.Any.fromFunction0(resolvedOptions))
    __obj.asInstanceOf[Converter[V]]
  }
}

