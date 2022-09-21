package typings.officeUiFabricReact

import typings.officeUiFabricReact.fontIconMod.IIconContent
import typings.officeUiFabricReact.iconTypesMod.IFontIconProps
import typings.officeUiFabricReact.iconTypesMod.IIconProps
import typings.officeUiFabricReact.iconTypesMod.IImageIconProps
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Icon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Icon", "FontIcon")
  @js.native
  val FontIcon: FunctionComponent[IFontIconProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Icon", "Icon")
  @js.native
  val Icon: FunctionComponent[IIconProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Icon", "IconBase")
  @js.native
  open class IconBase protected ()
    extends typings.officeUiFabricReact.iconBaseMod.IconBase {
    def this(props: IIconProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Icon", "IconType")
  @js.native
  object IconType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.iconTypesMod.IconType & Double] = js.native
    
    /* 0 */ val default: typings.officeUiFabricReact.iconTypesMod.IconType.default & Double = js.native
    
    /* 100000 */ val Default: typings.officeUiFabricReact.iconTypesMod.IconType.Default & Double = js.native
    
    /* 100001 */ val Image: typings.officeUiFabricReact.iconTypesMod.IconType.Image & Double = js.native
    
    /* 1 */ val image: typings.officeUiFabricReact.iconTypesMod.IconType.image & Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Icon", "ImageIcon")
  @js.native
  val ImageIcon: FunctionComponent[IImageIconProps] = js.native
  
  inline def getFontIcon(iconName: String): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontIcon")(iconName.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def getFontIcon(iconName: String, className: String): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontIcon")(iconName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  inline def getFontIcon(iconName: String, className: String, ariaLabel: String): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontIcon")(iconName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], ariaLabel.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  inline def getFontIcon(iconName: String, className: Unit, ariaLabel: String): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontIcon")(iconName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], ariaLabel.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  inline def getIconContent(): IIconContent | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconContent")().asInstanceOf[IIconContent | Null]
  inline def getIconContent(iconName: String): IIconContent | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconContent")(iconName.asInstanceOf[js.Any]).asInstanceOf[IIconContent | Null]
}
