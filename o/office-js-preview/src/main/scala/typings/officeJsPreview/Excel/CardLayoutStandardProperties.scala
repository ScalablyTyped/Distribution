package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Properties of a card layout relevant to most card layouts.
  *
  * @remarks
  * [Api set: ExcelApi 1.16]
  */
trait CardLayoutStandardProperties extends StObject {
  
  /**
    * Specifies a property which will be used as the main image of the card.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var mainImage: js.UndefOr[CardLayoutPropertyReference] = js.undefined
  
  /**
    * Represents the sections of the card.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var sections: js.UndefOr[js.Array[CardLayoutSection]] = js.undefined
  
  /**
    * Represents a specification of which property contains the subtitle of the card.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var subTitle: js.UndefOr[CardLayoutPropertyReference] = js.undefined
  
  /**
    * Represents the title of the card or the specification of which property contains the title of the card.
    *
    * @remarks
    * [Api set: ExcelApi 1.16]
    */
  var title: js.UndefOr[String | CardLayoutPropertyReference] = js.undefined
}
object CardLayoutStandardProperties {
  
  inline def apply(): CardLayoutStandardProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CardLayoutStandardProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardLayoutStandardProperties] (val x: Self) extends AnyVal {
    
    inline def setMainImage(value: CardLayoutPropertyReference): Self = StObject.set(x, "mainImage", value.asInstanceOf[js.Any])
    
    inline def setMainImageUndefined: Self = StObject.set(x, "mainImage", js.undefined)
    
    inline def setSections(value: js.Array[CardLayoutSection]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSectionsUndefined: Self = StObject.set(x, "sections", js.undefined)
    
    inline def setSectionsVarargs(value: CardLayoutSection*): Self = StObject.set(x, "sections", js.Array(value*))
    
    inline def setSubTitle(value: CardLayoutPropertyReference): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
    
    inline def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
    
    inline def setTitle(value: String | CardLayoutPropertyReference): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
