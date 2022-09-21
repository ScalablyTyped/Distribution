package typings.parcelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Target extends StObject {
  
  /** The output folder */
  val distDir: FilePath
  
  /** The output filename of the entry */
  val distEntry: js.UndefOr[FilePath | Null] = js.undefined
  
  val env: Environment
  
  /** The location that created this Target, e.g. `package.json#main`*/
  val loc: js.UndefOr[SourceLocation | Null] = js.undefined
  
  val name: String
  
  val publicUrl: String
}
object Target {
  
  inline def apply(distDir: FilePath, env: Environment, name: String, publicUrl: String): Target = {
    val __obj = js.Dynamic.literal(distDir = distDir.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publicUrl = publicUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
  
  extension [Self <: Target](x: Self) {
    
    inline def setDistDir(value: FilePath): Self = StObject.set(x, "distDir", value.asInstanceOf[js.Any])
    
    inline def setDistEntry(value: FilePath): Self = StObject.set(x, "distEntry", value.asInstanceOf[js.Any])
    
    inline def setDistEntryNull: Self = StObject.set(x, "distEntry", null)
    
    inline def setDistEntryUndefined: Self = StObject.set(x, "distEntry", js.undefined)
    
    inline def setEnv(value: Environment): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: SourceLocation): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPublicUrl(value: String): Self = StObject.set(x, "publicUrl", value.asInstanceOf[js.Any])
  }
}
