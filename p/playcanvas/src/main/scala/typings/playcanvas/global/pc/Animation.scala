package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An animation is a sequence of keyframe arrays which map to the nodes of a skeletal hierarchy.
  It controls how the nodes of the hierarchy are transformed over time.
  * @property name - Human-readable name of the animation.
  * @property duration - Duration of the animation in seconds.
  */
@JSGlobal("pc.Animation")
@js.native
class Animation ()
  extends typings.playcanvas.pc.Animation {
  /**
    * Duration of the animation in seconds.
    */
  /* CompleteClass */
  override var duration: Double = js.native
  /**
    * Human-readable name of the animation.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * A read-only property to get array of animation nodes.
    */
  /* CompleteClass */
  override val nodes: js.Array[typings.playcanvas.pc.Node] = js.native
  /**
    * Adds a node to the internal nodes array.
    * @param node - The node to add.
    */
  /* CompleteClass */
  override def addNode(node: typings.playcanvas.pc.Node): Unit = js.native
  /**
    * Gets a {@link pc.Node} by name.
    * @param name - The name of the pc.Node.
    * @returns The pc.Node with the specified name.
    */
  /* CompleteClass */
  override def getNode(name: String): typings.playcanvas.pc.Node = js.native
}

