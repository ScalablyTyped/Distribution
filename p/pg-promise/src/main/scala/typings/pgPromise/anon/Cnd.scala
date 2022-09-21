package typings.pgPromise.anon

import typings.pgPromise.mod.ITask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cnd[Ext] extends StObject {
  
  var cnd: js.UndefOr[Boolean | (js.Function1[/* t */ ITask[Ext] & Ext, Boolean])] = js.undefined
  
  var tag: js.UndefOr[Any] = js.undefined
}
object Cnd {
  
  inline def apply[Ext](): Cnd[Ext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cnd[Ext]]
  }
  
  extension [Self <: Cnd[?], Ext](x: Self & Cnd[Ext]) {
    
    inline def setCnd(value: Boolean | (js.Function1[/* t */ ITask[Ext] & Ext, Boolean])): Self = StObject.set(x, "cnd", value.asInstanceOf[js.Any])
    
    inline def setCndFunction1(value: /* t */ ITask[Ext] & Ext => Boolean): Self = StObject.set(x, "cnd", js.Any.fromFunction1(value))
    
    inline def setCndUndefined: Self = StObject.set(x, "cnd", js.undefined)
    
    inline def setTag(value: Any): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
