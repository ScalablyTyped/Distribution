package typings.pgFormat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdent extends js.Object {
  var ident: js.UndefOr[String] = js.undefined
  var literal: js.UndefOr[String] = js.undefined
  var string: js.UndefOr[String] = js.undefined
}

object AnonIdent {
  @scala.inline
  def apply(ident: String = null, literal: String = null, string: String = null): AnonIdent = {
    val __obj = js.Dynamic.literal()
    if (ident != null) __obj.updateDynamic("ident")(ident.asInstanceOf[js.Any])
    if (literal != null) __obj.updateDynamic("literal")(literal.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIdent]
  }
}

