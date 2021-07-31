package typings.officeUiFabricReact

import typings.officeUiFabricReact.ratingTypesMod.IRatingStyleProps
import typings.officeUiFabricReact.ratingTypesMod.IRatingStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ratingStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Rating/Rating.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: IRatingStyleProps): IRatingStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IRatingStyles]
}
