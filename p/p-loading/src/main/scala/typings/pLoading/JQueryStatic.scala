package typings.pLoading

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  def ploading(options: PLoadingOptions): Unit
  @JSName("ploading")
  var ploading_Original: PLoading
}
object JQueryStatic {
  
  inline def apply(ploading: PLoading): JQueryStatic = {
    val __obj = js.Dynamic.literal(ploading = ploading.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setPloading(value: PLoading): Self = StObject.set(x, "ploading", value.asInstanceOf[js.Any])
  }
}
