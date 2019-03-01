package typings
package pgLib.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindConfig extends js.Object {
  var binary: js.UndefOr[java.lang.String] = js.undefined
  var portal: js.UndefOr[java.lang.String] = js.undefined
  var statement: js.UndefOr[java.lang.String] = js.undefined
  var values: js.UndefOr[js.Array[js.UndefOr[nodeLib.Buffer | scala.Null | java.lang.String]]] = js.undefined
}

object BindConfig {
  @scala.inline
  def apply(
    binary: java.lang.String = null,
    portal: java.lang.String = null,
    statement: java.lang.String = null,
    values: js.Array[js.UndefOr[nodeLib.Buffer | scala.Null | java.lang.String]] = null
  ): BindConfig = {
    val __obj = js.Dynamic.literal()
    if (binary != null) __obj.updateDynamic("binary")(binary)
    if (portal != null) __obj.updateDynamic("portal")(portal)
    if (statement != null) __obj.updateDynamic("statement")(statement)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[BindConfig]
  }
}

