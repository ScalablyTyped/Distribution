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
  
  inline def apply(): IosVppEBook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosVppEBook]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IosVppEBook] (val x: Self) extends AnyVal {
    
    inline def setAppleId(value: NullableOption[String]): Self = StObject.set(x, "appleId", value.asInstanceOf[js.Any])
    
    inline def setAppleIdNull: Self = StObject.set(x, "appleId", null)
    
    inline def setAppleIdUndefined: Self = StObject.set(x, "appleId", js.undefined)
    
    inline def setGenres(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "genres", value.asInstanceOf[js.Any])
    
    inline def setGenresNull: Self = StObject.set(x, "genres", null)
    
    inline def setGenresUndefined: Self = StObject.set(x, "genres", js.undefined)
    
    inline def setGenresVarargs(value: String*): Self = StObject.set(x, "genres", js.Array(value*))
    
    inline def setLanguage(value: NullableOption[String]): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setSeller(value: NullableOption[String]): Self = StObject.set(x, "seller", value.asInstanceOf[js.Any])
    
    inline def setSellerNull: Self = StObject.set(x, "seller", null)
    
    inline def setSellerUndefined: Self = StObject.set(x, "seller", js.undefined)
    
    inline def setTotalLicenseCount(value: Double): Self = StObject.set(x, "totalLicenseCount", value.asInstanceOf[js.Any])
    
    inline def setTotalLicenseCountUndefined: Self = StObject.set(x, "totalLicenseCount", js.undefined)
    
    inline def setUsedLicenseCount(value: Double): Self = StObject.set(x, "usedLicenseCount", value.asInstanceOf[js.Any])
    
    inline def setUsedLicenseCountUndefined: Self = StObject.set(x, "usedLicenseCount", js.undefined)
    
    inline def setVppOrganizationName(value: NullableOption[String]): Self = StObject.set(x, "vppOrganizationName", value.asInstanceOf[js.Any])
    
    inline def setVppOrganizationNameNull: Self = StObject.set(x, "vppOrganizationName", null)
    
    inline def setVppOrganizationNameUndefined: Self = StObject.set(x, "vppOrganizationName", js.undefined)
    
    inline def setVppTokenId(value: String): Self = StObject.set(x, "vppTokenId", value.asInstanceOf[js.Any])
    
    inline def setVppTokenIdUndefined: Self = StObject.set(x, "vppTokenId", js.undefined)
  }
}
