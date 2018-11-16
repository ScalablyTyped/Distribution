package typings
package playcanvasLib.pcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * @name pc.Animation
     * @property {String} name Human-readable name of the animation
     * @property {Number} duration Duration of the animation in seconds.
     * @class An animation is a sequence of keyframe arrays which map to the nodes of a skeletal hierarchy.
     * It controls how the nodes of the hierarchy are transformed over time.
     * @returns {pc.Animation} A new pc.Animation object.
     */
@JSGlobal("pc.Animation")
@js.native
class Animation () extends js.Object {
  var duration: scala.Double = js.native
  var name: java.lang.String = js.native
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
           * @author Will Eastcott
           */
  def addNode(node: Node): scala.Unit = js.native
  /**
           * @function
           * @name pc.Animation#getNode
           * @description Gets a {@link pc.Node} by name
           * @param {String} name The name of the pc.Node
           * @returns {pc.Node} The pc.Node with the specified name
           * @author Will Eastcott
           */
  def getNode(name: java.lang.String): Node = js.native
}

