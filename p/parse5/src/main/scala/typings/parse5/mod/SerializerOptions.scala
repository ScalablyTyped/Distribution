package typings.parse5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerializerOptions extends StObject {
  
  /***
    * Specifies input tree format.
    *
    * **Default:** `treeAdapters.default`
    */
  var treeAdapter: js.UndefOr[TreeAdapter] = js.native
}
object SerializerOptions {
  
  @scala.inline
  def apply(): SerializerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializerOptions]
  }
  
  @scala.inline
  implicit class SerializerOptionsMutableBuilder[Self <: SerializerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTreeAdapter(value: TreeAdapter): Self = StObject.set(x, "treeAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTreeAdapterUndefined: Self = StObject.set(x, "treeAdapter", js.undefined)
  }
}
