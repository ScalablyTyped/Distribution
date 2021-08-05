package typings.minappEnv.wx

import typings.minappEnv.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStorageInfoSuccessCallbackOption extends StObject {
  
  /** 当前占用的空间大小, 单位 KB */
  var currentSize: Double
  
  /** 当前 storage 中所有的 key */
  var keys: Array[String]
  
  /** 限制的空间大小，单位 KB */
  var limitSize: Double
}
object GetStorageInfoSuccessCallbackOption {
  
  inline def apply(currentSize: Double, keys: Array[String], limitSize: Double): GetStorageInfoSuccessCallbackOption = {
    val __obj = js.Dynamic.literal(currentSize = currentSize.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], limitSize = limitSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStorageInfoSuccessCallbackOption]
  }
  
  extension [Self <: GetStorageInfoSuccessCallbackOption](x: Self) {
    
    inline def setCurrentSize(value: Double): Self = StObject.set(x, "currentSize", value.asInstanceOf[js.Any])
    
    inline def setKeys(value: Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setLimitSize(value: Double): Self = StObject.set(x, "limitSize", value.asInstanceOf[js.Any])
  }
}
