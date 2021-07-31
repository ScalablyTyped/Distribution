package typings.nivoTooltip

import typings.react.mod.NamedExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicTooltipMod {
  
  @JSImport("@nivo/tooltip/dist/types/BasicTooltip", "BasicTooltip")
  @js.native
  val BasicTooltip: NamedExoticComponent[BasicTooltipProps] = js.native
  
  trait BasicTooltipProps extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var enableChip: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataFormatter */ js.Any
      ] = js.undefined
    
    var id: ReactNode
    
    /**
      * @deprecated This should be replaced by custom tooltip components.
      */
    var renderContent: js.UndefOr[js.Function0[Element]] = js.undefined
    
    var value: js.UndefOr[Double | String | Date] = js.undefined
  }
  object BasicTooltipProps {
    
    @scala.inline
    def apply(): BasicTooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicTooltipProps]
    }
    
    @scala.inline
    implicit class BasicTooltipPropsMutableBuilder[Self <: BasicTooltipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setEnableChip(value: Boolean): Self = StObject.set(x, "enableChip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableChipUndefined: Self = StObject.set(x, "enableChip", js.undefined)
      
      @scala.inline
      def setFormat(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataFormatter */ js.Any
      ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setId(value: ReactNode): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setRenderContent(value: () => Element): Self = StObject.set(x, "renderContent", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRenderContentUndefined: Self = StObject.set(x, "renderContent", js.undefined)
      
      @scala.inline
      def setValue(value: Double | String | Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
