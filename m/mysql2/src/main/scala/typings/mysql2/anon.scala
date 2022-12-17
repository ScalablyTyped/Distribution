package typings.mysql2

import typings.mysql2.mod.Connection
import typings.mysql2.mysql2Strings.Field
import typings.mysql2.mysql2Strings.FieldPacket
import typings.mysql2.mysql2Strings.OkPacket
import typings.mysql2.mysql2Strings.ResultSetHeader
import typings.mysql2.mysql2Strings.RowDataPacket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var name: FieldPacket
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(name = "FieldPacket")
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setName(value: FieldPacket): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1` extends StObject {
    
    var name: OkPacket
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal(name = "OkPacket")
      __obj.asInstanceOf[`1`]
    }
    
    extension [Self <: `1`](x: Self) {
      
      inline def setName(value: OkPacket): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait `2` extends StObject {
    
    var name: ResultSetHeader
  }
  object `2` {
    
    inline def apply(): `2` = {
      val __obj = js.Dynamic.literal(name = "ResultSetHeader")
      __obj.asInstanceOf[`2`]
    }
    
    extension [Self <: `2`](x: Self) {
      
      inline def setName(value: ResultSetHeader): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait `3` extends StObject {
    
    var name: RowDataPacket
  }
  object `3` {
    
    inline def apply(): `3` = {
      val __obj = js.Dynamic.literal(name = "RowDataPacket")
      __obj.asInstanceOf[`3`]
    }
    
    extension [Self <: `3`](x: Self) {
      
      inline def setName(value: RowDataPacket): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Command extends StObject {
    
    var command: String
    
    var connection: Connection
  }
  object Command {
    
    inline def apply(command: String, connection: Connection): Command = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any])
      __obj.asInstanceOf[Command]
    }
    
    extension [Self <: Command](x: Self) {
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: Field
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal(name = "Field")
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: Field): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
