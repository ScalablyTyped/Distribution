package typings.maximMazurokGapiClientSpeech.gapi.client.speech

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassItem extends StObject {
  
  /** The class item's value. */
  var value: js.UndefOr[String] = js.undefined
}
object ClassItem {
  
  inline def apply(): ClassItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassItem]
  }
  
  extension [Self <: ClassItem](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
