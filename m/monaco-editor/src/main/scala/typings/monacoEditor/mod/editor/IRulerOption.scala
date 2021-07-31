package typings.monacoEditor.mod.editor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRulerOption extends StObject {
  
  val color: String | Null
  
  val column: Double
}
object IRulerOption {
  
  @scala.inline
  def apply(column: Double): IRulerOption = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], color = null)
    __obj.asInstanceOf[IRulerOption]
  }
  
  @scala.inline
  implicit class IRulerOptionMutableBuilder[Self <: IRulerOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorNull: Self = StObject.set(x, "color", null)
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
  }
}
