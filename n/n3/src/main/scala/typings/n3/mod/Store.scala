package typings.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("n3", "Store")
@js.native
class Store[Q_RDF /* <: typings.rdfJs.mod.BaseQuad */, Q_N3 /* <: BaseQuad */] ()
  extends typings.rdfJs.mod.Store[Q_RDF] {
  def this(triples: js.Array[Q_RDF]) = this()
  def this(triples: js.UndefOr[scala.Nothing], options: StoreOptions) = this()
  def this(triples: js.Array[Q_RDF], options: StoreOptions) = this()
  
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
    graph: js.UndefOr[scala.Nothing],
    done: js.Function0[Unit]
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
    graph: js.UndefOr[scala.Nothing],
    done: js.Function0[Unit]
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
  
  @JSName("forGraphs")
  def forGraphs_graph(
    callback: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: Q_N3['graph'] */ /* result */ js.Any, 
      Unit
    ],
    subject: OTerm,
    predicate: OTerm,
    `object`: OTerm
  ): Unit = js.native
  
  @JSName("forObjects")
  def forObjects_object(
    callback: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: Q_N3['object'] */ /* result */ js.Any, 
      Unit
    ],
    subject: OTerm,
    predicate: OTerm,
    graph: OTerm
  ): Unit = js.native
  
  @JSName("forPredicates")
  def forPredicates_predicate(
    callback: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: Q_N3['predicate'] */ /* result */ js.Any, 
      Unit
    ],
    subject: OTerm,
    `object`: OTerm,
    graph: OTerm
  ): Unit = js.native
  
  @JSName("forSubjects")
  def forSubjects_subject(
    callback: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: Q_N3['subject'] */ /* result */ js.Any, 
      Unit
    ],
    predicate: OTerm,
    `object`: OTerm,
    graph: OTerm
  ): Unit = js.native
  
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
    graph: js.UndefOr[scala.Nothing],
    done: js.Function0[Unit]
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
    graph: js.UndefOr[scala.Nothing],
    done: js.Function0[Unit]
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
  
  val size: Double = js.native
  
  def some(callback: QuadPredicate[Q_N3], subject: OTerm, predicate: OTerm, `object`: OTerm, graph: OTerm): Boolean = js.native
}
