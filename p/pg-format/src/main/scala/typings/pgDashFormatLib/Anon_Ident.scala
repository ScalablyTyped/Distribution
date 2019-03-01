package typings
package pgDashFormatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ident extends js.Object {
  var ident: js.UndefOr[java.lang.String] = js.undefined
  var literal: js.UndefOr[java.lang.String] = js.undefined
  var string: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Ident {
  @scala.inline
  def apply(ident: java.lang.String = null, literal: java.lang.String = null, string: java.lang.String = null): Anon_Ident = {
    val __obj = js.Dynamic.literal()
    if (ident != null) __obj.updateDynamic("ident")(ident)
    if (literal != null) __obj.updateDynamic("literal")(literal)
    if (string != null) __obj.updateDynamic("string")(string)
    __obj.asInstanceOf[Anon_Ident]
  }
}

