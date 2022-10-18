package typings.nodeRedUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Format extends StObject {
    
    var format: String
    
    var msg: String
  }
  object Format {
    
    inline def apply(format: String, msg: String): Format = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Format]
    }
    
    extension [Self <: Format](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    /** node id */
    var id: String
    
    var node: typings.nodeRedRegistry.mod.Node[js.Object]
  }
  object Id {
    
    inline def apply(id: String, node: typings.nodeRedRegistry.mod.Node[js.Object]): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setNode(value: typings.nodeRedRegistry.mod.Node[js.Object]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait IdNode extends StObject {
    
    /** node id */
    var id: String
    
    var node: Unit
  }
  object IdNode {
    
    inline def apply(id: String, node: Unit): IdNode = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdNode]
    }
    
    extension [Self <: IdNode](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Unit): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
  
  trait Key extends StObject {
    
    var key: String
    
    var store: js.UndefOr[String] = js.undefined
  }
  object Key {
    
    inline def apply(key: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setStore(value: String): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
  
  trait MaxLength extends StObject {
    
    var maxLength: js.UndefOr[Double] = js.undefined
  }
  object MaxLength {
    
    inline def apply(): MaxLength = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaxLength]
    }
    
    extension [Self <: MaxLength](x: Self) {
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    }
  }
  
  trait Msg extends StObject {
    
    var msg: Any
  }
  object Msg {
    
    inline def apply(msg: Any): Msg = {
      val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Msg]
    }
    
    extension [Self <: Msg](x: Self) {
      
      inline def setMsg(value: Any): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    }
  }
  
  trait Node extends StObject {
    
    /** node id */
    var id: String
    
    var node: typings.nodeRedRegistry.mod.Node[js.Object]
    
    /** index of port being sent on */
    var port: Double
  }
  object Node {
    
    inline def apply(id: String, node: typings.nodeRedRegistry.mod.Node[js.Object], port: Double): Node = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setNode(value: typings.nodeRedRegistry.mod.Node[js.Object]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
}
