package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Section object, for use in `section.set({ ... })`. */
@js.native
trait SectionUpdateData extends StObject {
  
  /**
    *
    * Gets the body object of the section. This does not include the header/footer and other section metadata.
    *
    * [Api set: WordApi 1.1]
    */
  var body: js.UndefOr[BodyUpdateData] = js.native
}
object SectionUpdateData {
  
  @scala.inline
  def apply(): SectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionUpdateData]
  }
  
  @scala.inline
  implicit class SectionUpdateDataMutableBuilder[Self <: SectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: BodyUpdateData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
