package typings.moddle

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.moddle.mod.Descriptor
import typings.moddle.mod.Element
import typings.moddle.mod.Moddle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait LocalName extends StObject {
    
    var localName: String
    
    var prefix: String
    
    var uri: String
  }
  object LocalName {
    
    inline def apply(localName: String, prefix: String, uri: String): LocalName = {
      val __obj = js.Dynamic.literal(localName = localName.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalName]
    }
    
    extension [Self <: LocalName](x: Self) {
      
      inline def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofElement
    extends StObject
       with Instantiable0[Element]
       with Instantiable1[/* fields */ StringDictionary[Any], Element] {
    
    @JSName("$descriptor")
    var $descriptor: Descriptor = js.native
    
    @JSName("$model")
    var $model: Moddle = js.native
  }
}
