package typings.openpgp.mod.key

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyResult extends js.Object {
  
  var err: js.Array[Error] | Null = js.native
  
  var keys: js.Array[Key] = js.native
}
object KeyResult {
  
  @scala.inline
  def apply(keys: js.Array[Key]): KeyResult = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyResult]
  }
  
  @scala.inline
  implicit class KeyResultOps[Self <: KeyResult] (val x: Self) extends AnyVal {
    
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
    def setKeysVarargs(value: Key*): Self = this.set("keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[Key]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrVarargs(value: Error*): Self = this.set("err", js.Array(value :_*))
    
    @scala.inline
    def setErr(value: js.Array[Error]): Self = this.set("err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrNull: Self = this.set("err", null)
  }
}
