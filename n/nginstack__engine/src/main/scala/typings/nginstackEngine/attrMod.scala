package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attrMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/dom/Attr", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Attr {
    
    /* CompleteClass */
    override val name: String = js.native
    
    /* CompleteClass */
    override val value: String = js.native
  }
  @JSImport("@nginstack/engine/lib/dom/Attr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Attr extends StObject {
    
    val name: String
    
    val value: String
  }
  object Attr {
    
    inline def apply(name: String, value: String): Attr = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attr]
    }
    
    extension [Self <: Attr](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
