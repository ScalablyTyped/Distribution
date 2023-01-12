package typings.node.dnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupOptions extends StObject {
  
  var all: js.UndefOr[Boolean] = js.undefined
  
  var family: js.UndefOr[Double] = js.undefined
  
  var hints: js.UndefOr[Double] = js.undefined
  
  /**
    * @default true
    */
  var verbatim: js.UndefOr[Boolean] = js.undefined
}
object LookupOptions {
  
  inline def apply(): LookupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LookupOptions] (val x: Self) extends AnyVal {
    
    inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    
    inline def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
    
    inline def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
    
    inline def setHints(value: Double): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
    
    inline def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
    
    inline def setVerbatim(value: Boolean): Self = StObject.set(x, "verbatim", value.asInstanceOf[js.Any])
    
    inline def setVerbatimUndefined: Self = StObject.set(x, "verbatim", js.undefined)
  }
}
