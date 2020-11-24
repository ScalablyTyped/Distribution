package typings.nodePolyglot.mod

import org.scalablytyped.runtime.StringDictionary
import typings.nodePolyglot.anon.Length
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InterpolationOptions
  extends /* interpolationKey */ StringDictionary[js.Any] {
  
  @JSName("_")
  var _underscore: js.UndefOr[String] = js.native
  
  var smart_count: js.UndefOr[Double | Length] = js.native
}
object InterpolationOptions {
  
  @scala.inline
  def apply(): InterpolationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterpolationOptions]
  }
  
  @scala.inline
  implicit class InterpolationOptionsOps[Self <: InterpolationOptions] (val x: Self) extends AnyVal {
    
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
    def set_underscore(value: String): Self = this.set("_", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_underscore: Self = this.set("_", js.undefined)
    
    @scala.inline
    def setSmart_count(value: Double | Length): Self = this.set("smart_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmart_count: Self = this.set("smart_count", js.undefined)
  }
}
