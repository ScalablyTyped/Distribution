package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Menuitemexportlibrary extends StObject {
  
  var `menu-item-export-library`: js.UndefOr[Boolean] = js.undefined
  
  var `menu-item-help`: js.UndefOr[Url] = js.undefined
  
  var `menu-item-import-library`: js.UndefOr[Boolean] = js.undefined
  
  var `menu-item-keyboard-shortcuts`: js.UndefOr[Boolean] = js.undefined
}
object Menuitemexportlibrary {
  
  inline def apply(): Menuitemexportlibrary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Menuitemexportlibrary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Menuitemexportlibrary] (val x: Self) extends AnyVal {
    
    inline def `setMenu-item-export-library`(value: Boolean): Self = StObject.set(x, "menu-item-export-library", value.asInstanceOf[js.Any])
    
    inline def `setMenu-item-export-libraryUndefined`: Self = StObject.set(x, "menu-item-export-library", js.undefined)
    
    inline def `setMenu-item-help`(value: Url): Self = StObject.set(x, "menu-item-help", value.asInstanceOf[js.Any])
    
    inline def `setMenu-item-helpUndefined`: Self = StObject.set(x, "menu-item-help", js.undefined)
    
    inline def `setMenu-item-import-library`(value: Boolean): Self = StObject.set(x, "menu-item-import-library", value.asInstanceOf[js.Any])
    
    inline def `setMenu-item-import-libraryUndefined`: Self = StObject.set(x, "menu-item-import-library", js.undefined)
    
    inline def `setMenu-item-keyboard-shortcuts`(value: Boolean): Self = StObject.set(x, "menu-item-keyboard-shortcuts", value.asInstanceOf[js.Any])
    
    inline def `setMenu-item-keyboard-shortcutsUndefined`: Self = StObject.set(x, "menu-item-keyboard-shortcuts", js.undefined)
  }
}
