package typings.mongoose.mod.Error

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CastError
  extends typings.mongoose.mod.Error {
  
  var kind: String = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  @JSName("name")
  var name_CastError: typings.mongoose.mongooseStrings.CastError = js.native
  
  var path: String = js.native
  
  var reason: js.UndefOr[js.Any] = js.native
  
  def setModel(model: js.Any): Unit = js.native
  
  var stringValue: String = js.native
  
  var value: js.Any = js.native
}
object CastError {
  
  @scala.inline
  def apply(
    kind: String,
    name: typings.mongoose.mongooseStrings.CastError,
    path: String,
    setModel: js.Any => Unit,
    stringValue: String,
    value: js.Any
  ): CastError = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], setModel = js.Any.fromFunction1(setModel), stringValue = stringValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastError]
  }
  
  @scala.inline
  implicit class CastErrorOps[Self <: CastError] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: typings.mongoose.mongooseStrings.CastError): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetModel(value: js.Any => Unit): Self = this.set("setModel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStringValue(value: String): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setReason(value: js.Any): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
}
