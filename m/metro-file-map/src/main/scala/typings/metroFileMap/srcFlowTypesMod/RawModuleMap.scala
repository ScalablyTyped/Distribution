package typings.metroFileMap.srcFlowTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawModuleMap extends StObject {
  
  var duplicates: DuplicatesIndex
  
  var map: ModuleMapData
  
  var mocks: MockData
  
  var rootDir: Path
}
object RawModuleMap {
  
  inline def apply(duplicates: DuplicatesIndex, map: ModuleMapData, mocks: MockData, rootDir: Path): RawModuleMap = {
    val __obj = js.Dynamic.literal(duplicates = duplicates.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mocks = mocks.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawModuleMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RawModuleMap] (val x: Self) extends AnyVal {
    
    inline def setDuplicates(value: DuplicatesIndex): Self = StObject.set(x, "duplicates", value.asInstanceOf[js.Any])
    
    inline def setMap(value: ModuleMapData): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMocks(value: MockData): Self = StObject.set(x, "mocks", value.asInstanceOf[js.Any])
    
    inline def setRootDir(value: Path): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
  }
}
