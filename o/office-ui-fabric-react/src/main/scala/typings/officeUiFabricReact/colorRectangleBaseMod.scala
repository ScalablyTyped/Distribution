package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PartialIColorRectanglePro
import typings.officeUiFabricReact.anon.ReadonlyIColorRectanglePr
import typings.officeUiFabricReact.anon.ReadonlyIColorRectangleSt
import typings.officeUiFabricReact.colorRectangleTypesMod.IColorRectangle
import typings.officeUiFabricReact.colorRectangleTypesMod.IColorRectangleProps
import typings.officeUiFabricReact.interfacesMod.IColor
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorRectangleBaseMod {
  
  @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.base", "ColorRectangleBase")
  @js.native
  class ColorRectangleBase protected ()
    extends Component[IColorRectangleProps, IColorRectangleState, js.Any]
       with IColorRectangle {
    def this(props: IColorRectangleProps) = this()
    
    var _descriptionId: js.Any = js.native
    
    var _disposables: js.Any = js.native
    
    var _disposeListeners: js.Any = js.native
    
    var _isAdjustingSaturation: js.Any = js.native
    
    var _onKeyDown: js.Any = js.native
    
    var _onMouseDown: js.Any = js.native
    
    var _onMouseMove: js.Any = js.native
    
    var _root: js.Any = js.native
    
    var _updateColor: js.Any = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MColorRectangleBase(prevProps: ReadonlyIColorRectanglePr, prevState: ReadonlyIColorRectangleSt): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MColorRectangleBase(): Unit = js.native
  }
  /* static members */
  object ColorRectangleBase {
    
    @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.base", "ColorRectangleBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.base", "ColorRectangleBase.defaultProps")
    @js.native
    def defaultProps: PartialIColorRectanglePro = js.native
    @scala.inline
    def defaultProps_=(x: PartialIColorRectanglePro): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.base", "_getNewColor")
  @js.native
  def getNewColor(ev: MouseEvent[Element, NativeMouseEvent], prevColor: IColor, root: HTMLElement): js.UndefOr[IColor] = js.native
  @JSImport("office-ui-fabric-react/lib/components/ColorPicker/ColorRectangle/ColorRectangle.base", "_getNewColor")
  @js.native
  def getNewColor(ev: typings.std.MouseEvent, prevColor: IColor, root: HTMLElement): js.UndefOr[IColor] = js.native
  
  @js.native
  trait IColorRectangleState extends StObject {
    
    var color: IColor = js.native
  }
  object IColorRectangleState {
    
    @scala.inline
    def apply(color: IColor): IColorRectangleState = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColorRectangleState]
    }
    
    @scala.inline
    implicit class IColorRectangleStateMutableBuilder[Self <: IColorRectangleState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: IColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    }
  }
}
