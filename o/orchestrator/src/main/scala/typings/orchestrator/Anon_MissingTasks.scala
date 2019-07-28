package typings.orchestrator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MissingTasks extends js.Object {
  var missingTasks: js.Array[String]
  var recursiveDependencies: js.Array[String]
  var sequence: js.Array[String]
}

object Anon_MissingTasks {
  @scala.inline
  def apply(
    missingTasks: js.Array[String],
    recursiveDependencies: js.Array[String],
    sequence: js.Array[String]
  ): Anon_MissingTasks = {
    val __obj = js.Dynamic.literal(missingTasks = missingTasks, recursiveDependencies = recursiveDependencies, sequence = sequence)
  
    __obj.asInstanceOf[Anon_MissingTasks]
  }
}

