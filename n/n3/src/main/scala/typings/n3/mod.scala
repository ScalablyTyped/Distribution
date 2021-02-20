package typings.n3

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.NodeJS.WritableStream
import typings.node.anon.End
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Transform
import typings.rdfJs.mod.DataFactory
import typings.rdfJs.mod.Sink
import typings.rdfJs.mod.Stream
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("n3", "BaseQuad")
  @js.native
  class BaseQuad protected ()
    extends typings.rdfJs.mod.BaseQuad {
    def this(subject: Term, predicate: Term, `object`: Term) = this()
    def this(subject: Term, predicate: Term, `object`: Term, graph: Term) = this()
    
    def equals(other: typings.rdfJs.mod.BaseQuad): Boolean = js.native
    
    def toJSON(): String = js.native
  }
  
  @JSImport("n3", "BlankNode")
  @js.native
  class BlankNode protected ()
    extends typings.rdfJs.mod.BlankNode
       with _QuadGraph
       with _QuadObject
       with _QuadSubject
       with _Term {
    def this(name: String) = this()
    
    val id: String = js.native
    
    def toJSON(): js.Object = js.native
  }
  /* static members */
  object BlankNode {
    
    @JSImport("n3", "BlankNode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("n3", "BlankNode.nextId")
    @js.native
    def nextId: Double = js.native
    @scala.inline
    def nextId_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextId")(x.asInstanceOf[js.Any])
    
    @JSImport("n3", "BlankNode.subclass")
    @js.native
    def subclass(`type`: js.Any): Unit = js.native
  }
  
  object DataFactory {
    
    @JSImport("n3", "DataFactory.blankNode")
    @js.native
    def blankNode(): BlankNode = js.native
    @JSImport("n3", "DataFactory.blankNode")
    @js.native
    def blankNode(value: String): BlankNode = js.native
    
    @JSImport("n3", "DataFactory.defaultGraph")
    @js.native
    def defaultGraph(): DefaultGraph = js.native
    
    @JSImport("n3", "DataFactory.literal")
    @js.native
    def literal(value: String): Literal = js.native
    @JSImport("n3", "DataFactory.literal")
    @js.native
    def literal(value: String, languageOrDatatype: String): Literal = js.native
    @JSImport("n3", "DataFactory.literal")
    @js.native
    def literal(value: String, languageOrDatatype: typings.rdfJs.mod.NamedNode[String]): Literal = js.native
    @JSImport("n3", "DataFactory.literal")
    @js.native
    def literal(value: Double): Literal = js.native
    @JSImport("n3", "DataFactory.literal")
    @js.native
    def literal(value: Double, languageOrDatatype: String): Literal = js.native
    @JSImport("n3", "DataFactory.literal")
    @js.native
    def literal(value: Double, languageOrDatatype: typings.rdfJs.mod.NamedNode[String]): Literal = js.native
    
    @JSImport("n3", "DataFactory.namedNode")
    @js.native
    def namedNode[Iri /* <: String */](value: Iri): NamedNode[Iri] = js.native
    
    @JSImport("n3", "DataFactory.quad")
    @js.native
    def quad(
      subject: typings.rdfJs.mod.QuadSubject,
      predicate: typings.rdfJs.mod.QuadPredicate,
      `object`: typings.rdfJs.mod.QuadObject
    ): Quad = js.native
    @JSImport("n3", "DataFactory.quad")
    @js.native
    def quad(
      subject: typings.rdfJs.mod.QuadSubject,
      predicate: typings.rdfJs.mod.QuadPredicate,
      `object`: typings.rdfJs.mod.QuadObject,
      graph: typings.rdfJs.mod.QuadGraph
    ): Quad = js.native
    @JSImport("n3", "DataFactory.quad")
    @js.native
    def quad[Q_In /* <: typings.rdfJs.mod.BaseQuad */, Q_Out /* <: BaseQuad */](
      subject: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['subject'] */ js.Any,
      predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['predicate'] */ js.Any,
      `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['object'] */ js.Any
    ): Q_Out = js.native
    @JSImport("n3", "DataFactory.quad")
    @js.native
    def quad[Q_In /* <: typings.rdfJs.mod.BaseQuad */, Q_Out /* <: BaseQuad */](
      subject: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['subject'] */ js.Any,
      predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['predicate'] */ js.Any,
      `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['object'] */ js.Any,
      graph: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['graph'] */ js.Any
    ): Q_Out = js.native
    
    @JSImport("n3", "DataFactory.triple")
    @js.native
    def triple(
      subject: typings.rdfJs.mod.QuadSubject,
      predicate: typings.rdfJs.mod.QuadPredicate,
      `object`: typings.rdfJs.mod.QuadObject
    ): Quad = js.native
    @JSImport("n3", "DataFactory.triple")
    @js.native
    def triple[Q_In /* <: typings.rdfJs.mod.BaseQuad */, Q_Out /* <: BaseQuad */](
      subject: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['subject'] */ js.Any,
      predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['predicate'] */ js.Any,
      `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['object'] */ js.Any
    ): Q_Out = js.native
    
    @JSImport("n3", "DataFactory.variable")
    @js.native
    def variable(value: String): Variable = js.native
  }
  
  @JSImport("n3", "DefaultGraph")
  @js.native
  class DefaultGraph ()
    extends typings.rdfJs.mod.DefaultGraph
       with _QuadGraph
       with _Term {
    
    val id: String = js.native
    
    def toJSON(): js.Object = js.native
  }
  /* static members */
  object DefaultGraph {
    
    @JSImport("n3", "DefaultGraph.subclass")
    @js.native
    def subclass(`type`: js.Any): Unit = js.native
  }
  
  @JSImport("n3", "Literal")
  @js.native
  class Literal protected ()
    extends typings.rdfJs.mod.Literal
       with _QuadObject
       with _Term {
    def this(id: String) = this()
    
    val datatypeString: String = js.native
    
    val id: String = js.native
    
    def toJSON(): js.Object = js.native
  }
  /* static members */
  object Literal {
    
    @JSImport("n3", "Literal.langStringDatatype")
    @js.native
    val langStringDatatype: NamedNode[String] = js.native
    
    @JSImport("n3", "Literal.subclass")
    @js.native
    def subclass(`type`: js.Any): Unit = js.native
  }
  
  @JSImport("n3", "NamedNode")
  @js.native
  class NamedNode[Iri /* <: String */] protected ()
    extends typings.rdfJs.mod.NamedNode[Iri] {
    def this(iri: Iri) = this()
    
    val id: String = js.native
    
    def toJSON(): js.Object = js.native
  }
  /* static members */
  object NamedNode {
    
    @JSImport("n3", "NamedNode.subclass")
    @js.native
    def subclass(`type`: js.Any): Unit = js.native
  }
  
  @JSImport("n3", "Parser")
  @js.native
  class Parser[Q /* <: BaseQuad */] () extends StObject {
    def this(options: ParserOptions) = this()
    
    def parse(input: String): js.Array[Q] = js.native
    def parse(input: String, callback: ParseCallback[Q]): Unit = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.rdfJs.mod._Term because Already inherited
  - typings.rdfJs.mod.BaseQuad because Already inherited
  - typings.rdfJs.mod.Quad because var conflicts: graph, `object`, predicate, subject, termType, value. Inlined subject_Quad, predicate_Quad, object_Quad, graph_Quad */ @JSImport("n3", "Quad")
  @js.native
  class Quad protected ()
    extends BaseQuad
       with typings.rdfJs.mod._QuadObject
       with typings.rdfJs.mod._QuadSubject {
    def this(subject: Term, predicate: Term, `object`: Term) = this()
    def this(subject: Term, predicate: Term, `object`: Term, graph: Term) = this()
    
    /**
      * The named graph.
      * @see Quad_Graph
      */
    @JSName("graph")
    var graph_Quad: typings.rdfJs.mod.QuadGraph = js.native
    
    /**
      * The object.
      * @see Quad_Object
      */
    @JSName("object")
    var object_Quad: typings.rdfJs.mod.QuadObject = js.native
    
    /**
      * The predicate.
      * @see Quad_Predicate
      */
    @JSName("predicate")
    var predicate_Quad: typings.rdfJs.mod.QuadPredicate = js.native
    
    /**
      * The subject.
      * @see Quad_Subject
      */
    @JSName("subject")
    var subject_Quad: typings.rdfJs.mod.QuadSubject = js.native
  }
  
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
  
  @JSImport("n3", "StreamParser")
  @js.native
  class StreamParser[Q /* <: BaseQuad */] ()
    extends Transform
       with Stream[Q]
       with Sink[EventEmitter, Stream[Q]] {
    def this(options: ParserOptions) = this()
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
    
    /**
      * This method pulls a quad out of the internal buffer and returns it.
      * If there is no quad available, then it will return null.
      *
      * @return A quad from the internal buffer, or null if none is available.
      */
    /* InferMemberOverrides */
    override def read(): (Q | Null) with (String | Buffer) = js.native
  }
  
  @JSImport("n3", "StreamWriter")
  @js.native
  class StreamWriter[Q /* <: typings.rdfJs.mod.BaseQuad */] ()
    extends Transform
       with Sink[Stream[Q], EventEmitter] {
    def this(fd: js.Any) = this()
    def this(options: WriterOptions) = this()
    def this(fd: js.Any, options: WriterOptions) = this()
    
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T): T = js.native
    /* InferMemberOverrides */
    override def pipe[T /* <: WritableStream */](destination: T, options: End): T = js.native
  }
  
  @JSImport("n3", "Triple")
  @js.native
  class Triple protected () extends Quad {
    def this(subject: Term, predicate: Term, `object`: Term) = this()
    def this(subject: Term, predicate: Term, `object`: Term, graph: Term) = this()
  }
  
  object Util {
    
    @JSImport("n3", "Util.inDefaultGraph")
    @js.native
    def inDefaultGraph(value: typings.rdfJs.mod.Quad): Boolean = js.native
    
    @JSImport("n3", "Util.isBlankNode")
    @js.native
    def isBlankNode(): Boolean = js.native
    @JSImport("n3", "Util.isBlankNode")
    @js.native
    def isBlankNode(value: typings.rdfJs.mod.Term): Boolean = js.native
    
    @JSImport("n3", "Util.isDefaultGraph")
    @js.native
    def isDefaultGraph(): Boolean = js.native
    @JSImport("n3", "Util.isDefaultGraph")
    @js.native
    def isDefaultGraph(value: typings.rdfJs.mod.Term): Boolean = js.native
    
    @JSImport("n3", "Util.isLiteral")
    @js.native
    def isLiteral(): Boolean = js.native
    @JSImport("n3", "Util.isLiteral")
    @js.native
    def isLiteral(value: typings.rdfJs.mod.Term): Boolean = js.native
    
    @JSImport("n3", "Util.isNamedNode")
    @js.native
    def isNamedNode(): Boolean = js.native
    @JSImport("n3", "Util.isNamedNode")
    @js.native
    def isNamedNode(value: typings.rdfJs.mod.Term): Boolean = js.native
    
    @JSImport("n3", "Util.isVariable")
    @js.native
    def isVariable(): Boolean = js.native
    @JSImport("n3", "Util.isVariable")
    @js.native
    def isVariable(value: typings.rdfJs.mod.Term): Boolean = js.native
    
    @JSImport("n3", "Util.prefix")
    @js.native
    def prefix(iri: String): PrefixedToIri = js.native
    @JSImport("n3", "Util.prefix")
    @js.native
    def prefix(iri: String, factory: DataFactory[typings.rdfJs.mod.Quad, typings.rdfJs.mod.Quad]): PrefixedToIri = js.native
    @JSImport("n3", "Util.prefix")
    @js.native
    def prefix(iri: typings.rdfJs.mod.NamedNode[String]): PrefixedToIri = js.native
    @JSImport("n3", "Util.prefix")
    @js.native
    def prefix(
      iri: typings.rdfJs.mod.NamedNode[String],
      factory: DataFactory[typings.rdfJs.mod.Quad, typings.rdfJs.mod.Quad]
    ): PrefixedToIri = js.native
    
    @JSImport("n3", "Util.prefixes")
    @js.native
    def prefixes(defaultPrefixes: Prefixes[typings.rdfJs.mod.NamedNode[String] | String]): js.Function1[/* prefix */ String, PrefixedToIri] = js.native
    @JSImport("n3", "Util.prefixes")
    @js.native
    def prefixes(
      defaultPrefixes: Prefixes[typings.rdfJs.mod.NamedNode[String] | String],
      factory: DataFactory[typings.rdfJs.mod.Quad, typings.rdfJs.mod.Quad]
    ): js.Function1[/* prefix */ String, PrefixedToIri] = js.native
  }
  
  @JSImport("n3", "Variable")
  @js.native
  class Variable protected ()
    extends typings.rdfJs.mod.Variable
       with _QuadGraph
       with _QuadObject
       with _QuadSubject
       with _Term {
    def this(name: String) = this()
    
    val id: String = js.native
    
    def toJSON(): js.Object = js.native
  }
  /* static members */
  object Variable {
    
    @JSImport("n3", "Variable.subclass")
    @js.native
    def subclass(`type`: js.Any): Unit = js.native
  }
  
  @JSImport("n3", "Writer")
  @js.native
  class Writer[Q /* <: typings.rdfJs.mod.BaseQuad */] () extends StObject {
    def this(fd: js.Any) = this()
    def this(options: WriterOptions) = this()
    def this(fd: js.Any, options: WriterOptions) = this()
    
    def addPrefix(prefix: String, iri: String): Unit = js.native
    def addPrefix(prefix: String, iri: String, done: js.Function0[Unit]): Unit = js.native
    def addPrefix(prefix: String, iri: typings.rdfJs.mod.NamedNode[String]): Unit = js.native
    def addPrefix(prefix: String, iri: typings.rdfJs.mod.NamedNode[String], done: js.Function0[Unit]): Unit = js.native
    
    def addPrefixes(prefixes: Prefixes[typings.rdfJs.mod.NamedNode[String] | String]): Unit = js.native
    def addPrefixes(prefixes: Prefixes[typings.rdfJs.mod.NamedNode[String] | String], done: js.Function0[Unit]): Unit = js.native
    
    def addQuad(quad: typings.rdfJs.mod.Quad): Unit = js.native
    def addQuad(
      subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
      predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
      `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
    ): Unit = js.native
    def addQuad(
      subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
      predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
      `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any,
      graph: js.UndefOr[scala.Nothing],
      done: js.Function0[Unit]
    ): Unit = js.native
    def addQuad(
      subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
      predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
      `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any,
      graph: /* import warning: importer.ImportType#apply Failed type conversion: Q['graph'] */ js.Any
    ): Unit = js.native
    def addQuad(
      subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
      predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
      `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any,
      graph: /* import warning: importer.ImportType#apply Failed type conversion: Q['graph'] */ js.Any,
      done: js.Function0[Unit]
    ): Unit = js.native
    def addQuad(
      subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
      predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
      `object`: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
        ]
    ): Unit = js.native
    def addQuad(
      subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
      predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
      `object`: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
        ],
      graph: js.UndefOr[scala.Nothing],
      done: js.Function0[Unit]
    ): Unit = js.native
    def addQuad(
      subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
      predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
      `object`: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
        ],
      graph: /* import warning: importer.ImportType#apply Failed type conversion: Q['graph'] */ js.Any
    ): Unit = js.native
    def addQuad(
      subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
      predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
      `object`: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
        ],
      graph: /* import warning: importer.ImportType#apply Failed type conversion: Q['graph'] */ js.Any,
      done: js.Function0[Unit]
    ): Unit = js.native
    
    def addQuads(quads: js.Array[typings.rdfJs.mod.Quad]): Unit = js.native
    
    def blank(
      predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
      `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
    ): BlankNode = js.native
    def blank(triple: js.Array[BlankTriple[typings.rdfJs.mod.Quad] | typings.rdfJs.mod.Quad]): BlankNode = js.native
    def blank(triple: BlankTriple[typings.rdfJs.mod.Quad]): BlankNode = js.native
    def blank(triple: typings.rdfJs.mod.Quad): BlankNode = js.native
    
    def end(): Unit = js.native
    def end(err: js.UndefOr[scala.Nothing], result: String): Unit = js.native
    def end(err: ErrorCallback): Unit = js.native
    def end(err: ErrorCallback, result: String): Unit = js.native
    
    @JSName("list")
    def list_object(
      triple: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
        ]
    ): js.Array[QuadObject] = js.native
    
    def quadToString(
      subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
      predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
      `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
    ): String = js.native
    def quadToString(
      subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
      predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
      `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any,
      graph: /* import warning: importer.ImportType#apply Failed type conversion: Q['graph'] */ js.Any
    ): String = js.native
    
    def quadsToString(quads: js.Array[typings.rdfJs.mod.Quad]): String = js.native
  }
  
  @js.native
  trait BlankTriple[Q /* <: typings.rdfJs.mod.BaseQuad */] extends StObject {
    
    var `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any = js.native
    
    var predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any = js.native
  }
  object BlankTriple {
    
    @scala.inline
    def apply[Q /* <: typings.rdfJs.mod.BaseQuad */](
      `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any,
      predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any
    ): BlankTriple[Q] = {
      val __obj = js.Dynamic.literal(predicate = predicate.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlankTriple[Q]]
    }
    
    @scala.inline
    implicit class BlankTripleMutableBuilder[Self <: BlankTriple[_], Q /* <: typings.rdfJs.mod.BaseQuad */] (val x: Self with BlankTriple[Q]) extends AnyVal {
      
      @scala.inline
      def setObject(value: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredicate(
        value: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any
      ): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    }
  }
  
  type ErrorCallback = js.Function2[/* err */ Error, /* result */ js.Any, Unit]
  
  type Logger = js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]
  
  type OTerm = typings.rdfJs.mod.Term | String | Null
  
  type ParseCallback[Q /* <: BaseQuad */] = js.Function3[
    /* error */ Error, 
    /* quad */ Q, 
    /* prefixes */ Prefixes[typings.rdfJs.mod.NamedNode[String]], 
    Unit
  ]
  
  @js.native
  trait ParserOptions extends StObject {
    
    var baseIRI: js.UndefOr[String] = js.native
    
    var blankNodePrefix: js.UndefOr[String] = js.native
    
    var factory: js.UndefOr[DataFactory[typings.rdfJs.mod.Quad, typings.rdfJs.mod.Quad]] = js.native
    
    var format: js.UndefOr[String] = js.native
  }
  object ParserOptions {
    
    @scala.inline
    def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    @scala.inline
    implicit class ParserOptionsMutableBuilder[Self <: ParserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseIRI(value: String): Self = StObject.set(x, "baseIRI", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseIRIUndefined: Self = StObject.set(x, "baseIRI", js.undefined)
      
      @scala.inline
      def setBlankNodePrefix(value: String): Self = StObject.set(x, "blankNodePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlankNodePrefixUndefined: Self = StObject.set(x, "blankNodePrefix", js.undefined)
      
      @scala.inline
      def setFactory(value: DataFactory[typings.rdfJs.mod.Quad, typings.rdfJs.mod.Quad]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  type PrefixedToIri = js.Function1[/* suffix */ String, NamedNode[String]]
  
  type Prefixes[I] = StringDictionary[I]
  
  type QuadCallback[Q /* <: BaseQuad */] = js.Function1[/* result */ Q, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.n3.mod.DefaultGraph
    - typings.n3.mod.NamedNode[java.lang.String]
    - typings.n3.mod.BlankNode
    - typings.n3.mod.Variable
  */
  type QuadGraph = _QuadGraph | NamedNode[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.n3.mod.NamedNode[java.lang.String]
    - typings.n3.mod.Literal
    - typings.n3.mod.BlankNode
    - typings.n3.mod.Variable
  */
  type QuadObject = _QuadObject | NamedNode[String]
  
  type QuadPredicate[Q /* <: BaseQuad */] = js.Function1[/* result */ Q, Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.n3.mod.NamedNode[java.lang.String]
    - typings.n3.mod.BlankNode
    - typings.n3.mod.Variable
  */
  type QuadSubject = _QuadSubject | NamedNode[String]
  
  type Quad_Predicate = NamedNode[String] | Variable
  
  @js.native
  trait StoreOptions extends StObject {
    
    var factory: js.UndefOr[DataFactory[typings.rdfJs.mod.Quad, typings.rdfJs.mod.Quad]] = js.native
  }
  object StoreOptions {
    
    @scala.inline
    def apply(): StoreOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoreOptions]
    }
    
    @scala.inline
    implicit class StoreOptionsMutableBuilder[Self <: StoreOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFactory(value: DataFactory[typings.rdfJs.mod.Quad, typings.rdfJs.mod.Quad]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.n3.mod.NamedNode[java.lang.String]
    - typings.n3.mod.BlankNode
    - typings.n3.mod.Literal
    - typings.n3.mod.Variable
    - typings.n3.mod.DefaultGraph
  */
  type Term = _Term | NamedNode[String]
  
  @js.native
  trait WriterOptions extends StObject {
    
    var end: js.UndefOr[Boolean] = js.native
    
    var format: js.UndefOr[String] = js.native
    
    var prefixes: js.UndefOr[Prefixes[typings.rdfJs.mod.NamedNode[String] | String]] = js.native
  }
  object WriterOptions {
    
    @scala.inline
    def apply(): WriterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WriterOptions]
    }
    
    @scala.inline
    implicit class WriterOptionsMutableBuilder[Self <: WriterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setPrefixes(value: Prefixes[typings.rdfJs.mod.NamedNode[String] | String]): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixesUndefined: Self = StObject.set(x, "prefixes", js.undefined)
    }
  }
  
  trait _QuadGraph extends StObject
  
  trait _QuadObject extends StObject
  
  trait _QuadSubject extends StObject
  
  trait _Term extends StObject
}
