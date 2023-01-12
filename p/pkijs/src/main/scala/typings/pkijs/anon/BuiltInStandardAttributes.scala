package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuiltInStandardAttributes extends StObject {
  
  var blockName: js.UndefOr[String] = js.undefined
  
  var builtInStandardAttributes: js.UndefOr[js.Object] = js.undefined
  
  var dNSName: js.UndefOr[String] = js.undefined
  
  var directoryName: js.UndefOr[js.Object] = js.undefined
  
  var ediPartyName: js.UndefOr[String] = js.undefined
  
  var iPAddress: js.UndefOr[String] = js.undefined
  
  var otherName: js.UndefOr[String] = js.undefined
  
  var registeredID: js.UndefOr[String] = js.undefined
  
  var rfc822Name: js.UndefOr[String] = js.undefined
  
  var uniformResourceIdentifier: js.UndefOr[String] = js.undefined
  
  var x400Address: js.UndefOr[String] = js.undefined
}
object BuiltInStandardAttributes {
  
  inline def apply(): BuiltInStandardAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuiltInStandardAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuiltInStandardAttributes] (val x: Self) extends AnyVal {
    
    inline def setBlockName(value: String): Self = StObject.set(x, "blockName", value.asInstanceOf[js.Any])
    
    inline def setBlockNameUndefined: Self = StObject.set(x, "blockName", js.undefined)
    
    inline def setBuiltInStandardAttributes(value: js.Object): Self = StObject.set(x, "builtInStandardAttributes", value.asInstanceOf[js.Any])
    
    inline def setBuiltInStandardAttributesUndefined: Self = StObject.set(x, "builtInStandardAttributes", js.undefined)
    
    inline def setDNSName(value: String): Self = StObject.set(x, "dNSName", value.asInstanceOf[js.Any])
    
    inline def setDNSNameUndefined: Self = StObject.set(x, "dNSName", js.undefined)
    
    inline def setDirectoryName(value: js.Object): Self = StObject.set(x, "directoryName", value.asInstanceOf[js.Any])
    
    inline def setDirectoryNameUndefined: Self = StObject.set(x, "directoryName", js.undefined)
    
    inline def setEdiPartyName(value: String): Self = StObject.set(x, "ediPartyName", value.asInstanceOf[js.Any])
    
    inline def setEdiPartyNameUndefined: Self = StObject.set(x, "ediPartyName", js.undefined)
    
    inline def setIPAddress(value: String): Self = StObject.set(x, "iPAddress", value.asInstanceOf[js.Any])
    
    inline def setIPAddressUndefined: Self = StObject.set(x, "iPAddress", js.undefined)
    
    inline def setOtherName(value: String): Self = StObject.set(x, "otherName", value.asInstanceOf[js.Any])
    
    inline def setOtherNameUndefined: Self = StObject.set(x, "otherName", js.undefined)
    
    inline def setRegisteredID(value: String): Self = StObject.set(x, "registeredID", value.asInstanceOf[js.Any])
    
    inline def setRegisteredIDUndefined: Self = StObject.set(x, "registeredID", js.undefined)
    
    inline def setRfc822Name(value: String): Self = StObject.set(x, "rfc822Name", value.asInstanceOf[js.Any])
    
    inline def setRfc822NameUndefined: Self = StObject.set(x, "rfc822Name", js.undefined)
    
    inline def setUniformResourceIdentifier(value: String): Self = StObject.set(x, "uniformResourceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setUniformResourceIdentifierUndefined: Self = StObject.set(x, "uniformResourceIdentifier", js.undefined)
    
    inline def setX400Address(value: String): Self = StObject.set(x, "x400Address", value.asInstanceOf[js.Any])
    
    inline def setX400AddressUndefined: Self = StObject.set(x, "x400Address", js.undefined)
  }
}
