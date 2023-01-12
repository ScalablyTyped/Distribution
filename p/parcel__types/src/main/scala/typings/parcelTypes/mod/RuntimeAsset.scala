package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeAsset extends StObject {
  
  val code: String
  
  val dependency: js.UndefOr[Dependency] = js.undefined
  
  val env: js.UndefOr[EnvironmentOptions] = js.undefined
  
  val filePath: FilePath
  
  val isEntry: js.UndefOr[Boolean] = js.undefined
}
object RuntimeAsset {
  
  inline def apply(code: String, filePath: FilePath): RuntimeAsset = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimeAsset]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuntimeAsset] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setDependency(value: Dependency): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    inline def setDependencyUndefined: Self = StObject.set(x, "dependency", js.undefined)
    
    inline def setEnv(value: EnvironmentOptions): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setFilePath(value: FilePath): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setIsEntry(value: Boolean): Self = StObject.set(x, "isEntry", value.asInstanceOf[js.Any])
    
    inline def setIsEntryUndefined: Self = StObject.set(x, "isEntry", js.undefined)
  }
}
