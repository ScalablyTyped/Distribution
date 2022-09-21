package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Section object, for use in `section.set({ ... })`. */
trait SectionUpdateData extends StObject {
  
  /**
    * Gets the body object of the section. This does not include the header/footer and other section metadata.
    *
    * @remarks
    * [Api set: WordApi 1.1]
    */
  var body: js.UndefOr[BodyUpdateData] = js.undefined
}
object SectionUpdateData {
  
  inline def apply(): SectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionUpdateData]
  }
  
  extension [Self <: SectionUpdateData](x: Self) {
    
    inline def setBody(value: BodyUpdateData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
