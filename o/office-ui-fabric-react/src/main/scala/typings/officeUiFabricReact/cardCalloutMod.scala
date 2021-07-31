package typings.officeUiFabricReact

import typings.officeUiFabricReact.baseCardTypesMod.IBaseCardProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardCalloutMod {
  
  @JSImport("office-ui-fabric-react/lib/components/HoverCard/CardCallout/CardCallout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def CardCallout(props: ICardCalloutProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CardCallout")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ICardCalloutProps
    extends StObject
       with IBaseCardProps[js.Object, js.Object, js.Object] {
    
    var content: js.UndefOr[Element] = js.undefined
    
    var finalHeight: js.UndefOr[Double] = js.undefined
  }
  object ICardCalloutProps {
    
    @scala.inline
    def apply(): ICardCalloutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICardCalloutProps]
    }
    
    @scala.inline
    implicit class ICardCalloutPropsMutableBuilder[Self <: ICardCalloutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: Element): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setFinalHeight(value: Double): Self = StObject.set(x, "finalHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalHeightUndefined: Self = StObject.set(x, "finalHeight", js.undefined)
    }
  }
}
