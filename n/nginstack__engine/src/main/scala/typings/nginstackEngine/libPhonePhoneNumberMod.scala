package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPhonePhoneNumberMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/phone/PhoneNumber", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with PhoneNumber {
    
    /* CompleteClass */
    var areaCode: Double = js.native
    
    /* CompleteClass */
    var countryCode: Double = js.native
    
    /* CompleteClass */
    var ddd: String = js.native
    
    /* CompleteClass */
    var ddi: String = js.native
    
    /* CompleteClass */
    var `extension`: String = js.native
    
    /* CompleteClass */
    var fullNumber: String = js.native
    
    /* CompleteClass */
    var localNumber: String = js.native
    
    /* CompleteClass */
    var number: String = js.native
  }
  @JSImport("@nginstack/engine/lib/phone/PhoneNumber", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait PhoneNumber extends StObject {
    
    var areaCode: Double
    
    var countryCode: Double
    
    var ddd: String
    
    var ddi: String
    
    var `extension`: String
    
    var fullNumber: String
    
    var localNumber: String
    
    var number: String
  }
  object PhoneNumber {
    
    inline def apply(
      areaCode: Double,
      countryCode: Double,
      ddd: String,
      ddi: String,
      `extension`: String,
      fullNumber: String,
      localNumber: String,
      number: String
    ): PhoneNumber = {
      val __obj = js.Dynamic.literal(areaCode = areaCode.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], ddd = ddd.asInstanceOf[js.Any], ddi = ddi.asInstanceOf[js.Any], fullNumber = fullNumber.asInstanceOf[js.Any], localNumber = localNumber.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PhoneNumber]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PhoneNumber] (val x: Self) extends AnyVal {
      
      inline def setAreaCode(value: Double): Self = StObject.set(x, "areaCode", value.asInstanceOf[js.Any])
      
      inline def setCountryCode(value: Double): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      inline def setDdd(value: String): Self = StObject.set(x, "ddd", value.asInstanceOf[js.Any])
      
      inline def setDdi(value: String): Self = StObject.set(x, "ddi", value.asInstanceOf[js.Any])
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setFullNumber(value: String): Self = StObject.set(x, "fullNumber", value.asInstanceOf[js.Any])
      
      inline def setLocalNumber(value: String): Self = StObject.set(x, "localNumber", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    }
  }
}
