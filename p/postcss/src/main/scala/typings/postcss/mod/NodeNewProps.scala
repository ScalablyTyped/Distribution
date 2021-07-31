package typings.postcss.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeNewProps extends StObject {
  
  var raws: js.UndefOr[NodeRaws] = js.undefined
  
  var source: js.UndefOr[NodeSource] = js.undefined
}
object NodeNewProps {
  
  @scala.inline
  def apply(): NodeNewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeNewProps]
  }
  
  @scala.inline
  implicit class NodeNewPropsMutableBuilder[Self <: NodeNewProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaws(value: NodeRaws): Self = StObject.set(x, "raws", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawsUndefined: Self = StObject.set(x, "raws", js.undefined)
    
    @scala.inline
    def setSource(value: NodeSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
