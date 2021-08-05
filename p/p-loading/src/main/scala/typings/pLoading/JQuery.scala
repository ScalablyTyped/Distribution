package typings.pLoading

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def ploading(options: PLoadingOptions): Unit
  @JSName("ploading")
  var ploading_Original: PLoading
}
object JQuery {
  
  inline def apply(ploading: PLoading): JQuery = {
    val __obj = js.Dynamic.literal(ploading = ploading.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setPloading(value: PLoading): Self = StObject.set(x, "ploading", value.asInstanceOf[js.Any])
  }
}
