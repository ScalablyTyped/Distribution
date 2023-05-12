package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `listTemplate.toJSON()`. */
trait ListTemplateData extends StObject {
  
  /**
    * Gets a ListLevels collection that represents all the levels for the specified ListTemplate.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var listLevels: js.UndefOr[js.Array[ListLevelData]] = js.undefined
  
  /**
    * Gets or sets whether the specified ListTemplate object is outline numbered.
    *
    * @remarks
    * [Api set: WordApi BETA (PREVIEW ONLY)]
    * @beta
    */
  var outlineNumbered: js.UndefOr[Boolean] = js.undefined
}
object ListTemplateData {
  
  inline def apply(): ListTemplateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTemplateData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTemplateData] (val x: Self) extends AnyVal {
    
    inline def setListLevels(value: js.Array[ListLevelData]): Self = StObject.set(x, "listLevels", value.asInstanceOf[js.Any])
    
    inline def setListLevelsUndefined: Self = StObject.set(x, "listLevels", js.undefined)
    
    inline def setListLevelsVarargs(value: ListLevelData*): Self = StObject.set(x, "listLevels", js.Array(value*))
    
    inline def setOutlineNumbered(value: Boolean): Self = StObject.set(x, "outlineNumbered", value.asInstanceOf[js.Any])
    
    inline def setOutlineNumberedUndefined: Self = StObject.set(x, "outlineNumbered", js.undefined)
  }
}
