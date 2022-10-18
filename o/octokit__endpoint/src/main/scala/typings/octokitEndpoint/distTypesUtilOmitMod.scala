package typings.octokitEndpoint

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilOmitMod {
  
  @JSImport("@octokit/endpoint/dist-types/util/omit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def omit(`object`: StringDictionary[Any], keysToOmit: js.Array[String]): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(`object`.asInstanceOf[js.Any], keysToOmit.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
}
