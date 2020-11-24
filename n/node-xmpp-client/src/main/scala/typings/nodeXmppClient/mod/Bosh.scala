package typings.nodeXmppClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bosh extends js.Object {
  
  var prebind: js.UndefOr[js.Function2[/* error */ js.Any, /* data */ js.Any, Unit]] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object Bosh {
  
  @scala.inline
  def apply(): Bosh = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bosh]
  }
  
  @scala.inline
  implicit class BoshOps[Self <: Bosh] (val x: Self) extends AnyVal {
    
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
    def setPrebind(value: (/* error */ js.Any, /* data */ js.Any) => Unit): Self = this.set("prebind", js.Any.fromFunction2(value))
    
    @scala.inline
    def deletePrebind: Self = this.set("prebind", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
