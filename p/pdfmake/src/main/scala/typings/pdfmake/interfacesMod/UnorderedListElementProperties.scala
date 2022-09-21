package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnorderedListElementProperties extends StObject {
  
  /**
    * Overrides the list marker type for this list item.
    *
    * Defaults to the list's {@link ContentUnorderedList.type}.
    */
  var listType: js.UndefOr[UnorderedListType] = js.undefined
}
object UnorderedListElementProperties {
  
  inline def apply(): UnorderedListElementProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnorderedListElementProperties]
  }
  
  extension [Self <: UnorderedListElementProperties](x: Self) {
    
    inline def setListType(value: UnorderedListType): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
    
    inline def setListTypeUndefined: Self = StObject.set(x, "listType", js.undefined)
  }
}
