package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An animation is a sequence of keyframe arrays which map to the nodes of a skeletal hierarchy.
  It controls how the nodes of the hierarchy are transformed over time.
  * @property name - Human-readable name of the animation.
  * @property duration - Duration of the animation in seconds.
  */
trait Animation extends js.Object {
  /**
    * Duration of the animation in seconds.
    */
  var duration: Double
  /**
    * Human-readable name of the animation.
    */
  var name: String
  /**
    * A read-only property to get array of animation nodes.
    */
  val nodes: js.Array[Node]
  /**
    * Adds a node to the internal nodes array.
    * @param node - The node to add.
    */
  def addNode(node: Node): Unit
  /**
    * Gets a {@link pc.Node} by name.
    * @param name - The name of the pc.Node.
    * @returns The pc.Node with the specified name.
    */
  def getNode(name: String): Node
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
}

