package typings.openui5.anon

import typings.openui5.int
import typings.openui5.sapMUploadUploadSetItemMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Loaded extends StObject {
  
  /**
    * The item that is being uploaded.
    */
  var item: js.UndefOr[default] = js.undefined
  
  /**
    * The number of bytes transferred since the beginning of the operation. This doesn't include headers and
    * other overhead, but only the content itself
    */
  var loaded: js.UndefOr[int] = js.undefined
  
  /**
    * The total number of bytes of content that will be transferred during the operation. If the total size
    * is unknown, this value is zero.
    */
  var total: js.UndefOr[int] = js.undefined
}
object Loaded {
  
  inline def apply(): Loaded = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Loaded]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Loaded] (val x: Self) extends AnyVal {
    
    inline def setItem(value: default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setLoaded(value: int): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    
    inline def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
    
    inline def setTotal(value: int): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
  }
}
