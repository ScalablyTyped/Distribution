package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a ListTemplate.
  *
  * @remarks
  * [Api set: WordApi BETA (PREVIEW ONLY)]
  * @beta
  */
trait ListTemplateLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the specified ListTemplate object is outline numbered.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var outlineNumbered: js.UndefOr[Boolean] = js.undefined
}
object ListTemplateLoadOptions {
  
  inline def apply(): ListTemplateLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTemplateLoadOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTemplateLoadOptions] (val x: Self) extends AnyVal {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setOutlineNumbered(value: Boolean): Self = StObject.set(x, "outlineNumbered", value.asInstanceOf[js.Any])
    
    inline def setOutlineNumberedUndefined: Self = StObject.set(x, "outlineNumbered", js.undefined)
  }
}
