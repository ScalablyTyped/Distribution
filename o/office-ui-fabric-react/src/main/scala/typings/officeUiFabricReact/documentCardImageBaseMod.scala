package typings.officeUiFabricReact

import typings.officeUiFabricReact.documentCardImageTypesMod.IDocumentCardImageProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentCardImageBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DocumentCard/DocumentCardImage.base", "DocumentCardImageBase")
  @js.native
  class DocumentCardImageBase protected ()
    extends Component[IDocumentCardImageProps, IDocumentCardImageState, js.Any] {
    def this(props: IDocumentCardImageProps) = this()
    
    var _classNames: js.Any = js.native
    
    var _onImageLoad: js.Any = js.native
    
    var _renderCenterIcon: js.Any = js.native
    
    var _renderCornerIcon: js.Any = js.native
  }
  
  @js.native
  trait IDocumentCardImageState extends StObject {
    
    val imageHasLoaded: Boolean = js.native
  }
  object IDocumentCardImageState {
    
    @scala.inline
    def apply(imageHasLoaded: Boolean): IDocumentCardImageState = {
      val __obj = js.Dynamic.literal(imageHasLoaded = imageHasLoaded.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDocumentCardImageState]
    }
    
    @scala.inline
    implicit class IDocumentCardImageStateMutableBuilder[Self <: IDocumentCardImageState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageHasLoaded(value: Boolean): Self = StObject.set(x, "imageHasLoaded", value.asInstanceOf[js.Any])
    }
  }
}
