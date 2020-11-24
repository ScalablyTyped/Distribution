package typings.maximMazurokGapiClientGamesmanagement.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FamilyName extends js.Object {
  
  /** The family name of this player. In some places, this is known as the last name. */
  var familyName: js.UndefOr[String] = js.native
  
  /** The given name of this player. In some places, this is known as the first name. */
  var givenName: js.UndefOr[String] = js.native
}
object FamilyName {
  
  @scala.inline
  def apply(): FamilyName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FamilyName]
  }
  
  @scala.inline
  implicit class FamilyNameOps[Self <: FamilyName] (val x: Self) extends AnyVal {
    
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
    def setFamilyName(value: String): Self = this.set("familyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamilyName: Self = this.set("familyName", js.undefined)
    
    @scala.inline
    def setGivenName(value: String): Self = this.set("givenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGivenName: Self = this.set("givenName", js.undefined)
  }
}
