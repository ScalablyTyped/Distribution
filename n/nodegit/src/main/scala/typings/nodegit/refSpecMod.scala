package typings.nodegit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refSpecMod {
  
  @JSImport("nodegit/ref-spec", "Refspec")
  @js.native
  open class Refspec () extends StObject {
    
    def direction(): Double = js.native
    
    def dst(): String = js.native
    
    def dstMatches(refname: String): Double = js.native
    
    def force(): Double = js.native
    
    def src(): String = js.native
    
    def srcMatches(refname: String): Double = js.native
    
    def string(): String = js.native
  }
  /* static members */
  object Refspec {
    
    @JSImport("nodegit/ref-spec", "Refspec")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(input: String, is_fetch: Double): js.Promise[Refspec] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(input.asInstanceOf[js.Any], is_fetch.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Refspec]]
  }
}
