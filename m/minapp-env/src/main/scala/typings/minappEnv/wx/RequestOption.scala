package typings.minappEnv.wx

import typings.minappEnv.ArrayBuffer
import typings.minappEnv.minappEnvStrings.CONNECT
import typings.minappEnv.minappEnvStrings.DELETE
import typings.minappEnv.minappEnvStrings.GET
import typings.minappEnv.minappEnvStrings.HEAD
import typings.minappEnv.minappEnvStrings.OPTIONS
import typings.minappEnv.minappEnvStrings.POST
import typings.minappEnv.minappEnvStrings.PUT
import typings.minappEnv.minappEnvStrings.TRACE
import typings.minappEnv.minappEnvStrings.arraybuffer_
import typings.minappEnv.minappEnvStrings.json_
import typings.minappEnv.minappEnvStrings.text
import typings.minappEnv.minappEnvStrings.其他
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[RequestCompleteCallback] = js.undefined
  /** 请求的参数 */
  var data: js.UndefOr[String | js.Object | ArrayBuffer] = js.undefined
  /** 返回的数据格式
    *
    * 可选值：
    * - 'json': 返回的数据为 JSON，返回后会对返回的数据进行一次 JSON.parse;
    * - '其他': 不对返回的内容进行 JSON.parse; */
  var dataType: js.UndefOr[json_ | 其他] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[RequestFailCallback] = js.undefined
  /** 设置请求的 header，header 中不能设置 Referer。
    *
    * `content-type` 默认为 `application/json` */
  var header: js.UndefOr[js.Object] = js.undefined
  /** HTTP 请求方法
    *
    * 可选值：
    * - 'OPTIONS': HTTP 请求 OPTIONS;
    * - 'GET': HTTP 请求 GET;
    * - 'HEAD': HTTP 请求 HEAD;
    * - 'POST': HTTP 请求 POST;
    * - 'PUT': HTTP 请求 PUT;
    * - 'DELETE': HTTP 请求 DELETE;
    * - 'TRACE': HTTP 请求 TRACE;
    * - 'CONNECT': HTTP 请求 CONNECT; */
  var method: js.UndefOr[OPTIONS | GET | HEAD | POST | PUT | DELETE | TRACE | CONNECT] = js.undefined
  /** 响应的数据类型
    *
    * 可选值：
    * - 'text': 响应的数据为文本;
    * - 'arraybuffer': 响应的数据为 ArrayBuffer;
    *
    * 最低基础库： `1.7.0` */
  var responseType: js.UndefOr[text | arraybuffer_] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[RequestSuccessCallback] = js.undefined
  /** 开发者服务器接口地址 */
  var url: String
}

object RequestOption {
  @scala.inline
  def apply(
    url: String,
    complete: /* res */ GeneralCallbackResult => Unit = null,
    data: String | js.Object | ArrayBuffer = null,
    dataType: json_ | 其他 = null,
    fail: /* res */ GeneralCallbackResult => Unit = null,
    header: js.Object = null,
    method: OPTIONS | GET | HEAD | POST | PUT | DELETE | TRACE | CONNECT = null,
    responseType: text | arraybuffer_ = null,
    success: /* result */ RequestSuccessCallbackResult => Unit = null
  ): RequestOption = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[RequestOption]
  }
}

