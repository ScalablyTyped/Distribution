package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataAccessOptions extends StObject {
  
  var logMode: js.UndefOr[String] = js.undefined
}
object DataAccessOptions {
  
  inline def apply(): DataAccessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataAccessOptions]
  }
  
  extension [Self <: DataAccessOptions](x: Self) {
    
    inline def setLogMode(value: String): Self = StObject.set(x, "logMode", value.asInstanceOf[js.Any])
    
    inline def setLogModeUndefined: Self = StObject.set(x, "logMode", js.undefined)
  }
}
