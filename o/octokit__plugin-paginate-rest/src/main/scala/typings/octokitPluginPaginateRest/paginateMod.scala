package typings.octokitPluginPaginateRest

import typings.octokitPluginPaginateRest.typesMod.MapFunction
import typings.octokitPluginPaginateRest.typesMod.PaginationResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@octokit/plugin-paginate-rest/dist-types/paginate", JSImport.Namespace)
@js.native
object paginateMod extends js.Object {
  def paginate(
    octokit: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Octokit */ js.Any,
    route: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Route */ js.Any
  ): js.Promise[PaginationResults[_]] = js.native
  def paginate(
    octokit: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Octokit */ js.Any,
    route: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Route */ js.Any,
    parameters: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any
  ): js.Promise[PaginationResults[_]] = js.native
  def paginate(
    octokit: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Octokit */ js.Any,
    route: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Route */ js.Any,
    parameters: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify RequestParameters */ js.Any,
    mapFn: MapFunction[_, _]
  ): js.Promise[PaginationResults[_]] = js.native
}

