package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `section.toJSON()`. */
trait SectionData extends StObject {
  
  /**
    *
    * Gets the body object of the section. This does not include the header/footer and other section metadata. Read-only.
    *
    * [Api set: WordApi 1.1]
    */
  var body: js.UndefOr[BodyData] = js.undefined
}
object SectionData {
  
  inline def apply(): SectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionData]
  }
  
  extension [Self <: SectionData](x: Self) {
    
    inline def setBody(value: BodyData): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
  }
}
