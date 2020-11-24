package typings.opentelemetryCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchStart extends js.Object {
  
  var fetchStart: Double = js.native
}
object FetchStart {
  
  @scala.inline
  def apply(fetchStart: Double): FetchStart = {
    val __obj = js.Dynamic.literal(fetchStart = fetchStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchStart]
  }
  
  @scala.inline
  implicit class FetchStartOps[Self <: FetchStart] (val x: Self) extends AnyVal {
    
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
    def setFetchStart(value: Double): Self = this.set("fetchStart", value.asInstanceOf[js.Any])
  }
}
