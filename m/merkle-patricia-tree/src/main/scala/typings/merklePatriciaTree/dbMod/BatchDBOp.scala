package typings.merklePatriciaTree.dbMod

import typings.merklePatriciaTree.merklePatriciaTreeStrings.del
import typings.merklePatriciaTree.merklePatriciaTreeStrings.put
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.merklePatriciaTree.dbMod.PutBatch
  - typings.merklePatriciaTree.dbMod.DelBatch
*/
trait BatchDBOp extends js.Object
object BatchDBOp {
  
  @scala.inline
  def PutBatch(key: Buffer, `type`: put, value: Buffer): BatchDBOp = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDBOp]
  }
  
  @scala.inline
  def DelBatch(key: Buffer, `type`: del): BatchDBOp = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDBOp]
  }
}
