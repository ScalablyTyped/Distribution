package typings.octokitRest

import typings.octokitCore.typesMod.Constructor
import typings.octokitRest.anon.TypeofCore
import typings.octokitRest.anon.paginatePaginateInterface
import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@octokit/rest", "Octokit")
  @js.native
  val Octokit: TypeofCore & Constructor[paginatePaginateInterface] = js.native
  type Octokit = InstanceType[
    (/* import warning: importer.ImportType#apply Failed type conversion: typeof Core */ js.Any) & Constructor[paginatePaginateInterface]
  ]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@octokit/rest", "Octokit")
  @js.native
  open class OctokitCls ()
    extends typings.octokitCore.mod.Octokit
}
