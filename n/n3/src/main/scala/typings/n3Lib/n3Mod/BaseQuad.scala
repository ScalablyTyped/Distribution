package typings
package n3Lib.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "BaseQuad")
@js.native
class BaseQuad protected ()
  extends rdfDashJsLib.rdfDashJsMod.BaseQuad {
  def this(subject: Term, predicate: Term, `object`: Term) = this()
  def this(subject: Term, predicate: Term, `object`: Term, graph: Term) = this()
  /**
    * The named graph.
    * @see Quad_Graph
    */
  /* CompleteClass */
  override var graph: rdfDashJsLib.rdfDashJsMod.Term = js.native
  @JSName("graph")
  var graph_BaseQuad: Term = js.native
  /**
    * The object.
    * @see Quad_Object
    */
  /* CompleteClass */
  override var `object`: rdfDashJsLib.rdfDashJsMod.Term = js.native
  @JSName("object")
  var object_BaseQuad: Term = js.native
  /**
    * The predicate.
    * @see Quad_Predicate
    */
  /* CompleteClass */
  override var predicate: rdfDashJsLib.rdfDashJsMod.Term = js.native
  @JSName("predicate")
  var predicate_BaseQuad: Term = js.native
  /**
    * The subject.
    * @see Quad_Subject
    */
  /* CompleteClass */
  override var subject: rdfDashJsLib.rdfDashJsMod.Term = js.native
  @JSName("subject")
  var subject_BaseQuad: Term = js.native
  /**
    * @param other The term to compare with.
    * @return True if and only if the argument is a) of the same type b) has all components equal.
    */
  /* CompleteClass */
  override def equals(other: rdfDashJsLib.rdfDashJsMod.BaseQuad): scala.Boolean = js.native
  def toJSON(): java.lang.String = js.native
}

