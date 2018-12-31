package typings
package n3Lib.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "DataFactory")
@js.native
object DataFactoryNs extends js.Object {
  def blankNode(): n3Lib.n3Mod.BlankNode = js.native
  def blankNode(value: java.lang.String): n3Lib.n3Mod.BlankNode = js.native
  def defaultGraph(): n3Lib.n3Mod.DefaultGraph = js.native
  def literal(value: java.lang.String): n3Lib.n3Mod.Literal = js.native
  def literal(value: java.lang.String, languageOrDatatype: java.lang.String): n3Lib.n3Mod.Literal = js.native
  def literal(value: java.lang.String, languageOrDatatype: rdfDashJsLib.rdfDashJsMod.NamedNode): n3Lib.n3Mod.Literal = js.native
  def literal(value: scala.Double): n3Lib.n3Mod.Literal = js.native
  def literal(value: scala.Double, languageOrDatatype: java.lang.String): n3Lib.n3Mod.Literal = js.native
  def literal(value: scala.Double, languageOrDatatype: rdfDashJsLib.rdfDashJsMod.NamedNode): n3Lib.n3Mod.Literal = js.native
  def namedNode(value: java.lang.String): n3Lib.n3Mod.NamedNode = js.native
  def quad(
    subject: rdfDashJsLib.rdfDashJsMod.Quad_Subject,
    predicate: rdfDashJsLib.rdfDashJsMod.Quad_Predicate,
    `object`: rdfDashJsLib.rdfDashJsMod.Quad_Object
  ): n3Lib.n3Mod.Quad = js.native
  def quad(
    subject: rdfDashJsLib.rdfDashJsMod.Quad_Subject,
    predicate: rdfDashJsLib.rdfDashJsMod.Quad_Predicate,
    `object`: rdfDashJsLib.rdfDashJsMod.Quad_Object,
    graph: rdfDashJsLib.rdfDashJsMod.Quad_Graph
  ): n3Lib.n3Mod.Quad = js.native
  def quad[Q_In /* <: rdfDashJsLib.rdfDashJsMod.BaseQuad */, Q_Out /* <: n3Lib.n3Mod.BaseQuad */](
    subject: /* import warning: ImportType.apply Failed type conversion: Q_In['subject'] */ js.Any,
    predicate: /* import warning: ImportType.apply Failed type conversion: Q_In['predicate'] */ js.Any,
    `object`: /* import warning: ImportType.apply Failed type conversion: Q_In['object'] */ js.Any
  ): Q_Out = js.native
  def quad[Q_In /* <: rdfDashJsLib.rdfDashJsMod.BaseQuad */, Q_Out /* <: n3Lib.n3Mod.BaseQuad */](
    subject: /* import warning: ImportType.apply Failed type conversion: Q_In['subject'] */ js.Any,
    predicate: /* import warning: ImportType.apply Failed type conversion: Q_In['predicate'] */ js.Any,
    `object`: /* import warning: ImportType.apply Failed type conversion: Q_In['object'] */ js.Any,
    graph: /* import warning: ImportType.apply Failed type conversion: Q_In['graph'] */ js.Any
  ): Q_Out = js.native
  def triple(
    subject: rdfDashJsLib.rdfDashJsMod.Quad_Subject,
    predicate: rdfDashJsLib.rdfDashJsMod.Quad_Predicate,
    `object`: rdfDashJsLib.rdfDashJsMod.Quad_Object
  ): n3Lib.n3Mod.Quad = js.native
  def triple[Q_In /* <: rdfDashJsLib.rdfDashJsMod.BaseQuad */, Q_Out /* <: n3Lib.n3Mod.BaseQuad */](
    subject: /* import warning: ImportType.apply Failed type conversion: Q_In['subject'] */ js.Any,
    predicate: /* import warning: ImportType.apply Failed type conversion: Q_In['predicate'] */ js.Any,
    `object`: /* import warning: ImportType.apply Failed type conversion: Q_In['object'] */ js.Any
  ): Q_Out = js.native
  def variable(value: java.lang.String): n3Lib.n3Mod.Variable = js.native
}

