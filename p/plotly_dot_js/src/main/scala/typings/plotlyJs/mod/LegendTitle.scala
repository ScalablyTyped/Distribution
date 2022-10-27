package typings.plotlyJs.mod

import typings.plotlyJs.anon.PartialFont
import typings.plotlyJs.plotlyJsStrings.`top left`
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendTitle extends StObject {
  
  var font: PartialFont
  
  var side: top | left | (`top left`)
  
  var text: String
}
object LegendTitle {
  
  inline def apply(font: PartialFont, side: top | left | (`top left`), text: String): LegendTitle = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendTitle]
  }
  
  extension [Self <: LegendTitle](x: Self) {
    
    inline def setFont(value: PartialFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setSide(value: top | left | (`top left`)): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
