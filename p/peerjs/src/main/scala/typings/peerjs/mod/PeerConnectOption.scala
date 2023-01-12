package typings.peerjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerConnectOption extends StObject {
  
  var label: js.UndefOr[String] = js.undefined
  
  var metadata: js.UndefOr[Any] = js.undefined
  
  var reliable: js.UndefOr[Boolean] = js.undefined
  
  var serialization: js.UndefOr[String] = js.undefined
}
object PeerConnectOption {
  
  inline def apply(): PeerConnectOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PeerConnectOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PeerConnectOption] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setReliable(value: Boolean): Self = StObject.set(x, "reliable", value.asInstanceOf[js.Any])
    
    inline def setReliableUndefined: Self = StObject.set(x, "reliable", js.undefined)
    
    inline def setSerialization(value: String): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
    
    inline def setSerializationUndefined: Self = StObject.set(x, "serialization", js.undefined)
  }
}
