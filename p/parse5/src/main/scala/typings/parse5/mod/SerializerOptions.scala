package typings.parse5.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializerOptions extends StObject {
  
  /***
    * Specifies input tree format.
    *
    * **Default:** `treeAdapters.default`
    */
  var treeAdapter: js.UndefOr[TreeAdapter] = js.undefined
}
object SerializerOptions {
  
  inline def apply(): SerializerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializerOptions]
  }
  
  extension [Self <: SerializerOptions](x: Self) {
    
    inline def setTreeAdapter(value: TreeAdapter): Self = StObject.set(x, "treeAdapter", value.asInstanceOf[js.Any])
    
    inline def setTreeAdapterUndefined: Self = StObject.set(x, "treeAdapter", js.undefined)
  }
}
