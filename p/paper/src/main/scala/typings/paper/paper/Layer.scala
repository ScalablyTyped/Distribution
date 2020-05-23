package typings.paper.paper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The Layer item represents a layer in a Paper.js project.
  * 
  * The layer which is currently active can be accessed through
  * {@link Project#activeLayer}.
  * An array of all layers in a project can be accessed through
  * {@link Project#layers}.
  */
@js.native
trait Layer extends Group {
  /** 
    * Activates the layer.
    */
  def activate(): Unit = js.native
}

