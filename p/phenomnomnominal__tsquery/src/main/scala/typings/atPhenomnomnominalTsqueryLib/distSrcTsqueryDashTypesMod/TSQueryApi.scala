package typings
package atPhenomnomnominalTsqueryLib.distSrcTsqueryDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSQueryApi extends js.Object {
  def apply[T /* <: typescriptLib.typescriptMod.Node */](ast: java.lang.String, selector: java.lang.String): js.Array[T] = js.native
  def apply[T /* <: typescriptLib.typescriptMod.Node */](ast: java.lang.String, selector: java.lang.String, options: TSQueryOptions): js.Array[T] = js.native
  def apply[T /* <: typescriptLib.typescriptMod.Node */](ast: typescriptLib.typescriptMod.Node, selector: java.lang.String): js.Array[T] = js.native
  def apply[T /* <: typescriptLib.typescriptMod.Node */](ast: typescriptLib.typescriptMod.Node, selector: java.lang.String, options: TSQueryOptions): js.Array[T] = js.native
  def ast(source: java.lang.String): typescriptLib.typescriptMod.SourceFile = js.native
  def ast(source: java.lang.String, fileName: java.lang.String): typescriptLib.typescriptMod.SourceFile = js.native
  def ast(
    source: java.lang.String,
    fileName: java.lang.String,
    scriptKind: typescriptLib.typescriptMod.ScriptKind
  ): typescriptLib.typescriptMod.SourceFile = js.native
  def map(
    ast: typescriptLib.typescriptMod.SourceFile,
    selector: java.lang.String,
    nodeTransformer: TSQueryNodeTransformer
  ): typescriptLib.typescriptMod.SourceFile = js.native
  def map(
    ast: typescriptLib.typescriptMod.SourceFile,
    selector: java.lang.String,
    nodeTransformer: TSQueryNodeTransformer,
    options: TSQueryOptions
  ): typescriptLib.typescriptMod.SourceFile = js.native
  def `match`[T /* <: typescriptLib.typescriptMod.Node */](ast: typescriptLib.typescriptMod.Node, selector: TSQuerySelectorNode): js.Array[T] = js.native
  def `match`[T /* <: typescriptLib.typescriptMod.Node */](ast: typescriptLib.typescriptMod.Node, selector: TSQuerySelectorNode, options: TSQueryOptions): js.Array[T] = js.native
  def parse(selector: java.lang.String): TSQuerySelectorNode = js.native
  def parse(selector: java.lang.String, options: TSQueryOptions): TSQuerySelectorNode = js.native
  def project(configFilePath: java.lang.String): js.Array[typescriptLib.typescriptMod.SourceFile] = js.native
  def query[T /* <: typescriptLib.typescriptMod.Node */](ast: java.lang.String, selector: java.lang.String): js.Array[T] = js.native
  def query[T /* <: typescriptLib.typescriptMod.Node */](ast: java.lang.String, selector: java.lang.String, options: TSQueryOptions): js.Array[T] = js.native
  def query[T /* <: typescriptLib.typescriptMod.Node */](ast: typescriptLib.typescriptMod.Node, selector: java.lang.String): js.Array[T] = js.native
  def query[T /* <: typescriptLib.typescriptMod.Node */](ast: typescriptLib.typescriptMod.Node, selector: java.lang.String, options: TSQueryOptions): js.Array[T] = js.native
  def replace(source: java.lang.String, selector: java.lang.String, stringTransformer: TSQueryStringTransformer): java.lang.String = js.native
  def replace(
    source: java.lang.String,
    selector: java.lang.String,
    stringTransformer: TSQueryStringTransformer,
    options: TSQueryOptions
  ): java.lang.String = js.native
  def syntaxKindName(node: typescriptLib.typescriptMod.SyntaxKind): java.lang.String = js.native
}

