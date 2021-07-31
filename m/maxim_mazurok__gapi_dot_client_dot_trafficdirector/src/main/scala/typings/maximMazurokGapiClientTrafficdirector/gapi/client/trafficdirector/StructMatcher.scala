package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructMatcher extends StObject {
  
  /** The path to retrieve the Value from the Struct. */
  var path: js.UndefOr[js.Array[PathSegment]] = js.undefined
  
  /** The StructMatcher is matched if the value retrieved by path is matched to this value. */
  var value: js.UndefOr[ValueMatcher] = js.undefined
}
object StructMatcher {
  
  @scala.inline
  def apply(): StructMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructMatcher]
  }
  
  @scala.inline
  implicit class StructMatcherMutableBuilder[Self <: StructMatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: js.Array[PathSegment]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPathVarargs(value: PathSegment*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: ValueMatcher): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
