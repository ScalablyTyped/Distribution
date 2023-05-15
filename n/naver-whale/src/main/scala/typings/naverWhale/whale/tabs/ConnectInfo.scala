package typings.naverWhale.whale.tabs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectInfo extends StObject {
  
  /**
    * Optional. Open a port to a specific document identified by documentId instead of all frames in the tab.
    * @since Chrome 106.
    */
  var documentId: js.UndefOr[String] = js.undefined
  
  /**
    * Open a port to a specific frame identified by frameId instead of all frames in the tab.
    * @since Chrome 41.
    */
  var frameId: js.UndefOr[Double] = js.undefined
  
  /** Optional. Will be passed into onConnect for content scripts that are listening for the connection event. */
  var name: js.UndefOr[String] = js.undefined
}
object ConnectInfo {
  
  inline def apply(): ConnectInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectInfo] (val x: Self) extends AnyVal {
    
    inline def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
