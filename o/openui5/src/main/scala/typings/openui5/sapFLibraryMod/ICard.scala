package typings.openui5.sapFLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICard extends StObject {
  
  var __implements__sap_f_ICard: Boolean
}
object ICard {
  
  inline def apply(__implements__sap_f_ICard: Boolean): ICard = {
    val __obj = js.Dynamic.literal(__implements__sap_f_ICard = __implements__sap_f_ICard.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICard]
  }
  
  extension [Self <: ICard](x: Self) {
    
    inline def set__implements__sap_f_ICard(value: Boolean): Self = StObject.set(x, "__implements__sap_f_ICard", value.asInstanceOf[js.Any])
  }
}
