package typings.pixiCore

import typings.pixiCore.anon.Size
import typings.pixiCore.anon.SyncFunc
import typings.pixiCore.libShaderProgramMod.IUniformData
import typings.pixiCore.libShaderUniformGroupMod.UniformGroup
import typings.pixiUtils.libTypesMod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libShaderUtilsGenerateUniformBufferSyncMod {
  
  @JSImport("@pixi/core/lib/shader/utils/generateUniformBufferSync", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createUBOElements(uniformData: js.Array[IUniformData]): Size = ^.asInstanceOf[js.Dynamic].applyDynamic("createUBOElements")(uniformData.asInstanceOf[js.Any]).asInstanceOf[Size]
  
  inline def generateUniformBufferSync(group: UniformGroup[Dict[Any]], uniformData: Dict[Any]): SyncFunc = (^.asInstanceOf[js.Dynamic].applyDynamic("generateUniformBufferSync")(group.asInstanceOf[js.Any], uniformData.asInstanceOf[js.Any])).asInstanceOf[SyncFunc]
  
  inline def getUBOData(uniforms: Dict[Any], uniformData: Dict[Any]): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUBOData")(uniforms.asInstanceOf[js.Any], uniformData.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  trait UBOElement extends StObject {
    
    var data: IUniformData
    
    var dataLen: Double
    
    var dirty: Double
    
    var offset: Double
  }
  object UBOElement {
    
    inline def apply(data: IUniformData, dataLen: Double, dirty: Double, offset: Double): UBOElement = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataLen = dataLen.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[UBOElement]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UBOElement] (val x: Self) extends AnyVal {
      
      inline def setData(value: IUniformData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataLen(value: Double): Self = StObject.set(x, "dataLen", value.asInstanceOf[js.Any])
      
      inline def setDirty(value: Double): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UniformsSyncCallback extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
}
