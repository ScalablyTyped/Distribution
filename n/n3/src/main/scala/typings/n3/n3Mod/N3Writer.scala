package typings.n3.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait N3Writer[Q /* <: typings.rdfDashJs.rdfDashJsMod.BaseQuad */] extends js.Object {
  def addPrefix(prefix: String, iri: String): Unit = js.native
  def addPrefix(prefix: String, iri: String, done: js.Function0[Unit]): Unit = js.native
  def addPrefix(prefix: String, iri: typings.rdfDashJs.rdfDashJsMod.NamedNode): Unit = js.native
  def addPrefix(prefix: String, iri: typings.rdfDashJs.rdfDashJsMod.NamedNode, done: js.Function0[Unit]): Unit = js.native
  def addPrefixes(prefixes: Prefixes[typings.rdfDashJs.rdfDashJsMod.NamedNode | String]): Unit = js.native
  def addPrefixes(prefixes: Prefixes[typings.rdfDashJs.rdfDashJsMod.NamedNode | String], done: js.Function0[Unit]): Unit = js.native
  def addQuad(quad: typings.rdfDashJs.rdfDashJsMod.Quad): Unit = js.native
  def addQuad(
    subject: /* import warning: ImportType.apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: ImportType.apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: /* import warning: ImportType.apply Failed type conversion: Q['object'] */ js.Any
  ): Unit = js.native
  def addQuad(
    subject: /* import warning: ImportType.apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: ImportType.apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: /* import warning: ImportType.apply Failed type conversion: Q['object'] */ js.Any,
    graph: /* import warning: ImportType.apply Failed type conversion: Q['graph'] */ js.Any
  ): Unit = js.native
  def addQuad(
    subject: /* import warning: ImportType.apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: ImportType.apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: /* import warning: ImportType.apply Failed type conversion: Q['object'] */ js.Any,
    graph: /* import warning: ImportType.apply Failed type conversion: Q['graph'] */ js.Any,
    done: js.Function0[Unit]
  ): Unit = js.native
  def addQuad(
    subject: /* import warning: ImportType.apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: ImportType.apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: js.Array[
      /* import warning: ImportType.apply Failed type conversion: Q['object'] */ js.Any
    ]
  ): Unit = js.native
  def addQuad(
    subject: /* import warning: ImportType.apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: ImportType.apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: js.Array[
      /* import warning: ImportType.apply Failed type conversion: Q['object'] */ js.Any
    ],
    graph: /* import warning: ImportType.apply Failed type conversion: Q['graph'] */ js.Any
  ): Unit = js.native
  def addQuad(
    subject: /* import warning: ImportType.apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: ImportType.apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: js.Array[
      /* import warning: ImportType.apply Failed type conversion: Q['object'] */ js.Any
    ],
    graph: /* import warning: ImportType.apply Failed type conversion: Q['graph'] */ js.Any,
    done: js.Function0[Unit]
  ): Unit = js.native
  def addQuads(quads: js.Array[typings.rdfDashJs.rdfDashJsMod.Quad]): Unit = js.native
  def blank(
    predicate: /* import warning: ImportType.apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: /* import warning: ImportType.apply Failed type conversion: Q['object'] */ js.Any
  ): BlankNode = js.native
  def blank(
    triple: js.Array[
      BlankTriple[typings.rdfDashJs.rdfDashJsMod.Quad] | typings.rdfDashJs.rdfDashJsMod.Quad
    ]
  ): BlankNode = js.native
  def blank(triple: BlankTriple[typings.rdfDashJs.rdfDashJsMod.Quad]): BlankNode = js.native
  def blank(triple: typings.rdfDashJs.rdfDashJsMod.Quad): BlankNode = js.native
  def end(): Unit = js.native
  def end(err: ErrorCallback): Unit = js.native
  def end(err: ErrorCallback, result: String): Unit = js.native
  @JSName("list")
  def list_object(
    triple: js.Array[
      /* import warning: ImportType.apply Failed type conversion: Q['object'] */ js.Any
    ]
  ): js.Array[Quad_Object] = js.native
  def quadToString(
    subject: /* import warning: ImportType.apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: ImportType.apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: /* import warning: ImportType.apply Failed type conversion: Q['object'] */ js.Any
  ): String = js.native
  def quadToString(
    subject: /* import warning: ImportType.apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: ImportType.apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: /* import warning: ImportType.apply Failed type conversion: Q['object'] */ js.Any,
    graph: /* import warning: ImportType.apply Failed type conversion: Q['graph'] */ js.Any
  ): String = js.native
  def quadsToString(quads: js.Array[typings.rdfDashJs.rdfDashJsMod.Quad]): String = js.native
}

