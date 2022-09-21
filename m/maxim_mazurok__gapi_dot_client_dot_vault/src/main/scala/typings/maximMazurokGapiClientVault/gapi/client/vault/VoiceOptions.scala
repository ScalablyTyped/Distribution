package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VoiceOptions extends StObject {
  
  /** Datatypes to search */
  var coveredData: js.UndefOr[js.Array[String]] = js.undefined
}
object VoiceOptions {
  
  inline def apply(): VoiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VoiceOptions]
  }
  
  extension [Self <: VoiceOptions](x: Self) {
    
    inline def setCoveredData(value: js.Array[String]): Self = StObject.set(x, "coveredData", value.asInstanceOf[js.Any])
    
    inline def setCoveredDataUndefined: Self = StObject.set(x, "coveredData", js.undefined)
    
    inline def setCoveredDataVarargs(value: String*): Self = StObject.set(x, "coveredData", js.Array(value*))
  }
}
