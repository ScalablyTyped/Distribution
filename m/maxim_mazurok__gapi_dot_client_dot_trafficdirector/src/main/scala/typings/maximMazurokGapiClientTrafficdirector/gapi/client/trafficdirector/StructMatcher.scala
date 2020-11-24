package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StructMatcher extends js.Object {
  
  /** The path to retrieve the Value from the Struct. */
  var path: js.UndefOr[js.Array[PathSegment]] = js.native
  
  /** The StructMatcher is matched if the value retrieved by path is matched to this value. */
  var value: js.UndefOr[ValueMatcher] = js.native
}
object StructMatcher {
  
  @scala.inline
  def apply(): StructMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StructMatcher]
  }
  
  @scala.inline
  implicit class StructMatcherOps[Self <: StructMatcher] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPathVarargs(value: PathSegment*): Self = this.set("path", js.Array(value :_*))
    
    @scala.inline
    def setPath(value: js.Array[PathSegment]): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setValue(value: ValueMatcher): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
