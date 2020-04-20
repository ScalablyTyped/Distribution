package typings.octokitPluginPaginateRest

import typings.octokitCore.mod.Octokit
import typings.octokitPluginPaginateRest.typesMod.MapFunction
import typings.octokitPluginPaginateRest.typesMod.PaginationResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/plugin-paginate-rest/dist-types/paginate", JSImport.Namespace)
@js.native
object paginateMod extends js.Object {
  def paginate(
    octokit: Octokit,
    route: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Route */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestInterface */ js.Any
  ): js.Promise[PaginationResults[_]] = js.native
  def paginate(
    octokit: Octokit,
    route: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Route */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestInterface */ js.Any,
    parameters: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any
  ): js.Promise[PaginationResults[_]] = js.native
  def paginate(
    octokit: Octokit,
    route: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Route */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestInterface */ js.Any,
    parameters: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any,
    mapFn: MapFunction[_, _]
  ): js.Promise[PaginationResults[_]] = js.native
}

