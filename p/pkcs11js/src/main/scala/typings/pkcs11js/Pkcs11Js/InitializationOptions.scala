package typings.pkcs11js.Pkcs11Js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitializationOptions extends js.Object {
  
  /**
    * bit flags specifying options for `C_Initialize`
    * - CKF_LIBRARY_CANT_CREATE_OS_THREADS. True if application threads which are executing calls to the library
    *   may not use native operating system calls to spawn new threads; false if they may
    * - CKF_OS_LOCKING_OK. True if the library can use the native operation system threading model for locking;
    *   false otherwise
    */
  var flags: js.UndefOr[Double] = js.native
  
  /**
    * NSS library parameters
    */
  var libraryParameters: js.UndefOr[String] = js.native
}
object InitializationOptions {
  
  @scala.inline
  def apply(): InitializationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitializationOptions]
  }
  
  @scala.inline
  implicit class InitializationOptionsOps[Self <: InitializationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFlags(value: Double): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    
    @scala.inline
    def setLibraryParameters(value: String): Self = this.set("libraryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLibraryParameters: Self = this.set("libraryParameters", js.undefined)
  }
}
