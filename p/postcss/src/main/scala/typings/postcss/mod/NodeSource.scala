package typings.postcss.mod

import typings.postcss.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeSource extends StObject {
  
  /**
    * The ending position of the node's source.
    */
  var end: js.UndefOr[Column] = js.native
  
  var input: Input = js.native
  
  /**
    * The starting position of the node's source.
    */
  var start: js.UndefOr[Column] = js.native
}
object NodeSource {
  
  @scala.inline
  def apply(input: Input): NodeSource = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSource]
  }
  
  @scala.inline
  implicit class NodeSourceMutableBuilder[Self <: NodeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Column): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setInput(value: Input): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Column): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
