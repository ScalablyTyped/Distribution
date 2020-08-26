package typings.nock.mod

import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.std.Date
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scope extends EventEmitter {
  @JSName("delete")
  var delete_Original: InterceptFunction = js.native
  @JSName("get")
  var get_Original: InterceptFunction = js.native
  @JSName("head")
  var head_Original: InterceptFunction = js.native
  @JSName("merge")
  var merge_Original: InterceptFunction = js.native
  @JSName("options")
  var options_Original: InterceptFunction = js.native
  @JSName("patch")
  var patch_Original: InterceptFunction = js.native
  @JSName("post")
  var post_Original: InterceptFunction = js.native
  @JSName("put")
  var put_Original: InterceptFunction = js.native
  def activeMocks(): js.Array[String] = js.native
  def defaultReplyHeaders(headers: ReplyHeaders): this.type = js.native
  def delete(uri: String): Interceptor = js.native
  def delete(uri: String, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def delete(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def delete(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
  def delete(
    uri: js.Function1[/* uri */ String, Boolean],
    requestBody: js.UndefOr[RequestBodyMatcher],
    interceptorOptions: Options
  ): Interceptor = js.native
  def delete(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
  def delete(uri: RegExp): Interceptor = js.native
  def delete(uri: RegExp, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def delete(uri: RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
  def done(): Unit = js.native
  def filteringPath(fn: js.Function1[/* path */ String, String]): this.type = js.native
  def filteringPath(regex: RegExp, replace: String): this.type = js.native
  def filteringRequestBody(fn: js.Function1[/* body */ String, String]): this.type = js.native
  def filteringRequestBody(regex: RegExp, replace: String): this.type = js.native
  def get(uri: String): Interceptor = js.native
  def get(uri: String, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def get(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def get(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
  def get(
    uri: js.Function1[/* uri */ String, Boolean],
    requestBody: js.UndefOr[RequestBodyMatcher],
    interceptorOptions: Options
  ): Interceptor = js.native
  def get(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
  def get(uri: RegExp): Interceptor = js.native
  def get(uri: RegExp, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def get(uri: RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
  def head(uri: String): Interceptor = js.native
  def head(uri: String, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def head(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def head(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
  def head(
    uri: js.Function1[/* uri */ String, Boolean],
    requestBody: js.UndefOr[RequestBodyMatcher],
    interceptorOptions: Options
  ): Interceptor = js.native
  def head(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
  def head(uri: RegExp): Interceptor = js.native
  def head(uri: RegExp, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def head(uri: RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
  def intercept(uri: String, method: String): Interceptor = js.native
  def intercept(uri: String, method: String, requestBody: js.UndefOr[RequestBodyMatcher], options: Options): Interceptor = js.native
  def intercept(uri: String, method: String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def intercept(uri: js.Function1[/* uri */ String, Boolean], method: String): Interceptor = js.native
  def intercept(
    uri: js.Function1[/* uri */ String, Boolean],
    method: String,
    requestBody: js.UndefOr[RequestBodyMatcher],
    options: Options
  ): Interceptor = js.native
  def intercept(uri: js.Function1[/* uri */ String, Boolean], method: String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def intercept(uri: RegExp, method: String): Interceptor = js.native
  def intercept(uri: RegExp, method: String, requestBody: js.UndefOr[RequestBodyMatcher], options: Options): Interceptor = js.native
  def intercept(uri: RegExp, method: String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def isDone(): Boolean = js.native
  def matchHeader(name: String, value: RequestHeaderMatcher): this.type = js.native
  def merge(uri: String): Interceptor = js.native
  def merge(uri: String, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def merge(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def merge(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
  def merge(
    uri: js.Function1[/* uri */ String, Boolean],
    requestBody: js.UndefOr[RequestBodyMatcher],
    interceptorOptions: Options
  ): Interceptor = js.native
  def merge(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
  def merge(uri: RegExp): Interceptor = js.native
  def merge(uri: RegExp, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def merge(uri: RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
  def options(uri: String): Interceptor = js.native
  def options(uri: String, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def options(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def options(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
  def options(
    uri: js.Function1[/* uri */ String, Boolean],
    requestBody: js.UndefOr[RequestBodyMatcher],
    interceptorOptions: Options
  ): Interceptor = js.native
  def options(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
  def options(uri: RegExp): Interceptor = js.native
  def options(uri: RegExp, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def options(uri: RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
  def patch(uri: String): Interceptor = js.native
  def patch(uri: String, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def patch(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def patch(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
  def patch(
    uri: js.Function1[/* uri */ String, Boolean],
    requestBody: js.UndefOr[RequestBodyMatcher],
    interceptorOptions: Options
  ): Interceptor = js.native
  def patch(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
  def patch(uri: RegExp): Interceptor = js.native
  def patch(uri: RegExp, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def patch(uri: RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
  def pendingMocks(): js.Array[String] = js.native
  def persist(): this.type = js.native
  def persist(flag: Boolean): this.type = js.native
  def post(uri: String): Interceptor = js.native
  def post(uri: String, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def post(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def post(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
  def post(
    uri: js.Function1[/* uri */ String, Boolean],
    requestBody: js.UndefOr[RequestBodyMatcher],
    interceptorOptions: Options
  ): Interceptor = js.native
  def post(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
  def post(uri: RegExp): Interceptor = js.native
  def post(uri: RegExp, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def post(uri: RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
  def put(uri: String): Interceptor = js.native
  def put(uri: String, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def put(uri: String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def put(uri: js.Function1[/* uri */ String, Boolean]): Interceptor = js.native
  def put(
    uri: js.Function1[/* uri */ String, Boolean],
    requestBody: js.UndefOr[RequestBodyMatcher],
    interceptorOptions: Options
  ): Interceptor = js.native
  def put(uri: js.Function1[/* uri */ String, Boolean], requestBody: RequestBodyMatcher): Interceptor = js.native
  def put(uri: RegExp): Interceptor = js.native
  def put(uri: RegExp, requestBody: js.UndefOr[RequestBodyMatcher], interceptorOptions: Options): Interceptor = js.native
  def put(uri: RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
  def replyContentLength(): this.type = js.native
  def replyDate(): this.type = js.native
  def replyDate(d: Date): this.type = js.native
}

