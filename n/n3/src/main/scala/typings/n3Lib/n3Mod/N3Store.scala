package typings
package n3Lib.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait N3Store[Q_RDF /* <: rdfDashJsLib.rdfDashJsMod.BaseQuad */, Q_N3 /* <: BaseQuad */]
  extends rdfDashJsLib.rdfDashJsMod.Sink[rdfDashJsLib.rdfDashJsMod.Quad] {
  val size: scala.Double = js.native
  def addQuad(quad: Q_RDF): scala.Unit = js.native
  def addQuad(
    subject: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(subject))) */js.Any,
    predicate: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(predicate))) */js.Any,
    `object`: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(object))) */js.Any
  ): scala.Unit = js.native
  def addQuad(
    subject: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(subject))) */js.Any,
    predicate: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(predicate))) */js.Any,
    `object`: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(object))) */js.Any,
    graph: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(graph))) */js.Any
  ): scala.Unit = js.native
  def addQuad(
    subject: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(subject))) */js.Any,
    predicate: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(predicate))) */js.Any,
    `object`: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(object))) */js.Any,
    graph: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(graph))) */js.Any,
    done: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def addQuad(
    subject: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(subject))) */js.Any,
    predicate: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(predicate))) */js.Any,
    `object`: js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(object))) */js.Any
    ]
  ): scala.Unit = js.native
  def addQuad(
    subject: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(subject))) */js.Any,
    predicate: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(predicate))) */js.Any,
    `object`: js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(object))) */js.Any
    ],
    graph: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(graph))) */js.Any
  ): scala.Unit = js.native
  def addQuad(
    subject: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(subject))) */js.Any,
    predicate: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(predicate))) */js.Any,
    `object`: js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(object))) */js.Any
    ],
    graph: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(graph))) */js.Any,
    done: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def addQuads(quads: js.Array[Q_RDF]): scala.Unit = js.native
  def countQuads(subject: OTerm, predicate: OTerm, `object`: OTerm, graph: OTerm): scala.Double = js.native
  def createBlankNode(): BlankNode = js.native
  def createBlankNode(suggestedName: java.lang.String): BlankNode = js.native
  def every(callback: QuadPredicate[Q_N3], subject: OTerm, predicate: OTerm, `object`: OTerm, graph: OTerm): scala.Boolean = js.native
  def forEach(callback: QuadCallback[Q_N3], subject: OTerm, predicate: OTerm, `object`: OTerm, graph: OTerm): scala.Unit = js.native
  def forGraphs(callback: QuadCallback[Q_N3], subject: OTerm, predicate: OTerm, `object`: OTerm): scala.Unit = js.native
  def forObjects(callback: QuadCallback[Q_N3], subject: OTerm, predicate: OTerm, graph: OTerm): scala.Unit = js.native
  def forPredicates(callback: QuadCallback[Q_N3], subject: OTerm, `object`: OTerm, graph: OTerm): scala.Unit = js.native
  def forSubjects(callback: QuadCallback[Q_N3], predicate: OTerm, `object`: OTerm, graph: OTerm): scala.Unit = js.native
  def getGraphs(subject: OTerm, predicate: OTerm, `object`: OTerm): js.Array[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_N3))),List()),Left(TsIdentSimple(graph))) */js.Any
  ] = js.native
  def getObjects(subject: OTerm, predicate: OTerm, graph: OTerm): js.Array[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_N3))),List()),Left(TsIdentSimple(object))) */js.Any
  ] = js.native
  def getPredicates(subject: OTerm, `object`: OTerm, graph: OTerm): js.Array[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_N3))),List()),Left(TsIdentSimple(predicate))) */js.Any
  ] = js.native
  def getQuads(subject: OTerm, predicate: OTerm, `object`: js.Array[OTerm], graph: OTerm): js.Array[Quad] = js.native
  def getQuads(subject: OTerm, predicate: OTerm, `object`: OTerm, graph: OTerm): js.Array[Quad] = js.native
  def getSubjects(predicate: OTerm, `object`: OTerm, graph: OTerm): js.Array[
    /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_N3))),List()),Left(TsIdentSimple(subject))) */js.Any
  ] = js.native
  // match, removeMatches and deleteGraph are missing for full RDF.Store adherence
  def remove(stream: nodeLib.streamMod.Stream): nodeLib.eventsMod.EventEmitter = js.native
  def removeQuad(quad: Q_RDF): scala.Unit = js.native
  def removeQuad(
    subject: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(subject))) */js.Any,
    predicate: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(predicate))) */js.Any,
    `object`: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(object))) */js.Any
  ): scala.Unit = js.native
  def removeQuad(
    subject: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(subject))) */js.Any,
    predicate: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(predicate))) */js.Any,
    `object`: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(object))) */js.Any,
    graph: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(graph))) */js.Any
  ): scala.Unit = js.native
  def removeQuad(
    subject: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(subject))) */js.Any,
    predicate: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(predicate))) */js.Any,
    `object`: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(object))) */js.Any,
    graph: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(graph))) */js.Any,
    done: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def removeQuad(
    subject: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(subject))) */js.Any,
    predicate: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(predicate))) */js.Any,
    `object`: js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(object))) */js.Any
    ]
  ): scala.Unit = js.native
  def removeQuad(
    subject: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(subject))) */js.Any,
    predicate: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(predicate))) */js.Any,
    `object`: js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(object))) */js.Any
    ],
    graph: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(graph))) */js.Any
  ): scala.Unit = js.native
  def removeQuad(
    subject: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(subject))) */js.Any,
    predicate: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(predicate))) */js.Any,
    `object`: js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(object))) */js.Any
    ],
    graph: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q_RDF))),List()),Left(TsIdentSimple(graph))) */js.Any,
    done: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def removeQuads(quads: js.Array[Q_RDF]): scala.Unit = js.native
  def some(callback: QuadPredicate[Q_N3], subject: OTerm, predicate: OTerm, `object`: OTerm, graph: OTerm): scala.Boolean = js.native
}

