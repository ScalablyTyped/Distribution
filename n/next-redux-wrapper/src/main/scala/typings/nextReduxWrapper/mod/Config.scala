package typings.nextReduxWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config[S /* <: js.Object */] extends js.Object {
  
  var debug: js.UndefOr[Boolean] = js.native
  
  var deserializeState: js.UndefOr[js.Function1[/* state */ js.Any, S]] = js.native
  
  var serializeState: js.UndefOr[js.Function1[/* state */ S, _]] = js.native
  
  var storeKey: js.UndefOr[String] = js.native
}
object Config {
  
  @scala.inline
  def apply[S /* <: js.Object */](): Config[S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config[S]]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config[_], S /* <: js.Object */] (val x: Self with Config[S]) extends AnyVal {
    
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
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDeserializeState(value: /* state */ js.Any => S): Self = this.set("deserializeState", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDeserializeState: Self = this.set("deserializeState", js.undefined)
    
    @scala.inline
    def setSerializeState(value: /* state */ S => _): Self = this.set("serializeState", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSerializeState: Self = this.set("serializeState", js.undefined)
    
    @scala.inline
    def setStoreKey(value: String): Self = this.set("storeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStoreKey: Self = this.set("storeKey", js.undefined)
  }
}
