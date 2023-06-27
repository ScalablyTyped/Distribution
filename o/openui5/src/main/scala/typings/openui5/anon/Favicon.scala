package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Favicon extends StObject {
  
  /**
    * the ICO file to be used inside the browser and for desktop shortcuts
    */
  var favicon: js.UndefOr[String] = js.undefined
  
  /**
    * a 120x120 pixel version for iPhones with low pixel density
    */
  var phone: js.UndefOr[String] = js.undefined
  
  /**
    * a 180x180 pixel version for iPhones with high pixel density
    */
  var `phone@2`: js.UndefOr[String] = js.undefined
  
  /**
    * whether the home icons already have some glare effect (otherwise iOS will add it)
    */
  var precomposed: js.UndefOr[Boolean] = js.undefined
  
  /**
    * a 152x152 pixel version for iPads with low pixel density
    */
  var tablet: js.UndefOr[String] = js.undefined
  
  /**
    * a 167x167 pixel version for iPads with high pixel density
    */
  var `tablet@2`: js.UndefOr[String] = js.undefined
}
object Favicon {
  
  inline def apply(): Favicon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Favicon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Favicon] (val x: Self) extends AnyVal {
    
    inline def setFavicon(value: String): Self = StObject.set(x, "favicon", value.asInstanceOf[js.Any])
    
    inline def setFaviconUndefined: Self = StObject.set(x, "favicon", js.undefined)
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def `setPhone@2`(value: String): Self = StObject.set(x, "phone@2", value.asInstanceOf[js.Any])
    
    inline def `setPhone@2Undefined`: Self = StObject.set(x, "phone@2", js.undefined)
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setPrecomposed(value: Boolean): Self = StObject.set(x, "precomposed", value.asInstanceOf[js.Any])
    
    inline def setPrecomposedUndefined: Self = StObject.set(x, "precomposed", js.undefined)
    
    inline def setTablet(value: String): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
    
    inline def `setTablet@2`(value: String): Self = StObject.set(x, "tablet@2", value.asInstanceOf[js.Any])
    
    inline def `setTablet@2Undefined`: Self = StObject.set(x, "tablet@2", js.undefined)
    
    inline def setTabletUndefined: Self = StObject.set(x, "tablet", js.undefined)
  }
}
