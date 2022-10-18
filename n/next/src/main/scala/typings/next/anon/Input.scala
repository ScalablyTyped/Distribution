package typings.next.anon

import typings.next.distBuildWebpackLoadersGetModuleBuildInfoMod.AssetBinding
import typings.std.RequestInfo
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input extends StObject {
  
  var assets: js.UndefOr[js.Array[AssetBinding]] = js.undefined
  
  var context: Response
  
  var distDir: String
  
  var input: RequestInfo | URL
}
object Input {
  
  inline def apply(context: Response, distDir: String, input: RequestInfo | URL): Input = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], distDir = distDir.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
  
  extension [Self <: Input](x: Self) {
    
    inline def setAssets(value: js.Array[AssetBinding]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setAssetsVarargs(value: AssetBinding*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setContext(value: Response): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setDistDir(value: String): Self = StObject.set(x, "distDir", value.asInstanceOf[js.Any])
    
    inline def setInput(value: RequestInfo | URL): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
  }
}
