package typings.officeUiFabricReact

import typings.officeUiFabricReact.interfacesMod.IColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shadesMod {
  
  @js.native
  sealed trait Shade extends StObject
  @JSImport("office-ui-fabric-react/lib/utilities/color/shades", "Shade")
  @js.native
  object Shade extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Shade with Double] = js.native
    
    @js.native
    sealed trait Shade1 extends Shade
    /* 1 */ val Shade1: typings.officeUiFabricReact.shadesMod.Shade.Shade1 with Double = js.native
    
    @js.native
    sealed trait Shade2 extends Shade
    /* 2 */ val Shade2: typings.officeUiFabricReact.shadesMod.Shade.Shade2 with Double = js.native
    
    @js.native
    sealed trait Shade3 extends Shade
    /* 3 */ val Shade3: typings.officeUiFabricReact.shadesMod.Shade.Shade3 with Double = js.native
    
    @js.native
    sealed trait Shade4 extends Shade
    /* 4 */ val Shade4: typings.officeUiFabricReact.shadesMod.Shade.Shade4 with Double = js.native
    
    @js.native
    sealed trait Shade5 extends Shade
    /* 5 */ val Shade5: typings.officeUiFabricReact.shadesMod.Shade.Shade5 with Double = js.native
    
    @js.native
    sealed trait Shade6 extends Shade
    /* 6 */ val Shade6: typings.officeUiFabricReact.shadesMod.Shade.Shade6 with Double = js.native
    
    @js.native
    sealed trait Shade7 extends Shade
    /* 7 */ val Shade7: typings.officeUiFabricReact.shadesMod.Shade.Shade7 with Double = js.native
    
    @js.native
    sealed trait Shade8 extends Shade
    /* 8 */ val Shade8: typings.officeUiFabricReact.shadesMod.Shade.Shade8 with Double = js.native
    
    @js.native
    sealed trait Unshaded extends Shade
    /* 0 */ val Unshaded: typings.officeUiFabricReact.shadesMod.Shade.Unshaded with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/shades", "getBackgroundShade")
  @js.native
  def getBackgroundShade(color: IColor, shade: Shade): IColor | Null = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/color/shades", "getBackgroundShade")
  @js.native
  def getBackgroundShade(color: IColor, shade: Shade, isInverted: Boolean): IColor | Null = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/shades", "getContrastRatio")
  @js.native
  def getContrastRatio(color1: IColor, color2: IColor): Double = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/shades", "getShade")
  @js.native
  def getShade(color: IColor, shade: Shade): IColor | Null = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/color/shades", "getShade")
  @js.native
  def getShade(color: IColor, shade: Shade, isInverted: Boolean): IColor | Null = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/shades", "isDark")
  @js.native
  def isDark(color: IColor): Boolean = js.native
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/shades", "isValidShade")
  @js.native
  def isValidShade(): Boolean = js.native
  @JSImport("office-ui-fabric-react/lib/utilities/color/shades", "isValidShade")
  @js.native
  def isValidShade(shade: Shade): Boolean = js.native
}
