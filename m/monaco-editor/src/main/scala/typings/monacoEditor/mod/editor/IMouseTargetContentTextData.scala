package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMouseTargetContentTextData extends StObject {
  
  val mightBeForeignElement: Boolean
}
object IMouseTargetContentTextData {
  
  inline def apply(mightBeForeignElement: Boolean): IMouseTargetContentTextData = {
    val __obj = js.Dynamic.literal(mightBeForeignElement = mightBeForeignElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMouseTargetContentTextData]
  }
  
  extension [Self <: IMouseTargetContentTextData](x: Self) {
    
    inline def setMightBeForeignElement(value: Boolean): Self = StObject.set(x, "mightBeForeignElement", value.asInstanceOf[js.Any])
  }
}
