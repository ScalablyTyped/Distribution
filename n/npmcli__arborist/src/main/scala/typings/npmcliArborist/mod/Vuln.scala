package typings.npmcliArborist.mod

import typings.pacote.mod.Packument_
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vuln extends StObject {
  
  var advisories: Set[Advisory] = js.native
  
  var effects: Set[Vuln] = js.native
  
  def fixAvailable: Boolean = js.native
  
  def isDirect: Boolean = js.native
  
  var name: String = js.native
  
  var nodes: Set[Node] = js.native
  
  var packument: Packument_ = js.native
  
  def range: String = js.native
  
  var severity: String = js.native
  
  def toJSON(): VulnJson = js.native
  
  var topNodes: Set[Node] = js.native
  
  var versions: js.Array[String] = js.native
  
  var via: Set[Advisory] = js.native
}
