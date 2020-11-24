package typings.pgPromise.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RawType extends js.Object {
  
  var rawType: js.Symbol = js.native
  
  var toPostgres: js.Symbol = js.native
}
object RawType {
  
  @scala.inline
  def apply(rawType: js.Symbol, toPostgres: js.Symbol): RawType = {
    val __obj = js.Dynamic.literal(rawType = rawType.asInstanceOf[js.Any], toPostgres = toPostgres.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawType]
  }
  
  @scala.inline
  implicit class RawTypeOps[Self <: RawType] (val x: Self) extends AnyVal {
    
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
    def setRawType(value: js.Symbol): Self = this.set("rawType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToPostgres(value: js.Symbol): Self = this.set("toPostgres", value.asInstanceOf[js.Any])
  }
}
