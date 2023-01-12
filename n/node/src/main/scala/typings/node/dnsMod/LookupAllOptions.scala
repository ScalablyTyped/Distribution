package typings.node.dnsMod

import typings.node.nodeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupAllOptions
  extends StObject
     with LookupOptions {
  
  @JSName("all")
  var all_LookupAllOptions: `true`
}
object LookupAllOptions {
  
  inline def apply(): LookupAllOptions = {
    val __obj = js.Dynamic.literal(all = true)
    __obj.asInstanceOf[LookupAllOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LookupAllOptions] (val x: Self) extends AnyVal {
    
    inline def setAll(value: `true`): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
  }
}
