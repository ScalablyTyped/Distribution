package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridFieldBufferMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/grid/FieldBuffer", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with FieldBuffer {
    
    /* CompleteClass */
    var valueWasInformedByUser: Boolean = js.native
  }
  @JSImport("@nginstack/web-framework/lib/grid/FieldBuffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FieldBuffer extends StObject {
    
    var valueWasInformedByUser: Boolean
  }
  object FieldBuffer {
    
    inline def apply(valueWasInformedByUser: Boolean): FieldBuffer = {
      val __obj = js.Dynamic.literal(valueWasInformedByUser = valueWasInformedByUser.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldBuffer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FieldBuffer] (val x: Self) extends AnyVal {
      
      inline def setValueWasInformedByUser(value: Boolean): Self = StObject.set(x, "valueWasInformedByUser", value.asInstanceOf[js.Any])
    }
  }
}
