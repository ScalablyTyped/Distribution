package typings.openui5.anon

import typings.openui5.int
import typings.openui5.jQuery.Event
import typings.openui5.sapFLibraryMod.NavigationDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  /**
    * The the column index, from which the border is reached.
    */
  var column: js.UndefOr[int] = js.undefined
  
  /**
    * The navigation direction that is used to reach the border.
    */
  var direction: js.UndefOr[
    NavigationDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NavigationDirection * / any */ String)
  ] = js.undefined
  
  /**
    * Event that leads to the focus change.
    */
  var event: js.UndefOr[Event] = js.undefined
  
  /**
    * The row index, from which the border is reached.
    */
  var row: js.UndefOr[int] = js.undefined
}
object Column {
  
  inline def apply(): Column = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Column]
  }
  
  extension [Self <: Column](x: Self) {
    
    inline def setColumn(value: int): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setDirection(
      value: NavigationDirection | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof NavigationDirection * / any */ String)
    ): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setEvent(value: Event): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setRow(value: int): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
