package typings.nodemailer.libXoauth2Mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.node.streamMod.internal
import typings.nodemailer.libSharedMod.Logger
import typings.nodemailer.nodemailerBooleans.`false`
import typings.nodemailer.nodemailerStrings.end
import typings.nodemailer.nodemailerStrings.error
import typings.nodemailer.nodemailerStrings.token
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XOAuth2 extends internal {
  var accessToken: String | `false` = js.native
  var expires: Double = js.native
  var logger: Logger = js.native
  var options: Options = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_token(event: token, listener: js.Function1[/* token */ Token, Unit]): this.type = js.native
  /** Converts an access_token and user id into a base64 encoded XOAuth2 token */
  def buildXOAuth2Token(accessToken: String): String = js.native
  @JSName("emit")
  def emit_error(event: error, error: Error): Boolean = js.native
  @JSName("emit")
  def emit_token(event: token, token: Token): Boolean = js.native
  /** Generates a new XOAuth2 token with the credentials provided at initialization */
  def generateToken(callback: js.Function2[/* err */ Error | Null, /* accessToken */ String, Unit]): Unit = js.native
  /** Returns or generates (if previous has expired) a XOAuth2 token */
  def getToken(renew: Boolean, callback: js.Function2[/* err */ Error | Null, /* accessToken */ String, Unit]): Unit = js.native
  /** Creates a JSON Web Token signed with RS256 (SHA256 + RSA) */
  def jwtSignRS256(payload: js.Object): String = js.native
  @JSName("listeners")
  def listeners_end(event: end): js.Array[js.Function1[/* token */ Token, Unit]] = js.native
  @JSName("listeners")
  def listeners_error(event: error): js.Array[js.Function1[/* err */ Error, Unit]] = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_token(event: token, listener: js.Function1[/* token */ Token, Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_token(event: token, listener: js.Function1[/* token */ Token, Unit]): this.type = js.native
  /**
    * Custom POST request handler.
    * This is only needed to keep paths short in Windows – usually this module
    * is a dependency of a dependency and if it tries to require something
    * like the request module the paths get way too long to handle for Windows.
    * As we do only a simple POST request we do not actually require complicated
    * logic support (no redirects, no nothing) anyway.
    */
  def postRequest(
    url: String,
    payload: String,
    params: RequestParams,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Buffer, Unit]
  ): Unit = js.native
  def postRequest(
    url: String,
    payload: StringDictionary[String],
    params: RequestParams,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Buffer, Unit]
  ): Unit = js.native
  def postRequest(
    url: String,
    payload: Buffer,
    params: RequestParams,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Buffer, Unit]
  ): Unit = js.native
  def postRequest(
    url: String,
    payload: Readable,
    params: RequestParams,
    callback: js.Function2[/* err */ Error | Null, /* buf */ Buffer, Unit]
  ): Unit = js.native
  @JSName("prependListener")
  def prependListener_end(event: end, listener: js.Function1[/* token */ Token, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_end(event: end, listener: js.Function1[/* token */ Token, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  def toBase64URL(data: String): String = js.native
  /** Encodes a buffer or a string into Base64url format */
  def toBase64URL(data: Buffer): String = js.native
  /** Updates token values */
  def updateToken(accessToken: String, timeout: s): Token = js.native
}

