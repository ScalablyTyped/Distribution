package typings
package nockLib.nockMod.nockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NockBackContext extends js.Object {
  var isLoaded: scala.Boolean
  var scopes: js.Array[Scope]
  def assertScopesFinished(): scala.Unit
}

object NockBackContext {
  @scala.inline
  def apply(assertScopesFinished: js.Function0[scala.Unit], isLoaded: scala.Boolean, scopes: js.Array[Scope]): NockBackContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assertScopesFinished")(assertScopesFinished)
    __obj.updateDynamic("isLoaded")(isLoaded)
    __obj.updateDynamic("scopes")(scopes)
    __obj.asInstanceOf[NockBackContext]
  }
}

