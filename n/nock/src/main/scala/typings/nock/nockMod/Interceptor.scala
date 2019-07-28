package typings.nock.nockMod

import typings.nock.Anon_Body
import typings.nock.Anon_Pass
import typings.nock.Fn_QueryObject
import typings.nock.Fn_Value
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Interceptor extends js.Object {
  def basicAuth(options: Anon_Pass): this.type = js.native
  def delay(opts: Double): this.type = js.native
  def delay(opts: Anon_Body): this.type = js.native
  def delayBody(timeMs: Double): this.type = js.native
  def delayConnection(timeMs: Double): this.type = js.native
  def getTotalDelay(): Double = js.native
  def matchHeader(name: String, value: String): this.type = js.native
  def matchHeader(name: String, value: Fn_Value): this.type = js.native
  def matchHeader(name: String, value: RegExp): this.type = js.native
  def once(): this.type = js.native
  def optionally(): this.type = js.native
  def query(params: String): this.type = js.native
  def query(params: Boolean): this.type = js.native
  def query(params: Fn_QueryObject): this.type = js.native
  def query(params: POJO): this.type = js.native
  def reply(
    callback: js.ThisFunction2[
      /* this */ ReplyCallbackContext, 
      /* uri */ String, 
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
      /* uri */ String, 
      /* body */ ReplyBody, 
      /* cb */ ReplyCallback, 
      Unit
    ]
  ): Scope = js.native
  def reply(responseCode: Double): Scope = js.native
  def reply(responseCode: Double, body: ReplyBody): Scope = js.native
  def reply(responseCode: Double, body: ReplyBody, headers: HttpHeaders): Scope = js.native
  def reply(
    responseCode: Double,
    callback: js.ThisFunction2[
      /* this */ ReplyCallbackContext, 
      /* uri */ String, 
      /* body */ ReplyBody, 
      ReplyCallbackResult
    ]
  ): Scope = js.native
  def reply(
    responseCode: Double,
    callback: js.ThisFunction3[
      /* this */ ReplyCallbackContext, 
      /* uri */ String, 
      /* body */ ReplyBody, 
      /* cb */ ReplyCallback, 
      Unit
    ]
  ): Scope = js.native
  /* tslint:enable:unified-signatures */
  def replyWithError(errorMessage: String): Scope = js.native
  def replyWithError(errorMessage: POJO): Scope = js.native
  def replyWithFile(responseCode: Double, fileName: String): Scope = js.native
  def replyWithFile(responseCode: Double, fileName: String, headers: HttpHeaders): Scope = js.native
  def socketDelay(timeMs: Double): this.type = js.native
  def thrice(): this.type = js.native
  def times(newCounter: Double): this.type = js.native
  def twice(): this.type = js.native
}

