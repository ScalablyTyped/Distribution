package typings
package nockLib.nockMod

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
  def apply(assertScopesFinished: () => scala.Unit, isLoaded: scala.Boolean, scopes: js.Array[Scope]): NockBackContext = {
    val __obj = js.Dynamic.literal(assertScopesFinished = js.Any.fromFunction0(assertScopesFinished), isLoaded = isLoaded, scopes = scopes)
  
    __obj.asInstanceOf[NockBackContext]
  }
}

