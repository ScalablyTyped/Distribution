package typings
package nockLib.nockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scope
  extends nodeLib.NodeJSNs.EventEmitter {
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
  def activeMocks(): js.Array[java.lang.String] = js.native
  def defaultReplyHeaders(headers: HttpHeaders): this.type = js.native
  def delete(uri: java.lang.String): Interceptor = js.native
  def delete(uri: java.lang.String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def delete(uri: java.lang.String, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
  def delete(uri: nockLib.Fn_Uri): Interceptor = js.native
  def delete(uri: nockLib.Fn_Uri, requestBody: RequestBodyMatcher): Interceptor = js.native
  def delete(uri: nockLib.Fn_Uri, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
  def delete(uri: stdLib.RegExp): Interceptor = js.native
  def delete(uri: stdLib.RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
  def delete(uri: stdLib.RegExp, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
  def done(): scala.Unit = js.native
  def filteringPath(fn: js.Function1[/* path */ java.lang.String, java.lang.String]): this.type = js.native
  def filteringPath(regex: stdLib.RegExp, replace: java.lang.String): this.type = js.native
  def filteringRequestBody(fn: js.Function1[/* body */ java.lang.String, java.lang.String]): this.type = js.native
  def filteringRequestBody(regex: stdLib.RegExp, replace: java.lang.String): this.type = js.native
  def get(uri: java.lang.String): Interceptor = js.native
  def get(uri: java.lang.String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def get(uri: java.lang.String, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
  def get(uri: nockLib.Fn_Uri): Interceptor = js.native
  def get(uri: nockLib.Fn_Uri, requestBody: RequestBodyMatcher): Interceptor = js.native
  def get(uri: nockLib.Fn_Uri, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
  def get(uri: stdLib.RegExp): Interceptor = js.native
  def get(uri: stdLib.RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
  def get(uri: stdLib.RegExp, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
  def head(uri: java.lang.String): Interceptor = js.native
  def head(uri: java.lang.String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def head(uri: java.lang.String, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
  def head(uri: nockLib.Fn_Uri): Interceptor = js.native
  def head(uri: nockLib.Fn_Uri, requestBody: RequestBodyMatcher): Interceptor = js.native
  def head(uri: nockLib.Fn_Uri, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
  def head(uri: stdLib.RegExp): Interceptor = js.native
  def head(uri: stdLib.RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
  def head(uri: stdLib.RegExp, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
  def intercept(uri: java.lang.String, method: java.lang.String): Interceptor = js.native
  def intercept(uri: java.lang.String, method: java.lang.String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def intercept(uri: java.lang.String, method: java.lang.String, requestBody: RequestBodyMatcher, options: Options): Interceptor = js.native
  def intercept(uri: nockLib.Fn_Uri, method: java.lang.String): Interceptor = js.native
  def intercept(uri: nockLib.Fn_Uri, method: java.lang.String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def intercept(uri: nockLib.Fn_Uri, method: java.lang.String, requestBody: RequestBodyMatcher, options: Options): Interceptor = js.native
  def intercept(uri: stdLib.RegExp, method: java.lang.String): Interceptor = js.native
  def intercept(uri: stdLib.RegExp, method: java.lang.String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def intercept(uri: stdLib.RegExp, method: java.lang.String, requestBody: RequestBodyMatcher, options: Options): Interceptor = js.native
  def isDone(): scala.Boolean = js.native
  def log(out: js.Function2[/* message */ js.Any, /* repeated */ js.Any, scala.Unit]): this.type = js.native
  def matchHeader(name: java.lang.String, value: java.lang.String): this.type = js.native
  def matchHeader(name: java.lang.String, value: nockLib.Fn_Value): this.type = js.native
  def matchHeader(name: java.lang.String, value: stdLib.RegExp): this.type = js.native
  def merge(uri: java.lang.String): Interceptor = js.native
  def merge(uri: java.lang.String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def merge(uri: java.lang.String, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
  def merge(uri: nockLib.Fn_Uri): Interceptor = js.native
  def merge(uri: nockLib.Fn_Uri, requestBody: RequestBodyMatcher): Interceptor = js.native
  def merge(uri: nockLib.Fn_Uri, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
  def merge(uri: stdLib.RegExp): Interceptor = js.native
  def merge(uri: stdLib.RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
  def merge(uri: stdLib.RegExp, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
  def options(uri: java.lang.String): Interceptor = js.native
  def options(uri: java.lang.String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def options(uri: java.lang.String, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
  def options(uri: nockLib.Fn_Uri): Interceptor = js.native
  def options(uri: nockLib.Fn_Uri, requestBody: RequestBodyMatcher): Interceptor = js.native
  def options(uri: nockLib.Fn_Uri, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
  def options(uri: stdLib.RegExp): Interceptor = js.native
  def options(uri: stdLib.RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
  def options(uri: stdLib.RegExp, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
  def patch(uri: java.lang.String): Interceptor = js.native
  def patch(uri: java.lang.String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def patch(uri: java.lang.String, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
  def patch(uri: nockLib.Fn_Uri): Interceptor = js.native
  def patch(uri: nockLib.Fn_Uri, requestBody: RequestBodyMatcher): Interceptor = js.native
  def patch(uri: nockLib.Fn_Uri, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
  def patch(uri: stdLib.RegExp): Interceptor = js.native
  def patch(uri: stdLib.RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
  def patch(uri: stdLib.RegExp, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
  def pendingMocks(): js.Array[java.lang.String] = js.native
  def persist(): this.type = js.native
  def persist(flag: scala.Boolean): this.type = js.native
  def post(uri: java.lang.String): Interceptor = js.native
  def post(uri: java.lang.String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def post(uri: java.lang.String, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
  def post(uri: nockLib.Fn_Uri): Interceptor = js.native
  def post(uri: nockLib.Fn_Uri, requestBody: RequestBodyMatcher): Interceptor = js.native
  def post(uri: nockLib.Fn_Uri, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
  def post(uri: stdLib.RegExp): Interceptor = js.native
  def post(uri: stdLib.RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
  def post(uri: stdLib.RegExp, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
  def put(uri: java.lang.String): Interceptor = js.native
  def put(uri: java.lang.String, requestBody: RequestBodyMatcher): Interceptor = js.native
  def put(uri: java.lang.String, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
  def put(uri: nockLib.Fn_Uri): Interceptor = js.native
  def put(uri: nockLib.Fn_Uri, requestBody: RequestBodyMatcher): Interceptor = js.native
  def put(uri: nockLib.Fn_Uri, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
  def put(uri: stdLib.RegExp): Interceptor = js.native
  def put(uri: stdLib.RegExp, requestBody: RequestBodyMatcher): Interceptor = js.native
  def put(uri: stdLib.RegExp, requestBody: RequestBodyMatcher, interceptorOptions: Options): Interceptor = js.native
  def replyContentLength(): this.type = js.native
  def replyDate(): this.type = js.native
  def replyDate(d: stdLib.Date): this.type = js.native
  def restore(): scala.Unit = js.native
  def shouldPersist(): scala.Boolean = js.native
}

