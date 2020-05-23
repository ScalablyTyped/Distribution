package typings.orchestrator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MissingTasks extends js.Object {
  var missingTasks: js.Array[String]
  var recursiveDependencies: js.Array[String]
  var sequence: js.Array[String]
}

object MissingTasks {
  @scala.inline
  def apply(
    missingTasks: js.Array[String],
    recursiveDependencies: js.Array[String],
    sequence: js.Array[String]
  ): MissingTasks = {
    val __obj = js.Dynamic.literal(missingTasks = missingTasks.asInstanceOf[js.Any], recursiveDependencies = recursiveDependencies.asInstanceOf[js.Any], sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[MissingTasks]
  }
}

