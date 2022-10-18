package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsIconIconDottypesMod.IFontIconProps
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsIconFontIconMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Icon/FontIcon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Icon/FontIcon", "FontIcon")
  @js.native
  val FontIcon: FunctionComponent[IFontIconProps] = js.native
  
  inline def getFontIcon(iconName: String): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontIcon")(iconName.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  inline def getFontIcon(iconName: String, className: String): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontIcon")(iconName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  inline def getFontIcon(iconName: String, className: String, ariaLabel: String): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontIcon")(iconName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], ariaLabel.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  inline def getFontIcon(iconName: String, className: Unit, ariaLabel: String): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontIcon")(iconName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], ariaLabel.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  inline def getIconContent(): IIconContent | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconContent")().asInstanceOf[IIconContent | Null]
  inline def getIconContent(iconName: String): IIconContent | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconContent")(iconName.asInstanceOf[js.Any]).asInstanceOf[IIconContent | Null]
  
  trait IIconContent extends StObject {
    
    var children: js.UndefOr[String | Element] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var iconClassName: js.UndefOr[String] = js.undefined
    
    var mergeImageProps: js.UndefOr[Boolean] = js.undefined
  }
  object IIconContent {
    
    inline def apply(): IIconContent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IIconContent]
    }
    
    extension [Self <: IIconContent](x: Self) {
      
      inline def setChildren(value: String | Element): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setIconClassName(value: String): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
      
      inline def setIconClassNameUndefined: Self = StObject.set(x, "iconClassName", js.undefined)
      
      inline def setMergeImageProps(value: Boolean): Self = StObject.set(x, "mergeImageProps", value.asInstanceOf[js.Any])
      
      inline def setMergeImagePropsUndefined: Self = StObject.set(x, "mergeImageProps", js.undefined)
    }
  }
}
