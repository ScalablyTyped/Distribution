package typings
package nativeDashToastLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Options extends js.Object {
  var error: js.Function1[
    /* options */ nativeDashToastLib.nativeDashToastMod.ToastOptions, 
    nativeDashToastLib.nativeDashToastMod.Toast
  ] = js.native
  var info: js.Function1[
    /* options */ nativeDashToastLib.nativeDashToastMod.ToastOptions, 
    nativeDashToastLib.nativeDashToastMod.Toast
  ] = js.native
  var success: js.Function1[
    /* options */ nativeDashToastLib.nativeDashToastMod.ToastOptions, 
    nativeDashToastLib.nativeDashToastMod.Toast
  ] = js.native
  var warning: js.Function1[
    /* options */ nativeDashToastLib.nativeDashToastMod.ToastOptions, 
    nativeDashToastLib.nativeDashToastMod.Toast
  ] = js.native
  def apply(options: nativeDashToastLib.nativeDashToastMod.ToastOptions): nativeDashToastLib.nativeDashToastMod.Toast = js.native
}

