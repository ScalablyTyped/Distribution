package typings.officeUiFabricReact

import typings.officeUiFabricReact.interfacesMod.IColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shadesMod {
  
  @JSImport("office-ui-fabric-react/lib/utilities/color/shades", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Shade extends StObject
  @JSImport("office-ui-fabric-react/lib/utilities/color/shades", "Shade")
  @js.native
  object Shade extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Shade & Double] = js.native
    
    @js.native
    sealed trait Shade1
      extends StObject
         with Shade
    /* 1 */ val Shade1: typings.officeUiFabricReact.shadesMod.Shade.Shade1 & Double = js.native
    
    @js.native
    sealed trait Shade2
      extends StObject
         with Shade
    /* 2 */ val Shade2: typings.officeUiFabricReact.shadesMod.Shade.Shade2 & Double = js.native
    
    @js.native
    sealed trait Shade3
      extends StObject
         with Shade
    /* 3 */ val Shade3: typings.officeUiFabricReact.shadesMod.Shade.Shade3 & Double = js.native
    
    @js.native
    sealed trait Shade4
      extends StObject
         with Shade
    /* 4 */ val Shade4: typings.officeUiFabricReact.shadesMod.Shade.Shade4 & Double = js.native
    
    @js.native
    sealed trait Shade5
      extends StObject
         with Shade
    /* 5 */ val Shade5: typings.officeUiFabricReact.shadesMod.Shade.Shade5 & Double = js.native
    
    @js.native
    sealed trait Shade6
      extends StObject
         with Shade
    /* 6 */ val Shade6: typings.officeUiFabricReact.shadesMod.Shade.Shade6 & Double = js.native
    
    @js.native
    sealed trait Shade7
      extends StObject
         with Shade
    /* 7 */ val Shade7: typings.officeUiFabricReact.shadesMod.Shade.Shade7 & Double = js.native
    
    @js.native
    sealed trait Shade8
      extends StObject
         with Shade
    /* 8 */ val Shade8: typings.officeUiFabricReact.shadesMod.Shade.Shade8 & Double = js.native
    
    @js.native
    sealed trait Unshaded
      extends StObject
         with Shade
    /* 0 */ val Unshaded: typings.officeUiFabricReact.shadesMod.Shade.Unshaded & Double = js.native
  }
  
  inline def getBackgroundShade(color: IColor, shade: Shade): IColor | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getBackgroundShade")(color.asInstanceOf[js.Any], shade.asInstanceOf[js.Any])).asInstanceOf[IColor | Null]
  inline def getBackgroundShade(color: IColor, shade: Shade, isInverted: Boolean): IColor | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getBackgroundShade")(color.asInstanceOf[js.Any], shade.asInstanceOf[js.Any], isInverted.asInstanceOf[js.Any])).asInstanceOf[IColor | Null]
  
  inline def getContrastRatio(color1: IColor, color2: IColor): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getContrastRatio")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getShade(color: IColor, shade: Shade): IColor | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getShade")(color.asInstanceOf[js.Any], shade.asInstanceOf[js.Any])).asInstanceOf[IColor | Null]
  inline def getShade(color: IColor, shade: Shade, isInverted: Boolean): IColor | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getShade")(color.asInstanceOf[js.Any], shade.asInstanceOf[js.Any], isInverted.asInstanceOf[js.Any])).asInstanceOf[IColor | Null]
  
  inline def isDark(color: IColor): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDark")(color.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidShade(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidShade")().asInstanceOf[Boolean]
  inline def isValidShade(shade: Shade): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidShade")(shade.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
