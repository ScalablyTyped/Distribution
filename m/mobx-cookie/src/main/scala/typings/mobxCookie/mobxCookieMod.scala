package typings.mobxCookie

import typings.jsCookie.mod.CookieAttributes
import typings.node.NodeJS.Timeout
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx-cookie/dist-types/mobx-cookie", JSImport.Namespace)
@js.native
object mobxCookieMod extends js.Object {
  
  @js.native
  trait MobxCookie extends js.Object {
    
    /**
      * Clear Timeout
      * Internal function for destroying the cookie expiry timer
      */
    def _clearTimeout(): Unit = js.native
    
    /**
      * Expires To Date Time
      * Internal function to convert a js-cookie expires value to string date-time.
      */
    def _expiresToDateTime(expires: Double): String | Date = js.native
    def _expiresToDateTime(expires: Date): String | Date = js.native
    
    /**
      * Expires To Milliseconds
      * Internal function to convert a js-cookie expires value to milliseconds.
      */
    def _expiresToMs(expires: Double): Double = js.native
    def _expiresToMs(expires: Date): Double = js.native
    
    var _name: String = js.native
    
    /**
      * Start Timeout
      * Internal function for creating the cookie expiry timer
      */
    def _startTimeout(expires: Double): Unit = js.native
    def _startTimeout(expires: Date): Unit = js.native
    
    /**
      * Sync Timeout
      * Internal function to start timer if an _expires_ cookie exists.
      */
    def _syncTimeout(): Unit = js.native
    
    var _timeout: js.UndefOr[Timeout] = js.native
    
    /**
      * [DEPRECATED] - Observe the value directly, e.g. store.cookie.value
      * Get
      * Use this to observe the value of the cookie
      */
    def get(): js.UndefOr[String] = js.native
    
    /**
      * Remove
      * Remove the cookie and reset the observable and timer
      */
    def remove(): Unit = js.native
    
    /**
      * Set
      * Set the value (and optional options) of the cookie. Also starts the
      * removal timer if options.expires is set
      */
    def set(value: String): Unit = js.native
    def set(value: String, options: CookieAttributes): Unit = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  
  @js.native
  class default protected () extends MobxCookie {
    def this(name: String) = this()
  }
}
