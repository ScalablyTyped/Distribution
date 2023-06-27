package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ListTemplate object, for use in `listTemplate.set({ ... })`. */
trait ListTemplateUpdateData extends StObject {
  
  /**
    * Specifies whether the specified ListTemplate object is outline numbered.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var outlineNumbered: js.UndefOr[Boolean] = js.undefined
}
object ListTemplateUpdateData {
  
  inline def apply(): ListTemplateUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTemplateUpdateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTemplateUpdateData] (val x: Self) extends AnyVal {
    
    inline def setOutlineNumbered(value: Boolean): Self = StObject.set(x, "outlineNumbered", value.asInstanceOf[js.Any])
    
    inline def setOutlineNumberedUndefined: Self = StObject.set(x, "outlineNumbered", js.undefined)
  }
}
