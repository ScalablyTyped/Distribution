package typings.officeUiFabricReact.personaTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPersonaCoinStyles extends StObject {
  
  var coin: IStyle
  
  var image: IStyle
  
  var imageArea: IStyle
  
  var initials: IStyle
  
  var size10WithoutPresenceIcon: IStyle
}
object IPersonaCoinStyles {
  
  inline def apply(): IPersonaCoinStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonaCoinStyles]
  }
  
  extension [Self <: IPersonaCoinStyles](x: Self) {
    
    inline def setCoin(value: IStyle): Self = StObject.set(x, "coin", value.asInstanceOf[js.Any])
    
    inline def setCoinNull: Self = StObject.set(x, "coin", null)
    
    inline def setCoinUndefined: Self = StObject.set(x, "coin", js.undefined)
    
    inline def setImage(value: IStyle): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageArea(value: IStyle): Self = StObject.set(x, "imageArea", value.asInstanceOf[js.Any])
    
    inline def setImageAreaNull: Self = StObject.set(x, "imageArea", null)
    
    inline def setImageAreaUndefined: Self = StObject.set(x, "imageArea", js.undefined)
    
    inline def setImageNull: Self = StObject.set(x, "image", null)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setInitials(value: IStyle): Self = StObject.set(x, "initials", value.asInstanceOf[js.Any])
    
    inline def setInitialsNull: Self = StObject.set(x, "initials", null)
    
    inline def setInitialsUndefined: Self = StObject.set(x, "initials", js.undefined)
    
    inline def setSize10WithoutPresenceIcon(value: IStyle): Self = StObject.set(x, "size10WithoutPresenceIcon", value.asInstanceOf[js.Any])
    
    inline def setSize10WithoutPresenceIconNull: Self = StObject.set(x, "size10WithoutPresenceIcon", null)
    
    inline def setSize10WithoutPresenceIconUndefined: Self = StObject.set(x, "size10WithoutPresenceIcon", js.undefined)
  }
}
