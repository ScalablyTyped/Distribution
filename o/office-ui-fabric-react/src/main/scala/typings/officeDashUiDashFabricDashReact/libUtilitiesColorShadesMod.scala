package typings.officeDashUiDashFabricDashReact

import org.scalablytyped.runtime.TopLevel
import typings.officeDashUiDashFabricDashReact.libUtilitiesColorInterfacesMod.IColor
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Shade with Double] = js.native
    /* 1 */ @js.native
    object Shade1 extends TopLevel[Shade1 with Double]
    
    /* 2 */ @js.native
    object Shade2 extends TopLevel[Shade2 with Double]
    
    /* 3 */ @js.native
    object Shade3 extends TopLevel[Shade3 with Double]
    
    /* 4 */ @js.native
    object Shade4 extends TopLevel[Shade4 with Double]
    
    /* 5 */ @js.native
    object Shade5 extends TopLevel[Shade5 with Double]
    
    /* 6 */ @js.native
    object Shade6 extends TopLevel[Shade6 with Double]
    
    /* 7 */ @js.native
    object Shade7 extends TopLevel[Shade7 with Double]
    
    /* 8 */ @js.native
    object Shade8 extends TopLevel[Shade8 with Double]
    
    /* 0 */ @js.native
    object Unshaded extends TopLevel[Unshaded with Double]
    
  }
  
}

