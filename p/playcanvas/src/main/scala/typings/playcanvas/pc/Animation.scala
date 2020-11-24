package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An animation is a sequence of keyframe arrays which map to the nodes of a skeletal hierarchy.
  It controls how the nodes of the hierarchy are transformed over time.
  * @property name - Human-readable name of the animation.
  * @property duration - Duration of the animation in seconds.
  */
@js.native
trait Animation extends js.Object {
  
  /**
    * Adds a node to the internal nodes array.
    * @param node - The node to add.
    */
  def addNode(node: Node): Unit = js.native
  
  /**
    * Duration of the animation in seconds.
    */
  var duration: Double = js.native
  
  /**
    * Gets a {@link pc.Node} by name.
    * @param name - The name of the pc.Node.
    * @returns The pc.Node with the specified name.
    */
  def getNode(name: String): Node = js.native
  
  /**
    * Human-readable name of the animation.
    */
  var name: String = js.native
  
  /**
    * A read-only property to get array of animation nodes.
    */
  val nodes: js.Array[Node] = js.native
}
object Animation {
  
  @scala.inline
  def apply(
    addNode: Node => Unit,
    duration: Double,
    getNode: String => Node,
    name: String,
    nodes: js.Array[Node]
  ): Animation = {
    val __obj = js.Dynamic.literal(addNode = js.Any.fromFunction1(addNode), duration = duration.asInstanceOf[js.Any], getNode = js.Any.fromFunction1(getNode), name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animation]
  }
  
  @scala.inline
  implicit class AnimationOps[Self <: Animation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddNode(value: Node => Unit): Self = this.set("addNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetNode(value: String => Node): Self = this.set("getNode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesVarargs(value: Node*): Self = this.set("nodes", js.Array(value :_*))
    
    @scala.inline
    def setNodes(value: js.Array[Node]): Self = this.set("nodes", value.asInstanceOf[js.Any])
  }
}
