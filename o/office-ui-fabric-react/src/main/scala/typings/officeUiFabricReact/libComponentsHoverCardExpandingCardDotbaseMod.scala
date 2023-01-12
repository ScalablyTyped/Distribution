package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.CompactCardHeight
import typings.officeUiFabricReact.libComponentsHoverCardExpandingCardDottypesMod.IExpandingCardProps
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsHoverCardExpandingCardDotbaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/HoverCard/ExpandingCard.base", "ExpandingCardBase")
  @js.native
  open class ExpandingCardBase protected () extends Component[IExpandingCardProps, IExpandingCardState, Any] {
    def this(props: IExpandingCardProps) = this()
    
    /* private */ var _async: Any = js.native
    
    /* private */ var _checkNeedsScroll: Any = js.native
    
    /* private */ var _classNames: Any = js.native
    
    /* private */ var _expandedElem: Any = js.native
    
    /* private */ var _onKeyDown: Any = js.native
    
    /* private */ var _onRenderCompactCard: Any = js.native
    
    /* private */ var _onRenderExpandedCard: Any = js.native
    
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
    inline def defaultProps_=(x: CompactCardHeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  trait IExpandingCardState extends StObject {
    
    var firstFrameRendered: Boolean
    
    var needsScroll: Boolean
  }
  object IExpandingCardState {
    
    inline def apply(firstFrameRendered: Boolean, needsScroll: Boolean): IExpandingCardState = {
      val __obj = js.Dynamic.literal(firstFrameRendered = firstFrameRendered.asInstanceOf[js.Any], needsScroll = needsScroll.asInstanceOf[js.Any])
      __obj.asInstanceOf[IExpandingCardState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IExpandingCardState] (val x: Self) extends AnyVal {
      
      inline def setFirstFrameRendered(value: Boolean): Self = StObject.set(x, "firstFrameRendered", value.asInstanceOf[js.Any])
      
      inline def setNeedsScroll(value: Boolean): Self = StObject.set(x, "needsScroll", value.asInstanceOf[js.Any])
    }
  }
}
