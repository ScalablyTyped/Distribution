package typings.pkcs11js.Pkcs11Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitializationOptions extends StObject {
  
  /**
    * bit flags specifying options for `C_Initialize`
    * - CKF_LIBRARY_CANT_CREATE_OS_THREADS. True if application threads which are executing calls to the library
    *   may not use native operating system calls to spawn new threads; false if they may
    * - CKF_OS_LOCKING_OK. True if the library can use the native operation system threading model for locking;
    *   false otherwise
    */
  var flags: js.UndefOr[Double] = js.undefined
  
  /**
    * NSS library parameters
    */
  var libraryParameters: js.UndefOr[String] = js.undefined
}
object InitializationOptions {
  
  inline def apply(): InitializationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitializationOptions]
  }
  
  extension [Self <: InitializationOptions](x: Self) {
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setLibraryParameters(value: String): Self = StObject.set(x, "libraryParameters", value.asInstanceOf[js.Any])
    
    inline def setLibraryParametersUndefined: Self = StObject.set(x, "libraryParameters", js.undefined)
  }
}
