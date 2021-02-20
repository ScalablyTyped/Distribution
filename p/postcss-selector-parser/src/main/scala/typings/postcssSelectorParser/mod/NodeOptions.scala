package typings.postcssSelectorParser.mod

import typings.postcssSelectorParser.anon.PartialSpaces
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeOptions[Value] extends StObject {
  
  var source: js.UndefOr[NodeSource] = js.native
  
  var sourceIndex: js.UndefOr[Double] = js.native
  
  var spaces: js.UndefOr[PartialSpaces] = js.native
  
  var value: Value = js.native
}
object NodeOptions {
  
  @scala.inline
  def apply[Value](value: Value): NodeOptions[Value] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeOptions[Value]]
  }
  
  @scala.inline
  implicit class NodeOptionsMutableBuilder[Self <: NodeOptions[_], Value] (val x: Self with NodeOptions[Value]) extends AnyVal {
    
    @scala.inline
    def setSource(value: NodeSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIndexUndefined: Self = StObject.set(x, "sourceIndex", js.undefined)
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setSpaces(value: PartialSpaces): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacesUndefined: Self = StObject.set(x, "spaces", js.undefined)
    
    @scala.inline
    def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
