package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsIconFontIconMod.IIconContent
import typings.officeUiFabricReact.libComponentsIconIconDottypesMod.IFontIconProps
import typings.officeUiFabricReact.libComponentsIconIconDottypesMod.IIconProps
import typings.officeUiFabricReact.libComponentsIconIconDottypesMod.IImageIconProps
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconMod {
  
  @JSImport("office-ui-fabric-react/lib/Icon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/Icon", "FontIcon")
  @js.native
  val FontIcon: FunctionComponent[IFontIconProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Icon", "Icon")
  @js.native
  val Icon: FunctionComponent[IIconProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Icon", "IconBase")
  @js.native
  open class IconBase protected ()
    extends typings.officeUiFabricReact.libComponentsIconMod.IconBase {
    def this(props: IIconProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Icon", "IconType")
  @js.native
  object IconType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.libComponentsIconIconDottypesMod.IconType & Double] = js.native
    
    /* 0 */ val default: typings.officeUiFabricReact.libComponentsIconIconDottypesMod.IconType.default & Double = js.native
    
    /* 100000 */ val Default: typings.officeUiFabricReact.libComponentsIconIconDottypesMod.IconType.Default & Double = js.native
    
    /* 100001 */ val Image: typings.officeUiFabricReact.libComponentsIconIconDottypesMod.IconType.Image & Double = js.native
    
    /* 1 */ val image: typings.officeUiFabricReact.libComponentsIconIconDottypesMod.IconType.image & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Icon", "ImageIcon")
  @js.native
  val ImageIcon: FunctionComponent[IImageIconProps] = js.native
  
  inline def getFontIcon(iconName: String): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontIcon")(iconName.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def getFontIcon(iconName: String, className: String): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontIcon")(iconName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  inline def getFontIcon(iconName: String, className: String, ariaLabel: String): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontIcon")(iconName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], ariaLabel.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  inline def getFontIcon(iconName: String, className: Unit, ariaLabel: String): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontIcon")(iconName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], ariaLabel.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  inline def getIconContent(): IIconContent | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconContent")().asInstanceOf[IIconContent | Null]
  inline def getIconContent(iconName: String): IIconContent | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconContent")(iconName.asInstanceOf[js.Any]).asInstanceOf[IIconContent | Null]
}
