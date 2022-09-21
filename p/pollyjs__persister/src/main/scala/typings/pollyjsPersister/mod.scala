package typings.pollyjsPersister

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pollyjs/persister", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Persister {
    
    /* CompleteClass */
    override val options: StringDictionary[Any] = js.native
    
    /* CompleteClass */
    override def persist(): js.Promise[Unit] = js.native
  }
  /* static members */
  object default {
    
    @JSImport("@pollyjs/persister", "default.id")
    @js.native
    val id: String = js.native
    
    @JSImport("@pollyjs/persister", "default.type")
    @js.native
    val `type`: String = js.native
  }
  
  trait Persister extends StObject {
    
    val options: StringDictionary[Any]
    
    def persist(): js.Promise[Unit]
  }
  object Persister {
    
    inline def apply(options: StringDictionary[Any], persist: () => js.Promise[Unit]): Persister = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist))
      __obj.asInstanceOf[Persister]
    }
    
    extension [Self <: Persister](x: Self) {
      
      inline def setOptions(value: StringDictionary[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPersist(value: () => js.Promise[Unit]): Self = StObject.set(x, "persist", js.Any.fromFunction0(value))
    }
  }
}
