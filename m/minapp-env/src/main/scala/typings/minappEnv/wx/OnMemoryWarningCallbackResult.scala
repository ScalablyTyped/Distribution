package typings.minappEnv.wx

import typings.minappEnv.minappEnvInts.`10`
import typings.minappEnv.minappEnvInts.`15`
import typings.minappEnv.minappEnvInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnMemoryWarningCallbackResult extends StObject {
  
  /** 内存告警等级，只有 Android 才有，对应系统宏定义
    *
    * 可选值：
    * - 5: TRIM_MEMORY_RUNNING_MODERATE;
    * - 10: TRIM_MEMORY_RUNNING_LOW;
    * - 15: TRIM_MEMORY_RUNNING_CRITICAL; */
  var level: `5` | `10` | `15`
}
object OnMemoryWarningCallbackResult {
  
  inline def apply(level: `5` | `10` | `15`): OnMemoryWarningCallbackResult = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnMemoryWarningCallbackResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnMemoryWarningCallbackResult] (val x: Self) extends AnyVal {
    
    inline def setLevel(value: `5` | `10` | `15`): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
