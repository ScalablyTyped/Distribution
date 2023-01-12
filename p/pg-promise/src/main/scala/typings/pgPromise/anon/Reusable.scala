package typings.pgPromise.anon

import typings.pgPromise.mod.ITask
import typings.pgPromise.mod.TransactionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reusable[Ext] extends StObject {
  
  var cnd: js.UndefOr[Boolean | (js.Function1[/* t */ ITask[Ext] & Ext, Boolean])] = js.undefined
  
  var mode: js.UndefOr[TransactionMode | Null] = js.undefined
  
  var reusable: js.UndefOr[Boolean | (js.Function1[/* t */ ITask[Ext] & Ext, Boolean])] = js.undefined
  
  var tag: js.UndefOr[Any] = js.undefined
}
object Reusable {
  
  inline def apply[Ext](): Reusable[Ext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reusable[Ext]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Reusable[?], Ext] (val x: Self & Reusable[Ext]) extends AnyVal {
    
    inline def setCnd(value: Boolean | (js.Function1[/* t */ ITask[Ext] & Ext, Boolean])): Self = StObject.set(x, "cnd", value.asInstanceOf[js.Any])
    
    inline def setCndFunction1(value: /* t */ ITask[Ext] & Ext => Boolean): Self = StObject.set(x, "cnd", js.Any.fromFunction1(value))
    
    inline def setCndUndefined: Self = StObject.set(x, "cnd", js.undefined)
    
    inline def setMode(value: TransactionMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setReusable(value: Boolean | (js.Function1[/* t */ ITask[Ext] & Ext, Boolean])): Self = StObject.set(x, "reusable", value.asInstanceOf[js.Any])
    
    inline def setReusableFunction1(value: /* t */ ITask[Ext] & Ext => Boolean): Self = StObject.set(x, "reusable", js.Any.fromFunction1(value))
    
    inline def setReusableUndefined: Self = StObject.set(x, "reusable", js.undefined)
    
    inline def setTag(value: Any): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
