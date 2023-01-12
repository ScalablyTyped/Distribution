package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSlideRequest extends StObject {
  
  /** The optional zero-based index indicating where to insert the slides. If you don't specify an index, the slide is created at the end. */
  var insertionIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * A user-supplied object ID. If you specify an ID, it must be unique among all pages and page elements in the presentation. The ID must start with an alphanumeric character or an
    * underscore (matches regex `[a-zA-Z0-9_]`); remaining characters may include those as well as a hyphen or colon (matches regex `[a-zA-Z0-9_-:]`). The ID length must be between 5 and
    * 50 characters, inclusive. If you don't specify an ID, a unique one is generated.
    */
  var objectId: js.UndefOr[String] = js.undefined
  
  /**
    * An optional list of object ID mappings from the placeholder(s) on the layout to the placeholders that are created on the slide from the specified layout. Can only be used when
    * `slide_layout_reference` is specified.
    */
  var placeholderIdMappings: js.UndefOr[js.Array[LayoutPlaceholderIdMapping]] = js.undefined
  
  /**
    * Layout reference of the slide to be inserted, based on the *current master*, which is one of the following: - The master of the previous slide index. - The master of the first
    * slide, if the insertion_index is zero. - The first master in the presentation, if there are no slides. If the LayoutReference is not found in the current master, a 400 bad request
    * error is returned. If you don't specify a layout reference, the slide uses the predefined `BLANK` layout.
    */
  var slideLayoutReference: js.UndefOr[LayoutReference] = js.undefined
}
object CreateSlideRequest {
  
  inline def apply(): CreateSlideRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSlideRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSlideRequest] (val x: Self) extends AnyVal {
    
    inline def setInsertionIndex(value: Double): Self = StObject.set(x, "insertionIndex", value.asInstanceOf[js.Any])
    
    inline def setInsertionIndexUndefined: Self = StObject.set(x, "insertionIndex", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setPlaceholderIdMappings(value: js.Array[LayoutPlaceholderIdMapping]): Self = StObject.set(x, "placeholderIdMappings", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderIdMappingsUndefined: Self = StObject.set(x, "placeholderIdMappings", js.undefined)
    
    inline def setPlaceholderIdMappingsVarargs(value: LayoutPlaceholderIdMapping*): Self = StObject.set(x, "placeholderIdMappings", js.Array(value*))
    
    inline def setSlideLayoutReference(value: LayoutReference): Self = StObject.set(x, "slideLayoutReference", value.asInstanceOf[js.Any])
    
    inline def setSlideLayoutReferenceUndefined: Self = StObject.set(x, "slideLayoutReference", js.undefined)
  }
}
