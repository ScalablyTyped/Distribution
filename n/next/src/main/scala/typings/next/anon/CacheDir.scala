package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheDir extends StObject {
  
  var cacheDir: js.UndefOr[String] = js.undefined
  
  var dir: String
  
  var disableStaticImages: Boolean
  
  var intentDirs: js.Array[String]
  
  var tsconfigPath: String
  
  var typeCheckPreflight: Boolean
}
object CacheDir {
  
  inline def apply(
    dir: String,
    disableStaticImages: Boolean,
    intentDirs: js.Array[String],
    tsconfigPath: String,
    typeCheckPreflight: Boolean
  ): CacheDir = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], disableStaticImages = disableStaticImages.asInstanceOf[js.Any], intentDirs = intentDirs.asInstanceOf[js.Any], tsconfigPath = tsconfigPath.asInstanceOf[js.Any], typeCheckPreflight = typeCheckPreflight.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheDir]
  }
  
  extension [Self <: CacheDir](x: Self) {
    
    inline def setCacheDir(value: String): Self = StObject.set(x, "cacheDir", value.asInstanceOf[js.Any])
    
    inline def setCacheDirUndefined: Self = StObject.set(x, "cacheDir", js.undefined)
    
    inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    inline def setDisableStaticImages(value: Boolean): Self = StObject.set(x, "disableStaticImages", value.asInstanceOf[js.Any])
    
    inline def setIntentDirs(value: js.Array[String]): Self = StObject.set(x, "intentDirs", value.asInstanceOf[js.Any])
    
    inline def setIntentDirsVarargs(value: String*): Self = StObject.set(x, "intentDirs", js.Array(value*))
    
    inline def setTsconfigPath(value: String): Self = StObject.set(x, "tsconfigPath", value.asInstanceOf[js.Any])
    
    inline def setTypeCheckPreflight(value: Boolean): Self = StObject.set(x, "typeCheckPreflight", value.asInstanceOf[js.Any])
  }
}
