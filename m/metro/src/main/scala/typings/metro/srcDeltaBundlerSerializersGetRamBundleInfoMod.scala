package typings.metro

import typings.metro.anon.ReadonlyModuleTransportLi
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDeltaBundlerSerializersGetRamBundleInfoMod {
  
  trait RamBundleInfo extends StObject {
    
    def getDependencies(filePath: String): Set[String]
    
    var groups: Map[Double, Set[Double]]
    
    var lazyModules: ReadonlyModuleTransportLi
    
    var startupModules: ReadonlyModuleTransportLi
  }
  object RamBundleInfo {
    
    inline def apply(
      getDependencies: String => Set[String],
      groups: Map[Double, Set[Double]],
      lazyModules: ReadonlyModuleTransportLi,
      startupModules: ReadonlyModuleTransportLi
    ): RamBundleInfo = {
      val __obj = js.Dynamic.literal(getDependencies = js.Any.fromFunction1(getDependencies), groups = groups.asInstanceOf[js.Any], lazyModules = lazyModules.asInstanceOf[js.Any], startupModules = startupModules.asInstanceOf[js.Any])
      __obj.asInstanceOf[RamBundleInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RamBundleInfo] (val x: Self) extends AnyVal {
      
      inline def setGetDependencies(value: String => Set[String]): Self = StObject.set(x, "getDependencies", js.Any.fromFunction1(value))
      
      inline def setGroups(value: Map[Double, Set[Double]]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setLazyModules(value: ReadonlyModuleTransportLi): Self = StObject.set(x, "lazyModules", value.asInstanceOf[js.Any])
      
      inline def setStartupModules(value: ReadonlyModuleTransportLi): Self = StObject.set(x, "startupModules", value.asInstanceOf[js.Any])
    }
  }
}
