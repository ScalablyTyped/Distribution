package typings.officeUiFabricReact.anon

import typings.uifabricMergeStyles.libIstyleMod.IStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/Icon/Icon.types.IIconStyles> */
trait PartialIIconStyles extends StObject {
  
  var imageContainer: js.UndefOr[IStyle] = js.undefined
  
  var root: js.UndefOr[IStyle] = js.undefined
}
object PartialIIconStyles {
  
  inline def apply(): PartialIIconStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIIconStyles]
  }
  
  extension [Self <: PartialIIconStyles](x: Self) {
    
    inline def setImageContainer(value: IStyle): Self = StObject.set(x, "imageContainer", value.asInstanceOf[js.Any])
    
    inline def setImageContainerNull: Self = StObject.set(x, "imageContainer", null)
    
    inline def setImageContainerUndefined: Self = StObject.set(x, "imageContainer", js.undefined)
    
    inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
