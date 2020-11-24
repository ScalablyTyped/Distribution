package typings.oracleOraclejet.ojdataproviderMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchByKeysParameters[K] extends js.Object {
  
  var attributes: js.UndefOr[js.Array[String | FetchAttribute]] = js.native
  
  var keys: Set[K] = js.native
}
object FetchByKeysParameters {
  
  @scala.inline
  def apply[K](keys: Set[K]): FetchByKeysParameters[K] = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchByKeysParameters[K]]
  }
  
  @scala.inline
  implicit class FetchByKeysParametersOps[Self <: FetchByKeysParameters[_], K] (val x: Self with FetchByKeysParameters[K]) extends AnyVal {
    
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
    def setKeys(value: Set[K]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesVarargs(value: (String | FetchAttribute)*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: js.Array[String | FetchAttribute]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
  }
}
