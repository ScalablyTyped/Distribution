package typings.orchestrator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MissingTasks extends js.Object {
  
  var missingTasks: js.Array[String] = js.native
  
  var recursiveDependencies: js.Array[String] = js.native
  
  var sequence: js.Array[String] = js.native
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
  
  @scala.inline
  implicit class MissingTasksOps[Self <: MissingTasks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMissingTasksVarargs(value: String*): Self = this.set("missingTasks", js.Array(value :_*))
    
    @scala.inline
    def setMissingTasks(value: js.Array[String]): Self = this.set("missingTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecursiveDependenciesVarargs(value: String*): Self = this.set("recursiveDependencies", js.Array(value :_*))
    
    @scala.inline
    def setRecursiveDependencies(value: js.Array[String]): Self = this.set("recursiveDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSequenceVarargs(value: String*): Self = this.set("sequence", js.Array(value :_*))
    
    @scala.inline
    def setSequence(value: js.Array[String]): Self = this.set("sequence", value.asInstanceOf[js.Any])
  }
}
