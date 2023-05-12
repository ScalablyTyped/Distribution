package typings.metroFileMap.srcFlowTypesMod

import typings.std.ReadonlyMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  rootDir :metro-file-map.metro-file-map/src/flow-types.Path,   duplicates :std.ReadonlyMap<string, std.ReadonlyMap<string, std.ReadonlyMap<string, number>>>,   map :std.ReadonlyMap<string, metro-file-map.metro-file-map/src/flow-types.ModuleMapItem>,   mocks :std.ReadonlyMap<string, metro-file-map.metro-file-map/src/flow-types.Path>}> */
trait ReadOnlyRawModuleMap extends StObject {
  
  val duplicates: ReadonlyMap[String, ReadonlyMap[String, ReadonlyMap[String, Double]]]
  
  val map: ReadonlyMap[String, ModuleMapItem]
  
  val mocks: ReadonlyMap[String, Path]
  
  val rootDir: Path
}
object ReadOnlyRawModuleMap {
  
  inline def apply(
    duplicates: ReadonlyMap[String, ReadonlyMap[String, ReadonlyMap[String, Double]]],
    map: ReadonlyMap[String, ModuleMapItem],
    mocks: ReadonlyMap[String, Path],
    rootDir: Path
  ): ReadOnlyRawModuleMap = {
    val __obj = js.Dynamic.literal(duplicates = duplicates.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], mocks = mocks.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadOnlyRawModuleMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadOnlyRawModuleMap] (val x: Self) extends AnyVal {
    
    inline def setDuplicates(value: ReadonlyMap[String, ReadonlyMap[String, ReadonlyMap[String, Double]]]): Self = StObject.set(x, "duplicates", value.asInstanceOf[js.Any])
    
    inline def setMap(value: ReadonlyMap[String, ModuleMapItem]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMocks(value: ReadonlyMap[String, Path]): Self = StObject.set(x, "mocks", value.asInstanceOf[js.Any])
    
    inline def setRootDir(value: Path): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
  }
}
