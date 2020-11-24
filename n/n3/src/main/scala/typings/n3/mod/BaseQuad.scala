package typings.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("n3", "BaseQuad")
@js.native
class BaseQuad protected ()
  extends typings.rdfJs.mod.BaseQuad {
  def this(subject: Term, predicate: Term, `object`: Term) = this()
  def this(subject: Term, predicate: Term, `object`: Term, graph: Term) = this()
  
  def equals(other: typings.rdfJs.mod.BaseQuad): Boolean = js.native
  
  def toJSON(): String = js.native
}
