package typings.monacoEditor.mod.languages

import typings.monacoEditor.mod.IRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColorInformation extends StObject {
  
  /**
    * The color represented in this range.
    */
  var color: IColor
  
  /**
    * The range within the model.
    */
  var range: IRange
}
object IColorInformation {
  
  inline def apply(color: IColor, range: IRange): IColorInformation = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorInformation]
  }
  
  extension [Self <: IColorInformation](x: Self) {
    
    inline def setColor(value: IColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setRange(value: IRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
