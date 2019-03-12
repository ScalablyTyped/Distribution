package typings
package mimosLib.mimosMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MimosOptionsValue
  extends mimeDashDbLib.mimeDashDbMod.DataStructure {
  /** method with signature function(mime) when this mime type is found in the database, this function will run. This allows you make customizations to mime based on developer criteria. */
  var predicate: js.UndefOr[js.Function1[/* mime */ MimosOptionsValue, MimosOptionsValue]] = js.undefined
  /** specify the type value of result objects, defaults to key. See the example below for more clarification. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object MimosOptionsValue {
  @scala.inline
  def apply(
    charset: java.lang.String = null,
    compressible: js.UndefOr[scala.Boolean] = js.undefined,
    extensions: js.Array[java.lang.String] = null,
    predicate: /* mime */ MimosOptionsValue => MimosOptionsValue = null,
    source: java.lang.String = null,
    `type`: java.lang.String = null
  ): MimosOptionsValue = {
    val __obj = js.Dynamic.literal()
    if (charset != null) __obj.updateDynamic("charset")(charset)
    if (!js.isUndefined(compressible)) __obj.updateDynamic("compressible")(compressible)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (predicate != null) __obj.updateDynamic("predicate")(js.Any.fromFunction1(predicate))
    if (source != null) __obj.updateDynamic("source")(source)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MimosOptionsValue]
  }
}

