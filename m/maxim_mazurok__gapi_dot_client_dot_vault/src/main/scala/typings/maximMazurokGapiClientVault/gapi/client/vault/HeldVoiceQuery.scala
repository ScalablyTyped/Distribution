package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeldVoiceQuery extends StObject {
  
  /** A list of data types covered by the hold. Should be non-empty. Order does not matter and duplicates are ignored. */
  var coveredData: js.UndefOr[js.Array[String]] = js.undefined
}
object HeldVoiceQuery {
  
  inline def apply(): HeldVoiceQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HeldVoiceQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeldVoiceQuery] (val x: Self) extends AnyVal {
    
    inline def setCoveredData(value: js.Array[String]): Self = StObject.set(x, "coveredData", value.asInstanceOf[js.Any])
    
    inline def setCoveredDataUndefined: Self = StObject.set(x, "coveredData", js.undefined)
    
    inline def setCoveredDataVarargs(value: String*): Self = StObject.set(x, "coveredData", js.Array(value*))
  }
}
