package typings.node.dnsMod

import typings.node.nodeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupOneOptions extends LookupOptions {
  
  @JSName("all")
  var all_LookupOneOptions: js.UndefOr[`false`] = js.native
}
object LookupOneOptions {
  
  @scala.inline
  def apply(): LookupOneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LookupOneOptions]
  }
  
  @scala.inline
  implicit class LookupOneOptionsMutableBuilder[Self <: LookupOneOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: `false`): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
  }
}
