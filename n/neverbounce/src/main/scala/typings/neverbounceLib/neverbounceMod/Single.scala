package typings
package neverbounceLib.neverbounceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Single extends js.Object {
  def check(email: java.lang.String): js.Promise[neverbounceLib.Response] = js.native
  def check(email: java.lang.String, addressInfo: scala.Boolean): js.Promise[neverbounceLib.Response] = js.native
  def check(email: java.lang.String, addressInfo: scala.Boolean, creditsInfo: scala.Boolean): js.Promise[neverbounceLib.Response] = js.native
  def check(email: java.lang.String, addressInfo: scala.Boolean, creditsInfo: scala.Boolean, timeout: js.Any): js.Promise[neverbounceLib.Response] = js.native
}

