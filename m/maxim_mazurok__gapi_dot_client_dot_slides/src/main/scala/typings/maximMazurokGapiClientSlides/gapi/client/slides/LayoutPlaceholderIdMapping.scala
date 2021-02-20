package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutPlaceholderIdMapping extends StObject {
  
  /**
    * The placeholder on a layout that will be applied to a slide. Only type and index are needed. For example, a predefined `TITLE_AND_BODY` layout may usually have a TITLE placeholder
    * with index 0 and a BODY placeholder with index 0.
    */
  var layoutPlaceholder: js.UndefOr[Placeholder] = js.native
  
  /** The object ID of the placeholder on a layout that will be applied to a slide. */
  var layoutPlaceholderObjectId: js.UndefOr[String] = js.native
  
  /**
    * A user-supplied object ID for the placeholder identified above that to be created onto a slide. If you specify an ID, it must be unique among all pages and page elements in the
    * presentation. The ID must start with an alphanumeric character or an underscore (matches regex `[a-zA-Z0-9_]`); remaining characters may include those as well as a hyphen or colon
    * (matches regex `[a-zA-Z0-9_-:]`). The length of the ID must not be less than 5 or greater than 50. If you don't specify an ID, a unique one is generated.
    */
  var objectId: js.UndefOr[String] = js.native
}
object LayoutPlaceholderIdMapping {
  
  @scala.inline
  def apply(): LayoutPlaceholderIdMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutPlaceholderIdMapping]
  }
  
  @scala.inline
  implicit class LayoutPlaceholderIdMappingMutableBuilder[Self <: LayoutPlaceholderIdMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayoutPlaceholder(value: Placeholder): Self = StObject.set(x, "layoutPlaceholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutPlaceholderObjectId(value: String): Self = StObject.set(x, "layoutPlaceholderObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutPlaceholderObjectIdUndefined: Self = StObject.set(x, "layoutPlaceholderObjectId", js.undefined)
    
    @scala.inline
    def setLayoutPlaceholderUndefined: Self = StObject.set(x, "layoutPlaceholder", js.undefined)
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
