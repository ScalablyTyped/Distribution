package typings.openui5.anon

import typings.openui5.int
import typings.openui5.sapFLibraryMod.LayoutType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsNavigationArrow extends StObject {
  
  /**
    * Indicates whether the layout changed as a result of the user clicking a layout arrow
    */
  var isNavigationArrow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the maximum number of columns that can be displayed at once changed
    */
  var isResize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The value of the `layout` property
    */
  var layout: js.UndefOr[
    LayoutType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LayoutType * / any */ String)
  ] = js.undefined
  
  /**
    * The maximum number of columns that can be displayed at once based on the available screen size and control
    * settings.
    *
    * Possible values are:
    * 	 - 3 for browser size of 1280px or more
    * 	 - 2 for browser size between 960px and 1280px
    * 	 - 1 for browser size less than 960px
    */
  var maxColumnsCount: js.UndefOr[int] = js.undefined
}
object IsNavigationArrow {
  
  inline def apply(): IsNavigationArrow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsNavigationArrow]
  }
  
  extension [Self <: IsNavigationArrow](x: Self) {
    
    inline def setIsNavigationArrow(value: Boolean): Self = StObject.set(x, "isNavigationArrow", value.asInstanceOf[js.Any])
    
    inline def setIsNavigationArrowUndefined: Self = StObject.set(x, "isNavigationArrow", js.undefined)
    
    inline def setIsResize(value: Boolean): Self = StObject.set(x, "isResize", value.asInstanceOf[js.Any])
    
    inline def setIsResizeUndefined: Self = StObject.set(x, "isResize", js.undefined)
    
    inline def setLayout(
      value: LayoutType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LayoutType * / any */ String)
    ): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMaxColumnsCount(value: int): Self = StObject.set(x, "maxColumnsCount", value.asInstanceOf[js.Any])
    
    inline def setMaxColumnsCountUndefined: Self = StObject.set(x, "maxColumnsCount", js.undefined)
  }
}
