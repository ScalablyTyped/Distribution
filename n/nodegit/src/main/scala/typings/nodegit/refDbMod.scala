package typings.nodegit

import typings.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refDbMod {
  
  @JSImport("nodegit/ref-db", "Refdb")
  @js.native
  class Refdb () extends StObject {
    
    def compress(): Double = js.native
    
    def free(): Unit = js.native
  }
  /* static members */
  object Refdb {
    
    @JSImport("nodegit/ref-db", "Refdb")
    @js.native
    val ^ : js.Any = js.native
    
    inline def open(repo: Repository): js.Promise[Refdb] = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(repo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Refdb]]
  }
}
