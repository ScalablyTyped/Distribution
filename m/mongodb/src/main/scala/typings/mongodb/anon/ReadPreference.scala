package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import typings.mongodb.mod.ReadPreferenceOrMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadPreference extends StObject {
  
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.undefined
  
  var session: js.UndefOr[ClientSession] = js.undefined
}
object ReadPreference {
  
  @scala.inline
  def apply(): ReadPreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadPreference]
  }
  
  @scala.inline
  implicit class ReadPreferenceMutableBuilder[Self <: ReadPreference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReadPreference(value: ReadPreferenceOrMode): Self = StObject.set(x, "readPreference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadPreferenceUndefined: Self = StObject.set(x, "readPreference", js.undefined)
    
    @scala.inline
    def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
