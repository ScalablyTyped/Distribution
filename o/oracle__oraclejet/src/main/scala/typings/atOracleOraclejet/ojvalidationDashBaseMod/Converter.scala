package typings.atOracleOraclejet.ojvalidationDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Converter[V] extends js.Object {
  var getHint: js.UndefOr[js.Function0[String | Null]] = js.undefined
  var getOptions: js.UndefOr[js.Function0[js.Object]] = js.undefined
  var resolvedOptions: js.UndefOr[js.Function0[js.Object]] = js.undefined
  def format(value: V): String | Null
  def parse(value: String): V | Null
}

object Converter {
  @scala.inline
  def apply[V](
    format: V => String | Null,
    parse: String => V | Null,
    getHint: () => String | Null = null,
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

