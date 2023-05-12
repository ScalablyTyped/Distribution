package typings.photoshop.domCoreModulesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUInfo extends StObject {
  
  /**
    * @minVersion 23.0
    */
  var clgpuInfoList: js.UndefOr[js.Array[OpenCLDeviceInfo]] = js.undefined
  
  /**
    * @minVersion 23.0
    */
  var gpuInfoList: js.UndefOr[js.Array[OpenGLDeviceInfo]] = js.undefined
}
object GPUInfo {
  
  inline def apply(): GPUInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUInfo] (val x: Self) extends AnyVal {
    
    inline def setClgpuInfoList(value: js.Array[OpenCLDeviceInfo]): Self = StObject.set(x, "clgpuInfoList", value.asInstanceOf[js.Any])
    
    inline def setClgpuInfoListUndefined: Self = StObject.set(x, "clgpuInfoList", js.undefined)
    
    inline def setClgpuInfoListVarargs(value: OpenCLDeviceInfo*): Self = StObject.set(x, "clgpuInfoList", js.Array(value*))
    
    inline def setGpuInfoList(value: js.Array[OpenGLDeviceInfo]): Self = StObject.set(x, "gpuInfoList", value.asInstanceOf[js.Any])
    
    inline def setGpuInfoListUndefined: Self = StObject.set(x, "gpuInfoList", js.undefined)
    
    inline def setGpuInfoListVarargs(value: OpenGLDeviceInfo*): Self = StObject.set(x, "gpuInfoList", js.Array(value*))
  }
}
