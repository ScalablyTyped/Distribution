package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathReviewid extends StObject {
  
  var path: Reviewid
}
object PathReviewid {
  
  inline def apply(path: Reviewid): PathReviewid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathReviewid]
  }
  
  extension [Self <: PathReviewid](x: Self) {
    
    inline def setPath(value: Reviewid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
