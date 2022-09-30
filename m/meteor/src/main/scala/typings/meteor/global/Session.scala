package typings.meteor.global

import typings.meteor.EJSONable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Session {
  
  @JSGlobal("Session")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Test if a session variable is equal to a value. If inside a
    * reactive computation, invalidate the computation the next
    * time the variable changes to or from the value.
    * @param key The name of the session variable to test
    * @param value The value to test against
    */
  inline def equals_(key: String, value: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(key: String, value: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(key: String, value: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(key: String, value: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Get the value of a session variable. If inside a reactive
    * computation, invalidate the computation the next time the
    * value of the variable is changed by `Session.set`. This
    * returns a clone of the session value, so if it's an object or an array,
    * mutating the returned value has no effect on the value stored in the
    * session.
    * @param key The name of the session variable to return
    */
  inline def get(key: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def set(key: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Set a variable in the session. Notify any listeners that the value
    * has changed (eg: redraw templates, and rerun any
    * `Tracker.autorun` computations, that called
    * `Session.get` on this `key`.)
    * @param key The key to set, eg, `selectedItem`
    * @param value The new value for `key`
    */
  inline def set(key: String, value: EJSONable): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setDefault(key: String, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDefault")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * Set a variable in the session if it hasn't been set before.
    * Otherwise works exactly the same as `Session.set`.
    * @param key The key to set, eg, `selectedItem`
    * @param value The new value for `key`
    */
  inline def setDefault(key: String, value: EJSONable): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setDefault")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
