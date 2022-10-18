package typings.next.anon

import typings.next.distBuildBabelLoaderTypesMod.NextBabelLoaderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filename extends StObject {
  
  var filename: String
  
  var inputSourceMap: js.UndefOr[js.Object | Null] = js.undefined
  
  var loaderOptions: NextBabelLoaderOptions
  
  var source: String
  
  var target: String
}
object Filename {
  
  inline def apply(filename: String, loaderOptions: NextBabelLoaderOptions, source: String, target: String): Filename = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], loaderOptions = loaderOptions.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filename]
  }
  
  extension [Self <: Filename](x: Self) {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setInputSourceMap(value: js.Object): Self = StObject.set(x, "inputSourceMap", value.asInstanceOf[js.Any])
    
    inline def setInputSourceMapNull: Self = StObject.set(x, "inputSourceMap", null)
    
    inline def setInputSourceMapUndefined: Self = StObject.set(x, "inputSourceMap", js.undefined)
    
    inline def setLoaderOptions(value: NextBabelLoaderOptions): Self = StObject.set(x, "loaderOptions", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
