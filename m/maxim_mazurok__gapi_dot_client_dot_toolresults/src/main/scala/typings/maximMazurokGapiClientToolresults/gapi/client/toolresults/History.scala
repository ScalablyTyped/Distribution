package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait History extends StObject {
  
  /** A short human-readable (plain text) name to display in the UI. Maximum of 100 characters. - In response: present if set during create. - In create request: optional */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * A unique identifier within a project for this History. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response always set - In create request:
    * never set
    */
  var historyId: js.UndefOr[String] = js.undefined
  
  /** A name to uniquely identify a history within a project. Maximum of 200 characters. - In response always set - In create request: always set */
  var name: js.UndefOr[String] = js.undefined
  
  /** The platform of the test history. - In response: always set. Returns the platform of the last execution if unknown. */
  var testPlatform: js.UndefOr[String] = js.undefined
}
object History {
  
  inline def apply(): History = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[History]
  }
  
  extension [Self <: History](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    inline def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTestPlatform(value: String): Self = StObject.set(x, "testPlatform", value.asInstanceOf[js.Any])
    
    inline def setTestPlatformUndefined: Self = StObject.set(x, "testPlatform", js.undefined)
  }
}
