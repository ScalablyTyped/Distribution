package typings.officeUiFabricReact

import typings.officeUiFabricReact.baseCardTypesMod.IBaseCardProps
import typings.officeUiFabricReact.baseCardTypesMod.IBaseCardStyleProps
import typings.officeUiFabricReact.baseCardTypesMod.IBaseCardStyles
import typings.react.mod.global.JSX.Element
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object plainCardTypesMod {
  
  trait IPlainCard extends StObject
  
  trait IPlainCardProps
    extends StObject
       with IBaseCardProps[IPlainCard, IPlainCardStyles, IPlainCardStyleProps] {
    
    /**
      *  Render function to populate compact content area
      */
    var onRenderPlainCard: js.UndefOr[IRenderFunction[js.Any]] = js.undefined
  }
  object IPlainCardProps {
    
    @scala.inline
    def apply(): IPlainCardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPlainCardProps]
    }
    
    @scala.inline
    implicit class IPlainCardPropsMutableBuilder[Self <: IPlainCardProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnRenderPlainCard(
        value: (/* props */ js.UndefOr[js.Any], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[js.Any], Element | Null]]) => Element | Null
      ): Self = StObject.set(x, "onRenderPlainCard", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderPlainCardUndefined: Self = StObject.set(x, "onRenderPlainCard", js.undefined)
    }
  }
  
  type IPlainCardStyleProps = IBaseCardStyleProps
  
  type IPlainCardStyles = IBaseCardStyles
}
