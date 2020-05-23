package typings.n3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.rdfJs.mod.BaseQuad because Already inherited
- typings.rdfJs.mod.Quad because var conflicts: graph, `object`, predicate, subject. Inlined graph_Quad, object_Quad, predicate_Quad, subject_Quad */ @JSImport("n3", "Quad")
@js.native
class Quad protected () extends BaseQuad {
  def this(subject: Term, predicate: Term, `object`: Term) = this()
  def this(subject: Term, predicate: Term, `object`: Term, graph: Term) = this()
  /**
    * The named graph.
    * @see Quad_Graph
    */
  @JSName("graph")
  var graph_Quad: typings.rdfJs.mod.QuadGraph = js.native
  /**
    * The object.
    * @see Quad_Object
    */
  @JSName("object")
  var object_Quad: typings.rdfJs.mod.QuadObject = js.native
  /**
    * The predicate.
    * @see Quad_Predicate
    */
  @JSName("predicate")
  var predicate_Quad: typings.rdfJs.mod.QuadPredicate = js.native
  /**
    * The subject.
    * @see Quad_Subject
    */
  @JSName("subject")
  var subject_Quad: typings.rdfJs.mod.QuadSubject = js.native
}

