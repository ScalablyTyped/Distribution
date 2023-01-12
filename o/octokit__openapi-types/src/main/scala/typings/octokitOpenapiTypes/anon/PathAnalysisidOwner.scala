package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAnalysisidOwner extends StObject {
  
  var path: AnalysisidOwner
}
object PathAnalysisidOwner {
  
  inline def apply(path: AnalysisidOwner): PathAnalysisidOwner = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAnalysisidOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathAnalysisidOwner] (val x: Self) extends AnyVal {
    
    inline def setPath(value: AnalysisidOwner): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
