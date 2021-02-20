package typings.officeUiFabricReact

import typings.officeUiFabricReact.beakTypesMod.IBeakStylesProps
import typings.uifabricMergeStyles.istyleMod.IStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object beakStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Coachmark/Beak/Beak.styles", "getStyles")
  @js.native
  def getStyles(props: IBeakStylesProps): IBeakStyles = js.native
  
  @js.native
  trait IBeakStyles extends StObject {
    
    var beak: js.UndefOr[IStyle] = js.native
    
    /**
      * Style for the root element in the default enabled/unchecked state.
      */
    var root: js.UndefOr[IStyle] = js.native
  }
  object IBeakStyles {
    
    @scala.inline
    def apply(): IBeakStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBeakStyles]
    }
    
    @scala.inline
    implicit class IBeakStylesMutableBuilder[Self <: IBeakStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeak(value: IStyle): Self = StObject.set(x, "beak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeakNull: Self = StObject.set(x, "beak", null)
      
      @scala.inline
      def setBeakUndefined: Self = StObject.set(x, "beak", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
