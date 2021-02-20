package typings.officeUiFabricReact

import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Icon/Icon.base", "IconBase")
  @js.native
  class IconBase protected ()
    extends Component[IIconProps, IIconState, js.Any] {
    def this(props: IIconProps) = this()
    
    var _onImageLoadingStateChange: js.Any = js.native
  }
  
  @js.native
  trait IIconState extends StObject {
    
    var imageLoadError: Boolean = js.native
  }
  object IIconState {
    
    @scala.inline
    def apply(imageLoadError: Boolean): IIconState = {
      val __obj = js.Dynamic.literal(imageLoadError = imageLoadError.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIconState]
    }
    
    @scala.inline
    implicit class IIconStateMutableBuilder[Self <: IIconState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageLoadError(value: Boolean): Self = StObject.set(x, "imageLoadError", value.asInstanceOf[js.Any])
    }
  }
}
