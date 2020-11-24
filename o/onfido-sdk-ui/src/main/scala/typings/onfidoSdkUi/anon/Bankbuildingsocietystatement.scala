package typings.onfidoSdkUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bankbuildingsocietystatement extends js.Object {
  
  var bank_building_society_statement: js.UndefOr[Boolean] = js.native
  
   // GBR only
  var benefit_letters: js.UndefOr[Boolean] = js.native
  
  var council_tax: js.UndefOr[Boolean] = js.native
  
  var driving_licence: js.UndefOr[Boolean] = js.native
  
   // GBR only
  var government_letter: js.UndefOr[Boolean] = js.native
  
  var national_identity_card: js.UndefOr[Boolean] = js.native
  
  var passport: js.UndefOr[Boolean] = js.native
  
  var utility_bill: js.UndefOr[Boolean] = js.native
}
object Bankbuildingsocietystatement {
  
  @scala.inline
  def apply(): Bankbuildingsocietystatement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bankbuildingsocietystatement]
  }
  
  @scala.inline
  implicit class BankbuildingsocietystatementOps[Self <: Bankbuildingsocietystatement] (val x: Self) extends AnyVal {
    
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
    def setBank_building_society_statement(value: Boolean): Self = this.set("bank_building_society_statement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBank_building_society_statement: Self = this.set("bank_building_society_statement", js.undefined)
    
    @scala.inline
    def setBenefit_letters(value: Boolean): Self = this.set("benefit_letters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBenefit_letters: Self = this.set("benefit_letters", js.undefined)
    
    @scala.inline
    def setCouncil_tax(value: Boolean): Self = this.set("council_tax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCouncil_tax: Self = this.set("council_tax", js.undefined)
    
    @scala.inline
    def setDriving_licence(value: Boolean): Self = this.set("driving_licence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriving_licence: Self = this.set("driving_licence", js.undefined)
    
    @scala.inline
    def setGovernment_letter(value: Boolean): Self = this.set("government_letter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGovernment_letter: Self = this.set("government_letter", js.undefined)
    
    @scala.inline
    def setNational_identity_card(value: Boolean): Self = this.set("national_identity_card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNational_identity_card: Self = this.set("national_identity_card", js.undefined)
    
    @scala.inline
    def setPassport(value: Boolean): Self = this.set("passport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassport: Self = this.set("passport", js.undefined)
    
    @scala.inline
    def setUtility_bill(value: Boolean): Self = this.set("utility_bill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUtility_bill: Self = this.set("utility_bill", js.undefined)
  }
}
