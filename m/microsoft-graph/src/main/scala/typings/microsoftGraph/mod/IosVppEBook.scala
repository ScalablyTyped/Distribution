package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IosVppEBook extends ManagedEBook {
  
  // The Apple ID associated with Vpp token.
  var appleId: js.UndefOr[NullableOption[String]] = js.native
  
  // Genres.
  var genres: js.UndefOr[NullableOption[js.Array[String]]] = js.native
  
  // Language.
  var language: js.UndefOr[NullableOption[String]] = js.native
  
  // Seller.
  var seller: js.UndefOr[NullableOption[String]] = js.native
  
  // Total license count.
  var totalLicenseCount: js.UndefOr[Double] = js.native
  
  // Used license count.
  var usedLicenseCount: js.UndefOr[Double] = js.native
  
  // The Vpp token's organization name.
  var vppOrganizationName: js.UndefOr[NullableOption[String]] = js.native
  
  // The Vpp token ID.
  var vppTokenId: js.UndefOr[String] = js.native
}
object IosVppEBook {
  
  @scala.inline
  def apply(): IosVppEBook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosVppEBook]
  }
  
  @scala.inline
  implicit class IosVppEBookOps[Self <: IosVppEBook] (val x: Self) extends AnyVal {
    
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
    def setAppleId(value: NullableOption[String]): Self = this.set("appleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppleId: Self = this.set("appleId", js.undefined)
    
    @scala.inline
    def setAppleIdNull: Self = this.set("appleId", null)
    
    @scala.inline
    def setGenresVarargs(value: String*): Self = this.set("genres", js.Array(value :_*))
    
    @scala.inline
    def setGenres(value: NullableOption[js.Array[String]]): Self = this.set("genres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenres: Self = this.set("genres", js.undefined)
    
    @scala.inline
    def setGenresNull: Self = this.set("genres", null)
    
    @scala.inline
    def setLanguage(value: NullableOption[String]): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLanguageNull: Self = this.set("language", null)
    
    @scala.inline
    def setSeller(value: NullableOption[String]): Self = this.set("seller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeller: Self = this.set("seller", js.undefined)
    
    @scala.inline
    def setSellerNull: Self = this.set("seller", null)
    
    @scala.inline
    def setTotalLicenseCount(value: Double): Self = this.set("totalLicenseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalLicenseCount: Self = this.set("totalLicenseCount", js.undefined)
    
    @scala.inline
    def setUsedLicenseCount(value: Double): Self = this.set("usedLicenseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsedLicenseCount: Self = this.set("usedLicenseCount", js.undefined)
    
    @scala.inline
    def setVppOrganizationName(value: NullableOption[String]): Self = this.set("vppOrganizationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVppOrganizationName: Self = this.set("vppOrganizationName", js.undefined)
    
    @scala.inline
    def setVppOrganizationNameNull: Self = this.set("vppOrganizationName", null)
    
    @scala.inline
    def setVppTokenId(value: String): Self = this.set("vppTokenId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVppTokenId: Self = this.set("vppTokenId", js.undefined)
  }
}
