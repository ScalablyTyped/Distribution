package typings.openui5.anon

import typings.openui5.int
import typings.openui5.sapUiCommonsLibraryMod.PaginatorEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SrcPage extends StObject {
  
  /**
    * The page which is the current one before the page event is fired (and another page is displayed)
    */
  var srcPage: js.UndefOr[int] = js.undefined
  
  /**
    * The page that shall be displayed next after the page event is fired.
    *
    * The page number is 1-based: the first page has index 1, not 0, to match the number visible in the UI.
    */
  var targetPage: js.UndefOr[int] = js.undefined
  
  /**
    * Provides the values 'First', 'Last', 'Next', 'Previous', 'Goto'. The event parameter informs the application
    * how the user navigated to the new page: Whether the 'Next' button was used, or another button, or whether
    * the page was directly selected
    */
  var `type`: js.UndefOr[
    PaginatorEvent | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PaginatorEvent * / any */ String)
  ] = js.undefined
}
object SrcPage {
  
  inline def apply(): SrcPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SrcPage]
  }
  
  extension [Self <: SrcPage](x: Self) {
    
    inline def setSrcPage(value: int): Self = StObject.set(x, "srcPage", value.asInstanceOf[js.Any])
    
    inline def setSrcPageUndefined: Self = StObject.set(x, "srcPage", js.undefined)
    
    inline def setTargetPage(value: int): Self = StObject.set(x, "targetPage", value.asInstanceOf[js.Any])
    
    inline def setTargetPageUndefined: Self = StObject.set(x, "targetPage", js.undefined)
    
    inline def setType(
      value: PaginatorEvent | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PaginatorEvent * / any */ String)
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
