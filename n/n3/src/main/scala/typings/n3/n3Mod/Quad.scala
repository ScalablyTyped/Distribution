package typings.n3.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.rdfDashJs.rdfDashJsMod.BaseQuad because Already inherited
- typings.rdfDashJs.rdfDashJsMod.Quad because var conflicts: graph, `object`, predicate, subject. Inlined graph_Quad, object_Quad, predicate_Quad, subject_Quad */ @JSImport("n3", "Quad")
@js.native
class Quad protected () extends BaseQuad {
  def this(subject: Term, predicate: Term, `object`: Term) = this()
  def this(subject: Term, predicate: Term, `object`: Term, graph: Term) = this()
  /**
    * The named graph.
    * @see Quad_Graph
    */
  @JSName("graph")
  var graph_Quad: typings.rdfDashJs.rdfDashJsMod.Quad_Graph = js.native
  /**
    * The object.
    * @see Quad_Object
    */
  @JSName("object")
  var object_Quad: typings.rdfDashJs.rdfDashJsMod.Quad_Object = js.native
  /**
    * The predicate.
    * @see Quad_Predicate
    */
  @JSName("predicate")
  var predicate_Quad: typings.rdfDashJs.rdfDashJsMod.Quad_Predicate = js.native
  /**
    * The subject.
    * @see Quad_Subject
    */
  @JSName("subject")
  var subject_Quad: typings.rdfDashJs.rdfDashJsMod.Quad_Subject = js.native
}

