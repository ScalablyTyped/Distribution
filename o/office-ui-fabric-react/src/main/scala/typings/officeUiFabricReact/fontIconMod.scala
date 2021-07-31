package typings.officeUiFabricReact

import typings.officeUiFabricReact.iconTypesMod.IFontIconProps
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontIconMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Icon/FontIcon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Icon/FontIcon", "FontIcon")
  @js.native
  val FontIcon: FunctionComponent[IFontIconProps] = js.native
  
  @scala.inline
  def getFontIcon(iconName: String): ReactElement | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getFontIcon")(iconName.asInstanceOf[js.Any]).asInstanceOf[ReactElement | Null]
  @scala.inline
  def getFontIcon(iconName: String, className: String): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontIcon")(iconName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  @scala.inline
  def getFontIcon(iconName: String, className: String, ariaLabel: String): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontIcon")(iconName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], ariaLabel.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  @scala.inline
  def getFontIcon(iconName: String, className: Unit, ariaLabel: String): ReactElement | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getFontIcon")(iconName.asInstanceOf[js.Any], className.asInstanceOf[js.Any], ariaLabel.asInstanceOf[js.Any])).asInstanceOf[ReactElement | Null]
  
  @scala.inline
  def getIconContent(): IIconContent | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconContent")().asInstanceOf[IIconContent | Null]
  @scala.inline
  def getIconContent(iconName: String): IIconContent | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconContent")(iconName.asInstanceOf[js.Any]).asInstanceOf[IIconContent | Null]
  
  trait IIconContent extends StObject {
    
    var children: js.UndefOr[String] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var iconClassName: js.UndefOr[String] = js.undefined
  }
  object IIconContent {
    
    @scala.inline
    def apply(): IIconContent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IIconContent]
    }
    
    @scala.inline
    implicit class IIconContentMutableBuilder[Self <: IIconContent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setIconClassName(value: String): Self = StObject.set(x, "iconClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconClassNameUndefined: Self = StObject.set(x, "iconClassName", js.undefined)
    }
  }
}
