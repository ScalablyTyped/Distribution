package typings.orchestrator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMissingTasks extends js.Object {
  var missingTasks: js.Array[String]
  var recursiveDependencies: js.Array[String]
  var sequence: js.Array[String]
}

object AnonMissingTasks {
  @scala.inline
  def apply(
    missingTasks: js.Array[String],
    recursiveDependencies: js.Array[String],
    sequence: js.Array[String]
  ): AnonMissingTasks = {
    val __obj = js.Dynamic.literal(missingTasks = missingTasks.asInstanceOf[js.Any], recursiveDependencies = recursiveDependencies.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMissingTasks]
  }
}

