package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortOrder extends StObject {
  
  /**
    * The key of the property that is sorted.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * The new sort order.
    */
  var sortOrder: js.UndefOr[
    typings.openui5.sapUiCoreLibraryMod.SortOrder | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SortOrder * / any */ String)
  ] = js.undefined
}
object SortOrder {
  
  inline def apply(): SortOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortOrder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SortOrder] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setSortOrder(
      value: typings.openui5.sapUiCoreLibraryMod.SortOrder | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SortOrder * / any */ String)
    ): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
