package typings.nock.mod

import typings.nock.anon.Pass
import typings.node.NodeJS.ErrnoException
import typings.node.querystringMod.ParsedUrlQuery
import typings.node.urlMod.URLSearchParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Interceptor extends js.Object {
  
  def basicAuth(options: Pass): this.type = js.native
  
  def delay(opts: Double): this.type = js.native
  def delay(opts: typings.nock.anon.Body): this.type = js.native
  
  def delayBody(timeMs: Double): this.type = js.native
  
  def delayConnection(timeMs: Double): this.type = js.native
  
  def matchHeader(name: String, value: RequestHeaderMatcher): this.type = js.native
  
  def once(): this.type = js.native
  
  def optionally(): this.type = js.native
  
  def query(matcher: String): this.type = js.native
  def query(matcher: js.Function1[/* parsedObj */ ParsedUrlQuery, Boolean]): this.type = js.native
  def query(matcher: Boolean): this.type = js.native
  def query(matcher: DataMatcherMap): this.type = js.native
  def query(matcher: URLSearchParams): this.type = js.native
  
  def reply(): Scope = js.native
  // tslint (as of 5.16) is under the impression that the callback types can be unified,
  // however, doing so causes the params to lose their inherited types during use.
  // the order of the overrides is important for determining the param types in the replay fns.
  /* tslint:disable:unified-signatures */
  def reply(
    replyFnWithCallback: js.ThisFunction3[
      /* this */ ReplyFnContext, 
      /* uri */ String, 
      /* body */ Body, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ ReplyFnResult, Unit], 
      Unit
    ]
  ): Scope = js.native
  def reply(
    replyFn: js.ThisFunction2[
      /* this */ ReplyFnContext, 
      /* uri */ String, 
      /* body */ Body, 
      ReplyFnResult | js.Promise[ReplyFnResult]
    ]
  ): Scope = js.native
  def reply(responseCode: js.UndefOr[scala.Nothing], body: js.UndefOr[Body], headers: ReplyHeaders): Scope = js.native
  def reply(responseCode: js.UndefOr[scala.Nothing], body: Body): Scope = js.native
  def reply(responseCode: StatusCode): Scope = js.native
  def reply(responseCode: StatusCode, body: js.UndefOr[Body], headers: ReplyHeaders): Scope = js.native
  def reply(responseCode: StatusCode, body: Body): Scope = js.native
  def reply(
    statusCode: StatusCode,
    replyBodyFnWithCallback: js.ThisFunction3[
      /* this */ ReplyFnContext, 
      /* uri */ String, 
      /* body */ Body, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ ReplyBody, Unit], 
      Unit
    ]
  ): Scope = js.native
  def reply(
    statusCode: StatusCode,
    replyBodyFnWithCallback: js.ThisFunction3[
      /* this */ ReplyFnContext, 
      /* uri */ String, 
      /* body */ Body, 
      /* callback */ js.Function2[/* err */ ErrnoException | Null, /* result */ ReplyBody, Unit], 
      Unit
    ],
    headers: ReplyHeaders
  ): Scope = js.native
  def reply(
    statusCode: StatusCode,
    replyBodyFn: js.ThisFunction2[
      /* this */ ReplyFnContext, 
      /* uri */ String, 
      /* body */ Body, 
      ReplyBody | js.Promise[ReplyBody]
    ]
  ): Scope = js.native
  def reply(
    statusCode: StatusCode,
    replyBodyFn: js.ThisFunction2[
      /* this */ ReplyFnContext, 
      /* uri */ String, 
      /* body */ Body, 
      ReplyBody | js.Promise[ReplyBody]
    ],
    headers: ReplyHeaders
  ): Scope = js.native
  
  /* tslint:enable:unified-signatures */
  def replyWithError(errorMessage: String): Scope = js.native
  def replyWithError(errorMessage: js.Object): Scope = js.native
  
  def replyWithFile(statusCode: StatusCode, fileName: String): Scope = js.native
  def replyWithFile(statusCode: StatusCode, fileName: String, headers: ReplyHeaders): Scope = js.native
  
  def thrice(): this.type = js.native
  
  def times(newCounter: Double): this.type = js.native
  
  def twice(): this.type = js.native
}
