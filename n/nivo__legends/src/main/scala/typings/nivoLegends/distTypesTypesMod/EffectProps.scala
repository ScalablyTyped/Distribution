package typings.nivoLegends.distTypesTypesMod

import typings.nivoLegends.anon.PartialitemTextColorstrin
import typings.nivoLegends.nivoLegendsStrings.hover
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This can be used to add effect on legends on interaction.
  */
trait EffectProps extends StObject {
  
  var on: hover
  
  var style: PartialitemTextColorstrin
}
object EffectProps {
  
  inline def apply(style: PartialitemTextColorstrin): EffectProps = {
    val __obj = js.Dynamic.literal(on = "hover", style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[EffectProps]
  }
  
  extension [Self <: EffectProps](x: Self) {
    
    inline def setOn(value: hover): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: PartialitemTextColorstrin): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
