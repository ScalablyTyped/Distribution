package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentInfos extends StObject {
  
  var contentInfos: js.UndefOr[String] = js.undefined
}
object ContentInfos {
  
  inline def apply(): ContentInfos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentInfos]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentInfos] (val x: Self) extends AnyVal {
    
    inline def setContentInfos(value: String): Self = StObject.set(x, "contentInfos", value.asInstanceOf[js.Any])
    
    inline def setContentInfosUndefined: Self = StObject.set(x, "contentInfos", js.undefined)
  }
}
