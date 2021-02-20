package typings.nodegit

import typings.node.Buffer
import typings.nodegit.oidMod.Oid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object odbObjectMod {
  
  @JSImport("nodegit/odb-object", "OdbObject")
  @js.native
  class OdbObject () extends StObject {
    
    def data(): Buffer = js.native
    
    def dup(): js.Promise[OdbObject] = js.native
    
    def free(): Unit = js.native
    
    def id(): Oid = js.native
    
    def size(): Double = js.native
    
    def `type`(): Double = js.native
  }
}
