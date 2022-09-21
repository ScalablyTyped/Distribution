package typings.officeJs.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `hyperlink.toJSON()`. */
trait HyperlinkData extends StObject {
  
  /**
    *
    * Gets the address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets the description of a hyperlink. Read-only.
    *
    * [Api set:  1.1]
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets the extra URL request information used to resolve the hyperlink's URL. Read-only.
    *
    * [Api set:  1.1]
    */
  var extraInfo: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets the sub-address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  var subAddress: js.UndefOr[String] = js.undefined
}
object HyperlinkData {
  
  inline def apply(): HyperlinkData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperlinkData]
  }
  
  extension [Self <: HyperlinkData](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExtraInfo(value: String): Self = StObject.set(x, "extraInfo", value.asInstanceOf[js.Any])
    
    inline def setExtraInfoUndefined: Self = StObject.set(x, "extraInfo", js.undefined)
    
    inline def setSubAddress(value: String): Self = StObject.set(x, "subAddress", value.asInstanceOf[js.Any])
    
    inline def setSubAddressUndefined: Self = StObject.set(x, "subAddress", js.undefined)
  }
}
