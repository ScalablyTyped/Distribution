package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shared extends js.Object {
  
  // The identity of the owner of the shared item. Read-only.
  var owner: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  // Indicates the scope of how the item is shared: anonymous, organization, or users. Read-only.
  var scope: js.UndefOr[NullableOption[String]] = js.native
  
  // The identity of the user who shared the item. Read-only.
  var sharedBy: js.UndefOr[NullableOption[IdentitySet]] = js.native
  
  // The UTC date and time when the item was shared. Read-only.
  var sharedDateTime: js.UndefOr[NullableOption[String]] = js.native
}
object Shared {
  
  @scala.inline
  def apply(): Shared = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Shared]
  }
  
  @scala.inline
  implicit class SharedOps[Self <: Shared] (val x: Self) extends AnyVal {
    
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
    def setOwner(value: NullableOption[IdentitySet]): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setOwnerNull: Self = this.set("owner", null)
    
    @scala.inline
    def setScope(value: NullableOption[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setScopeNull: Self = this.set("scope", null)
    
    @scala.inline
    def setSharedBy(value: NullableOption[IdentitySet]): Self = this.set("sharedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedBy: Self = this.set("sharedBy", js.undefined)
    
    @scala.inline
    def setSharedByNull: Self = this.set("sharedBy", null)
    
    @scala.inline
    def setSharedDateTime(value: NullableOption[String]): Self = this.set("sharedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedDateTime: Self = this.set("sharedDateTime", js.undefined)
    
    @scala.inline
    def setSharedDateTimeNull: Self = this.set("sharedDateTime", null)
  }
}
