package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathRepoReviewid extends StObject {
  
  var path: RepoReviewid
}
object PathRepoReviewid {
  
  inline def apply(path: RepoReviewid): PathRepoReviewid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathRepoReviewid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathRepoReviewid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: RepoReviewid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
