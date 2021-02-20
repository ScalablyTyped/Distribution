package typings.nodegit

import typings.nodegit.oidMod.Oid
import typings.nodegit.transferProgressMod.TransferProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexerMod {
  
  @JSImport("nodegit/indexer", "Indexer")
  @js.native
  class Indexer () extends StObject {
    
    def commit(stats: TransferProgress): Double = js.native
    
    def free(): Unit = js.native
    
    def hash(): Oid = js.native
  }
}
