package typings
package nodemailerLib.libXoauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XOAuth2
  extends nodeLib.streamMod.Stream {
  var accessToken: java.lang.String | nodemailerLib.nodemailerLibNumbers.`false` = js.native
  var expires: scala.Double = js.native
  var logger: nodemailerLib.libSharedMod.Logger = js.native
  var options: nodemailerLib.libXoauth2Mod.XOAuth2Ns.Options = js.native
  @JSName("addListener")
  def addListener_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_token(
    event: nodemailerLib.nodemailerLibStrings.token,
    listener: js.Function1[/* token */ nodemailerLib.libXoauth2Mod.XOAuth2Ns.Token, scala.Unit]
  ): this.type = js.native
  /** Converts an access_token and user id into a base64 encoded XOAuth2 token */
  def buildXOAuth2Token(accessToken: java.lang.String): java.lang.String = js.native
  @JSName("emit")
  def emit_error(event: nodemailerLib.nodemailerLibStrings.error, error: nodeLib.Error): scala.Boolean = js.native
  @JSName("emit")
  def emit_token(
    event: nodemailerLib.nodemailerLibStrings.token,
    token: nodemailerLib.libXoauth2Mod.XOAuth2Ns.Token
  ): scala.Boolean = js.native
  /** Generates a new XOAuth2 token with the credentials provided at initialization */
  def generateToken(
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* accessToken */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /** Returns or generates (if previous has expired) a XOAuth2 token */
  def getToken(
    renew: scala.Boolean,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* accessToken */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /** Creates a JSON Web Token signed with RS256 (SHA256 + RSA) */
  def jwtSignRS256(payload: js.Object): java.lang.String = js.native
  @JSName("listeners")
  def listeners_end(event: nodemailerLib.nodemailerLibStrings.end): js.Array[
    js.Function1[/* token */ nodemailerLib.libXoauth2Mod.XOAuth2Ns.Token, scala.Unit]
  ] = js.native
  @JSName("listeners")
  def listeners_error(event: nodemailerLib.nodemailerLibStrings.error): js.Array[js.Function1[/* err */ nodeLib.Error, scala.Unit]] = js.native
  @JSName("on")
  def on_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_token(
    event: nodemailerLib.nodemailerLibStrings.token,
    listener: js.Function1[/* token */ nodemailerLib.libXoauth2Mod.XOAuth2Ns.Token, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_token(
    event: nodemailerLib.nodemailerLibStrings.token,
    listener: js.Function1[/* token */ nodemailerLib.libXoauth2Mod.XOAuth2Ns.Token, scala.Unit]
  ): this.type = js.native
  /**
    * Custom POST request handler.
    * This is only needed to keep paths short in Windows – usually this module
    * is a dependency of a dependency and if it tries to require something
    * like the request module the paths get way too long to handle for Windows.
    * As we do only a simple POST request we do not actually require complicated
    * logic support (no redirects, no nothing) anyway.
    */
  def postRequest(
    url: java.lang.String,
    payload: java.lang.String,
    params: nodemailerLib.libXoauth2Mod.XOAuth2Ns.RequestParams,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def postRequest(
    url: java.lang.String,
    payload: nodeLib.Buffer,
    params: nodemailerLib.libXoauth2Mod.XOAuth2Ns.RequestParams,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def postRequest(
    url: java.lang.String,
    payload: nodeLib.streamMod.Readable,
    params: nodemailerLib.libXoauth2Mod.XOAuth2Ns.RequestParams,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def postRequest(
    url: java.lang.String,
    payload: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    params: nodemailerLib.libXoauth2Mod.XOAuth2Ns.RequestParams,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  @JSName("prependListener")
  def prependListener_end(
    event: nodemailerLib.nodemailerLibStrings.end,
    listener: js.Function1[/* token */ nodemailerLib.libXoauth2Mod.XOAuth2Ns.Token, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_end(
    event: nodemailerLib.nodemailerLibStrings.end,
    listener: js.Function1[/* token */ nodemailerLib.libXoauth2Mod.XOAuth2Ns.Token, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(
    event: nodemailerLib.nodemailerLibStrings.error,
    listener: js.Function1[/* err */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  def toBase64URL(data: java.lang.String): java.lang.String = js.native
  /** Encodes a buffer or a string into Base64url format */
  def toBase64URL(data: nodeLib.Buffer): java.lang.String = js.native
  /** Updates token values */
  def updateToken(accessToken: java.lang.String, timeout: s): nodemailerLib.libXoauth2Mod.XOAuth2Ns.Token = js.native
}

