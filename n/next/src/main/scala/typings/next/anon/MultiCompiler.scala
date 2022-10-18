package typings.next.anon

import typings.next.distServerConfigSharedMod.NextConfigComplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MultiCompiler extends StObject {
  
  var appDir: js.UndefOr[String] = js.undefined
  
  var maxInactiveAge: Double
  
  var multiCompiler: typings.next.distCompiledWebpackWebpackMod.webpack.MultiCompiler
  
  var nextConfig: NextConfigComplete
  
  var pagesBufferLength: Double
  
  var pagesDir: js.UndefOr[String] = js.undefined
  
  var rootDir: String
}
object MultiCompiler {
  
  inline def apply(
    maxInactiveAge: Double,
    multiCompiler: typings.next.distCompiledWebpackWebpackMod.webpack.MultiCompiler,
    nextConfig: NextConfigComplete,
    pagesBufferLength: Double,
    rootDir: String
  ): MultiCompiler = {
    val __obj = js.Dynamic.literal(maxInactiveAge = maxInactiveAge.asInstanceOf[js.Any], multiCompiler = multiCompiler.asInstanceOf[js.Any], nextConfig = nextConfig.asInstanceOf[js.Any], pagesBufferLength = pagesBufferLength.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiCompiler]
  }
  
  extension [Self <: MultiCompiler](x: Self) {
    
    inline def setAppDir(value: String): Self = StObject.set(x, "appDir", value.asInstanceOf[js.Any])
    
    inline def setAppDirUndefined: Self = StObject.set(x, "appDir", js.undefined)
    
    inline def setMaxInactiveAge(value: Double): Self = StObject.set(x, "maxInactiveAge", value.asInstanceOf[js.Any])
    
    inline def setMultiCompiler(value: typings.next.distCompiledWebpackWebpackMod.webpack.MultiCompiler): Self = StObject.set(x, "multiCompiler", value.asInstanceOf[js.Any])
    
    inline def setNextConfig(value: NextConfigComplete): Self = StObject.set(x, "nextConfig", value.asInstanceOf[js.Any])
    
    inline def setPagesBufferLength(value: Double): Self = StObject.set(x, "pagesBufferLength", value.asInstanceOf[js.Any])
    
    inline def setPagesDir(value: String): Self = StObject.set(x, "pagesDir", value.asInstanceOf[js.Any])
    
    inline def setPagesDirUndefined: Self = StObject.set(x, "pagesDir", js.undefined)
    
    inline def setRootDir(value: String): Self = StObject.set(x, "rootDir", value.asInstanceOf[js.Any])
  }
}
