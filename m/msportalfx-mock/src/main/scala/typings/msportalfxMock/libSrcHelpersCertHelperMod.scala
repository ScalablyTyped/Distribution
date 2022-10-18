package typings.msportalfxMock

import typings.q.mod.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcHelpersCertHelperMod {
  
  object CertHelper {
    
    @JSImport("msportalfx-mock/lib/src/Helpers/certHelper", "CertHelper")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Clears older certificates targeted to localhost, and generates a new certificate. Also
      * places the new certificate in to the local machine store.
      * NOTE: Should be compiled with COMMENTS as this is required to execute PS scripts.
      *
      * @return The generated localhost certificate/
      */
    inline def createLocalHostSSLOptions(): Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLocalHostSSLOptions")().asInstanceOf[Promise[Any]]
  }
}
