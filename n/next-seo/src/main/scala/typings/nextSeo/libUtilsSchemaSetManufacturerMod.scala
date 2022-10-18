package typings.nextSeo

import typings.nextSeo.anon.Logo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsSchemaSetManufacturerMod {
  
  @JSImport("next-seo/lib/utils/schema/setManufacturer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def setManufacturer(): js.UndefOr[Logo] = ^.asInstanceOf[js.Dynamic].applyDynamic("setManufacturer")().asInstanceOf[js.UndefOr[Logo]]
  inline def setManufacturer(manufacturer: Manufacturer): js.UndefOr[Logo] = ^.asInstanceOf[js.Dynamic].applyDynamic("setManufacturer")(manufacturer.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Logo]]
  
  trait Manufacturer extends StObject {
    
    var manufacturerLogo: js.UndefOr[String] = js.undefined
    
    var manufacturerName: js.UndefOr[String] = js.undefined
  }
  object Manufacturer {
    
    inline def apply(): Manufacturer = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Manufacturer]
    }
    
    extension [Self <: Manufacturer](x: Self) {
      
      inline def setManufacturerLogo(value: String): Self = StObject.set(x, "manufacturerLogo", value.asInstanceOf[js.Any])
      
      inline def setManufacturerLogoUndefined: Self = StObject.set(x, "manufacturerLogo", js.undefined)
      
      inline def setManufacturerName(value: String): Self = StObject.set(x, "manufacturerName", value.asInstanceOf[js.Any])
      
      inline def setManufacturerNameUndefined: Self = StObject.set(x, "manufacturerName", js.undefined)
    }
  }
}
