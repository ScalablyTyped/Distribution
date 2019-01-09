package typings
package phantomjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Phantom extends js.Object {
  // Properties
  var args: js.Array[java.lang.String] = js.native
    // DEPRECATED
  var cookies: js.Array[Cookie] = js.native
  var cookiesEnabled: scala.Boolean = js.native
  var libraryPath: java.lang.String = js.native
  var scriptName: java.lang.String = js.native
    // DEPRECATED
  var version: Anon_Major = js.native
  // Functions
  def addCookie(cookie: Cookie): scala.Boolean = js.native
  def clearCookies(): scala.Unit = js.native
  def deleteCookie(cookieName: java.lang.String): scala.Boolean = js.native
  def exit(): scala.Boolean = js.native
  def exit(returnValue: js.Any): scala.Boolean = js.native
  def injectJs(filename: java.lang.String): scala.Boolean = js.native
  // Callbacks
  def onError(msg: java.lang.String, trace: js.Array[java.lang.String]): js.Any = js.native
}

