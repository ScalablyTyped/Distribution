package typings.paypalRestSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CallbackFunction[T] = js.Function2[/* err */ typings.paypalRestSdk.mod.SDKError, /* response */ T, js.Any]
  
  @scala.inline
  def configure(opts: typings.paypalRestSdk.mod.ConfigureOptions): java.lang.String = typings.paypalRestSdk.mod.^.asInstanceOf[js.Dynamic].applyDynamic("configure")(opts.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
}
