package typings.officeJsPreview.global.Office

import typings.officeJsPreview.anon.Host
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Office.onReady")
@js.native
object onReady extends js.Object {
  
  /**
    * Ensures that the Office JavaScript APIs are ready to be called by the add-in. If the framework hasn't initialized yet, the callback or promise
    * will wait until the Office host is ready to accept API calls. Note that though this API is intended to be used inside an Office add-in, it can
    * also be used outside the add-in. In that case, once Office.js determines that it is running outside of an Office host application, it will call
    * the callback and resolve the promise with "null" for both the host and platform.
    *
    * @param callback - An optional callback method, that will receive the host and platform info.
    *                   Alternatively, rather than use a callback, an add-in may simply wait for the Promise returned by the function to resolve.
    * @returns A Promise that contains the host and platform info, once initialization is completed.
    */
  def apply(): js.Promise[Host] = js.native
  def apply(callback: js.Function1[/* info */ Host, _]): js.Promise[Host] = js.native
}
