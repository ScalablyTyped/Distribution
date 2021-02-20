package typings.nodegit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refSpecMod {
  
  @JSImport("nodegit/ref-spec", "Refspec")
  @js.native
  class Refspec () extends StObject {
    
    def direction(): Double = js.native
    
    def dst(): String = js.native
    
    def dstMatches(refname: String): Double = js.native
    
    def force(): Double = js.native
    
    def src(): String = js.native
    
    def srcMatches(refname: String): Double = js.native
  }
}
