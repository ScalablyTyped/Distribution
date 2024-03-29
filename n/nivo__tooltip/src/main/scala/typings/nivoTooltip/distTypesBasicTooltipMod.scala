package typings.nivoTooltip

import typings.react.mod.NamedExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBasicTooltipMod {
  
  @JSImport("@nivo/tooltip/dist/types/BasicTooltip", "BasicTooltip")
  @js.native
  val BasicTooltip: NamedExoticComponent[BasicTooltipProps] = js.native
  
  trait BasicTooltipProps extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var enableChip: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValueFormat<number | string | Date> */ Any
      ] = js.undefined
    
    var id: ReactNode
    
    /**
      * @deprecated This should be replaced by custom tooltip components.
      */
    var renderContent: js.UndefOr[js.Function0[Element]] = js.undefined
    
    var value: js.UndefOr[Double | String | js.Date] = js.undefined
  }
  object BasicTooltipProps {
    
    inline def apply(): BasicTooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicTooltipProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BasicTooltipProps] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setEnableChip(value: Boolean): Self = StObject.set(x, "enableChip", value.asInstanceOf[js.Any])
      
      inline def setEnableChipUndefined: Self = StObject.set(x, "enableChip", js.undefined)
      
      inline def setFormat(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ValueFormat<number | string | Date> */ Any
      ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setId(value: ReactNode): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setRenderContent(value: () => Element): Self = StObject.set(x, "renderContent", js.Any.fromFunction0(value))
      
      inline def setRenderContentUndefined: Self = StObject.set(x, "renderContent", js.undefined)
      
      inline def setValue(value: Double | String | js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
