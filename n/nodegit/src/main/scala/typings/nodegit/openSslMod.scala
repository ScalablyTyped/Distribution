package typings.nodegit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object openSslMod {
  
  @JSImport("nodegit/open-ssl", "Openssl")
  @js.native
  class Openssl () extends StObject
  /* static members */
  object Openssl {
    
    @JSImport("nodegit/open-ssl", "Openssl")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def setLocking(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("setLocking")().asInstanceOf[Double]
  }
}
