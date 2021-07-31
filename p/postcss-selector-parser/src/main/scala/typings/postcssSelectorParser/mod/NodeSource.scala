package typings.postcssSelectorParser.mod

import typings.postcssSelectorParser.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeSource extends StObject {
  
  var end: js.UndefOr[Column] = js.undefined
  
  var start: js.UndefOr[Column] = js.undefined
}
object NodeSource {
  
  @scala.inline
  def apply(): NodeSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeSource]
  }
  
  @scala.inline
  implicit class NodeSourceMutableBuilder[Self <: NodeSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Column): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    @scala.inline
    def setStart(value: Column): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
