package typings.officeUiFabricReact

import typings.officeUiFabricReact.imageTypesMod.IImageStyleProps
import typings.officeUiFabricReact.imageTypesMod.IImageStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Image/Image.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: IImageStyleProps): IImageStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IImageStyles]
}
