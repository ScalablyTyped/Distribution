package typings.opentracing.mockSpanMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugInfo extends js.Object {
  
  var millis: js.Tuple3[Double, Double, Double] = js.native
  
  var operation: String = js.native
  
  var tags: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var uuid: String = js.native
}
object DebugInfo {
  
  @scala.inline
  def apply(millis: js.Tuple3[Double, Double, Double], operation: String, uuid: String): DebugInfo = {
    val __obj = js.Dynamic.literal(millis = millis.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugInfo]
  }
  
  @scala.inline
  implicit class DebugInfoOps[Self <: DebugInfo] (val x: Self) extends AnyVal {
    
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
    def setMillis(value: js.Tuple3[Double, Double, Double]): Self = this.set("millis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: String): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: StringDictionary[js.Any]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
