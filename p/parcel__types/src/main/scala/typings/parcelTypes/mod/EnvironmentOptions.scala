package typings.parcelTypes.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentOptions extends StObject {
  
  val context: js.UndefOr[EnvironmentContext] = js.undefined
  
  val engines: js.UndefOr[Engines] = js.undefined
  
  val includeNodeModules: js.UndefOr[Boolean | js.Array[PackageName] | (Record[PackageName, Boolean])] = js.undefined
  
  val isLibrary: js.UndefOr[Boolean] = js.undefined
  
  val loc: js.UndefOr[SourceLocation | Null] = js.undefined
  
  val outputFormat: js.UndefOr[OutputFormat] = js.undefined
  
  val shouldOptimize: js.UndefOr[Boolean] = js.undefined
  
  val shouldScopeHoist: js.UndefOr[Boolean] = js.undefined
  
  val sourceMap: js.UndefOr[TargetSourceMapOptions | Null] = js.undefined
  
  val sourceType: js.UndefOr[SourceType] = js.undefined
}
object EnvironmentOptions {
  
  inline def apply(): EnvironmentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvironmentOptions] (val x: Self) extends AnyVal {
    
    inline def setContext(value: EnvironmentContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setEngines(value: Engines): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
    
    inline def setEnginesUndefined: Self = StObject.set(x, "engines", js.undefined)
    
    inline def setIncludeNodeModules(value: Boolean | js.Array[PackageName] | (Record[PackageName, Boolean])): Self = StObject.set(x, "includeNodeModules", value.asInstanceOf[js.Any])
    
    inline def setIncludeNodeModulesUndefined: Self = StObject.set(x, "includeNodeModules", js.undefined)
    
    inline def setIncludeNodeModulesVarargs(value: PackageName*): Self = StObject.set(x, "includeNodeModules", js.Array(value*))
    
    inline def setIsLibrary(value: Boolean): Self = StObject.set(x, "isLibrary", value.asInstanceOf[js.Any])
    
    inline def setIsLibraryUndefined: Self = StObject.set(x, "isLibrary", js.undefined)
    
    inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setOutputFormat(value: OutputFormat): Self = StObject.set(x, "outputFormat", value.asInstanceOf[js.Any])
    
    inline def setOutputFormatUndefined: Self = StObject.set(x, "outputFormat", js.undefined)
    
    inline def setShouldOptimize(value: Boolean): Self = StObject.set(x, "shouldOptimize", value.asInstanceOf[js.Any])
    
    inline def setShouldOptimizeUndefined: Self = StObject.set(x, "shouldOptimize", js.undefined)
    
    inline def setShouldScopeHoist(value: Boolean): Self = StObject.set(x, "shouldScopeHoist", value.asInstanceOf[js.Any])
    
    inline def setShouldScopeHoistUndefined: Self = StObject.set(x, "shouldScopeHoist", js.undefined)
    
    inline def setSourceMap(value: TargetSourceMapOptions): Self = StObject.set(x, "sourceMap", value.asInstanceOf[js.Any])
    
    inline def setSourceMapNull: Self = StObject.set(x, "sourceMap", null)
    
    inline def setSourceMapUndefined: Self = StObject.set(x, "sourceMap", js.undefined)
    
    inline def setSourceType(value: SourceType): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
  }
}
