package typings.meteorAccountsPhone

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meteorMod {
  
  object Meteor {
    
    @JSImport("meteor/meteor", "Meteor")
    @js.native
    val ^ : js.Any = js.native
    
    inline def loginWithPhoneAndPassword(selector: String, password: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPhoneAndPassword")(selector.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithPhoneAndPassword(selector: String, password: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPhoneAndPassword")(selector.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithPhoneAndPassword(selector: js.Object, password: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPhoneAndPassword")(selector.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loginWithPhoneAndPassword(selector: js.Object, password: String, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loginWithPhoneAndPassword")(selector.asInstanceOf[js.Any], password.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
