package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Contains the collection of the document's {@link Word.Section} objects.
  *
  * [Api set: WordApi 1.1]
  */
trait SectionCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the body object of the section. This does not include the header/footer and other section metadata.
    *
    * [Api set: WordApi 1.1]
    */
  var body: js.UndefOr[BodyLoadOptions] = js.undefined
}
object SectionCollectionLoadOptions {
  
  @scala.inline
  def apply(): SectionCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class SectionCollectionLoadOptionsMutableBuilder[Self <: SectionCollectionLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setBody(value: BodyLoadOptions): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
