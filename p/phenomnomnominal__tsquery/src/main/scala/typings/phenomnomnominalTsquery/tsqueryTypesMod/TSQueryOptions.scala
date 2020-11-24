package typings.phenomnomnominalTsquery.tsqueryTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TSQueryOptions extends js.Object {
  
  var visitAllChildren: js.UndefOr[Boolean] = js.native
}
object TSQueryOptions {
  
  @scala.inline
  def apply(): TSQueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TSQueryOptions]
  }
  
  @scala.inline
  implicit class TSQueryOptionsOps[Self <: TSQueryOptions] (val x: Self) extends AnyVal {
    
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
    def setVisitAllChildren(value: Boolean): Self = this.set("visitAllChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisitAllChildren: Self = this.set("visitAllChildren", js.undefined)
  }
}
