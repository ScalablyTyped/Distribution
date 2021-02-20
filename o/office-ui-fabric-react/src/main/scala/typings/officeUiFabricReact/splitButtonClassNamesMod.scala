package typings.officeUiFabricReact

import typings.officeUiFabricReact.buttonTypesMod.IButtonStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitButtonClassNamesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Button/SplitButton/SplitButton.classNames", "getSplitButtonClassNames")
  @js.native
  def getSplitButtonClassNames(styles: IButtonStyles, disabled: Boolean, expanded: Boolean, checked: Boolean): ISplitButtonClassNames = js.native
  @JSImport("office-ui-fabric-react/lib/components/Button/SplitButton/SplitButton.classNames", "getSplitButtonClassNames")
  @js.native
  def getSplitButtonClassNames(
    styles: IButtonStyles,
    disabled: Boolean,
    expanded: Boolean,
    checked: Boolean,
    primaryDisabled: Boolean
  ): ISplitButtonClassNames = js.native
  
  @js.native
  trait ISplitButtonClassNames extends StObject {
    
    var divider: js.UndefOr[String] = js.native
    
    var flexContainer: js.UndefOr[String] = js.native
    
    var icon: js.UndefOr[String] = js.native
    
    var root: js.UndefOr[String] = js.native
    
    var splitButtonContainer: js.UndefOr[String] = js.native
  }
  object ISplitButtonClassNames {
    
    @scala.inline
    def apply(): ISplitButtonClassNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISplitButtonClassNames]
    }
    
    @scala.inline
    implicit class ISplitButtonClassNamesMutableBuilder[Self <: ISplitButtonClassNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDivider(value: String): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      @scala.inline
      def setFlexContainer(value: String): Self = StObject.set(x, "flexContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexContainerUndefined: Self = StObject.set(x, "flexContainer", js.undefined)
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setSplitButtonContainer(value: String): Self = StObject.set(x, "splitButtonContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplitButtonContainerUndefined: Self = StObject.set(x, "splitButtonContainer", js.undefined)
    }
  }
}
