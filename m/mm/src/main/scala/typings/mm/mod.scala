package typings.mm

import typings.mm.anon.Host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(target: Any, key: String, prop: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(target.asInstanceOf[js.Any], key.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("mm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * mock return callback(null, data).
    */
  inline def data(mod: Any, method: String, data: Any): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("data")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  inline def data(mod: Any, method: String, data: Any, timeout: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("data")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], data.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  
  /**
    * mock return callback(null, data1, data2).
    */
  inline def datas(mod: Any, method: String, datas: Any): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("datas")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datas.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  inline def datas(mod: Any, method: String, datas: Any, timeout: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("datas")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], datas.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  
  /**
    * mock return callback(null, null).
    */
  inline def empty(mod: Any, method: String): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("empty")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  inline def empty(mod: Any, method: String, timeout: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("empty")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  
  /**
    * Mock async function error.
    */
  inline def error(mod: Any, method: String): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  inline def error(mod: Any, method: String, error: String): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  inline def error(mod: Any, method: String, error: String, props: js.Object): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  inline def error(mod: Any, method: String, error: String, props: js.Object, timeout: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any], props.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  inline def error(mod: Any, method: String, error: String, props: Unit, timeout: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any], props.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  inline def error(mod: Any, method: String, error: js.Error): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  inline def error(mod: Any, method: String, error: js.Error, props: js.Object): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  inline def error(mod: Any, method: String, error: js.Error, props: js.Object, timeout: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any], props.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  inline def error(mod: Any, method: String, error: js.Error, props: Unit, timeout: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any], props.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  inline def error(mod: Any, method: String, error: Unit, props: js.Object): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  inline def error(mod: Any, method: String, error: Unit, props: js.Object, timeout: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any], props.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  inline def error(mod: Any, method: String, error: Unit, props: Unit, timeout: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any], props.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  
  /**
    * Mock async function error once.
    */
  inline def errorOnce(mod: Any, method: String): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("errorOnce")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  inline def errorOnce(mod: Any, method: String, error: String): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("errorOnce")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  inline def errorOnce(mod: Any, method: String, error: String, props: js.Object): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("errorOnce")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  inline def errorOnce(mod: Any, method: String, error: String, props: js.Object, timeout: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("errorOnce")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any], props.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  inline def errorOnce(mod: Any, method: String, error: String, props: Unit, timeout: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("errorOnce")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any], props.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  inline def errorOnce(mod: Any, method: String, error: js.Error): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("errorOnce")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  inline def errorOnce(mod: Any, method: String, error: js.Error, props: js.Object): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("errorOnce")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  inline def errorOnce(mod: Any, method: String, error: js.Error, props: js.Object, timeout: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("errorOnce")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any], props.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  inline def errorOnce(mod: Any, method: String, error: js.Error, props: Unit, timeout: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("errorOnce")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any], props.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  inline def errorOnce(mod: Any, method: String, error: Unit, props: js.Object): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("errorOnce")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  inline def errorOnce(mod: Any, method: String, error: Unit, props: js.Object, timeout: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("errorOnce")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any], props.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  inline def errorOnce(mod: Any, method: String, error: Unit, props: Unit, timeout: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("errorOnce")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any], props.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[MockMate]
  
  object http {
    
    @JSImport("mm", "http")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mm", "http.request")
    @js.native
    def request: Request = js.native
    inline def request(url: String, data: Any): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def request(url: String, data: Any, headers: js.Object): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def request(url: String, data: Any, headers: js.Object, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def request(url: String, data: Any, headers: Unit, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def request(url: js.RegExp, data: Any): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def request(url: js.RegExp, data: Any, headers: js.Object): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def request(url: js.RegExp, data: Any, headers: js.Object, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def request(url: js.RegExp, data: Any, headers: Unit, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def request(url: Host, data: Any): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def request(url: Host, data: Any, headers: js.Object): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def request(url: Host, data: Any, headers: js.Object, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def request(url: Host, data: Any, headers: Unit, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    
    @JSImport("mm", "http.requestError")
    @js.native
    def requestError: RequestError = js.native
    inline def requestError(url: String, reqError: String, resError: String): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: String, reqError: String, resError: String, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: String, reqError: String, resError: js.Error): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: String, reqError: String, resError: js.Error, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: String, reqError: js.Error, resError: String): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: String, reqError: js.Error, resError: String, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: String, reqError: js.Error, resError: js.Error): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: String, reqError: js.Error, resError: js.Error, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: js.RegExp, reqError: String, resError: String): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: js.RegExp, reqError: String, resError: String, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: js.RegExp, reqError: String, resError: js.Error): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: js.RegExp, reqError: String, resError: js.Error, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: js.RegExp, reqError: js.Error, resError: String): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: js.RegExp, reqError: js.Error, resError: String, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: js.RegExp, reqError: js.Error, resError: js.Error): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: js.RegExp, reqError: js.Error, resError: js.Error, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: Host, reqError: String, resError: String): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: Host, reqError: String, resError: String, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: Host, reqError: String, resError: js.Error): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: Host, reqError: String, resError: js.Error, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: Host, reqError: js.Error, resError: String): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: Host, reqError: js.Error, resError: String, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: Host, reqError: js.Error, resError: js.Error): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: Host, reqError: js.Error, resError: js.Error, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError_=(x: RequestError): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestError")(x.asInstanceOf[js.Any])
    
    inline def request_=(x: Request): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("request")(x.asInstanceOf[js.Any])
  }
  
  object https {
    
    @JSImport("mm", "https")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mm", "https.request")
    @js.native
    def request: Request = js.native
    inline def request(url: String, data: Any): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def request(url: String, data: Any, headers: js.Object): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def request(url: String, data: Any, headers: js.Object, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def request(url: String, data: Any, headers: Unit, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def request(url: js.RegExp, data: Any): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def request(url: js.RegExp, data: Any, headers: js.Object): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def request(url: js.RegExp, data: Any, headers: js.Object, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def request(url: js.RegExp, data: Any, headers: Unit, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def request(url: Host, data: Any): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def request(url: Host, data: Any, headers: js.Object): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def request(url: Host, data: Any, headers: js.Object, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def request(url: Host, data: Any, headers: Unit, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    
    @JSImport("mm", "https.requestError")
    @js.native
    def requestError: RequestError = js.native
    inline def requestError(url: String, reqError: String, resError: String): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: String, reqError: String, resError: String, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: String, reqError: String, resError: js.Error): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: String, reqError: String, resError: js.Error, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: String, reqError: js.Error, resError: String): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: String, reqError: js.Error, resError: String, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: String, reqError: js.Error, resError: js.Error): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: String, reqError: js.Error, resError: js.Error, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: js.RegExp, reqError: String, resError: String): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: js.RegExp, reqError: String, resError: String, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: js.RegExp, reqError: String, resError: js.Error): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: js.RegExp, reqError: String, resError: js.Error, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: js.RegExp, reqError: js.Error, resError: String): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: js.RegExp, reqError: js.Error, resError: String, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: js.RegExp, reqError: js.Error, resError: js.Error): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: js.RegExp, reqError: js.Error, resError: js.Error, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: Host, reqError: String, resError: String): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: Host, reqError: String, resError: String, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: Host, reqError: String, resError: js.Error): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: Host, reqError: String, resError: js.Error, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: Host, reqError: js.Error, resError: String): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: Host, reqError: js.Error, resError: String, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: Host, reqError: js.Error, resError: js.Error): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError(url: Host, reqError: js.Error, resError: js.Error, delay: Double): MockMate = (^.asInstanceOf[js.Dynamic].applyDynamic("requestError")(url.asInstanceOf[js.Any], reqError.asInstanceOf[js.Any], resError.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[MockMate]
    inline def requestError_=(x: RequestError): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("requestError")(x.asInstanceOf[js.Any])
    
    inline def request_=(x: Request): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("request")(x.asInstanceOf[js.Any])
  }
  
  /**
    * remove all mock effects.
    */
  inline def restore(): MockMate = ^.asInstanceOf[js.Dynamic].applyDynamic("restore")().asInstanceOf[MockMate]
  
  /**
    * mock function sync return data
    */
  inline def syncData(mod: Any, method: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncData")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def syncData(mod: Any, method: String, data: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncData")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * mock function sync return nothing
    */
  inline def syncEmpty(mod: Any, method: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncEmpty")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * mock function sync throw error
    */
  inline def syncError(mod: Any, method: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncError")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def syncError(mod: Any, method: String, error: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncError")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def syncError(mod: Any, method: String, error: String, props: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncError")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def syncError(mod: Any, method: String, error: js.Error): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncError")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def syncError(mod: Any, method: String, error: js.Error, props: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncError")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def syncError(mod: Any, method: String, error: Unit, props: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncError")(mod.asInstanceOf[js.Any], method.asInstanceOf[js.Any], error.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  // export MockMate type for egg-mock;
  type MockMate = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof mm */ Any
  
  type Request = js.Function4[
    /* url */ String | js.RegExp | Host, 
    /* data */ Any, 
    /* headers */ js.UndefOr[js.Object], 
    /* delay */ js.UndefOr[Double], 
    MockMate
  ]
  
  type RequestError = js.Function4[
    /* url */ String | js.RegExp | Host, 
    /* reqError */ String | js.Error, 
    /* resError */ String | js.Error, 
    /* delay */ js.UndefOr[Double], 
    MockMate
  ]
}
