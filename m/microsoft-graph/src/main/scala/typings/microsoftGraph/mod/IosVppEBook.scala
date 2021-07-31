package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IosVppEBook
  extends StObject
     with ManagedEBook {
  
  // The Apple ID associated with Vpp token.
  var appleId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Genres.
  var genres: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
  
  // Language.
  var language: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Seller.
  var seller: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Total license count.
  var totalLicenseCount: js.UndefOr[Double] = js.undefined
  
  // Used license count.
  var usedLicenseCount: js.UndefOr[Double] = js.undefined
  
  // The Vpp token's organization name.
  var vppOrganizationName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The Vpp token ID.
  var vppTokenId: js.UndefOr[String] = js.undefined
}
object IosVppEBook {
  
  @scala.inline
  def apply(): IosVppEBook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosVppEBook]
  }
  
  @scala.inline
  implicit class IosVppEBookMutableBuilder[Self <: IosVppEBook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppleId(value: NullableOption[String]): Self = StObject.set(x, "appleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppleIdNull: Self = StObject.set(x, "appleId", null)
    
    @scala.inline
    def setAppleIdUndefined: Self = StObject.set(x, "appleId", js.undefined)
    
    @scala.inline
    def setGenres(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "genres", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenresNull: Self = StObject.set(x, "genres", null)
    
    @scala.inline
    def setGenresUndefined: Self = StObject.set(x, "genres", js.undefined)
    
    @scala.inline
    def setGenresVarargs(value: String*): Self = StObject.set(x, "genres", js.Array(value :_*))
    
    @scala.inline
    def setLanguage(value: NullableOption[String]): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageNull: Self = StObject.set(x, "language", null)
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setSeller(value: NullableOption[String]): Self = StObject.set(x, "seller", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSellerNull: Self = StObject.set(x, "seller", null)
    
    @scala.inline
    def setSellerUndefined: Self = StObject.set(x, "seller", js.undefined)
    
    @scala.inline
    def setTotalLicenseCount(value: Double): Self = StObject.set(x, "totalLicenseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalLicenseCountUndefined: Self = StObject.set(x, "totalLicenseCount", js.undefined)
    
    @scala.inline
    def setUsedLicenseCount(value: Double): Self = StObject.set(x, "usedLicenseCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedLicenseCountUndefined: Self = StObject.set(x, "usedLicenseCount", js.undefined)
    
    @scala.inline
    def setVppOrganizationName(value: NullableOption[String]): Self = StObject.set(x, "vppOrganizationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVppOrganizationNameNull: Self = StObject.set(x, "vppOrganizationName", null)
    
    @scala.inline
    def setVppOrganizationNameUndefined: Self = StObject.set(x, "vppOrganizationName", js.undefined)
    
    @scala.inline
    def setVppTokenId(value: String): Self = StObject.set(x, "vppTokenId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVppTokenIdUndefined: Self = StObject.set(x, "vppTokenId", js.undefined)
  }
}
