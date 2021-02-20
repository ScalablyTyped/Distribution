package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Splashscreen extends StObject {
  
  def hide(): Unit = js.native
  
  def show(): Unit = js.native
}
object Splashscreen {
  
  @scala.inline
  def apply(hide: () => Unit, show: () => Unit): Splashscreen = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Splashscreen]
  }
  
  @scala.inline
  implicit class SplashscreenMutableBuilder[Self <: Splashscreen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
