package typings.photoshop.domCoreModulesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HistoryStateInfo extends StObject {
  
  /**
    * The target document's ID that will have its history suspended with suspendHistory.
    * @minVersion 23.0
    */
  var documentID: Double
  
  /**
    * Name of the history state to be shown in History panel
    * @minVersion 23.0
    */
  var name: String
}
object HistoryStateInfo {
  
  inline def apply(documentID: Double, name: String): HistoryStateInfo = {
    val __obj = js.Dynamic.literal(documentID = documentID.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HistoryStateInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HistoryStateInfo] (val x: Self) extends AnyVal {
    
    inline def setDocumentID(value: Double): Self = StObject.set(x, "documentID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
