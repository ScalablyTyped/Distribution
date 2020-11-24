package typings.oauth2orize.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("oauth2orize", "OAuth2Error")
@js.native
/**
  * @param code Defaults to *server_error*.
  * @param status Defaults to 500.
  */
class OAuth2Error () extends Error {
  def this(message: String) = this()
  def this(message: js.UndefOr[scala.Nothing], code: String) = this()
  def this(message: String, code: String) = this()
  def this(message: js.UndefOr[scala.Nothing], code: js.UndefOr[scala.Nothing], uri: String) = this()
  def this(message: js.UndefOr[scala.Nothing], code: String, uri: String) = this()
  def this(message: String, code: js.UndefOr[scala.Nothing], uri: String) = this()
  def this(message: String, code: String, uri: String) = this()
  def this(
    message: js.UndefOr[scala.Nothing],
    code: js.UndefOr[scala.Nothing],
    uri: js.UndefOr[scala.Nothing],
    status: Double
  ) = this()
  def this(message: js.UndefOr[scala.Nothing], code: js.UndefOr[scala.Nothing], uri: String, status: Double) = this()
  def this(message: js.UndefOr[scala.Nothing], code: String, uri: js.UndefOr[scala.Nothing], status: Double) = this()
  def this(message: js.UndefOr[scala.Nothing], code: String, uri: String, status: Double) = this()
  def this(message: String, code: js.UndefOr[scala.Nothing], uri: js.UndefOr[scala.Nothing], status: Double) = this()
  def this(message: String, code: js.UndefOr[scala.Nothing], uri: String, status: Double) = this()
  def this(message: String, code: String, uri: js.UndefOr[scala.Nothing], status: Double) = this()
  def this(message: String, code: String, uri: String, status: Double) = this()
  
  var code: String = js.native
  
  var status: Double = js.native
  
  var uri: js.UndefOr[String] = js.native
}
