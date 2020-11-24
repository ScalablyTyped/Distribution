package typings.pgPromise.mod

import typings.pgPromise.pgSubsetMod.IClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IConnectionOptions[C /* <: IClient */] extends js.Object {
  
  var direct: js.UndefOr[Boolean] = js.native
  
  var onLost: js.UndefOr[js.Function2[/* err */ js.Any, /* e */ ILostContext[C], Unit]] = js.native
}
object IConnectionOptions {
  
  @scala.inline
  def apply[C /* <: IClient */](): IConnectionOptions[C] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConnectionOptions[C]]
  }
  
  @scala.inline
  implicit class IConnectionOptionsOps[Self <: IConnectionOptions[_], C /* <: IClient */] (val x: Self with IConnectionOptions[C]) extends AnyVal {
    
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
    def setDirect(value: Boolean): Self = this.set("direct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirect: Self = this.set("direct", js.undefined)
    
    @scala.inline
    def setOnLost(value: (/* err */ js.Any, /* e */ ILostContext[C]) => Unit): Self = this.set("onLost", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnLost: Self = this.set("onLost", js.undefined)
  }
}
