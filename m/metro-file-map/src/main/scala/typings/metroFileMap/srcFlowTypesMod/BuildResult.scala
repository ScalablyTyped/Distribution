package typings.metroFileMap.srcFlowTypesMod

import typings.metroFileMap.srcModuleMapMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildResult extends StObject {
  
  var fileSystem: FileSystem
  
  var hasteModuleMap: default
}
object BuildResult {
  
  inline def apply(fileSystem: FileSystem, hasteModuleMap: default): BuildResult = {
    val __obj = js.Dynamic.literal(fileSystem = fileSystem.asInstanceOf[js.Any], hasteModuleMap = hasteModuleMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildResult] (val x: Self) extends AnyVal {
    
    inline def setFileSystem(value: FileSystem): Self = StObject.set(x, "fileSystem", value.asInstanceOf[js.Any])
    
    inline def setHasteModuleMap(value: default): Self = StObject.set(x, "hasteModuleMap", value.asInstanceOf[js.Any])
  }
}
