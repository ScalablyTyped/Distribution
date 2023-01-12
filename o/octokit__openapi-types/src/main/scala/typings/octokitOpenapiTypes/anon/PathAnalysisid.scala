package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathAnalysisid extends StObject {
  
  var path: Analysisid
}
object PathAnalysisid {
  
  inline def apply(path: Analysisid): PathAnalysisid = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathAnalysisid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PathAnalysisid] (val x: Self) extends AnyVal {
    
    inline def setPath(value: Analysisid): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
