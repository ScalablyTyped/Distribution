package typings
package oauth2orizeLib.oauth2orizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth2orize", "OAuth2Error")
@js.native
/**
  * @param code Defaults to *server_error*.
  * @param status Defaults to 500.
  */
class OAuth2Error ()
  extends stdLib.Error {
  def this(message: java.lang.String) = this()
  def this(message: java.lang.String, code: java.lang.String) = this()
  def this(message: java.lang.String, code: java.lang.String, uri: java.lang.String) = this()
  def this(message: java.lang.String, code: java.lang.String, uri: java.lang.String, status: scala.Double) = this()
  var code: java.lang.String = js.native
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var status: scala.Double = js.native
  var uri: js.UndefOr[java.lang.String] = js.native
}

