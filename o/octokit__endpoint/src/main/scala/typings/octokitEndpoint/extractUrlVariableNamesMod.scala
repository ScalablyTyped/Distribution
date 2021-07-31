package typings.octokitEndpoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extractUrlVariableNamesMod {
  
  @JSImport("@octokit/endpoint/dist-types/util/extract-url-variable-names", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def extractUrlVariableNames(url: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractUrlVariableNames")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
}
