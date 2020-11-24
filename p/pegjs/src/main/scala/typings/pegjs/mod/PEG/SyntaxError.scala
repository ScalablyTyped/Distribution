package typings.pegjs.mod.PEG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyntaxError extends js.Object {
  
  var column: Double = js.native
  
  var expected: js.Array[_] = js.native
  
  var found: js.Any = js.native
  
  var line: Double = js.native
  
  var location: LocationRange = js.native
  
  var message: String = js.native
  
  var name: String = js.native
  
  var offset: Double = js.native
}
object SyntaxError {
  
  @scala.inline
  def apply(
    column: Double,
    expected: js.Array[_],
    found: js.Any,
    line: Double,
    location: LocationRange,
    message: String,
    name: String,
    offset: Double
  ): SyntaxError = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxError]
  }
  
  @scala.inline
  implicit class SyntaxErrorOps[Self <: SyntaxError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedVarargs(value: js.Any*): Self = this.set("expected", js.Array(value :_*))
    
    @scala.inline
    def setExpected(value: js.Array[_]): Self = this.set("expected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFound(value: js.Any): Self = this.set("found", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LocationRange): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
  }
}
