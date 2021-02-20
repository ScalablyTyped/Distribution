package typings.mysql2

import typings.mysql2.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldMod {
  
  @js.native
  trait Field extends StObject {
    
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
    implicit class FieldMutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: js.Function): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstructor(value: Name): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometry(value: js.Function): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setString(value: js.Function): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTable(value: String): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
