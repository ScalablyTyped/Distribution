package typings.nuxtjsAuth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Storage extends js.Object {
  
  def getCookie(key: String): js.Any = js.native
  def getCookie(key: String, isJson: Boolean): js.Any = js.native
  
  def getLocalStorage(key: String): js.Any = js.native
  def getLocalStorage(key: String, isJson: Boolean): js.Any = js.native
  
  def getState(key: String): String = js.native
  
  def getUniversal(key: String): js.Any = js.native
  def getUniversal(key: String, isJson: Boolean): js.Any = js.native
  
  // Cookies
  def setCookie(key: String, `val`: js.Any): js.Any = js.native
  def setCookie(key: String, `val`: js.Any, options: js.Object): js.Any = js.native
  
  // Local Storage
  def setLocalStorage(key: String, `val`: js.Any): js.Any = js.native
  def setLocalStorage(key: String, `val`: js.Any, isJson: Boolean): js.Any = js.native
  
  // Local State
  def setState(key: String, `val`: js.Any): String = js.native
  
  def setUniversal(key: String, value: js.Any): String = js.native
  def setUniversal(key: String, value: js.Any, isJson: Boolean): String = js.native
  
  def syncUniversal(key: String, defaultValue: js.Any): js.Any = js.native
  def syncUniversal(key: String, defaultValue: js.Any, isJson: Boolean): js.Any = js.native
  
  def watchState(key: String, handler: js.Function1[/* newValue */ js.Any, Unit]): js.Any = js.native
}
