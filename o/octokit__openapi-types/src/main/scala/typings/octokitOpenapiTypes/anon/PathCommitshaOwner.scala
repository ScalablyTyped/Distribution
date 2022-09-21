package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathCommitshaOwner extends StObject {
  
  var path: CommitshaOwner
}
object PathCommitshaOwner {
  
  inline def apply(path: CommitshaOwner): PathCommitshaOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathCommitshaOwner]
  }
  
  extension [Self <: PathCommitshaOwner](x: Self) {
    
    inline def setPath(value: CommitshaOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
