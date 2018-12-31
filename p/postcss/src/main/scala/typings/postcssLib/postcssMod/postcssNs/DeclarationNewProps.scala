package typings
package postcssLib.postcssMod.postcssNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationNewProps extends js.Object {
  /**
    * The declaration's property name.
    */
  var prop: js.UndefOr[java.lang.String] = js.undefined
  var raws: js.UndefOr[DeclarationRaws] = js.undefined
  /**
    * The declaration's value. This value will be cleaned of comments. If the
    * source value contained comments, those comments will be available in the
    * _value.raws property. If you have not changed the value, the result of
    * decl.toString() will include the original raws value (comments and all).
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

