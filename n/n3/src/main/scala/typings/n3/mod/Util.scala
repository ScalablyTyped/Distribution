package typings.n3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Util {
  
  @JSImport("n3", "Util")
  @js.native
  val ^ : js.Any = js.native
  
  inline def inDefaultGraph(value: typings.rdfjsTypes.dataModelMod.Quad): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inDefaultGraph")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isBlankNode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlankNode")().asInstanceOf[Boolean]
  inline def isBlankNode(value: typings.rdfjsTypes.dataModelMod.Term): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBlankNode")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isDefaultGraph(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefaultGraph")().asInstanceOf[Boolean]
  inline def isDefaultGraph(value: typings.rdfjsTypes.dataModelMod.Term): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDefaultGraph")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isLiteral(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLiteral")().asInstanceOf[Boolean]
  inline def isLiteral(value: typings.rdfjsTypes.dataModelMod.Term): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLiteral")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isNamedNode(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedNode")().asInstanceOf[Boolean]
  inline def isNamedNode(value: typings.rdfjsTypes.dataModelMod.Term): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNamedNode")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isVariable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariable")().asInstanceOf[Boolean]
  inline def isVariable(value: typings.rdfjsTypes.dataModelMod.Term): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVariable")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def prefix(iri: String): PrefixedToIri = ^.asInstanceOf[js.Dynamic].applyDynamic("prefix")(iri.asInstanceOf[js.Any]).asInstanceOf[PrefixedToIri]
  inline def prefix(
    iri: String,
    factory: typings.rdfjsTypes.dataModelMod.DataFactory[typings.rdfjsTypes.dataModelMod.Quad, typings.rdfjsTypes.dataModelMod.Quad]
  ): PrefixedToIri = (^.asInstanceOf[js.Dynamic].applyDynamic("prefix")(iri.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[PrefixedToIri]
  inline def prefix(iri: typings.rdfjsTypes.dataModelMod.NamedNode[String]): PrefixedToIri = ^.asInstanceOf[js.Dynamic].applyDynamic("prefix")(iri.asInstanceOf[js.Any]).asInstanceOf[PrefixedToIri]
  inline def prefix(
    iri: typings.rdfjsTypes.dataModelMod.NamedNode[String],
    factory: typings.rdfjsTypes.dataModelMod.DataFactory[typings.rdfjsTypes.dataModelMod.Quad, typings.rdfjsTypes.dataModelMod.Quad]
  ): PrefixedToIri = (^.asInstanceOf[js.Dynamic].applyDynamic("prefix")(iri.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[PrefixedToIri]
  
  inline def prefixes(defaultPrefixes: Prefixes[typings.rdfjsTypes.dataModelMod.NamedNode[String] | String]): js.Function1[/* prefix */ String, PrefixedToIri] = ^.asInstanceOf[js.Dynamic].applyDynamic("prefixes")(defaultPrefixes.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* prefix */ String, PrefixedToIri]]
  inline def prefixes(
    defaultPrefixes: Prefixes[typings.rdfjsTypes.dataModelMod.NamedNode[String] | String],
    factory: typings.rdfjsTypes.dataModelMod.DataFactory[typings.rdfjsTypes.dataModelMod.Quad, typings.rdfjsTypes.dataModelMod.Quad]
  ): js.Function1[/* prefix */ String, PrefixedToIri] = (^.asInstanceOf[js.Dynamic].applyDynamic("prefixes")(defaultPrefixes.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* prefix */ String, PrefixedToIri]]
}
