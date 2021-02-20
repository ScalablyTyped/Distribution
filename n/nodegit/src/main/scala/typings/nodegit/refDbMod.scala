package typings.nodegit

import typings.nodegit.repositoryMod.Repository
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    @JSImport("nodegit/ref-db", "Refdb.open")
    @js.native
    def open(repo: Repository): js.Promise[Refdb] = js.native
  }
}
