package typings
package n3Lib.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait N3Writer[Q /* <: rdfDashJsLib.rdfDashJsMod.BaseQuad */] extends js.Object {
  def addPrefix(prefix: java.lang.String, iri: java.lang.String): scala.Unit = js.native
  def addPrefix(prefix: java.lang.String, iri: java.lang.String, done: js.Function0[scala.Unit]): scala.Unit = js.native
  def addPrefix(prefix: java.lang.String, iri: rdfDashJsLib.rdfDashJsMod.NamedNode): scala.Unit = js.native
  def addPrefix(prefix: java.lang.String, iri: rdfDashJsLib.rdfDashJsMod.NamedNode, done: js.Function0[scala.Unit]): scala.Unit = js.native
  def addPrefixes(prefixes: Prefixes[rdfDashJsLib.rdfDashJsMod.NamedNode | java.lang.String]): scala.Unit = js.native
  def addPrefixes(
    prefixes: Prefixes[rdfDashJsLib.rdfDashJsMod.NamedNode | java.lang.String],
    done: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def addQuad(quad: rdfDashJsLib.rdfDashJsMod.Quad): scala.Unit = js.native
  def addQuad(
    subject: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(subject))) */js.Any,
    predicate: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(predicate))) */js.Any,
    `object`: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(object))) */js.Any
  ): scala.Unit = js.native
  def addQuad(
    subject: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(subject))) */js.Any,
    predicate: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(predicate))) */js.Any,
    `object`: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(object))) */js.Any,
    graph: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(graph))) */js.Any
  ): scala.Unit = js.native
  def addQuad(
    subject: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(subject))) */js.Any,
    predicate: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(predicate))) */js.Any,
    `object`: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(object))) */js.Any,
    graph: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(graph))) */js.Any,
    done: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def addQuad(
    subject: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(subject))) */js.Any,
    predicate: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(predicate))) */js.Any,
    `object`: js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(object))) */js.Any
    ]
  ): scala.Unit = js.native
  def addQuad(
    subject: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(subject))) */js.Any,
    predicate: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(predicate))) */js.Any,
    `object`: js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(object))) */js.Any
    ],
    graph: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(graph))) */js.Any
  ): scala.Unit = js.native
  def addQuad(
    subject: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(subject))) */js.Any,
    predicate: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(predicate))) */js.Any,
    `object`: js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(object))) */js.Any
    ],
    graph: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(graph))) */js.Any,
    done: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def addQuads(quads: js.Array[rdfDashJsLib.rdfDashJsMod.Quad]): scala.Unit = js.native
  def blank(
    predicate: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(predicate))) */js.Any,
    `object`: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(object))) */js.Any
  ): BlankNode = js.native
  def blank(triple: js.Array[BlankTriple[rdfDashJsLib.rdfDashJsMod.Quad] | rdfDashJsLib.rdfDashJsMod.Quad]): BlankNode = js.native
  def blank(triple: BlankTriple[rdfDashJsLib.rdfDashJsMod.Quad]): BlankNode = js.native
  def blank(triple: rdfDashJsLib.rdfDashJsMod.Quad): BlankNode = js.native
  def end(): scala.Unit = js.native
  def end(err: ErrorCallback): scala.Unit = js.native
  def end(err: ErrorCallback, result: java.lang.String): scala.Unit = js.native
  def list(
    triple: js.Array[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(object))) */js.Any
    ]
  ): js.Array[Quad_Object] = js.native
  def quadToString(
    subject: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(subject))) */js.Any,
    predicate: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(predicate))) */js.Any,
    `object`: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(object))) */js.Any
  ): java.lang.String = js.native
  def quadToString(
    subject: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(subject))) */js.Any,
    predicate: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(predicate))) */js.Any,
    `object`: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(object))) */js.Any,
    graph: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Q))),List()),Left(TsIdentSimple(graph))) */js.Any
  ): java.lang.String = js.native
  def quadsToString(quads: js.Array[rdfDashJsLib.rdfDashJsMod.Quad]): java.lang.String = js.native
}

