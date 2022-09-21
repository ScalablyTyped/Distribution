package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object entityMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dom/Entity", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Entity {
    
    /* CompleteClass */
    override val notationName: String = js.native
    
    /* CompleteClass */
    override val publicId: String = js.native
    
    /* CompleteClass */
    override val systemId: String = js.native
  }
  @JSImport("@nginstack/engine/lib/dom/Entity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Entity extends StObject {
    
    val notationName: String
    
    val publicId: String
    
    val systemId: String
  }
  object Entity {
    
    inline def apply(notationName: String, publicId: String, systemId: String): Entity = {
      val __obj = js.Dynamic.literal(notationName = notationName.asInstanceOf[js.Any], publicId = publicId.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entity]
    }
    
    extension [Self <: Entity](x: Self) {
      
      inline def setNotationName(value: String): Self = StObject.set(x, "notationName", value.asInstanceOf[js.Any])
      
      inline def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
      
      inline def setSystemId(value: String): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
    }
  }
}
