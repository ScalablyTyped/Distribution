package typings.officeUiFabricReact

import typings.officeUiFabricReact.fontIconMod.IIconContent
import typings.officeUiFabricReact.iconTypesMod.IFontIconProps
import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.officeUiFabricReact.iconTypesMod.IImageIconProps
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/Icon", JSImport.Namespace)
@js.native
object libIconMod extends js.Object {
  
  val FontIcon: FunctionComponent[IFontIconProps] = js.native
  
  val Icon: FunctionComponent[IIconProps] = js.native
  
  val ImageIcon: FunctionComponent[IImageIconProps] = js.native
  
  def getFontIcon(iconName: String): ReactElement | Null = js.native
  def getFontIcon(iconName: String, className: js.UndefOr[scala.Nothing], ariaLabel: String): ReactElement | Null = js.native
  def getFontIcon(iconName: String, className: String): ReactElement | Null = js.native
  def getFontIcon(iconName: String, className: String, ariaLabel: String): ReactElement | Null = js.native
  
  def getIconContent(): IIconContent | Null = js.native
  def getIconContent(iconName: String): IIconContent | Null = js.native
  
  @js.native
  class IconBase protected ()
    extends typings.officeUiFabricReact.iconMod.IconBase {
    def this(props: IIconProps) = this()
  }
  
  @js.native
  object IconType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.iconTypesMod.IconType with Double] = js.native
    
    /* 100000 */ val Default: typings.officeUiFabricReact.iconTypesMod.IconType.Default with Double = js.native
    
    /* 100001 */ val Image: typings.officeUiFabricReact.iconTypesMod.IconType.Image with Double = js.native
    
    /* 0 */ val default: typings.officeUiFabricReact.iconTypesMod.IconType.default with Double = js.native
    
    /* 1 */ val image: typings.officeUiFabricReact.iconTypesMod.IconType.image with Double = js.native
  }
}
