package typings.mobxCookie

import typings.jsCookie.mod.CookieAttributes
import typings.node.timersMod.global.NodeJS.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mobxCookieMod {
  
  @JSImport("mobx-cookie/dist-types/mobx-cookie", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with MobxCookie {
    def this(name: String) = this()
  }
  
  @js.native
  trait MobxCookie extends StObject {
    
    var _name: String = js.native
    
    var _timeout: js.UndefOr[Timeout] = js.native
    
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
}
