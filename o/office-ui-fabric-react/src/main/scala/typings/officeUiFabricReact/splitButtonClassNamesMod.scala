package typings.officeUiFabricReact

import typings.officeUiFabricReact.buttonTypesMod.IButtonStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object splitButtonClassNamesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Button/SplitButton/SplitButton.classNames", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getSplitButtonClassNames(styles: IButtonStyles, disabled: Boolean, expanded: Boolean, checked: Boolean): ISplitButtonClassNames = (^.asInstanceOf[js.Dynamic].applyDynamic("getSplitButtonClassNames")(styles.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], expanded.asInstanceOf[js.Any], checked.asInstanceOf[js.Any])).asInstanceOf[ISplitButtonClassNames]
  @scala.inline
  def getSplitButtonClassNames(
    styles: IButtonStyles,
    disabled: Boolean,
    expanded: Boolean,
    checked: Boolean,
    primaryDisabled: Boolean
  ): ISplitButtonClassNames = (^.asInstanceOf[js.Dynamic].applyDynamic("getSplitButtonClassNames")(styles.asInstanceOf[js.Any], disabled.asInstanceOf[js.Any], expanded.asInstanceOf[js.Any], checked.asInstanceOf[js.Any], primaryDisabled.asInstanceOf[js.Any])).asInstanceOf[ISplitButtonClassNames]
  
  trait ISplitButtonClassNames extends StObject {
    
    var divider: js.UndefOr[String] = js.undefined
    
    var flexContainer: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[String] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
    
    var splitButtonContainer: js.UndefOr[String] = js.undefined
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
