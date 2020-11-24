package typings.persona.Persona

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatchOptions extends js.Object {
  
  var loggedInUser: String = js.native
  
  def onlogin(s: String): Unit = js.native
  
  def onlogout(): Unit = js.native
  
  var onready: js.UndefOr[js.Function0[Unit]] = js.native
}
object WatchOptions {
  
  @scala.inline
  def apply(loggedInUser: String, onlogin: String => Unit, onlogout: () => Unit): WatchOptions = {
    val __obj = js.Dynamic.literal(loggedInUser = loggedInUser.asInstanceOf[js.Any], onlogin = js.Any.fromFunction1(onlogin), onlogout = js.Any.fromFunction0(onlogout))
    __obj.asInstanceOf[WatchOptions]
  }
  
  @scala.inline
  implicit class WatchOptionsOps[Self <: WatchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLoggedInUser(value: String): Self = this.set("loggedInUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlogin(value: String => Unit): Self = this.set("onlogin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnlogout(value: () => Unit): Self = this.set("onlogout", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnready(value: () => Unit): Self = this.set("onready", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnready: Self = this.set("onready", js.undefined)
  }
}
