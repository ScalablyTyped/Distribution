package typings.merklePatriciaTree

import typings.merklePatriciaTree.dbMod.DB
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("merkle-patricia-tree/dist/scratch", JSImport.Namespace)
@js.native
object scratchMod extends js.Object {
  
  @js.native
  class ScratchDB protected () extends DB {
    def this(upstreamDB: DB) = this()
    
    var _upstream: js.Any = js.native
  }
}
