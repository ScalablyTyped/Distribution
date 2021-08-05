package typings.officeUiFabricReact

import typings.officeUiFabricReact.beakTypesMod.IBeakStylesProps
import typings.uifabricMergeStyles.istyleMod.IStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object beakStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Coachmark/Beak/Beak.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: IBeakStylesProps): IBeakStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IBeakStyles]
  
  trait IBeakStyles extends StObject {
    
    var beak: js.UndefOr[IStyle] = js.undefined
    
    /**
      * Style for the root element in the default enabled/unchecked state.
      */
    var root: js.UndefOr[IStyle] = js.undefined
  }
  object IBeakStyles {
    
    inline def apply(): IBeakStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IBeakStyles]
    }
    
    extension [Self <: IBeakStyles](x: Self) {
      
      inline def setBeak(value: IStyle): Self = StObject.set(x, "beak", value.asInstanceOf[js.Any])
      
      inline def setBeakNull: Self = StObject.set(x, "beak", null)
      
      inline def setBeakUndefined: Self = StObject.set(x, "beak", js.undefined)
      
      inline def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootNull: Self = StObject.set(x, "root", null)
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
}
