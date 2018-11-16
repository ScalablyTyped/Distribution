package typings
package n3Lib.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(rdfDashJsLib.rdfDashJsMod.Quad because Would inherit conflicting mutable fields List(graph, `object`, predicate, subject))*/
@JSImport("n3", "Quad")
@js.native
class Quad protected () extends BaseQuad {
  def this(subject: Term, predicate: Term, `object`: Term) = this()
  def this(subject: Term, predicate: Term, `object`: Term, graph: Term) = this()
  @JSName("graph")
  var graph_Quad: Quad_Graph = js.native
  @JSName("object")
  var object_Quad: Quad_Object = js.native
  @JSName("predicate")
  var predicate_Quad: Quad_Predicate = js.native
  @JSName("subject")
  var subject_Quad: Quad_Subject = js.native
}

