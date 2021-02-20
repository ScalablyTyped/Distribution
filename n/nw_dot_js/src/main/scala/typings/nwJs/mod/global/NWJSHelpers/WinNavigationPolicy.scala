package typings.nwJs.mod.global.NWJSHelpers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * nw.Window.get().on('navigation') callback policy argument object
  */
@js.native
trait WinNavigationPolicy extends StObject {
  
  /**
    * Ignore the request, navigation won’t happen.
    */
  def ignore(): Unit = js.native
}
object WinNavigationPolicy {
  
  @scala.inline
  def apply(ignore: () => Unit): WinNavigationPolicy = {
    val __obj = js.Dynamic.literal(ignore = js.Any.fromFunction0(ignore))
    __obj.asInstanceOf[WinNavigationPolicy]
  }
  
  @scala.inline
  implicit class WinNavigationPolicyMutableBuilder[Self <: WinNavigationPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIgnore(value: () => Unit): Self = StObject.set(x, "ignore", js.Any.fromFunction0(value))
  }
}
