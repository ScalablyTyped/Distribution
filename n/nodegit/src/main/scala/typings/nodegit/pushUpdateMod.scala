package typings.nodegit

import typings.nodegit.oidMod.Oid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pushUpdateMod {
  
  @JSImport("nodegit/push-update", "PushUpdate")
  @js.native
  class PushUpdate () extends StObject {
    
    var dst: Oid = js.native
    
    var dstRefname: String = js.native
    
    var src: Oid = js.native
    
    var srcRefname: String = js.native
  }
}
