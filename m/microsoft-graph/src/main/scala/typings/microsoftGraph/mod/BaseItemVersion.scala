package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseItemVersion
  extends StObject
     with Entity {
  
  // Identity of the user which last modified the version. Read-only.
  var lastModifiedBy: js.UndefOr[NullableOption[IdentitySet]] = js.undefined
  
  // Date and time the version was last modified. Read-only.
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Indicates the publication status of this particular version. Read-only.
  var publication: js.UndefOr[NullableOption[PublicationFacet]] = js.undefined
}
object BaseItemVersion {
  
  inline def apply(): BaseItemVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseItemVersion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseItemVersion] (val x: Self) extends AnyVal {
    
    inline def setLastModifiedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByNull: Self = StObject.set(x, "lastModifiedBy", null)
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
    
    inline def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    inline def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    inline def setPublication(value: NullableOption[PublicationFacet]): Self = StObject.set(x, "publication", value.asInstanceOf[js.Any])
    
    inline def setPublicationNull: Self = StObject.set(x, "publication", null)
    
    inline def setPublicationUndefined: Self = StObject.set(x, "publication", js.undefined)
  }
}
