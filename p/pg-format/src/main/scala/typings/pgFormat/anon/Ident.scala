package typings.pgFormat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ident extends js.Object {
  var ident: js.UndefOr[String] = js.undefined
  var literal: js.UndefOr[String] = js.undefined
  var string: js.UndefOr[String] = js.undefined
}

object Ident {
  @scala.inline
  def apply(ident: String = null, literal: String = null, string: String = null): Ident = {
    val __obj = js.Dynamic.literal()
    if (ident != null) __obj.updateDynamic("ident")(ident.asInstanceOf[js.Any])
    if (literal != null) __obj.updateDynamic("literal")(literal.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ident]
  }
}

