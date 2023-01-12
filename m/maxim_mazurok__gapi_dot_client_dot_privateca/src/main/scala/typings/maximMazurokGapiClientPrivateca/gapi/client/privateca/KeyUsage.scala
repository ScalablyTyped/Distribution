package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyUsage extends StObject {
  
  /** Describes high-level ways in which a key may be used. */
  var baseKeyUsage: js.UndefOr[KeyUsageOptions] = js.undefined
  
  /** Detailed scenarios in which a key may be used. */
  var extendedKeyUsage: js.UndefOr[ExtendedKeyUsageOptions] = js.undefined
  
  /** Used to describe extended key usages that are not listed in the KeyUsage.ExtendedKeyUsageOptions message. */
  var unknownExtendedKeyUsages: js.UndefOr[js.Array[ObjectId]] = js.undefined
}
object KeyUsage {
  
  inline def apply(): KeyUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyUsage] (val x: Self) extends AnyVal {
    
    inline def setBaseKeyUsage(value: KeyUsageOptions): Self = StObject.set(x, "baseKeyUsage", value.asInstanceOf[js.Any])
    
    inline def setBaseKeyUsageUndefined: Self = StObject.set(x, "baseKeyUsage", js.undefined)
    
    inline def setExtendedKeyUsage(value: ExtendedKeyUsageOptions): Self = StObject.set(x, "extendedKeyUsage", value.asInstanceOf[js.Any])
    
    inline def setExtendedKeyUsageUndefined: Self = StObject.set(x, "extendedKeyUsage", js.undefined)
    
    inline def setUnknownExtendedKeyUsages(value: js.Array[ObjectId]): Self = StObject.set(x, "unknownExtendedKeyUsages", value.asInstanceOf[js.Any])
    
    inline def setUnknownExtendedKeyUsagesUndefined: Self = StObject.set(x, "unknownExtendedKeyUsages", js.undefined)
    
    inline def setUnknownExtendedKeyUsagesVarargs(value: ObjectId*): Self = StObject.set(x, "unknownExtendedKeyUsages", js.Array(value*))
  }
}
