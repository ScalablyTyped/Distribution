package typings.merklePatriciaTree.dbMod

import typings.merklePatriciaTree.merklePatriciaTreeStrings.del
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DelBatch extends BatchDBOp {
  
  var key: Buffer = js.native
  
  var `type`: del = js.native
}
object DelBatch {
  
  @scala.inline
  def apply(key: Buffer, `type`: del): DelBatch = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelBatch]
  }
  
  @scala.inline
  implicit class DelBatchOps[Self <: DelBatch] (val x: Self) extends AnyVal {
    
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
    def setKey(value: Buffer): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: del): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
