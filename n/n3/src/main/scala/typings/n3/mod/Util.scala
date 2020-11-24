package typings.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("n3", "Util")
@js.native
object Util extends js.Object {
  
  def inDefaultGraph(value: typings.rdfJs.mod.Quad): Boolean = js.native
  
  def isBlankNode(): Boolean = js.native
  def isBlankNode(value: typings.rdfJs.mod.Term): Boolean = js.native
  
  def isDefaultGraph(): Boolean = js.native
  def isDefaultGraph(value: typings.rdfJs.mod.Term): Boolean = js.native
  
  def isLiteral(): Boolean = js.native
  def isLiteral(value: typings.rdfJs.mod.Term): Boolean = js.native
  
  def isNamedNode(): Boolean = js.native
  def isNamedNode(value: typings.rdfJs.mod.Term): Boolean = js.native
  
  def isVariable(): Boolean = js.native
  def isVariable(value: typings.rdfJs.mod.Term): Boolean = js.native
  
  def prefix(iri: String): PrefixedToIri = js.native
  def prefix(
    iri: String,
    factory: typings.rdfJs.mod.DataFactory[typings.rdfJs.mod.Quad, typings.rdfJs.mod.Quad]
  ): PrefixedToIri = js.native
  def prefix(iri: typings.rdfJs.mod.NamedNode[String]): PrefixedToIri = js.native
  def prefix(
    iri: typings.rdfJs.mod.NamedNode[String],
    factory: typings.rdfJs.mod.DataFactory[typings.rdfJs.mod.Quad, typings.rdfJs.mod.Quad]
  ): PrefixedToIri = js.native
  
  def prefixes(defaultPrefixes: Prefixes[typings.rdfJs.mod.NamedNode[String] | String]): js.Function1[/* prefix */ String, PrefixedToIri] = js.native
  def prefixes(
    defaultPrefixes: Prefixes[typings.rdfJs.mod.NamedNode[String] | String],
    factory: typings.rdfJs.mod.DataFactory[typings.rdfJs.mod.Quad, typings.rdfJs.mod.Quad]
  ): js.Function1[/* prefix */ String, PrefixedToIri] = js.native
}
