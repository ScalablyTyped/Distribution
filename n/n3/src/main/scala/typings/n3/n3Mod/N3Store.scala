package typings.n3.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait N3Store[Q_RDF /* <: typings.rdfDashJs.rdfDashJsMod.BaseQuad */, Q_N3 /* <: BaseQuad */]
  extends typings.rdfDashJs.rdfDashJsMod.Store[Q_RDF] {
  val size: Double = js.native
  def addQuad(quad: Q_RDF): Unit = js.native
  def addQuad(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['object'] */ js.Any
  ): Unit = js.native
  def addQuad(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['object'] */ js.Any,
    graph: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['graph'] */ js.Any
  ): Unit = js.native
  def addQuad(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['object'] */ js.Any,
    graph: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['graph'] */ js.Any,
    done: js.Function0[Unit]
  ): Unit = js.native
  def addQuad(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['predicate'] */ js.Any,
    `object`: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['object'] */ js.Any
    ]
  ): Unit = js.native
  def addQuad(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['predicate'] */ js.Any,
    `object`: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['object'] */ js.Any
    ],
    graph: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['graph'] */ js.Any
  ): Unit = js.native
  def addQuad(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['predicate'] */ js.Any,
    `object`: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['object'] */ js.Any
    ],
    graph: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['graph'] */ js.Any,
    done: js.Function0[Unit]
  ): Unit = js.native
  def addQuads(quads: js.Array[Q_RDF]): Unit = js.native
  def countQuads(subject: OTerm, predicate: OTerm, `object`: OTerm, graph: OTerm): Double = js.native
  def createBlankNode(): BlankNode = js.native
  def createBlankNode(suggestedName: String): BlankNode = js.native
  def every(callback: QuadPredicate[Q_N3], subject: OTerm, predicate: OTerm, `object`: OTerm, graph: OTerm): Boolean = js.native
  def forEach(callback: QuadCallback[Q_N3], subject: OTerm, predicate: OTerm, `object`: OTerm, graph: OTerm): Unit = js.native
  def forGraphs(callback: QuadCallback[Q_N3], subject: OTerm, predicate: OTerm, `object`: OTerm): Unit = js.native
  def forObjects(callback: QuadCallback[Q_N3], subject: OTerm, predicate: OTerm, graph: OTerm): Unit = js.native
  def forPredicates(callback: QuadCallback[Q_N3], subject: OTerm, `object`: OTerm, graph: OTerm): Unit = js.native
  def forSubjects(callback: QuadCallback[Q_N3], predicate: OTerm, `object`: OTerm, graph: OTerm): Unit = js.native
  def getGraphs(subject: OTerm, predicate: OTerm, `object`: OTerm): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: Q_N3['graph'] */ js.Any
  ] = js.native
  def getObjects(subject: OTerm, predicate: OTerm, graph: OTerm): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: Q_N3['object'] */ js.Any
  ] = js.native
  def getPredicates(subject: OTerm, `object`: OTerm, graph: OTerm): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: Q_N3['predicate'] */ js.Any
  ] = js.native
  def getQuads(subject: OTerm, predicate: OTerm, `object`: js.Array[OTerm], graph: OTerm): js.Array[Quad] = js.native
  def getQuads(subject: OTerm, predicate: OTerm, `object`: OTerm, graph: OTerm): js.Array[Quad] = js.native
  def getSubjects(predicate: OTerm, `object`: OTerm, graph: OTerm): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: Q_N3['subject'] */ js.Any
  ] = js.native
  def removeQuad(quad: Q_RDF): Unit = js.native
  def removeQuad(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['object'] */ js.Any
  ): Unit = js.native
  def removeQuad(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['object'] */ js.Any,
    graph: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['graph'] */ js.Any
  ): Unit = js.native
  def removeQuad(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['object'] */ js.Any,
    graph: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['graph'] */ js.Any,
    done: js.Function0[Unit]
  ): Unit = js.native
  def removeQuad(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['predicate'] */ js.Any,
    `object`: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['object'] */ js.Any
    ]
  ): Unit = js.native
  def removeQuad(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['predicate'] */ js.Any,
    `object`: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['object'] */ js.Any
    ],
    graph: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['graph'] */ js.Any
  ): Unit = js.native
  def removeQuad(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['predicate'] */ js.Any,
    `object`: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['object'] */ js.Any
    ],
    graph: /* import warning: importer.ImportType#apply Failed type conversion: Q_RDF['graph'] */ js.Any,
    done: js.Function0[Unit]
  ): Unit = js.native
  def removeQuads(quads: js.Array[Q_RDF]): Unit = js.native
  def some(callback: QuadPredicate[Q_N3], subject: OTerm, predicate: OTerm, `object`: OTerm, graph: OTerm): Boolean = js.native
}

