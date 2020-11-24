package typings.mysql2.fieldMod

import typings.mysql2.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Field extends js.Object {
  
  var buffer: js.Function = js.native
  
  var constructor: Name = js.native
  
  var db: String = js.native
  
  var geometry: js.Function = js.native
  
  var length: Double = js.native
  
  var name: String = js.native
  
  var string: js.Function = js.native
  
  var table: String = js.native
  
  var `type`: String = js.native
}
object Field {
  
  @scala.inline
  def apply(
    buffer: js.Function,
    constructor: Name,
    db: String,
    geometry: js.Function,
    length: Double,
    name: String,
    string: js.Function,
    table: String,
    `type`: String
  ): Field = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], db = db.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  
  @scala.inline
  implicit class FieldOps[Self <: Field] (val x: Self) extends AnyVal {
    
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
    def setBuffer(value: js.Function): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstructor(value: Name): Self = this.set("constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDb(value: String): Self = this.set("db", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometry(value: js.Function): Self = this.set("geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setString(value: js.Function): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable(value: String): Self = this.set("table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
