package typings.officeUiFabricReact

import typings.officeUiFabricReact.iconTypesMod.IFontIconProps
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontIconMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Icon/FontIcon", "FontIcon")
  @js.native
  val FontIcon: FunctionComponent[IFontIconProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Icon/FontIcon", "getFontIcon")
  @js.native
  def getFontIcon(iconName: String): ReactElement | Null = js.native
  @JSImport("office-ui-fabric-react/lib/components/Icon/FontIcon", "getFontIcon")
  @js.native
  def getFontIcon(iconName: String, className: js.UndefOr[scala.Nothing], ariaLabel: String): ReactElement | Null = js.native
  @JSImport("office-ui-fabric-react/lib/components/Icon/FontIcon", "getFontIcon")
  @js.native
  def getFontIcon(iconName: String, className: String): ReactElement | Null = js.native
  @JSImport("office-ui-fabric-react/lib/components/Icon/FontIcon", "getFontIcon")
  @js.native
  def getFontIcon(iconName: String, className: String, ariaLabel: String): ReactElement | Null = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Icon/FontIcon", "getIconContent")
  @js.native
  def getIconContent(): IIconContent | Null = js.native
  @JSImport("office-ui-fabric-react/lib/components/Icon/FontIcon", "getIconContent")
  @js.native
  def getIconContent(iconName: String): IIconContent | Null = js.native
  
  @js.native
  trait IIconContent extends StObject {
    
    var children: js.UndefOr[String] = js.native
    
    var fontFamily: js.UndefOr[String] = js.native
    
    var iconClassName: js.UndefOr[String] = js.native
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
