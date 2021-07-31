package typings.nodeSass.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SassError
  extends StObject
     with Error {
  
  var column: Double
  
  var file: String
  
  var line: Double
  
  var status: Double
}
object SassError {
  
  @scala.inline
  def apply(column: Double, file: String, line: Double, message: String, name: String, status: Double): SassError = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SassError]
  }
  
  @scala.inline
  implicit class SassErrorMutableBuilder[Self <: SassError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
