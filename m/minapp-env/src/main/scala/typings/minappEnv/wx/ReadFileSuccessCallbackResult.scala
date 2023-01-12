package typings.minappEnv.wx

import typings.minappEnv.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadFileSuccessCallbackResult extends StObject {
  
  /** 文件内容 */
  var data: String | ArrayBuffer
}
object ReadFileSuccessCallbackResult {
  
  inline def apply(data: String | ArrayBuffer): ReadFileSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadFileSuccessCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadFileSuccessCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setData(value: String | ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
