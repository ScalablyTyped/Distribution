package typings.octokitRest

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.octokitCore.typesMod.Constructor
import typings.octokitPluginRestEndpointMethods.methodTypesMod.RestEndpointMethods
import typings.octokitRest.anon.Instantiable
import typings.octokitRest.anon.Paginate
import typings.octokitRest.anon.TypeofCore
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@octokit/rest", "Octokit")
  @js.native
  val Octokit: (Instantiable1[/* args (repeated) */ js.Any, StringDictionary[js.Any]]) & Instantiable & TypeofCore & (Constructor[Unit & Paginate & RestEndpointMethods]) = js.native
  type Octokit = InstanceType[
    (Instantiable1[/* args (repeated) */ js.Any, StringDictionary[js.Any]]) & Instantiable & (/* import warning: importer.ImportType#apply Failed type conversion: typeof Core */ js.Any) & (Constructor[Unit & Paginate & RestEndpointMethods])
  ]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@octokit/rest", "Octokit")
  @js.native
  class OctokitCls ()
    extends typings.octokitCore.mod.Octokit
}
