package typings
package n3Lib.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "Util")
@js.native
object UtilNs extends js.Object {
  def inDefaultGraph(value: rdfDashJsLib.rdfDashJsMod.Quad): scala.Boolean = js.native
  def isBlankNode(): scala.Boolean = js.native
  def isBlankNode(value: rdfDashJsLib.rdfDashJsMod.Term): scala.Boolean = js.native
  def isDefaultGraph(): scala.Boolean = js.native
  def isDefaultGraph(value: rdfDashJsLib.rdfDashJsMod.Term): scala.Boolean = js.native
  def isLiteral(): scala.Boolean = js.native
  def isLiteral(value: rdfDashJsLib.rdfDashJsMod.Term): scala.Boolean = js.native
  def isNamedNode(): scala.Boolean = js.native
  def isNamedNode(value: rdfDashJsLib.rdfDashJsMod.Term): scala.Boolean = js.native
  def isVariable(): scala.Boolean = js.native
  def isVariable(value: rdfDashJsLib.rdfDashJsMod.Term): scala.Boolean = js.native
  def prefix(iri: java.lang.String): n3Lib.n3Mod.PrefixedToIri = js.native
  def prefix(iri: java.lang.String, factory: rdfDashJsLib.rdfDashJsMod.DataFactory): n3Lib.n3Mod.PrefixedToIri = js.native
  def prefix(iri: rdfDashJsLib.rdfDashJsMod.NamedNode): n3Lib.n3Mod.PrefixedToIri = js.native
  def prefix(iri: rdfDashJsLib.rdfDashJsMod.NamedNode, factory: rdfDashJsLib.rdfDashJsMod.DataFactory): n3Lib.n3Mod.PrefixedToIri = js.native
  def prefixes(defaultPrefixes: n3Lib.n3Mod.Prefixes[rdfDashJsLib.rdfDashJsMod.NamedNode | java.lang.String]): js.Function1[/* prefix */ java.lang.String, n3Lib.n3Mod.PrefixedToIri] = js.native
  def prefixes(
    defaultPrefixes: n3Lib.n3Mod.Prefixes[rdfDashJsLib.rdfDashJsMod.NamedNode | java.lang.String],
    factory: rdfDashJsLib.rdfDashJsMod.DataFactory
  ): js.Function1[/* prefix */ java.lang.String, n3Lib.n3Mod.PrefixedToIri] = js.native
}

