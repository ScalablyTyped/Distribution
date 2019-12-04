package typings.n3.n3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("n3", "BaseQuad")
@js.native
class BaseQuad protected ()
  extends typings.rdfDashJs.rdfDashJsMod.BaseQuad {
  def this(subject: Term, predicate: Term, `object`: Term) = this()
  def this(subject: Term, predicate: Term, `object`: Term, graph: Term) = this()
  /**
    * The named graph.
    * @see Quad_Graph
    */
  /* CompleteClass */
  override var graph: typings.rdfDashJs.rdfDashJsMod.Term = js.native
  /**
    * The object.
    * @see Quad_Object
    */
  /* CompleteClass */
  override var `object`: typings.rdfDashJs.rdfDashJsMod.Term = js.native
  /**
    * The predicate.
    * @see Quad_Predicate
    */
  /* CompleteClass */
  override var predicate: typings.rdfDashJs.rdfDashJsMod.Term = js.native
  /**
    * The subject.
    * @see Quad_Subject
    */
  /* CompleteClass */
  override var subject: typings.rdfDashJs.rdfDashJsMod.Term = js.native
  /**
    * @param other The term to compare with.
    * @return True if and only if the argument is a) of the same type b) has all components equal.
    */
  /* CompleteClass */
  override def equals(other: typings.rdfDashJs.rdfDashJsMod.BaseQuad): Boolean = js.native
  def toJSON(): String = js.native
}

