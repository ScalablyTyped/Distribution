package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationLinkResource
  extends StObject
     with EducationResource {
  
  // URL to the resource.
  var link: js.UndefOr[NullableOption[String]] = js.undefined
}
object EducationLinkResource {
  
  inline def apply(): EducationLinkResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationLinkResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EducationLinkResource] (val x: Self) extends AnyVal {
    
    inline def setLink(value: NullableOption[String]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkNull: Self = StObject.set(x, "link", null)
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
  }
}
