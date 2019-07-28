package typings.oauth2orize.oauth2orizeMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oauth2orize", "OAuth2Error")
@js.native
/**
  * @param code Defaults to *server_error*.
  * @param status Defaults to 500.
  */
class OAuth2Error () extends Error {
  def this(message: String) = this()
  def this(message: String, code: String) = this()
  def this(message: String, code: String, uri: String) = this()
  def this(message: String, code: String, uri: String, status: Double) = this()
  var code: String = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var status: Double = js.native
  var uri: js.UndefOr[String] = js.native
}

