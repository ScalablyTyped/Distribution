package typings.nodegit

import typings.nodegit.certMod.Cert.TYPE
import typings.nodegit.nodegitNumbers.`0`
import typings.nodegit.nodegitNumbers.`1`
import typings.nodegit.nodegitNumbers.`2`
import typings.nodegit.nodegitNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certMod {
  
  @JSImport("nodegit/cert", "Cert")
  @js.native
  open class Cert () extends StObject {
    
    var certType: TYPE = js.native
  }
  object Cert {
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
    */
    trait SSH extends StObject
    object SSH {
      
      inline def MD5: `1` = 1.asInstanceOf[`1`]
      
      inline def SHA1: `2` = 2.asInstanceOf[`2`]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.nodegit.nodegitNumbers.`0`
      - typings.nodegit.nodegitNumbers.`1`
      - typings.nodegit.nodegitNumbers.`2`
      - typings.nodegit.nodegitNumbers.`3`
    */
    trait TYPE extends StObject
    object TYPE {
      
      inline def HOSTKEY_LIBSSH2: `2` = 2.asInstanceOf[`2`]
      
      inline def NONE: `0` = 0.asInstanceOf[`0`]
      
      inline def STRARRAY: `3` = 3.asInstanceOf[`3`]
      
      inline def X509: `1` = 1.asInstanceOf[`1`]
    }
  }
}
