package typings.n3.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "DataFactory")
@js.native
object DataFactoryNs extends js.Object {
  def blankNode(): BlankNode = js.native
  def blankNode(value: String): BlankNode = js.native
  def defaultGraph(): DefaultGraph = js.native
  def literal(value: String): Literal = js.native
  def literal(value: String, languageOrDatatype: String): Literal = js.native
  def literal(value: String, languageOrDatatype: typings.rdfDashJs.rdfDashJsMod.NamedNode): Literal = js.native
  def literal(value: Double): Literal = js.native
  def literal(value: Double, languageOrDatatype: String): Literal = js.native
  def literal(value: Double, languageOrDatatype: typings.rdfDashJs.rdfDashJsMod.NamedNode): Literal = js.native
  def namedNode(value: String): NamedNode = js.native
  def quad(
    subject: typings.rdfDashJs.rdfDashJsMod.Quad_Subject,
    predicate: typings.rdfDashJs.rdfDashJsMod.Quad_Predicate,
    `object`: typings.rdfDashJs.rdfDashJsMod.Quad_Object
  ): Quad = js.native
  def quad(
    subject: typings.rdfDashJs.rdfDashJsMod.Quad_Subject,
    predicate: typings.rdfDashJs.rdfDashJsMod.Quad_Predicate,
    `object`: typings.rdfDashJs.rdfDashJsMod.Quad_Object,
    graph: typings.rdfDashJs.rdfDashJsMod.Quad_Graph
  ): Quad = js.native
  def quad[Q_In /* <: typings.rdfDashJs.rdfDashJsMod.BaseQuad */, Q_Out /* <: BaseQuad */](
    subject: /* import warning: ImportType.apply Failed type conversion: Q_In['subject'] */ js.Any,
    predicate: /* import warning: ImportType.apply Failed type conversion: Q_In['predicate'] */ js.Any,
    `object`: /* import warning: ImportType.apply Failed type conversion: Q_In['object'] */ js.Any
  ): Q_Out = js.native
  def quad[Q_In /* <: typings.rdfDashJs.rdfDashJsMod.BaseQuad */, Q_Out /* <: BaseQuad */](
    subject: /* import warning: ImportType.apply Failed type conversion: Q_In['subject'] */ js.Any,
    predicate: /* import warning: ImportType.apply Failed type conversion: Q_In['predicate'] */ js.Any,
    `object`: /* import warning: ImportType.apply Failed type conversion: Q_In['object'] */ js.Any,
    graph: /* import warning: ImportType.apply Failed type conversion: Q_In['graph'] */ js.Any
  ): Q_Out = js.native
  def triple(
    subject: typings.rdfDashJs.rdfDashJsMod.Quad_Subject,
    predicate: typings.rdfDashJs.rdfDashJsMod.Quad_Predicate,
    `object`: typings.rdfDashJs.rdfDashJsMod.Quad_Object
  ): Quad = js.native
  def triple[Q_In /* <: typings.rdfDashJs.rdfDashJsMod.BaseQuad */, Q_Out /* <: BaseQuad */](
    subject: /* import warning: ImportType.apply Failed type conversion: Q_In['subject'] */ js.Any,
    predicate: /* import warning: ImportType.apply Failed type conversion: Q_In['predicate'] */ js.Any,
    `object`: /* import warning: ImportType.apply Failed type conversion: Q_In['object'] */ js.Any
  ): Q_Out = js.native
  def variable(value: String): Variable = js.native
}

