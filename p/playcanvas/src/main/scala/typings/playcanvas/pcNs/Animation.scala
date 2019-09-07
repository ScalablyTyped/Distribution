package typings.playcanvas.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @constructor
  * @name pc.Animation
  * @classdesc An animation is a sequence of keyframe arrays which map to the nodes of a skeletal hierarchy.
  * It controls how the nodes of the hierarchy are transformed over time.
  * @property {String} name Human-readable name of the animation
  * @property {Number} duration Duration of the animation in seconds.
  */
@JSGlobal("pc.Animation")
@js.native
class Animation () extends js.Object {
  /**
    * Duration of the animation in seconds.
    */
  var duration: Double = js.native
  /**
    * Human-readable name of the animation
    */
  var name: String = js.native
  /**
    * @readonly
    * @name pc.Animation#nodes
    * @type pc.Node[]
    * @description A read-only property to get array of animation nodes
    */
  val nodes: js.Array[Node] = js.native
  /**
    * @function
    * @name pc.Animation#addNode
    * @description Adds a node to the internal nodes array.
    * @param {pc.Node} node The node to add.
    */
  def addNode(node: Node): Unit = js.native
  /**
    * @function
    * @name pc.Animation#getNode
    * @description Gets a {@link pc.Node} by name
    * @param {String} name The name of the pc.Node
    * @returns {pc.Node} The pc.Node with the specified name
    */
  def getNode(name: String): Node = js.native
}

