package typings.nock.nockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackContext extends js.Object {
  var isLoaded: Boolean
  var scopes: js.Array[Scope]
  def assertScopesFinished(): Unit
}

object BackContext {
  @scala.inline
  def apply(assertScopesFinished: () => Unit, isLoaded: Boolean, scopes: js.Array[Scope]): BackContext = {
    val __obj = js.Dynamic.literal(assertScopesFinished = js.Any.fromFunction0(assertScopesFinished), isLoaded = isLoaded.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BackContext]
  }
}

