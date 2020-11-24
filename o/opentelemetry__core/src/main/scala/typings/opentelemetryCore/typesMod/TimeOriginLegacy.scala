package typings.opentelemetryCore.typesMod

import typings.opentelemetryCore.anon.FetchStart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeOriginLegacy extends js.Object {
  
  var timing: FetchStart = js.native
}
object TimeOriginLegacy {
  
  @scala.inline
  def apply(timing: FetchStart): TimeOriginLegacy = {
    val __obj = js.Dynamic.literal(timing = timing.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeOriginLegacy]
  }
  
  @scala.inline
  implicit class TimeOriginLegacyOps[Self <: TimeOriginLegacy] (val x: Self) extends AnyVal {
    
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
    def setTiming(value: FetchStart): Self = this.set("timing", value.asInstanceOf[js.Any])
  }
}
