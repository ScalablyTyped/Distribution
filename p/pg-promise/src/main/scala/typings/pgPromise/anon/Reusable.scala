package typings.pgPromise.anon

import typings.pgPromise.mod.ITask
import typings.pgPromise.mod.TransactionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reusable[Ext] extends StObject {
  
  var cnd: js.UndefOr[Boolean | (js.Function1[/* t */ ITask[Ext] with Ext, Boolean])] = js.native
  
  var mode: js.UndefOr[TransactionMode | Null] = js.native
  
  var reusable: js.UndefOr[Boolean | (js.Function1[/* t */ ITask[Ext] with Ext, Boolean])] = js.native
  
  var tag: js.UndefOr[js.Any] = js.native
}
object Reusable {
  
  @scala.inline
  def apply[Ext](): Reusable[Ext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reusable[Ext]]
  }
  
  @scala.inline
  implicit class ReusableMutableBuilder[Self <: Reusable[_], Ext] (val x: Self with Reusable[Ext]) extends AnyVal {
    
    @scala.inline
    def setCnd(value: Boolean | (js.Function1[/* t */ ITask[Ext] with Ext, Boolean])): Self = StObject.set(x, "cnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCndFunction1(value: /* t */ ITask[Ext] with Ext => Boolean): Self = StObject.set(x, "cnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCndUndefined: Self = StObject.set(x, "cnd", js.undefined)
    
    @scala.inline
    def setMode(value: TransactionMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeNull: Self = StObject.set(x, "mode", null)
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setReusable(value: Boolean | (js.Function1[/* t */ ITask[Ext] with Ext, Boolean])): Self = StObject.set(x, "reusable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReusableFunction1(value: /* t */ ITask[Ext] with Ext => Boolean): Self = StObject.set(x, "reusable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReusableUndefined: Self = StObject.set(x, "reusable", js.undefined)
    
    @scala.inline
    def setTag(value: js.Any): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
