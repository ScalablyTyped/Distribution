package typings.n3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataFactory {
  
  @JSImport("n3", "DataFactory")
  @js.native
  val ^ : js.Any = js.native
  
  inline def blankNode(): BlankNode = ^.asInstanceOf[js.Dynamic].applyDynamic("blankNode")().asInstanceOf[BlankNode]
  inline def blankNode(value: String): BlankNode = ^.asInstanceOf[js.Dynamic].applyDynamic("blankNode")(value.asInstanceOf[js.Any]).asInstanceOf[BlankNode]
  
  inline def defaultGraph(): DefaultGraph = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultGraph")().asInstanceOf[DefaultGraph]
  
  inline def literal(value: String): Literal = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[Literal]
  inline def literal(value: String, languageOrDatatype: String): Literal = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], languageOrDatatype.asInstanceOf[js.Any])).asInstanceOf[Literal]
  inline def literal(value: String, languageOrDatatype: typings.rdfjsTypes.dataModelMod.NamedNode[String]): Literal = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], languageOrDatatype.asInstanceOf[js.Any])).asInstanceOf[Literal]
  inline def literal(value: Double): Literal = ^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any]).asInstanceOf[Literal]
  inline def literal(value: Double, languageOrDatatype: String): Literal = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], languageOrDatatype.asInstanceOf[js.Any])).asInstanceOf[Literal]
  inline def literal(value: Double, languageOrDatatype: typings.rdfjsTypes.dataModelMod.NamedNode[String]): Literal = (^.asInstanceOf[js.Dynamic].applyDynamic("literal")(value.asInstanceOf[js.Any], languageOrDatatype.asInstanceOf[js.Any])).asInstanceOf[Literal]
  
  inline def namedNode[Iri /* <: String */](value: Iri): NamedNode[Iri] = ^.asInstanceOf[js.Dynamic].applyDynamic("namedNode")(value.asInstanceOf[js.Any]).asInstanceOf[NamedNode[Iri]]
  
  inline def quad(
    subject: typings.rdfjsTypes.dataModelMod.QuadSubject,
    predicate: typings.rdfjsTypes.dataModelMod.QuadPredicate,
    `object`: typings.rdfjsTypes.dataModelMod.QuadObject
  ): Quad = (^.asInstanceOf[js.Dynamic].applyDynamic("quad")(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Quad]
  inline def quad(
    subject: typings.rdfjsTypes.dataModelMod.QuadSubject,
    predicate: typings.rdfjsTypes.dataModelMod.QuadPredicate,
    `object`: typings.rdfjsTypes.dataModelMod.QuadObject,
    graph: typings.rdfjsTypes.dataModelMod.QuadGraph
  ): Quad = (^.asInstanceOf[js.Dynamic].applyDynamic("quad")(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[Quad]
  inline def quad[Q_In /* <: typings.rdfjsTypes.dataModelMod.BaseQuad */, Q_Out /* <: BaseQuad */](
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['object'] */ js.Any
  ): Q_Out = (^.asInstanceOf[js.Dynamic].applyDynamic("quad")(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Q_Out]
  inline def quad[Q_In /* <: typings.rdfjsTypes.dataModelMod.BaseQuad */, Q_Out /* <: BaseQuad */](
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['object'] */ js.Any,
    graph: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['graph'] */ js.Any
  ): Q_Out = (^.asInstanceOf[js.Dynamic].applyDynamic("quad")(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], graph.asInstanceOf[js.Any])).asInstanceOf[Q_Out]
  
  inline def triple(
    subject: typings.rdfjsTypes.dataModelMod.QuadSubject,
    predicate: typings.rdfjsTypes.dataModelMod.QuadPredicate,
    `object`: typings.rdfjsTypes.dataModelMod.QuadObject
  ): Quad = (^.asInstanceOf[js.Dynamic].applyDynamic("triple")(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Quad]
  inline def triple[Q_In /* <: typings.rdfjsTypes.dataModelMod.BaseQuad */, Q_Out /* <: BaseQuad */](
    subject: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['subject'] */ js.Any,
    predicate: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['predicate'] */ js.Any,
    `object`: /* import warning: importer.ImportType#apply Failed type conversion: Q_In['object'] */ js.Any
  ): Q_Out = (^.asInstanceOf[js.Dynamic].applyDynamic("triple")(subject.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[Q_Out]
  
  inline def variable(value: String): Variable = ^.asInstanceOf[js.Dynamic].applyDynamic("variable")(value.asInstanceOf[js.Any]).asInstanceOf[Variable]
}
