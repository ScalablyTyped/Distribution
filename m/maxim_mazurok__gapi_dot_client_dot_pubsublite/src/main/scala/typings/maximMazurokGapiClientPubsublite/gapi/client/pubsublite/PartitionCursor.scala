package typings.maximMazurokGapiClientPubsublite.gapi.client.pubsublite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PartitionCursor extends js.Object {
  
  /** The value of the cursor. */
  var cursor: js.UndefOr[Cursor] = js.native
  
  /** The partition this is for. */
  var partition: js.UndefOr[String] = js.native
}
object PartitionCursor {
  
  @scala.inline
  def apply(): PartitionCursor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartitionCursor]
  }
  
  @scala.inline
  implicit class PartitionCursorOps[Self <: PartitionCursor] (val x: Self) extends AnyVal {
    
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
    def setCursor(value: Cursor): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setPartition(value: String): Self = this.set("partition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartition: Self = this.set("partition", js.undefined)
  }
}
