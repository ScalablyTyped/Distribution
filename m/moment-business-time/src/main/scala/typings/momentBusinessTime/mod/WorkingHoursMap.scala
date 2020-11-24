package typings.momentBusinessTime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkingHoursMap extends js.Object {
  
  var `0`: js.Array[String] | Null = js.native
  
  var `1`: js.Array[String] | Null = js.native
  
  var `2`: js.Array[String] | Null = js.native
  
  var `3`: js.Array[String] | Null = js.native
  
  var `4`: js.Array[String] | Null = js.native
  
  var `5`: js.Array[String] | Null = js.native
  
  var `6`: js.Array[String] | Null = js.native
}
object WorkingHoursMap {
  
  @scala.inline
  def apply(): WorkingHoursMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkingHoursMap]
  }
  
  @scala.inline
  implicit class WorkingHoursMapOps[Self <: WorkingHoursMap] (val x: Self) extends AnyVal {
    
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
    def set0Varargs(value: String*): Self = this.set("0", js.Array(value :_*))
    
    @scala.inline
    def set0(value: js.Array[String]): Self = this.set("0", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set0Null: Self = this.set("0", null)
    
    @scala.inline
    def set1Varargs(value: String*): Self = this.set("1", js.Array(value :_*))
    
    @scala.inline
    def set1(value: js.Array[String]): Self = this.set("1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set1Null: Self = this.set("1", null)
    
    @scala.inline
    def set2Varargs(value: String*): Self = this.set("2", js.Array(value :_*))
    
    @scala.inline
    def set2(value: js.Array[String]): Self = this.set("2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set2Null: Self = this.set("2", null)
    
    @scala.inline
    def set3Varargs(value: String*): Self = this.set("3", js.Array(value :_*))
    
    @scala.inline
    def set3(value: js.Array[String]): Self = this.set("3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set3Null: Self = this.set("3", null)
    
    @scala.inline
    def set4Varargs(value: String*): Self = this.set("4", js.Array(value :_*))
    
    @scala.inline
    def set4(value: js.Array[String]): Self = this.set("4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set4Null: Self = this.set("4", null)
    
    @scala.inline
    def set5Varargs(value: String*): Self = this.set("5", js.Array(value :_*))
    
    @scala.inline
    def set5(value: js.Array[String]): Self = this.set("5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set5Null: Self = this.set("5", null)
    
    @scala.inline
    def set6Varargs(value: String*): Self = this.set("6", js.Array(value :_*))
    
    @scala.inline
    def set6(value: js.Array[String]): Self = this.set("6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set6Null: Self = this.set("6", null)
  }
}
