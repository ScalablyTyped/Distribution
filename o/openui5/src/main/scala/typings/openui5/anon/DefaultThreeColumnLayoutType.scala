package typings.openui5.anon

import typings.openui5.int
import typings.openui5.sapFLibraryMod.LayoutType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultThreeColumnLayoutType extends StObject {
  
  /**
    * Determines what three-column layout type will be suggested by default: `sap.f.LayoutType.ThreeColumnsMidExpanded`
    * or `sap.f.LayoutType.ThreeColumnsEndExpanded`.
    */
  var defaultThreeColumnLayoutType: js.UndefOr[
    LayoutType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LayoutType * / any */ String)
  ] = js.undefined
  
  /**
    * Determines what two-column layout type will be suggested by default: `sap.f.LayoutType.TwoColumnsBeginExpanded`
    * or `sap.f.LayoutType.TwoColumnsMidExpanded`.
    */
  var defaultTwoColumnLayoutType: js.UndefOr[
    LayoutType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LayoutType * / any */ String)
  ] = js.undefined
  
  /**
    * Determines whether a single-column or a 2-column layout will be suggested for logical level 0.
    *
    * Possible values:
    *
    *
    * 	 - Value of `1` (default) - A single-column layout will be suggested for logical level 0.
    *
    *
    * 	 - Value of `2` - A 2-column layout will be suggested for logical level 0.
    */
  var initialColumnsCount: int
  
  /**
    * Determines the maximum number of columns that will be displayed side by side.
    *
    * Possible values:
    *
    *
    * 	 - Value of `1` only single-column layouts will be suggested.
    *
    *
    * 	 - Value of `2` Up to 2-column layouts will be suggested.
    *
    *
    * 	 - Value of `3` (default) - Up to 3-column layouts will be suggested.
    */
  var maxColumnsCount: int
  
  /**
    * **Deprecated as of version 1.50**, use `maxColumnsCount` param instead.
    *
    * Determines the suggested layout types: `Normal` (3-column layouts), `MasterDetail` (2-column layouts
    * for the first two pages, all other pages will open in fullscreen), and `SingleColumn` (one page at a
    * time only).
    */
  var mode: String
}
object DefaultThreeColumnLayoutType {
  
  inline def apply(initialColumnsCount: int, maxColumnsCount: int, mode: String): DefaultThreeColumnLayoutType = {
    val __obj = js.Dynamic.literal(initialColumnsCount = initialColumnsCount.asInstanceOf[js.Any], maxColumnsCount = maxColumnsCount.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultThreeColumnLayoutType]
  }
  
  extension [Self <: DefaultThreeColumnLayoutType](x: Self) {
    
    inline def setDefaultThreeColumnLayoutType(
      value: LayoutType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LayoutType * / any */ String)
    ): Self = StObject.set(x, "defaultThreeColumnLayoutType", value.asInstanceOf[js.Any])
    
    inline def setDefaultThreeColumnLayoutTypeUndefined: Self = StObject.set(x, "defaultThreeColumnLayoutType", js.undefined)
    
    inline def setDefaultTwoColumnLayoutType(
      value: LayoutType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LayoutType * / any */ String)
    ): Self = StObject.set(x, "defaultTwoColumnLayoutType", value.asInstanceOf[js.Any])
    
    inline def setDefaultTwoColumnLayoutTypeUndefined: Self = StObject.set(x, "defaultTwoColumnLayoutType", js.undefined)
    
    inline def setInitialColumnsCount(value: int): Self = StObject.set(x, "initialColumnsCount", value.asInstanceOf[js.Any])
    
    inline def setMaxColumnsCount(value: int): Self = StObject.set(x, "maxColumnsCount", value.asInstanceOf[js.Any])
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
