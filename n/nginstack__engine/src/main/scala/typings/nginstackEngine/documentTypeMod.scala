package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentTypeMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dom/DocumentType", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DocumentType {
    
    /* CompleteClass */
    var entities: NamedNodeMap = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var notations: NamedNodeMap = js.native
  }
  @JSImport("@nginstack/engine/lib/dom/DocumentType", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DocumentType extends StObject {
    
    var entities: NamedNodeMap
    
    var name: String
    
    var notations: NamedNodeMap
  }
  object DocumentType {
    
    inline def apply(entities: NamedNodeMap, name: String, notations: NamedNodeMap): DocumentType = {
      val __obj = js.Dynamic.literal(entities = entities.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], notations = notations.asInstanceOf[js.Any])
      __obj.asInstanceOf[DocumentType]
    }
    
    extension [Self <: DocumentType](x: Self) {
      
      inline def setEntities(value: NamedNodeMap): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNotations(value: NamedNodeMap): Self = StObject.set(x, "notations", value.asInstanceOf[js.Any])
    }
  }
  
  type NamedNodeMap = typings.nginstackEngine.namedNodeMapMod.^
}
