package typings.numeral.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Billion extends js.Object {
  
  var billion: String = js.native
  
  var million: String = js.native
  
  var thousand: String = js.native
  
  var trillion: String = js.native
}
object Billion {
  
  @scala.inline
  def apply(billion: String, million: String, thousand: String, trillion: String): Billion = {
    val __obj = js.Dynamic.literal(billion = billion.asInstanceOf[js.Any], million = million.asInstanceOf[js.Any], thousand = thousand.asInstanceOf[js.Any], trillion = trillion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Billion]
  }
  
  @scala.inline
  implicit class BillionOps[Self <: Billion] (val x: Self) extends AnyVal {
    
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
    def setBillion(value: String): Self = this.set("billion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMillion(value: String): Self = this.set("million", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThousand(value: String): Self = this.set("thousand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrillion(value: String): Self = this.set("trillion", value.asInstanceOf[js.Any])
  }
}
