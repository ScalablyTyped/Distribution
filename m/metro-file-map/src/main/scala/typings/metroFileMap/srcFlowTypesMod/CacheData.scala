package typings.metroFileMap.srcFlowTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheData extends StObject {
  
  val clocks: WatchmanClocks
  
  val duplicates: DuplicatesIndex
  
  val files: FileData
  
  val map: ModuleMapData
  
  val mocks: MockData
}
object CacheData {
  
  inline def apply(
    clocks: WatchmanClocks,
    duplicates: DuplicatesIndex,
    files: FileData,
    map: ModuleMapData,
    mocks: MockData
  ): CacheData = {
    val __obj = js.Dynamic.literal(clocks = clocks.asInstanceOf[js.Any], duplicates = duplicates.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mocks = mocks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CacheData] (val x: Self) extends AnyVal {
    
    inline def setClocks(value: WatchmanClocks): Self = StObject.set(x, "clocks", value.asInstanceOf[js.Any])
    
    inline def setDuplicates(value: DuplicatesIndex): Self = StObject.set(x, "duplicates", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: FileData): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setMap(value: ModuleMapData): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMocks(value: MockData): Self = StObject.set(x, "mocks", value.asInstanceOf[js.Any])
  }
}
