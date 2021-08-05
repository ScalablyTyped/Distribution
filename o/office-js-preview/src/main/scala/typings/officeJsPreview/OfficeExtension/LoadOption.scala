package typings.officeJsPreview.OfficeExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies which properties of an object should be loaded. This load happens when the sync() method is executed.
  * This synchronizes the states between Office objects and corresponding JavaScript proxy objects.
  *
  * @remarks
  *
  * For Word, the preferred method for specifying the properties and paging information is by using a string literal.
  * The first two examples show the preferred way to request the text and font size properties for paragraphs in a paragraph collection:
  *
  * `context.load(paragraphs, 'text, font/size');`
  *
  * `paragraphs.load('text, font/size');`
  *
  * Here is a similar example using object notation (includes paging):
  *
  * `context.load(paragraphs, {select: 'text, font/size', expand: 'font', top: 50, skip: 0});`
  *
  * `paragraphs.load({select: 'text, font/size', expand: 'font', top: 50, skip: 0});`
  *
  * Note that if we don't specify the specific properties on the font object in the select statement, the expand statement by itself would
  * indicate that all of the font properties are loaded.
  */
trait LoadOption extends StObject {
  
  /**
    * A comma-delimited string, or array of strings, that specifies the navigation properties to load.
    */
  var expand: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * A comma-delimited string, or array of strings, that specifies the properties to load.
    */
  var select: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Only usable on collection types. Specifies the number of items in the collection that are to be skipped and not included in the result.
    * If top is specified, the result set will start after skipping the specified number of items.
    */
  var skip: js.UndefOr[Double] = js.undefined
  
  /**
    * Only usable on collection types. Specifies the maximum number of collection items that can be included in the result.
    */
  var top: js.UndefOr[Double] = js.undefined
}
object LoadOption {
  
  inline def apply(): LoadOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadOption]
  }
  
  extension [Self <: LoadOption](x: Self) {
    
    inline def setExpand(value: String | js.Array[String]): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
    
    inline def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
    
    inline def setExpandVarargs(value: String*): Self = StObject.set(x, "expand", js.Array(value :_*))
    
    inline def setSelect(value: String | js.Array[String]): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    inline def setSelectVarargs(value: String*): Self = StObject.set(x, "select", js.Array(value :_*))
    
    inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
