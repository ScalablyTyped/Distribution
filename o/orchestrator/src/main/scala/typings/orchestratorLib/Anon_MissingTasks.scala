package typings
package orchestratorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MissingTasks extends js.Object {
  var missingTasks: js.Array[java.lang.String]
  var recursiveDependencies: js.Array[java.lang.String]
  var sequence: js.Array[java.lang.String]
}

object Anon_MissingTasks {
  @scala.inline
  def apply(
    missingTasks: js.Array[java.lang.String],
    recursiveDependencies: js.Array[java.lang.String],
    sequence: js.Array[java.lang.String]
  ): Anon_MissingTasks = {
    val __obj = js.Dynamic.literal(missingTasks = missingTasks, recursiveDependencies = recursiveDependencies, sequence = sequence)
  
    __obj.asInstanceOf[Anon_MissingTasks]
  }
}

