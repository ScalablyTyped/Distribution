package typings.meteorMdgValidatedMethod.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictkey
  extends /* key */ StringDictionary[js.Any] {
  
  var noRetry: js.UndefOr[Boolean] = js.native
  
  var onResultReceived: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.native
  
  var returnStubValue: js.UndefOr[Boolean] = js.native
  
  var throwStubExceptions: js.UndefOr[Boolean] = js.native
}
object Dictkey {
  
  @scala.inline
  def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
    
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
    def setNoRetry(value: Boolean): Self = this.set("noRetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoRetry: Self = this.set("noRetry", js.undefined)
    
    @scala.inline
    def setOnResultReceived(value: /* result */ js.Any => Unit): Self = this.set("onResultReceived", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResultReceived: Self = this.set("onResultReceived", js.undefined)
    
    @scala.inline
    def setReturnStubValue(value: Boolean): Self = this.set("returnStubValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnStubValue: Self = this.set("returnStubValue", js.undefined)
    
    @scala.inline
    def setThrowStubExceptions(value: Boolean): Self = this.set("throwStubExceptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrowStubExceptions: Self = this.set("throwStubExceptions", js.undefined)
  }
}
