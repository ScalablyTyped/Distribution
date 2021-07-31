package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.CompactCardHeight
import typings.officeUiFabricReact.expandingCardTypesMod.IExpandingCardProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object expandingCardBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/HoverCard/ExpandingCard.base", "ExpandingCardBase")
  @js.native
  class ExpandingCardBase protected ()
    extends Component[IExpandingCardProps, IExpandingCardState, js.Any] {
    def this(props: IExpandingCardProps) = this()
    
    var _async: js.Any = js.native
    
    var _checkNeedsScroll: js.Any = js.native
    
    var _classNames: js.Any = js.native
    
    var _expandedElem: js.Any = js.native
    
    var _onKeyDown: js.Any = js.native
    
    var _onRenderCompactCard: js.Any = js.native
    
    var _onRenderExpandedCard: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MExpandingCardBase(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MExpandingCardBase(): Unit = js.native
  }
  /* static members */
  object ExpandingCardBase {
    
    @JSImport("office-ui-fabric-react/lib/components/HoverCard/ExpandingCard.base", "ExpandingCardBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/HoverCard/ExpandingCard.base", "ExpandingCardBase.defaultProps")
    @js.native
    def defaultProps: CompactCardHeight = js.native
    @scala.inline
    def defaultProps_=(x: CompactCardHeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IExpandingCardState extends StObject {
    
    var firstFrameRendered: Boolean
    
    var needsScroll: Boolean
  }
  object IExpandingCardState {
    
    @scala.inline
    def apply(firstFrameRendered: Boolean, needsScroll: Boolean): IExpandingCardState = {
      val __obj = js.Dynamic.literal(firstFrameRendered = firstFrameRendered.asInstanceOf[js.Any], needsScroll = needsScroll.asInstanceOf[js.Any])
      __obj.asInstanceOf[IExpandingCardState]
    }
    
    @scala.inline
    implicit class IExpandingCardStateMutableBuilder[Self <: IExpandingCardState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirstFrameRendered(value: Boolean): Self = StObject.set(x, "firstFrameRendered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNeedsScroll(value: Boolean): Self = StObject.set(x, "needsScroll", value.asInstanceOf[js.Any])
    }
  }
}
