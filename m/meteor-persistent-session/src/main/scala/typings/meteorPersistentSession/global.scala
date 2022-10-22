package typings.meteorPersistentSession

import typings.meteor.EJSONable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Session {
    
    @JSGlobal("Session")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    inline def clear(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def clearAuth(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAuth")().asInstanceOf[Unit]
    
    inline def clearPersistent(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearPersistent")().asInstanceOf[Unit]
    
    inline def clearTemp(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTemp")().asInstanceOf[Unit]
    
    inline def makeAuth(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("makeAuth")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def makePersistent(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("makePersistent")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def makeTemp(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("makeTemp")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def setAuth(key: String, value: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setAuth")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def setAuth(key: String, value: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setAuth")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def setAuth(key: String, value: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setAuth")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def setAuth(key: String, value: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setAuth")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def setDefaultAuth(key: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultAuth")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setDefaultAuth(key: String, value: EJSONable): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultAuth")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setDefaultPersistent(key: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultPersistent")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setDefaultPersistent(key: String, value: EJSONable): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultPersistent")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setDefaultTemp(key: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultTemp")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def setDefaultTemp(key: String, value: EJSONable): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultTemp")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setPersistent(key: String, value: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setPersistent")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def setPersistent(key: String, value: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setPersistent")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def setPersistent(key: String, value: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setPersistent")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def setPersistent(key: String, value: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setPersistent")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def setTemp(key: String, value: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setTemp")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def setTemp(key: String, value: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setTemp")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def setTemp(key: String, value: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setTemp")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def setTemp(key: String, value: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setTemp")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
