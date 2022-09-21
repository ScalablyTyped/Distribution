package typings.n3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("n3", "Writer")
@js.native
open class Writer[Q /* <: typings.rdfjsTypes.dataModelMod.BaseQuad */] () extends StObject {
  def this(fd: Any) = this()
  def this(options: WriterOptions) = this()
  def this(fd: Any, options: WriterOptions) = this()
  
  def addPrefix(prefix: String, iri: String): Unit = js.native
  def addPrefix(prefix: String, iri: String, done: js.Function0[Unit]): Unit = js.native
  def addPrefix(prefix: String, iri: typings.rdfjsTypes.dataModelMod.NamedNode[String]): Unit = js.native
  def addPrefix(prefix: String, iri: typings.rdfjsTypes.dataModelMod.NamedNode[String], done: js.Function0[Unit]): Unit = js.native
  
  def addPrefixes(prefixes: Prefixes[typings.rdfjsTypes.dataModelMod.NamedNode[String] | String]): Unit = js.native
  def addPrefixes(
    prefixes: Prefixes[typings.rdfjsTypes.dataModelMod.NamedNode[String] | String],
    done: js.Function0[Unit]
  ): Unit = js.native
  
  def addQuad(quad: typings.rdfjsTypes.dataModelMod.Quad): Unit = js.native
  def addQuad(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
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
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any,
    graph: Unit,
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
  def addQuad(
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
    ],
    graph: Unit,
    done: js.Function0[Unit]
  ): Unit = js.native
  
  def addQuads(quads: js.Array[typings.rdfjsTypes.dataModelMod.Quad]): Unit = js.native
  
  def blank(
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q['object'] */ js.Any
  ): BlankNode = js.native
  def blank(
    triple: js.Array[
      BlankTriple[typings.rdfjsTypes.dataModelMod.Quad] | typings.rdfjsTypes.dataModelMod.Quad
    ]
  ): BlankNode = js.native
  def blank(triple: BlankTriple[typings.rdfjsTypes.dataModelMod.Quad]): BlankNode = js.native
  def blank(triple: typings.rdfjsTypes.dataModelMod.Quad): BlankNode = js.native
  
  def end(): Unit = js.native
  def end(err: Unit, result: String): Unit = js.native
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
  
  def quadsToString(quads: js.Array[typings.rdfjsTypes.dataModelMod.Quad]): String = js.native
}
