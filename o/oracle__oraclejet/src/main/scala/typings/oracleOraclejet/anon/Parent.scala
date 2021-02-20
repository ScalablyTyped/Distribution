package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Parent[K] extends StObject {
  
  var index: js.UndefOr[Double] = js.native
  
  var key: js.UndefOr[K] = js.native
  
  var parent: js.UndefOr[typings.std.Element] = js.native
}
object Parent {
  
  @scala.inline
  def apply[K](): Parent[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parent[K]]
  }
  
  @scala.inline
  implicit class ParentMutableBuilder[Self <: Parent[_], K] (val x: Self with Parent[K]) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setParent(value: typings.std.Element): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
