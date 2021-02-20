package typings.pollyjsPersister

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@pollyjs/persister", JSImport.Default)
  @js.native
  class default () extends Persister
  /* static members */
  object default {
    
    @JSImport("@pollyjs/persister", "default.id")
    @js.native
    val id: String = js.native
    
    @JSImport("@pollyjs/persister", "default.type")
    @js.native
    val `type`: String = js.native
  }
  
  @js.native
  trait Persister extends StObject {
    
    val options: StringDictionary[js.Any] = js.native
    
    def persist(): js.Promise[Unit] = js.native
  }
  object Persister {
    
    @scala.inline
    def apply(options: StringDictionary[js.Any], persist: () => js.Promise[Unit]): Persister = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], persist = js.Any.fromFunction0(persist))
      __obj.asInstanceOf[Persister]
    }
    
    @scala.inline
    implicit class PersisterMutableBuilder[Self <: Persister] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: StringDictionary[js.Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersist(value: () => js.Promise[Unit]): Self = StObject.set(x, "persist", js.Any.fromFunction0(value))
    }
  }
}
