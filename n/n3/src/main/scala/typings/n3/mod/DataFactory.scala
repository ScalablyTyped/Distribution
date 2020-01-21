package typings.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "DataFactory")
@js.native
object DataFactory extends js.Object {
  def blankNode(): BlankNode = js.native
  def blankNode(value: String): BlankNode = js.native
  def defaultGraph(): DefaultGraph = js.native
  def literal(value: String): Literal = js.native
  def literal(value: String, languageOrDatatype: String): Literal = js.native
  def literal(value: String, languageOrDatatype: typings.rdfJs.mod.NamedNode): Literal = js.native
  def literal(value: Double): Literal = js.native
  def literal(value: Double, languageOrDatatype: String): Literal = js.native
  def literal(value: Double, languageOrDatatype: typings.rdfJs.mod.NamedNode): Literal = js.native
  def namedNode(value: String): NamedNode = js.native
  def quad(
    subject: typings.rdfJs.mod.QuadSubject,
    predicate: typings.rdfJs.mod.QuadPredicate,
    `object`: typings.rdfJs.mod.QuadObject
  ): Quad = js.native
  def quad(
    subject: typings.rdfJs.mod.QuadSubject,
    predicate: typings.rdfJs.mod.QuadPredicate,
    `object`: typings.rdfJs.mod.QuadObject,
    graph: typings.rdfJs.mod.QuadGraph
  ): Quad = js.native
  def quad[Q_In /* <: typings.rdfJs.mod.BaseQuad */, Q_Out /* <: BaseQuad */](
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['object'] */ js.Any
  ): Q_Out = js.native
  def quad[Q_In /* <: typings.rdfJs.mod.BaseQuad */, Q_Out /* <: BaseQuad */](
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['object'] */ js.Any,
    graph: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['graph'] */ js.Any
  ): Q_Out = js.native
  def triple(
    subject: typings.rdfJs.mod.QuadSubject,
    predicate: typings.rdfJs.mod.QuadPredicate,
    `object`: typings.rdfJs.mod.QuadObject
  ): Quad = js.native
  def triple[Q_In /* <: typings.rdfJs.mod.BaseQuad */, Q_Out /* <: BaseQuad */](
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['object'] */ js.Any
  ): Q_Out = js.native
  def variable(value: String): Variable = js.native
}

