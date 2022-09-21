package typings.mcpingJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Id extends StObject {
    
    var id: String
    
    var name: String
  }
  object Id {
    
    inline def apply(id: String, name: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Max extends StObject {
    
    var max: Double
    
    var online: Double
    
    var sample: js.UndefOr[js.Array[Id]] = js.undefined
  }
  object Max {
    
    inline def apply(max: Double, online: Double): Max = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], online = online.asInstanceOf[js.Any])
      __obj.asInstanceOf[Max]
    }
    
    extension [Self <: Max](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setOnline(value: Double): Self = StObject.set(x, "online", value.asInstanceOf[js.Any])
      
      inline def setSample(value: js.Array[Id]): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
      
      inline def setSampleUndefined: Self = StObject.set(x, "sample", js.undefined)
      
      inline def setSampleVarargs(value: Id*): Self = StObject.set(x, "sample", js.Array(value*))
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var protocol: Double
  }
  object Name {
    
    inline def apply(name: String, protocol: Double): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: Double): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text extends StObject {
    
    var text: String
  }
  object Text {
    
    inline def apply(text: String): Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    extension [Self <: Text](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
}
