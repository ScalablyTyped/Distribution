package typings.node.anon

import typings.node.workerThreadsMod.TransferListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transfer extends StObject {
  
  var transfer: js.Array[TransferListItem]
}
object Transfer {
  
  inline def apply(transfer: js.Array[TransferListItem]): Transfer = {
    val __obj = js.Dynamic.literal(transfer = transfer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transfer]
  }
  
  extension [Self <: Transfer](x: Self) {
    
    inline def setTransfer(value: js.Array[TransferListItem]): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    inline def setTransferVarargs(value: TransferListItem*): Self = StObject.set(x, "transfer", js.Array(value*))
  }
}
