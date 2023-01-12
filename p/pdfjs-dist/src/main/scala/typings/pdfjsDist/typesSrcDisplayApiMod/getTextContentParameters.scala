package typings.pdfjsDist.typesSrcDisplayApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait getTextContentParameters extends StObject {
  
  /**
    * - Do not attempt to combine
    * same line {@link TextItem }'s. The default value is `false`.
    */
  var disableCombineTextItems: Boolean
  
  /**
    * - When true include marked
    * content items in the items array of TextContent. The default is `false`.
    */
  var includeMarkedContent: js.UndefOr[Boolean] = js.undefined
}
object getTextContentParameters {
  
  inline def apply(disableCombineTextItems: Boolean): getTextContentParameters = {
    val __obj = js.Dynamic.literal(disableCombineTextItems = disableCombineTextItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[getTextContentParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: getTextContentParameters] (val x: Self) extends AnyVal {
    
    inline def setDisableCombineTextItems(value: Boolean): Self = StObject.set(x, "disableCombineTextItems", value.asInstanceOf[js.Any])
    
    inline def setIncludeMarkedContent(value: Boolean): Self = StObject.set(x, "includeMarkedContent", value.asInstanceOf[js.Any])
    
    inline def setIncludeMarkedContentUndefined: Self = StObject.set(x, "includeMarkedContent", js.undefined)
  }
}
