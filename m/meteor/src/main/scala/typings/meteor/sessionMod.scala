package typings.meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionMod {
  
  object Session {
    
    @JSImport("meteor/session", "Session.equals")
    @js.native
    def equals_(key: String, value: String): Boolean = js.native
    @JSImport("meteor/session", "Session.equals")
    @js.native
    def equals_(key: String, value: js.Any): Boolean = js.native
    @JSImport("meteor/session", "Session.equals")
    @js.native
    def equals_(key: String, value: Boolean): Boolean = js.native
    @JSImport("meteor/session", "Session.equals")
    @js.native
    def equals_(key: String, value: Double): Boolean = js.native
    
    @JSImport("meteor/session", "Session.get")
    @js.native
    def get(key: String): js.Any = js.native
    
    @JSImport("meteor/session", "Session.set")
    @js.native
    def set(key: String, value: js.Any): Unit = js.native
    @JSImport("meteor/session", "Session.set")
    @js.native
    def set(key: String, value: EJSONable): Unit = js.native
    
    @JSImport("meteor/session", "Session.setDefault")
    @js.native
    def setDefault(key: String, value: js.Any): Unit = js.native
    @JSImport("meteor/session", "Session.setDefault")
    @js.native
    def setDefault(key: String, value: EJSONable): Unit = js.native
  }
}
