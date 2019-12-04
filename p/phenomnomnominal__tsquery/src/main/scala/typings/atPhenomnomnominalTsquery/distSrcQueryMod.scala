package typings.atPhenomnomnominalTsquery

import typings.atPhenomnomnominalTsquery.distSrcTsqueryDashTypesMod.TSQueryOptions
import typings.typescript.typescriptMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phenomnomnominal/tsquery/dist/src/query", JSImport.Namespace)
@js.native
object distSrcQueryMod extends js.Object {
  def query[T /* <: Node */](ast: String, selector: String): js.Array[T] = js.native
  def query[T /* <: Node */](ast: String, selector: String, options: TSQueryOptions): js.Array[T] = js.native
  def query[T /* <: Node */](ast: Node, selector: String): js.Array[T] = js.native
  def query[T /* <: Node */](ast: Node, selector: String, options: TSQueryOptions): js.Array[T] = js.native
}

