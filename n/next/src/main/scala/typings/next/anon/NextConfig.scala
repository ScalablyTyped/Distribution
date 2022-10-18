package typings.next.anon

import typings.next.distServerConfigSharedMod.NextConfigComplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NextConfig extends StObject {
  
  var distDir: String
  
  var nextConfig: NextConfigComplete
}
object NextConfig {
  
  inline def apply(distDir: String, nextConfig: NextConfigComplete): NextConfig = {
    val __obj = js.Dynamic.literal(distDir = distDir.asInstanceOf[js.Any], nextConfig = nextConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextConfig]
  }
  
  extension [Self <: NextConfig](x: Self) {
    
    inline def setDistDir(value: String): Self = StObject.set(x, "distDir", value.asInstanceOf[js.Any])
    
    inline def setNextConfig(value: NextConfigComplete): Self = StObject.set(x, "nextConfig", value.asInstanceOf[js.Any])
  }
}
