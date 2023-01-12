package typings.parcelTypes.anon

import typings.parcelTypes.mod.FilePath
import typings.parcelTypes.mod.PluginLogger
import typings.parcelTypes.mod.PluginOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dependency extends StObject {
  
  var dependency: typings.parcelTypes.mod.Dependency
  
  var logger: PluginLogger
  
  var options: PluginOptions
  
  var pipeline: js.UndefOr[String | Null] = js.undefined
  
  var specifier: FilePath
}
object Dependency {
  
  inline def apply(
    dependency: typings.parcelTypes.mod.Dependency,
    logger: PluginLogger,
    options: PluginOptions,
    specifier: FilePath
  ): Dependency = {
    val __obj = js.Dynamic.literal(dependency = dependency.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], specifier = specifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dependency]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Dependency] (val x: Self) extends AnyVal {
    
    inline def setDependency(value: typings.parcelTypes.mod.Dependency): Self = StObject.set(x, "dependency", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: PluginLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: PluginOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPipeline(value: String): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineNull: Self = StObject.set(x, "pipeline", null)
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    inline def setSpecifier(value: FilePath): Self = StObject.set(x, "specifier", value.asInstanceOf[js.Any])
  }
}
