package typings.officeUiFabricReact

import typings.officeUiFabricReact.libComponentsHoverCardBaseCardDottypesMod.IBaseCardProps
import typings.officeUiFabricReact.libComponentsHoverCardBaseCardDottypesMod.IBaseCardStyleProps
import typings.officeUiFabricReact.libComponentsHoverCardBaseCardDottypesMod.IBaseCardStyles
import typings.react.mod.global.JSX.Element
import typings.uifabricUtilities.libIrenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsHoverCardPlainCardPlainCardDottypesMod {
  
  trait IPlainCard extends StObject
  
  trait IPlainCardProps
    extends StObject
       with IBaseCardProps[IPlainCard, IPlainCardStyles, IPlainCardStyleProps] {
    
    /**
      *  Render function to populate compact content area
      */
    var onRenderPlainCard: js.UndefOr[IRenderFunction[Any]] = js.undefined
  }
  object IPlainCardProps {
    
    inline def apply(): IPlainCardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPlainCardProps]
    }
    
    extension [Self <: IPlainCardProps](x: Self) {
      
      inline def setOnRenderPlainCard(
        value: (/* props */ js.UndefOr[Any], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[Any], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderPlainCard", js.Any.fromFunction2(value))
      
      inline def setOnRenderPlainCardUndefined: Self = StObject.set(x, "onRenderPlainCard", js.undefined)
    }
  }
  
  type IPlainCardStyleProps = IBaseCardStyleProps
  
  type IPlainCardStyles = IBaseCardStyles
}
