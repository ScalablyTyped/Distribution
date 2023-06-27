package typings.openui5

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapBaseSecurityEncodeURLParametersMod {
  
  @JSImport("sap/base/security/encodeURLParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(/**
    * The map of parameters to encode
    */
  mParams: Record[String, String | Double | Boolean]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(mParams.asInstanceOf[js.Any]).asInstanceOf[String]
}
