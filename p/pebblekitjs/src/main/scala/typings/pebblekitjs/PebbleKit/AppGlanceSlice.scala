package typings.pebblekitjs.PebbleKit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The structure of an app glance.
  */
@js.native
trait AppGlanceSlice extends js.Object {
  
  var expirationTime: js.UndefOr[String] = js.native
  
  var layout: Layout = js.native
}
object AppGlanceSlice {
  
  @scala.inline
  def apply(layout: Layout): AppGlanceSlice = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppGlanceSlice]
  }
  
  @scala.inline
  implicit class AppGlanceSliceOps[Self <: AppGlanceSlice] (val x: Self) extends AnyVal {
    
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
    def setLayout(value: Layout): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationTime(value: String): Self = this.set("expirationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpirationTime: Self = this.set("expirationTime", js.undefined)
  }
}
