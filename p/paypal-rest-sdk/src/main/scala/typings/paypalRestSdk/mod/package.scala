package typings.paypalRestSdk.mod

import typings.paypalRestSdk.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def configure(opts: ConfigureOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(opts.asInstanceOf[js.Any]).asInstanceOf[String]

type CallbackFunction[T] = js.Function2[/* err */ SDKError, /* response */ T, Any]
