package typings.nock.nockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NockBackContext extends js.Object {
  var isLoaded: Boolean
  var scopes: js.Array[Scope]
  def assertScopesFinished(): Unit
}

object NockBackContext {
  @scala.inline
  def apply(assertScopesFinished: () => Unit, isLoaded: Boolean, scopes: js.Array[Scope]): NockBackContext = {
    val __obj = js.Dynamic.literal(assertScopesFinished = js.Any.fromFunction0(assertScopesFinished), isLoaded = isLoaded, scopes = scopes)
  
    __obj.asInstanceOf[NockBackContext]
  }
}

