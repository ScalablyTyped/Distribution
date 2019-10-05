package typings.officeDashUiDashFabricDashReact

import typings.officeDashUiDashFabricDashReact.libUtilitiesColorInterfacesMod.IColor
import typings.officeDashUiDashFabricDashReact.libUtilitiesColorShadesMod.Shade
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/utilities/color/shades", JSImport.Namespace)
@js.native
object libUtilitiesColorShadesMod extends js.Object {
  @js.native
  sealed trait Shade extends js.Object
  
  def getBackgroundShade(color: IColor, shade: Shade): IColor | Null = js.native
  def getBackgroundShade(color: IColor, shade: Shade, isInverted: Boolean): IColor | Null = js.native
  def getContrastRatio(color1: IColor, color2: IColor): Double = js.native
  def getShade(color: IColor, shade: Shade): IColor | Null = js.native
  def getShade(color: IColor, shade: Shade, isInverted: Boolean): IColor | Null = js.native
  def isDark(color: IColor): Boolean = js.native
  def isValidShade(): Boolean = js.native
  def isValidShade(shade: Shade): Boolean = js.native
  @js.native
  object Shade extends js.Object {
    @js.native
    sealed trait Shade1 extends Shade
    
    @js.native
    sealed trait Shade2 extends Shade
    
    @js.native
    sealed trait Shade3 extends Shade
    
    @js.native
    sealed trait Shade4 extends Shade
    
    @js.native
    sealed trait Shade5 extends Shade
    
    @js.native
    sealed trait Shade6 extends Shade
    
    @js.native
    sealed trait Shade7 extends Shade
    
    @js.native
    sealed trait Shade8 extends Shade
    
    @js.native
    sealed trait Unshaded extends Shade
    
    /* 1 */ val Shade1: typings.officeDashUiDashFabricDashReact.libUtilitiesColorShadesMod.Shade.Shade1 with Double = js.native
    /* 2 */ val Shade2: typings.officeDashUiDashFabricDashReact.libUtilitiesColorShadesMod.Shade.Shade2 with Double = js.native
    /* 3 */ val Shade3: typings.officeDashUiDashFabricDashReact.libUtilitiesColorShadesMod.Shade.Shade3 with Double = js.native
    /* 4 */ val Shade4: typings.officeDashUiDashFabricDashReact.libUtilitiesColorShadesMod.Shade.Shade4 with Double = js.native
    /* 5 */ val Shade5: typings.officeDashUiDashFabricDashReact.libUtilitiesColorShadesMod.Shade.Shade5 with Double = js.native
    /* 6 */ val Shade6: typings.officeDashUiDashFabricDashReact.libUtilitiesColorShadesMod.Shade.Shade6 with Double = js.native
    /* 7 */ val Shade7: typings.officeDashUiDashFabricDashReact.libUtilitiesColorShadesMod.Shade.Shade7 with Double = js.native
    /* 8 */ val Shade8: typings.officeDashUiDashFabricDashReact.libUtilitiesColorShadesMod.Shade.Shade8 with Double = js.native
    /* 0 */ val Unshaded: typings.officeDashUiDashFabricDashReact.libUtilitiesColorShadesMod.Shade.Unshaded with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Shade with Double] = js.native
  }
  
}

