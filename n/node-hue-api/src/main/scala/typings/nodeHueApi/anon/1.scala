package typings.nodeHueApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends js.Object {
  
  var `1`: String = js.native
  
  var `2`: String = js.native
  
  var `3`: String = js.native
  
  var `4`: String = js.native
  
  var `5`: String = js.native
  
  var `6`: String = js.native
  
  var `7`: String = js.native
  
  var `8`: String = js.native
}
object `1` {
  
  @scala.inline
  def apply(
    `1`: String,
    `2`: String,
    `3`: String,
    `4`: String,
    `5`: String,
    `6`: String,
    `7`: String,
    `8`: String
  ): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.updateDynamic("5")(`5`.asInstanceOf[js.Any])
    __obj.updateDynamic("6")(`6`.asInstanceOf[js.Any])
    __obj.updateDynamic("7")(`7`.asInstanceOf[js.Any])
    __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1Ops`[Self <: `1`] (val x: Self) extends AnyVal {
    
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
    def set1(value: String): Self = this.set("1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set2(value: String): Self = this.set("2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set3(value: String): Self = this.set("3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set4(value: String): Self = this.set("4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set5(value: String): Self = this.set("5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set6(value: String): Self = this.set("6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set7(value: String): Self = this.set("7", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set8(value: String): Self = this.set("8", value.asInstanceOf[js.Any])
  }
}
