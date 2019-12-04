package typings.atPhenomnomnominalTsquery

import typings.atPhenomnomnominalTsquery.distSrcTsqueryDashTypesMod.TSQueryNodeTransformer
import typings.atPhenomnomnominalTsquery.distSrcTsqueryDashTypesMod.TSQueryOptions
import typings.typescript.typescriptMod.SourceFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phenomnomnominal/tsquery/dist/src/map", JSImport.Namespace)
@js.native
object distSrcMapMod extends js.Object {
  def map(ast: SourceFile, selector: String, nodeTransformer: TSQueryNodeTransformer): SourceFile = js.native
  def map(
    ast: SourceFile,
    selector: String,
    nodeTransformer: TSQueryNodeTransformer,
    options: TSQueryOptions
  ): SourceFile = js.native
}

