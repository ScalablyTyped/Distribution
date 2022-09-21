package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An animation is a sequence of keyframe arrays which map to the nodes of a skeletal hierarchy. It
  * controls how the nodes of the hierarchy are transformed over time.
  */
@JSImport("playcanvas", "Animation")
@js.native
open class Animation () extends StObject {
  
  var _nodes: js.Array[Any] = js.native
  
  /**
    * Adds a node to the internal nodes array.
    *
    * @param {Node} node - The node to add.
    */
  def addNode(node: Node1): Unit = js.native
  
  /**
    * Duration of the animation in seconds.
    *
    * @type {number}
    */
  var duration: Double = js.native
  
  /**
    * Gets a {@link Node} by name.
    *
    * @param {string} name - The name of the {@link Node}.
    * @returns {Node} The {@link Node} with the specified name.
    */
  def getNode(name: String): Node1 = js.native
  
  /**
    * Human-readable name of the animation.
    *
    * @type {string}
    */
  var name: String = js.native
  
  /**
    * A read-only property to get array of animation nodes.
    *
    * @type {Node[]}
    */
  def nodes: js.Array[Node1] = js.native
}
