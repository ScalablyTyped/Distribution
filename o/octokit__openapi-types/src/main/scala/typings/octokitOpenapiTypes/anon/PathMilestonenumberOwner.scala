package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathMilestonenumberOwner extends StObject {
  
  var path: MilestonenumberOwner
}
object PathMilestonenumberOwner {
  
  inline def apply(path: MilestonenumberOwner): PathMilestonenumberOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathMilestonenumberOwner]
  }
  
  extension [Self <: PathMilestonenumberOwner](x: Self) {
    
    inline def setPath(value: MilestonenumberOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
