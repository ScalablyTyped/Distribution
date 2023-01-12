package typings.node.dnsMod

import typings.node.nodeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupOneOptions
  extends StObject
     with LookupOptions {
  
  @JSName("all")
  var all_LookupOneOptions: js.UndefOr[`false`] = js.undefined
}
object LookupOneOptions {
  
  inline def apply(): LookupOneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupOneOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LookupOneOptions] (val x: Self) extends AnyVal {
    
    inline def setAll(value: `false`): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
  }
}
