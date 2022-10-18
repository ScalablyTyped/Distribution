package typings.msRest

import org.scalablytyped.runtime.StringDictionary
import typings.msRest.mod.Mapper
import typings.msRest.mod.MapperType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ClassName extends StObject {
    
    var className: String
    
    var modelProperties: js.UndefOr[StringDictionary[Mapper]] = js.undefined
    
    var name: MapperType
  }
  object ClassName {
    
    inline def apply(className: String, name: MapperType): ClassName = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClassName]
    }
    
    extension [Self <: ClassName](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setModelProperties(value: StringDictionary[Mapper]): Self = StObject.set(x, "modelProperties", value.asInstanceOf[js.Any])
      
      inline def setModelPropertiesUndefined: Self = StObject.set(x, "modelProperties", js.undefined)
      
      inline def setName(value: MapperType): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Element extends StObject {
    
    var element: Mapper
    
    var name: MapperType
  }
  object Element {
    
    inline def apply(element: Mapper, name: MapperType): Element = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    extension [Self <: Element](x: Self) {
      
      inline def setElement(value: Mapper): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setName(value: MapperType): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: MapperType
    
    var value: Mapper
  }
  object Name {
    
    inline def apply(name: MapperType, value: Mapper): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: MapperType): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Mapper): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Version extends StObject {
    
    var name: String
    
    var version: String
  }
  object Version {
    
    inline def apply(name: String, version: String): Version = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Version]
    }
    
    extension [Self <: Version](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
