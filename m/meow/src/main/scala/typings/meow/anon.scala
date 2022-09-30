package typings.meow

import typings.meow.meowBooleans.`true`
import typings.meow.meowStrings.boolean
import typings.meow.meowStrings.number
import typings.meow.meowStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var `type`: string
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("string")
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1` extends StObject {
    
    var `type`: boolean
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("boolean")
      __obj.asInstanceOf[`1`]
    }
    
    extension [Self <: `1`](x: Self) {
      
      inline def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Default extends StObject {
    
    var default: Any
  }
  object Default {
    
    inline def apply(default: Any): Default = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default]
    }
    
    extension [Self <: Default](x: Self) {
      
      inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsRequired extends StObject {
    
    var isRequired: `true`
  }
  object IsRequired {
    
    inline def apply(): IsRequired = {
      val __obj = js.Dynamic.literal(isRequired = true)
      __obj.asInstanceOf[IsRequired]
    }
    
    extension [Self <: IsRequired](x: Self) {
      
      inline def setIsRequired(value: `true`): Self = StObject.set(x, "isRequired", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: number
  }
  object Type {
    
    inline def apply(): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("number")
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: number): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
