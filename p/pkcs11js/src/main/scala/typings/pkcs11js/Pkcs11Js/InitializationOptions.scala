package typings.pkcs11js.Pkcs11Js

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
  var flags: js.UndefOr[Double] = js.undefined
  /**
    * NSS library parameters
    */
  var libraryParameters: js.UndefOr[String] = js.undefined
}

object InitializationOptions {
  @scala.inline
  def apply(flags: js.UndefOr[Double] = js.undefined, libraryParameters: String = null): InitializationOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flags)) __obj.updateDynamic("flags")(flags.get.asInstanceOf[js.Any])
    if (libraryParameters != null) __obj.updateDynamic("libraryParameters")(libraryParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializationOptions]
  }
}

