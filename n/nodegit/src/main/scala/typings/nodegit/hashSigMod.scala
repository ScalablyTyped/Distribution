package typings.nodegit

import typings.nodegit.nodegitInts.`0`
import typings.nodegit.nodegitInts.`1`
import typings.nodegit.nodegitInts.`2`
import typings.nodegit.nodegitInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hashSigMod {
  
  @JSImport("nodegit/hash-sig", "Hashsig")
  @js.native
  open class Hashsig () extends StObject {
    
    def compare(b: Hashsig): Double = js.native
    
    def free(): Unit = js.native
  }
  /* static members */
  object Hashsig {
    
    @JSImport("nodegit/hash-sig", "Hashsig")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(buf: String, buflen: Double, opts: Double): js.Promise[Hashsig] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(buf.asInstanceOf[js.Any], buflen.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Hashsig]]
    
    inline def createFromFile(path: String, opts: Double): js.Promise[Hashsig] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromFile")(path.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Hashsig]]
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitInts.`0`
      - typings.nodegit.nodegitInts.`1`
      - typings.nodegit.nodegitInts.`2`
      - typings.nodegit.nodegitInts.`4`
    */
    trait OPTION extends StObject
    object OPTION {
      
      inline def ALLOW_SMALL_FILES: `4` = 4.asInstanceOf[`4`]
      
      inline def IGNORE_WHITESPACE: `1` = 1.asInstanceOf[`1`]
      
      inline def NORMAL: `0` = 0.asInstanceOf[`0`]
      
      inline def SMART_WHITESPACE: `2` = 2.asInstanceOf[`2`]
    }
  }
}
