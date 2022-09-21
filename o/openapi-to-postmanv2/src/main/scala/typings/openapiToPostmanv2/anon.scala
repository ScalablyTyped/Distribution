package typings.openapiToPostmanv2

import typings.openapiToPostmanv2.openapiToPostmanv2Strings.collection
import typings.postmanCollection.mod.CollectionDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: CollectionDefinition
  }
  object Data {
    
    inline def apply(data: CollectionDefinition): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: CollectionDefinition): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait MissingEndpoints extends StObject {
    
    var missingEndpoints: Any
    
    var requests: Any
  }
  object MissingEndpoints {
    
    inline def apply(missingEndpoints: Any, requests: Any): MissingEndpoints = {
      val __obj = js.Dynamic.literal(missingEndpoints = missingEndpoints.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any])
      __obj.asInstanceOf[MissingEndpoints]
    }
    
    extension [Self <: MissingEndpoints](x: Self) {
      
      inline def setMissingEndpoints(value: Any): Self = StObject.set(x, "missingEndpoints", value.asInstanceOf[js.Any])
      
      inline def setRequests(value: Any): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: String
  }
  object Name {
    
    inline def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Output[T] extends StObject {
    
    var output: js.Array[Type & T]
  }
  object Output {
    
    inline def apply[T](output: js.Array[Type & T]): Output[T] = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[Output[T]]
    }
    
    extension [Self <: Output[?], T](x: Self & Output[T]) {
      
      inline def setOutput(value: js.Array[Type & T]): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputVarargs(value: (Type & T)*): Self = StObject.set(x, "output", js.Array(value*))
    }
  }
  
  trait Type extends StObject {
    
    var `type`: collection
  }
  object Type {
    
    inline def apply(): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("collection")
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: collection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
