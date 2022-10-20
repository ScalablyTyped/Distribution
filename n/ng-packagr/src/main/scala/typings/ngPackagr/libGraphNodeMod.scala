package typings.ngPackagr

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGraphNodeMod {
  
  @JSImport("ng-packagr/lib/graph/node", "Node")
  @js.native
  open class Node protected () extends StObject {
    def this(url: String) = this()
    
    /* private */ var _dependees: Any = js.native
    
    /* private */ var _dependents: Any = js.native
    
    var data: Any = js.native
    
    def dependees: Set[Node] = js.native
    
    def dependents: Set[Node] = js.native
    
    def dependsOn(dependent: js.Array[Node]): Unit = js.native
    def dependsOn(dependent: Node): Unit = js.native
    
    def filter(by: js.Function2[/* value */ this.type, /* index */ Double, Boolean]): js.Array[Node] = js.native
    
    def find(by: js.Function2[/* value */ this.type, /* index */ Double, Boolean]): js.UndefOr[Node] = js.native
    
    def some(by: js.Function2[/* value */ this.type, /* index */ Double, Boolean]): Boolean = js.native
    
    var state: NodeState = js.native
    
    var `type`: String = js.native
    
    val url: String = js.native
  }
  
  @JSImport("ng-packagr/lib/graph/node", "STATE_DIRTY")
  @js.native
  val STATE_DIRTY: NodeState = js.native
  
  @JSImport("ng-packagr/lib/graph/node", "STATE_DONE")
  @js.native
  val STATE_DONE: NodeState = js.native
  
  @JSImport("ng-packagr/lib/graph/node", "STATE_IN_PROGRESS")
  @js.native
  val STATE_IN_PROGRESS: NodeState = js.native
  
  @JSImport("ng-packagr/lib/graph/node", "STATE_PENDING")
  @js.native
  val STATE_PENDING: NodeState = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.ngPackagr.ngPackagrStrings._empty
    - typings.ngPackagr.ngPackagrStrings.dirty
    - typings.ngPackagr.ngPackagrStrings.`in-progress`
    - typings.ngPackagr.ngPackagrStrings.pending
    - typings.ngPackagr.ngPackagrStrings.done
  */
  trait NodeState extends StObject
  object NodeState {
    
    inline def _empty: typings.ngPackagr.ngPackagrStrings._empty = "".asInstanceOf[typings.ngPackagr.ngPackagrStrings._empty]
    
    inline def dirty: typings.ngPackagr.ngPackagrStrings.dirty = "dirty".asInstanceOf[typings.ngPackagr.ngPackagrStrings.dirty]
    
    inline def done: typings.ngPackagr.ngPackagrStrings.done = "done".asInstanceOf[typings.ngPackagr.ngPackagrStrings.done]
    
    inline def `in-progress`: typings.ngPackagr.ngPackagrStrings.`in-progress` = "in-progress".asInstanceOf[typings.ngPackagr.ngPackagrStrings.`in-progress`]
    
    inline def pending: typings.ngPackagr.ngPackagrStrings.pending = "pending".asInstanceOf[typings.ngPackagr.ngPackagrStrings.pending]
  }
}
