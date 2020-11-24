package typings.openjscad

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICenter extends js.Object {
  
  def center(cAxes: js.Array[String]): CxG = js.native
}
object ICenter {
  
  @scala.inline
  def apply(center: js.Array[String] => CxG): ICenter = {
    val __obj = js.Dynamic.literal(center = js.Any.fromFunction1(center))
    __obj.asInstanceOf[ICenter]
  }
  
  @scala.inline
  implicit class ICenterOps[Self <: ICenter] (val x: Self) extends AnyVal {
    
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
    def setCenter(value: js.Array[String] => CxG): Self = this.set("center", js.Any.fromFunction1(value))
  }
}
