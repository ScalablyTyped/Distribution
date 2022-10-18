package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomDomimplementationMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dom/DOMImplementation", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DOMImplementation {
    
    /* CompleteClass */
    override def hasFeature(feature: String, version: String): Boolean = js.native
  }
  @JSImport("@nginstack/engine/lib/dom/DOMImplementation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait DOMImplementation extends StObject {
    
    def hasFeature(feature: String, version: String): Boolean
  }
  object DOMImplementation {
    
    inline def apply(hasFeature: (String, String) => Boolean): DOMImplementation = {
      val __obj = js.Dynamic.literal(hasFeature = js.Any.fromFunction2(hasFeature))
      __obj.asInstanceOf[DOMImplementation]
    }
    
    extension [Self <: DOMImplementation](x: Self) {
      
      inline def setHasFeature(value: (String, String) => Boolean): Self = StObject.set(x, "hasFeature", js.Any.fromFunction2(value))
    }
  }
}
