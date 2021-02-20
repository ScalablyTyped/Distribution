package typings.node.dnsMod

import typings.node.nodeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupAllOptions extends LookupOptions {
  
  @JSName("all")
  var all_LookupAllOptions: `true` = js.native
}
object LookupAllOptions {
  
  @scala.inline
  def apply(all: `true`): LookupAllOptions = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupAllOptions]
  }
  
  @scala.inline
  implicit class LookupAllOptionsMutableBuilder[Self <: LookupAllOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll(value: `true`): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
  }
}
