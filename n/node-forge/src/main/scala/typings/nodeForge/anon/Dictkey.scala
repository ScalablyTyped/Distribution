package typings.nodeForge.anon

import org.scalablytyped.runtime.StringDictionary
import typings.nodeForge.mod.pkcs12.Bag
import org.scalablytyped.runtime.StObject
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
  implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFriendlyName(value: js.Array[Bag]): Self = StObject.set(x, "friendlyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFriendlyNameUndefined: Self = StObject.set(x, "friendlyName", js.undefined)
    
    @scala.inline
    def setFriendlyNameVarargs(value: Bag*): Self = StObject.set(x, "friendlyName", js.Array(value :_*))
    
    @scala.inline
    def setLocalKeyId(value: js.Array[Bag]): Self = StObject.set(x, "localKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalKeyIdUndefined: Self = StObject.set(x, "localKeyId", js.undefined)
    
    @scala.inline
    def setLocalKeyIdVarargs(value: Bag*): Self = StObject.set(x, "localKeyId", js.Array(value :_*))
  }
}
