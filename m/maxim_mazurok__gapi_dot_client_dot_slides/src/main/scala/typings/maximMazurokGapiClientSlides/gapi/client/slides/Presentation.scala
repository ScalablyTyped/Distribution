package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Presentation extends StObject {
  
  /** The layouts in the presentation. A layout is a template that determines how content is arranged and styled on the slides that inherit from that layout. */
  var layouts: js.UndefOr[js.Array[Page]] = js.undefined
  
  /** The locale of the presentation, as an IETF BCP 47 language tag. */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * The slide masters in the presentation. A slide master contains all common page elements and the common properties for a set of layouts. They serve three purposes: - Placeholder
    * shapes on a master contain the default text styles and shape properties of all placeholder shapes on pages that use that master. - The master page properties define the common page
    * properties inherited by its layouts. - Any other shapes on the master slide appear on all slides using that master, regardless of their layout.
    */
  var masters: js.UndefOr[js.Array[Page]] = js.undefined
  
  /**
    * The notes master in the presentation. It serves three purposes: - Placeholder shapes on a notes master contain the default text styles and shape properties of all placeholder shapes
    * on notes pages. Specifically, a `SLIDE_IMAGE` placeholder shape contains the slide thumbnail, and a `BODY` placeholder shape contains the speaker notes. - The notes master page
    * properties define the common page properties inherited by all notes pages. - Any other shapes on the notes master appear on all notes pages. The notes master is read-only.
    */
  var notesMaster: js.UndefOr[Page] = js.undefined
  
  /** The size of pages in the presentation. */
  var pageSize: js.UndefOr[Size] = js.undefined
  
  /** The ID of the presentation. */
  var presentationId: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The revision ID of the presentation. Can be used in update requests to assert the presentation revision hasn't changed since the last read operation. Only populated if
    * the user has edit access to the presentation. The revision ID is not a sequential number but a nebulous string. The format of the revision ID may change over time, so it should be
    * treated opaquely. A returned revision ID is only guaranteed to be valid for 24 hours after it has been returned and cannot be shared across users. If the revision ID is unchanged
    * between calls, then the presentation has not changed. Conversely, a changed ID (for the same presentation and user) usually means the presentation has been updated. However, a
    * changed ID can also be due to internal factors such as ID format changes.
    */
  var revisionId: js.UndefOr[String] = js.undefined
  
  /** The slides in the presentation. A slide inherits properties from a slide layout. */
  var slides: js.UndefOr[js.Array[Page]] = js.undefined
  
  /** The title of the presentation. */
  var title: js.UndefOr[String] = js.undefined
}
object Presentation {
  
  inline def apply(): Presentation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Presentation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Presentation] (val x: Self) extends AnyVal {
    
    inline def setLayouts(value: js.Array[Page]): Self = StObject.set(x, "layouts", value.asInstanceOf[js.Any])
    
    inline def setLayoutsUndefined: Self = StObject.set(x, "layouts", js.undefined)
    
    inline def setLayoutsVarargs(value: Page*): Self = StObject.set(x, "layouts", js.Array(value*))
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setMasters(value: js.Array[Page]): Self = StObject.set(x, "masters", value.asInstanceOf[js.Any])
    
    inline def setMastersUndefined: Self = StObject.set(x, "masters", js.undefined)
    
    inline def setMastersVarargs(value: Page*): Self = StObject.set(x, "masters", js.Array(value*))
    
    inline def setNotesMaster(value: Page): Self = StObject.set(x, "notesMaster", value.asInstanceOf[js.Any])
    
    inline def setNotesMasterUndefined: Self = StObject.set(x, "notesMaster", js.undefined)
    
    inline def setPageSize(value: Size): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPresentationId(value: String): Self = StObject.set(x, "presentationId", value.asInstanceOf[js.Any])
    
    inline def setPresentationIdUndefined: Self = StObject.set(x, "presentationId", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    inline def setSlides(value: js.Array[Page]): Self = StObject.set(x, "slides", value.asInstanceOf[js.Any])
    
    inline def setSlidesUndefined: Self = StObject.set(x, "slides", js.undefined)
    
    inline def setSlidesVarargs(value: Page*): Self = StObject.set(x, "slides", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
