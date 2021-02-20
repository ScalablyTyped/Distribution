package typings.meteorPersistentSession

import typings.meteor.EJSONable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Session {
    
    @JSGlobal("Session.clear")
    @js.native
    def clear(): Unit = js.native
    @JSGlobal("Session.clear")
    @js.native
    def clear(key: String): Unit = js.native
    
    @JSGlobal("Session.clearAuth")
    @js.native
    def clearAuth(): Unit = js.native
    
    @JSGlobal("Session.clearPersistent")
    @js.native
    def clearPersistent(): Unit = js.native
    
    @JSGlobal("Session.clearTemp")
    @js.native
    def clearTemp(): Unit = js.native
    
    @JSGlobal("Session.makeAuth")
    @js.native
    def makeAuth(key: String): Unit = js.native
    
    @JSGlobal("Session.makePersistent")
    @js.native
    def makePersistent(key: String): Unit = js.native
    
    @JSGlobal("Session.makeTemp")
    @js.native
    def makeTemp(key: String): Unit = js.native
    
    @JSGlobal("Session.setAuth")
    @js.native
    def setAuth(key: String, value: String): Boolean = js.native
    @JSGlobal("Session.setAuth")
    @js.native
    def setAuth(key: String, value: js.Any): Boolean = js.native
    @JSGlobal("Session.setAuth")
    @js.native
    def setAuth(key: String, value: Boolean): Boolean = js.native
    @JSGlobal("Session.setAuth")
    @js.native
    def setAuth(key: String, value: Double): Boolean = js.native
    
    @JSGlobal("Session.setDefaultAuth")
    @js.native
    def setDefaultAuth(key: String, value: js.Any): Unit = js.native
    @JSGlobal("Session.setDefaultAuth")
    @js.native
    def setDefaultAuth(key: String, value: EJSONable): Unit = js.native
    
    @JSGlobal("Session.setDefaultPersistent")
    @js.native
    def setDefaultPersistent(key: String, value: js.Any): Unit = js.native
    @JSGlobal("Session.setDefaultPersistent")
    @js.native
    def setDefaultPersistent(key: String, value: EJSONable): Unit = js.native
    
    @JSGlobal("Session.setDefaultTemp")
    @js.native
    def setDefaultTemp(key: String, value: js.Any): Unit = js.native
    @JSGlobal("Session.setDefaultTemp")
    @js.native
    def setDefaultTemp(key: String, value: EJSONable): Unit = js.native
    
    @JSGlobal("Session.setPersistent")
    @js.native
    def setPersistent(key: String, value: String): Boolean = js.native
    @JSGlobal("Session.setPersistent")
    @js.native
    def setPersistent(key: String, value: js.Any): Boolean = js.native
    @JSGlobal("Session.setPersistent")
    @js.native
    def setPersistent(key: String, value: Boolean): Boolean = js.native
    @JSGlobal("Session.setPersistent")
    @js.native
    def setPersistent(key: String, value: Double): Boolean = js.native
    
    @JSGlobal("Session.setTemp")
    @js.native
    def setTemp(key: String, value: String): Boolean = js.native
    @JSGlobal("Session.setTemp")
    @js.native
    def setTemp(key: String, value: js.Any): Boolean = js.native
    @JSGlobal("Session.setTemp")
    @js.native
    def setTemp(key: String, value: Boolean): Boolean = js.native
    @JSGlobal("Session.setTemp")
    @js.native
    def setTemp(key: String, value: Double): Boolean = js.native
  }
}
