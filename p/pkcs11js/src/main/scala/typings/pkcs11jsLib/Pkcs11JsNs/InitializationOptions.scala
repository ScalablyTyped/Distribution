package typings
package pkcs11jsLib.Pkcs11JsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitializationOptions extends js.Object {
  /**
    * bit flags specifying options for `C_Initialize`
    * - CKF_LIBRARY_CANT_CREATE_OS_THREADS. True if application threads which are executing calls to the library
    *   may not use native operating system calls to spawn new threads; false if they may
    * - CKF_OS_LOCKING_OK. True if the library can use the native operation system threading model for locking;
    *   false otherwise
    */
  var flags: js.UndefOr[scala.Double] = js.undefined
  /**
    * NSS library parameters
    */
  var libraryParameters: js.UndefOr[java.lang.String] = js.undefined
}

object InitializationOptions {
  @scala.inline
  def apply(flags: scala.Int | scala.Double = null, libraryParameters: java.lang.String = null): InitializationOptions = {
    val __obj = js.Dynamic.literal()
    if (flags != null) __obj.updateDynamic("flags")(flags.asInstanceOf[js.Any])
    if (libraryParameters != null) __obj.updateDynamic("libraryParameters")(libraryParameters)
    __obj.asInstanceOf[InitializationOptions]
  }
}

