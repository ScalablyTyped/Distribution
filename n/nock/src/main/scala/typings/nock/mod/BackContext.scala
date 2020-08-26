package typings.nock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackContext extends js.Object {
  var isLoaded: Boolean = js.native
  var scopes: js.Array[Scope] = js.native
  def assertScopesFinished(): Unit = js.native
}

object BackContext {
  @scala.inline
  def apply(assertScopesFinished: () => Unit, isLoaded: Boolean, scopes: js.Array[Scope]): BackContext = {
    val __obj = js.Dynamic.literal(assertScopesFinished = js.Any.fromFunction0(assertScopesFinished), isLoaded = isLoaded.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackContext]
  }
  @scala.inline
  implicit class BackContextOps[Self <: BackContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssertScopesFinished(value: () => Unit): Self = this.set("assertScopesFinished", js.Any.fromFunction0(value))
    @scala.inline
    def setIsLoaded(value: Boolean): Self = this.set("isLoaded", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopesVarargs(value: Scope*): Self = this.set("scopes", js.Array(value :_*))
    @scala.inline
    def setScopes(value: js.Array[Scope]): Self = this.set("scopes", value.asInstanceOf[js.Any])
  }
  
}

