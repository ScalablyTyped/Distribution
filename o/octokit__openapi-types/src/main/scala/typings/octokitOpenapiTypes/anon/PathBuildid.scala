package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathBuildid extends StObject {
  
  var path: Buildid
}
object PathBuildid {
  
  inline def apply(path: Buildid): PathBuildid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathBuildid]
  }
  
  extension [Self <: PathBuildid](x: Self) {
    
    inline def setPath(value: Buildid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
