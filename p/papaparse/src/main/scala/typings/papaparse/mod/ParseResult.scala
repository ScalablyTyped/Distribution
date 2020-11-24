package typings.papaparse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseResult[T] extends js.Object {
  
  var data: js.Array[T] = js.native
  
  var errors: js.Array[ParseError] = js.native
  
  var meta: ParseMeta = js.native
}
object ParseResult {
  
  @scala.inline
  def apply[T](data: js.Array[T], errors: js.Array[ParseError], meta: ParseMeta): ParseResult[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseResult[T]]
  }
  
  @scala.inline
  implicit class ParseResultOps[Self <: ParseResult[_], T] (val x: Self with ParseResult[T]) extends AnyVal {
    
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
    def setDataVarargs(value: T*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[T]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: ParseError*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[ParseError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: ParseMeta): Self = this.set("meta", value.asInstanceOf[js.Any])
  }
}
