package typings.n3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.rdfjsTypes.dataModelMod._Term because Already inherited
- typings.rdfjsTypes.dataModelMod.BaseQuad because Already inherited
- typings.rdfjsTypes.dataModelMod.Quad because var conflicts: graph, `object`, predicate, subject, termType, value. Inlined subject_Quad, predicate_Quad, object_Quad, graph_Quad */ @JSImport("n3", "Quad")
@js.native
open class Quad protected ()
  extends BaseQuad
     with typings.rdfjsTypes.dataModelMod._QuadObject
     with typings.rdfjsTypes.dataModelMod._QuadSubject {
  def this(subject: Term, predicate: Term, `object`: Term) = this()
  def this(subject: Term, predicate: Term, `object`: Term, graph: Term) = this()
  
  /**
    * The named graph.
    * @see Quad_Graph
    */
  @JSName("graph")
  var graph_Quad: typings.rdfjsTypes.dataModelMod.QuadGraph = js.native
  
  /**
    * The object.
    * @see Quad_Object
    */
  @JSName("object")
  var object_Quad: typings.rdfjsTypes.dataModelMod.QuadObject = js.native
  
  /**
    * The predicate.
    * @see Quad_Predicate
    */
  @JSName("predicate")
  var predicate_Quad: typings.rdfjsTypes.dataModelMod.QuadPredicate = js.native
  
  /**
    * The subject.
    * @see Quad_Subject
    */
  @JSName("subject")
  var subject_Quad: typings.rdfjsTypes.dataModelMod.QuadSubject = js.native
}
