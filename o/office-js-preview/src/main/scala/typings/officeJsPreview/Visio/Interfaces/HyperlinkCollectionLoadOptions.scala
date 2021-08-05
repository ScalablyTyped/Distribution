package typings.officeJsPreview.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the Hyperlink Collection.
  *
  * [Api set:  1.1]
  */
trait HyperlinkCollectionLoadOptions extends StObject {
  
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  var address: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the description of a hyperlink. Read-only.
    *
    * [Api set:  1.1]
    */
  var description: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the extra URL request information used to resolve the hyperlink's URL. Read-only.
    *
    * [Api set:  1.1]
    */
  var extraInfo: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Gets the sub-address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  var subAddress: js.UndefOr[Boolean] = js.undefined
}
object HyperlinkCollectionLoadOptions {
  
  inline def apply(): HyperlinkCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperlinkCollectionLoadOptions]
  }
  
  extension [Self <: HyperlinkCollectionLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setAddress(value: Boolean): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setDescription(value: Boolean): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExtraInfo(value: Boolean): Self = StObject.set(x, "extraInfo", value.asInstanceOf[js.Any])
    
    inline def setExtraInfoUndefined: Self = StObject.set(x, "extraInfo", js.undefined)
    
    inline def setSubAddress(value: Boolean): Self = StObject.set(x, "subAddress", value.asInstanceOf[js.Any])
    
    inline def setSubAddressUndefined: Self = StObject.set(x, "subAddress", js.undefined)
  }
}
