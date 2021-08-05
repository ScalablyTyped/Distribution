package typings.nodeRedRuntime.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Catalogues extends StObject {
  
  /**
    * Alternative palette manager catalogues
    */
  var catalogues: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Enable/disable the Palette Manager
    */
  var editable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Override node colours - rules test against category/type by RegExp.
    */
  var theme: js.UndefOr[js.Array[Category]] = js.undefined
}
object Catalogues {
  
  inline def apply(): Catalogues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Catalogues]
  }
  
  extension [Self <: Catalogues](x: Self) {
    
    inline def setCatalogues(value: js.Array[String]): Self = StObject.set(x, "catalogues", value.asInstanceOf[js.Any])
    
    inline def setCataloguesUndefined: Self = StObject.set(x, "catalogues", js.undefined)
    
    inline def setCataloguesVarargs(value: String*): Self = StObject.set(x, "catalogues", js.Array(value :_*))
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setTheme(value: js.Array[Category]): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setThemeVarargs(value: Category*): Self = StObject.set(x, "theme", js.Array(value :_*))
  }
}
