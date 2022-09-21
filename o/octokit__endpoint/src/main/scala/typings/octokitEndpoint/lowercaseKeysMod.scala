package typings.octokitEndpoint

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lowercaseKeysMod {
  
  @JSImport("@octokit/endpoint/dist-types/util/lowercase-keys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lowercaseKeys(): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("lowercaseKeys")().asInstanceOf[StringDictionary[Any]]
  inline def lowercaseKeys(`object`: StringDictionary[Any]): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("lowercaseKeys")(`object`.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
}
