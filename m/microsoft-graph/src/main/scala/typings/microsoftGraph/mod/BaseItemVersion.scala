package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseItemVersion extends Entity {
  
  // Identity of the user which last modified the version. Read-only.
  var lastModifiedBy: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  // Date and time the version was last modified. Read-only.
  var lastModifiedDateTime: js.UndefOr[NullableOption[String]] = js.native
  
  // Indicates the publication status of this particular version. Read-only.
  var publication: js.UndefOr[NullableOption[PublicationFacet]] = js.native
}
object BaseItemVersion {
  
  @scala.inline
  def apply(): BaseItemVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseItemVersion]
  }
  
  @scala.inline
  implicit class BaseItemVersionMutableBuilder[Self <: BaseItemVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastModifiedBy(value: NullableOption[IdentitySet]): Self = StObject.set(x, "lastModifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedByNull: Self = StObject.set(x, "lastModifiedBy", null)
    
    @scala.inline
    def setLastModifiedByUndefined: Self = StObject.set(x, "lastModifiedBy", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: NullableOption[String]): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeNull: Self = StObject.set(x, "lastModifiedDateTime", null)
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setPublication(value: NullableOption[PublicationFacet]): Self = StObject.set(x, "publication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicationNull: Self = StObject.set(x, "publication", null)
    
    @scala.inline
    def setPublicationUndefined: Self = StObject.set(x, "publication", js.undefined)
  }
}
