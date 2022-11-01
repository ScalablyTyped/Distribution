package typings.next.anon

import typings.next.distBuildWebpackLoadersNextFlightClientEntryLoaderMod.ClientComponentImports
import typings.next.distCompiledWebpackWebpackMod.webpack.Compilation
import typings.next.distCompiledWebpackWebpackMod.webpack.Compiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BundlePath extends StObject {
  
  var bundlePath: String
  
  var clientComponentImports: ClientComponentImports
  
  var compilation: Compilation
  
  var compiler: Compiler
  
  var entryName: String
}
object BundlePath {
  
  inline def apply(
    bundlePath: String,
    clientComponentImports: ClientComponentImports,
    compilation: Compilation,
    compiler: Compiler,
    entryName: String
  ): BundlePath = {
    val __obj = js.Dynamic.literal(bundlePath = bundlePath.asInstanceOf[js.Any], clientComponentImports = clientComponentImports.asInstanceOf[js.Any], compilation = compilation.asInstanceOf[js.Any], compiler = compiler.asInstanceOf[js.Any], entryName = entryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundlePath]
  }
  
  extension [Self <: BundlePath](x: Self) {
    
    inline def setBundlePath(value: String): Self = StObject.set(x, "bundlePath", value.asInstanceOf[js.Any])
    
    inline def setClientComponentImports(value: ClientComponentImports): Self = StObject.set(x, "clientComponentImports", value.asInstanceOf[js.Any])
    
    inline def setClientComponentImportsVarargs(value: String*): Self = StObject.set(x, "clientComponentImports", js.Array(value*))
    
    inline def setCompilation(value: Compilation): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
    
    inline def setCompiler(value: Compiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setEntryName(value: String): Self = StObject.set(x, "entryName", value.asInstanceOf[js.Any])
  }
}
