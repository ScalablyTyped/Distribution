package typings.officeUiFabricReact

import typings.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubbleStyleProps
import typings.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubbleStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object teachingBubbleStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubble.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: ITeachingBubbleStyleProps): ITeachingBubbleStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ITeachingBubbleStyles]
}
