package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathBuildidOwner extends StObject {
  
  var path: BuildidOwner
}
object PathBuildidOwner {
  
  inline def apply(path: BuildidOwner): PathBuildidOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathBuildidOwner]
  }
  
  extension [Self <: PathBuildidOwner](x: Self) {
    
    inline def setPath(value: BuildidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
