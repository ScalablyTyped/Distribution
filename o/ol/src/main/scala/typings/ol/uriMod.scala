package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uriMod {
  
  @JSImport("ol/uri", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def appendParams(uri: String, params: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("appendParams")(uri.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
}
