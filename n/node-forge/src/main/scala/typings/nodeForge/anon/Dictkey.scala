package typings.nodeForge.anon

import org.scalablytyped.runtime.StringDictionary
import typings.nodeForge.mod.pkcs12.Bag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictkey
  extends /* key */ StringDictionary[js.UndefOr[js.Array[Bag]]] {
  
  var friendlyName: js.UndefOr[js.Array[Bag]] = js.native
  
  var localKeyId: js.UndefOr[js.Array[Bag]] = js.native
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
    def setFriendlyNameVarargs(value: Bag*): Self = this.set("friendlyName", js.Array(value :_*))
    
    @scala.inline
    def setFriendlyName(value: js.Array[Bag]): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFriendlyName: Self = this.set("friendlyName", js.undefined)
    
    @scala.inline
    def setLocalKeyIdVarargs(value: Bag*): Self = this.set("localKeyId", js.Array(value :_*))
    
    @scala.inline
    def setLocalKeyId(value: js.Array[Bag]): Self = this.set("localKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalKeyId: Self = this.set("localKeyId", js.undefined)
  }
}
