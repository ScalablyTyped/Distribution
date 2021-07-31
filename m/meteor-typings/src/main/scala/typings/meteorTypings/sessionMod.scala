package typings.meteorTypings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionMod {
  
  object Session {
    
    @JSImport("meteor/session", "Session")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def equals_(key: String, value: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def equals_(key: String, value: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def equals_(key: String, value: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    @scala.inline
    def equals_(key: String, value: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @scala.inline
    def get(key: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    
    @scala.inline
    def set(key: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def set(key: String, value: EJSONable): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def setDefault(key: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDefault")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    @scala.inline
    def setDefault(key: String, value: EJSONable): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDefault")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
