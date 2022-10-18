package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutDir extends StObject {
  
  var buildId: String
  
  var dev: Boolean
  
  var dir: String
  
  var distDir: String
  
  var outDir: String | Null
}
object OutDir {
  
  inline def apply(buildId: String, dev: Boolean, dir: String, distDir: String): OutDir = {
    val __obj = js.Dynamic.literal(buildId = buildId.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], distDir = distDir.asInstanceOf[js.Any], outDir = null)
    __obj.asInstanceOf[OutDir]
  }
  
  extension [Self <: OutDir](x: Self) {
    
    inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
    
    inline def setDev(value: Boolean): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDistDir(value: String): Self = StObject.set(x, "distDir", value.asInstanceOf[js.Any])
    
    inline def setOutDir(value: String): Self = StObject.set(x, "outDir", value.asInstanceOf[js.Any])
    
    inline def setOutDirNull: Self = StObject.set(x, "outDir", null)
  }
}
