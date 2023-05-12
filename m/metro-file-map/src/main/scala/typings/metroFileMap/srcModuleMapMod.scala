package typings.metroFileMap

import typings.metroFileMap.srcFlowTypesMod.IModuleMap
import typings.metroFileMap.srcFlowTypesMod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModuleMapMod {
  
  @JSImport("metro-file-map/src/ModuleMap", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ModuleMap
  /* static members */
  object default {
    
    @JSImport("metro-file-map/src/ModuleMap", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(rootDir: Path): ModuleMap = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(rootDir.asInstanceOf[js.Any]).asInstanceOf[ModuleMap]
  }
  
  @js.native
  trait ModuleMap
    extends StObject
       with IModuleMap
}
