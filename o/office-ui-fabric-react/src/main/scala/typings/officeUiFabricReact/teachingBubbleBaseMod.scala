package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.CalloutProps
import typings.officeUiFabricReact.teachingBubbleTypesMod.ITeachingBubbleProps
import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object teachingBubbleBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubble.base", "TeachingBubbleBase")
  @js.native
  class TeachingBubbleBase protected ()
    extends Component[ITeachingBubbleProps, ITeachingBubbleState, js.Any] {
    def this(props: ITeachingBubbleProps) = this()
    
    var _defaultCalloutProps: js.Any = js.native
    
    def focus(): Unit = js.native
    
    var rootElement: RefObject[HTMLDivElement] = js.native
  }
  /* static members */
  object TeachingBubbleBase {
    
    @JSImport("office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubble.base", "TeachingBubbleBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/TeachingBubble/TeachingBubble.base", "TeachingBubbleBase.defaultProps")
    @js.native
    def defaultProps: CalloutProps = js.native
    @scala.inline
    def defaultProps_=(x: CalloutProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ITeachingBubbleState extends StObject {
    
    var isTeachingBubbleVisible: js.UndefOr[Boolean] = js.native
  }
  object ITeachingBubbleState {
    
    @scala.inline
    def apply(): ITeachingBubbleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITeachingBubbleState]
    }
    
    @scala.inline
    implicit class ITeachingBubbleStateMutableBuilder[Self <: ITeachingBubbleState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsTeachingBubbleVisible(value: Boolean): Self = StObject.set(x, "isTeachingBubbleVisible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTeachingBubbleVisibleUndefined: Self = StObject.set(x, "isTeachingBubbleVisible", js.undefined)
    }
  }
}
