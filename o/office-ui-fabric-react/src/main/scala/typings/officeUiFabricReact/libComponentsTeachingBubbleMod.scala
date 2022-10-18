package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.CalloutProps
import typings.officeUiFabricReact.libComponentsTeachingBubbleTeachingBubbleDottypesMod.ITeachingBubbleProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsTeachingBubbleMod {
  
  @JSImport("office-ui-fabric-react/lib/components/TeachingBubble", "TeachingBubble")
  @js.native
  val TeachingBubble: FunctionComponent[ITeachingBubbleProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/TeachingBubble", "TeachingBubbleBase")
  @js.native
  open class TeachingBubbleBase protected ()
    extends typings.officeUiFabricReact.libComponentsTeachingBubbleTeachingBubbleDotbaseMod.TeachingBubbleBase {
    def this(props: ITeachingBubbleProps) = this()
  }
  /* static members */
  object TeachingBubbleBase {
    
    @JSImport("office-ui-fabric-react/lib/components/TeachingBubble", "TeachingBubbleBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/TeachingBubble", "TeachingBubbleBase.defaultProps")
    @js.native
    def defaultProps: CalloutProps = js.native
    inline def defaultProps_=(x: CalloutProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/TeachingBubble", "TeachingBubbleContent")
  @js.native
  val TeachingBubbleContent: FunctionComponent[ITeachingBubbleProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/TeachingBubble", "TeachingBubbleContentBase")
  @js.native
  open class TeachingBubbleContentBase protected ()
    extends typings.officeUiFabricReact.libComponentsTeachingBubbleTeachingBubbleContentDotbaseMod.TeachingBubbleContentBase {
    def this(props: ITeachingBubbleProps) = this()
  }
}
