package typings.node.dnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupOneOptions
  extends StObject
     with LookupOptions {
  
  @JSName("all")
  var all_LookupOneOptions: js.UndefOr[false] = js.undefined
}
object LookupOneOptions {
  
  inline def apply(): LookupOneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupOneOptions]
  }
  
  extension [Self <: LookupOneOptions](x: Self) {
    
    inline def setAll(value: false): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
  }
}
