package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomNotationMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dom/Notation", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Notation {
    
    /* CompleteClass */
    override val publicId: String = js.native
    
    /* CompleteClass */
    override val systemId: String = js.native
  }
  @JSImport("@nginstack/engine/lib/dom/Notation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Notation extends StObject {
    
    val publicId: String
    
    val systemId: String
  }
  object Notation {
    
    inline def apply(publicId: String, systemId: String): Notation = {
      val __obj = js.Dynamic.literal(publicId = publicId.asInstanceOf[js.Any], systemId = systemId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Notation]
    }
    
    extension [Self <: Notation](x: Self) {
      
      inline def setPublicId(value: String): Self = StObject.set(x, "publicId", value.asInstanceOf[js.Any])
      
      inline def setSystemId(value: String): Self = StObject.set(x, "systemId", value.asInstanceOf[js.Any])
    }
  }
}
