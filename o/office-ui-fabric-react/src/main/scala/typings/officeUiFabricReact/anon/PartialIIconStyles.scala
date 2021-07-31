package typings.officeUiFabricReact.anon

import typings.uifabricMergeStyles.istyleMod.IStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/Icon/Icon.types.IIconStyles> */
trait PartialIIconStyles extends StObject {
  
  var imageContainer: js.UndefOr[IStyle] = js.undefined
  
  var root: js.UndefOr[IStyle] = js.undefined
}
object PartialIIconStyles {
  
  @scala.inline
  def apply(): PartialIIconStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIIconStyles]
  }
  
  @scala.inline
  implicit class PartialIIconStylesMutableBuilder[Self <: PartialIIconStyles] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImageContainer(value: IStyle): Self = StObject.set(x, "imageContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageContainerNull: Self = StObject.set(x, "imageContainer", null)
    
    @scala.inline
    def setImageContainerUndefined: Self = StObject.set(x, "imageContainer", js.undefined)
    
    @scala.inline
    def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNull: Self = StObject.set(x, "root", null)
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
