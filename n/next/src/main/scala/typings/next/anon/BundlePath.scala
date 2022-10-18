package typings.next.anon

import typings.next.distBuildWebpackLoadersNextFlightClientEntryLoaderMod.ClientComponentImports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundlePath extends StObject {
  
  var bundlePath: String
  
  var clientComponentImports: ClientComponentImports
  
  var compilation: Any
  
  var compiler: Any
  
  var entryName: String
}
object BundlePath {
  
  inline def apply(
    bundlePath: String,
    clientComponentImports: ClientComponentImports,
    compilation: Any,
    compiler: Any,
    entryName: String
  ): BundlePath = {
    val __obj = js.Dynamic.literal(bundlePath = bundlePath.asInstanceOf[js.Any], clientComponentImports = clientComponentImports.asInstanceOf[js.Any], compilation = compilation.asInstanceOf[js.Any], compiler = compiler.asInstanceOf[js.Any], entryName = entryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundlePath]
  }
  
  extension [Self <: BundlePath](x: Self) {
    
    inline def setBundlePath(value: String): Self = StObject.set(x, "bundlePath", value.asInstanceOf[js.Any])
    
    inline def setClientComponentImports(value: ClientComponentImports): Self = StObject.set(x, "clientComponentImports", value.asInstanceOf[js.Any])
    
    inline def setClientComponentImportsVarargs(value: String*): Self = StObject.set(x, "clientComponentImports", js.Array(value*))
    
    inline def setCompilation(value: Any): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
    
    inline def setCompiler(value: Any): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setEntryName(value: String): Self = StObject.set(x, "entryName", value.asInstanceOf[js.Any])
  }
}
