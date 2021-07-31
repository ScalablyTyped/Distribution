package typings.phantomjs

import typings.phantomjs.anon.Major
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Phantom extends StObject {
  
  // Functions
  def addCookie(cookie: Cookie): Boolean = js.native
  
  // Properties
  var args: js.Array[String] = js.native
  
  def clearCookies(): Unit = js.native
  
  // DEPRECATED
  var cookies: js.Array[Cookie] = js.native
  
  var cookiesEnabled: Boolean = js.native
  
  def deleteCookie(cookieName: String): Boolean = js.native
  
  def exit(): Boolean = js.native
  def exit(returnValue: js.Any): Boolean = js.native
  
  def injectJs(filename: String): Boolean = js.native
  
  var libraryPath: String = js.native
  
  // Callbacks
  def onError(msg: String, trace: js.Array[String]): js.Any = js.native
  
  var scriptName: String = js.native
  
  // DEPRECATED
  var version: Major = js.native
}
