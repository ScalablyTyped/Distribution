package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTime extends StObject {
  
  var createTime: Double
  
  var updateLastFrameTime: Double
}
object CreateTime {
  
  inline def apply(createTime: Double, updateLastFrameTime: Double): CreateTime = {
    val __obj = js.Dynamic.literal(createTime = createTime.asInstanceOf[js.Any], updateLastFrameTime = updateLastFrameTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTime]
  }
  
  extension [Self <: CreateTime](x: Self) {
    
    inline def setCreateTime(value: Double): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateLastFrameTime(value: Double): Self = StObject.set(x, "updateLastFrameTime", value.asInstanceOf[js.Any])
  }
}
