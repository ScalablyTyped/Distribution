package typings
package passportDashOauth2Lib.passportDashOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-oauth2", "TokenError")
@js.native
class TokenError protected ()
  extends stdLib.Error {
  def this(message: js.UndefOr[scala.Nothing], code: java.lang.String) = this()
  def this(message: java.lang.String, code: java.lang.String) = this()
  def this(message: js.UndefOr[scala.Nothing], code: java.lang.String, uri: java.lang.String) = this()
  def this(message: java.lang.String, code: java.lang.String, uri: java.lang.String) = this()
  def this(message: js.UndefOr[scala.Nothing], code: java.lang.String, uri: java.lang.String, status: scala.Double) = this()
  def this(message: java.lang.String, code: java.lang.String, uri: java.lang.String, status: scala.Double) = this()
  var code: java.lang.String = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var status: scala.Double = js.native
  var uri: js.UndefOr[java.lang.String] = js.native
}

