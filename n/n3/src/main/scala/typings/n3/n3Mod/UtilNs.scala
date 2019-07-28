package typings.n3.n3Mod

import typings.rdfDashJs.rdfDashJsMod.DataFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "Util")
@js.native
object UtilNs extends js.Object {
  def inDefaultGraph(value: typings.rdfDashJs.rdfDashJsMod.Quad): Boolean = js.native
  def isBlankNode(): Boolean = js.native
  def isBlankNode(value: typings.rdfDashJs.rdfDashJsMod.Term): Boolean = js.native
  def isDefaultGraph(): Boolean = js.native
  def isDefaultGraph(value: typings.rdfDashJs.rdfDashJsMod.Term): Boolean = js.native
  def isLiteral(): Boolean = js.native
  def isLiteral(value: typings.rdfDashJs.rdfDashJsMod.Term): Boolean = js.native
  def isNamedNode(): Boolean = js.native
  def isNamedNode(value: typings.rdfDashJs.rdfDashJsMod.Term): Boolean = js.native
  def isVariable(): Boolean = js.native
  def isVariable(value: typings.rdfDashJs.rdfDashJsMod.Term): Boolean = js.native
  def prefix(iri: String): PrefixedToIri = js.native
  def prefix(iri: String, factory: DataFactory): PrefixedToIri = js.native
  def prefix(iri: typings.rdfDashJs.rdfDashJsMod.NamedNode): PrefixedToIri = js.native
  def prefix(iri: typings.rdfDashJs.rdfDashJsMod.NamedNode, factory: DataFactory): PrefixedToIri = js.native
  def prefixes(defaultPrefixes: Prefixes[typings.rdfDashJs.rdfDashJsMod.NamedNode | String]): js.Function1[/* prefix */ String, PrefixedToIri] = js.native
  def prefixes(defaultPrefixes: Prefixes[typings.rdfDashJs.rdfDashJsMod.NamedNode | String], factory: DataFactory): js.Function1[/* prefix */ String, PrefixedToIri] = js.native
}

