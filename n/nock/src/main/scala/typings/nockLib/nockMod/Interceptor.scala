package typings
package nockLib.nockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interceptor extends js.Object {
  def basicAuth(options: nockLib.Anon_Pass): this.type = js.native
  def delay(opts: nockLib.Anon_BodyHead): this.type = js.native
  def delay(opts: scala.Double): this.type = js.native
  def delayBody(timeMs: scala.Double): this.type = js.native
  def delayConnection(timeMs: scala.Double): this.type = js.native
  def getTotalDelay(): scala.Double = js.native
  def matchHeader(name: java.lang.String, value: java.lang.String): this.type = js.native
  def matchHeader(name: java.lang.String, value: nockLib.Anon_Value): this.type = js.native
  def matchHeader(name: java.lang.String, value: stdLib.RegExp): this.type = js.native
  def once(): this.type = js.native
  def optionally(): this.type = js.native
  def query(params: java.lang.String): this.type = js.native
  def query(params: nockLib.Anon_QueryObject): this.type = js.native
  def query(params: POJO): this.type = js.native
  def query(params: scala.Boolean): this.type = js.native
  def reply(
    callback: js.ThisFunction2[
      /* this */ ReplyCallbackContext, 
      /* uri */ java.lang.String, 
      /* body */ ReplyBody, 
      ReplyCallbackResult
    ]
  ): Scope = js.native
  // tslint (as of 5.16) is under the impression that the callback types can be unified,
  // however, doing so causes the params to lose their inherited types during use.
  /* tslint:disable:unified-signatures */
  def reply(
    callback: js.ThisFunction3[
      /* this */ ReplyCallbackContext, 
      /* uri */ java.lang.String, 
      /* body */ ReplyBody, 
      /* cb */ ReplyCallback, 
      scala.Unit
    ]
  ): Scope = js.native
  def reply(responseCode: scala.Double): Scope = js.native
  def reply(responseCode: scala.Double, body: ReplyBody): Scope = js.native
  def reply(responseCode: scala.Double, body: ReplyBody, headers: HttpHeaders): Scope = js.native
  def reply(
    responseCode: scala.Double,
    callback: js.ThisFunction2[
      /* this */ ReplyCallbackContext, 
      /* uri */ java.lang.String, 
      /* body */ ReplyBody, 
      ReplyCallbackResult
    ]
  ): Scope = js.native
  def reply(
    responseCode: scala.Double,
    callback: js.ThisFunction3[
      /* this */ ReplyCallbackContext, 
      /* uri */ java.lang.String, 
      /* body */ ReplyBody, 
      /* cb */ ReplyCallback, 
      scala.Unit
    ]
  ): Scope = js.native
  /* tslint:enable:unified-signatures */
  def replyWithError(errorMessage: java.lang.String): Scope = js.native
  def replyWithError(errorMessage: POJO): Scope = js.native
  def replyWithFile(responseCode: scala.Double, fileName: java.lang.String): Scope = js.native
  def replyWithFile(responseCode: scala.Double, fileName: java.lang.String, headers: HttpHeaders): Scope = js.native
  def socketDelay(timeMs: scala.Double): this.type = js.native
  def thrice(): this.type = js.native
  def times(newCounter: scala.Double): this.type = js.native
  def twice(): this.type = js.native
}

