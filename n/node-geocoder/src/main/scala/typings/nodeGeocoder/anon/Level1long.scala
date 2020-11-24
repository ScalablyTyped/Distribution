package typings.nodeGeocoder.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Level1long extends js.Object {
  
  var level1long: js.UndefOr[String] = js.native
  
  var level1short: js.UndefOr[String] = js.native
  
  var level2long: js.UndefOr[String] = js.native
  
  var level2short: js.UndefOr[String] = js.native
}
object Level1long {
  
  @scala.inline
  def apply(): Level1long = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Level1long]
  }
  
  @scala.inline
  implicit class Level1longOps[Self <: Level1long] (val x: Self) extends AnyVal {
    
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
    def setLevel1long(value: String): Self = this.set("level1long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel1long: Self = this.set("level1long", js.undefined)
    
    @scala.inline
    def setLevel1short(value: String): Self = this.set("level1short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel1short: Self = this.set("level1short", js.undefined)
    
    @scala.inline
    def setLevel2long(value: String): Self = this.set("level2long", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel2long: Self = this.set("level2long", js.undefined)
    
    @scala.inline
    def setLevel2short(value: String): Self = this.set("level2short", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel2short: Self = this.set("level2short", js.undefined)
  }
}
