package typings.pgPromise.anon

import typings.pgPromise.mod.ITask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cnd[Ext] extends StObject {
  
  var cnd: js.UndefOr[Boolean | (js.Function1[/* t */ ITask[Ext] with Ext, Boolean])] = js.native
  
  var tag: js.UndefOr[js.Any] = js.native
}
object Cnd {
  
  @scala.inline
  def apply[Ext](): Cnd[Ext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cnd[Ext]]
  }
  
  @scala.inline
  implicit class CndMutableBuilder[Self <: Cnd[_], Ext] (val x: Self with Cnd[Ext]) extends AnyVal {
    
    @scala.inline
    def setCnd(value: Boolean | (js.Function1[/* t */ ITask[Ext] with Ext, Boolean])): Self = StObject.set(x, "cnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCndFunction1(value: /* t */ ITask[Ext] with Ext => Boolean): Self = StObject.set(x, "cnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCndUndefined: Self = StObject.set(x, "cnd", js.undefined)
    
    @scala.inline
    def setTag(value: js.Any): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
