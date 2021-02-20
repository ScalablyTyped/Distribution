package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataAccessOptions extends StObject {
  
  var logMode: js.UndefOr[String] = js.native
}
object DataAccessOptions {
  
  @scala.inline
  def apply(): DataAccessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataAccessOptions]
  }
  
  @scala.inline
  implicit class DataAccessOptionsMutableBuilder[Self <: DataAccessOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogMode(value: String): Self = StObject.set(x, "logMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogModeUndefined: Self = StObject.set(x, "logMode", js.undefined)
  }
}
