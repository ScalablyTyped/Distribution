package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderedListElementProperties extends StObject {
  
  /**
    * Overrides the counter for this list item.
    *
    * For a non-decimal {@link listType}, the number is mapped to the corresponding
    * marker string (e.g. `1` => `A` for `upper-alpha`).
    *
    * Does not influence the counters for the other list items.
    */
  var counter: js.UndefOr[Double] = js.undefined
  
  /**
    * Overrides the list marker type for this list item.
    *
    * Defaults to the list's {@link ContentOrderedList.type}.
    */
  var listType: js.UndefOr[OrderedListType] = js.undefined
}
object OrderedListElementProperties {
  
  inline def apply(): OrderedListElementProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderedListElementProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrderedListElementProperties] (val x: Self) extends AnyVal {
    
    inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
    
    inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
    
    inline def setListType(value: OrderedListType): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
    
    inline def setListTypeUndefined: Self = StObject.set(x, "listType", js.undefined)
  }
}
