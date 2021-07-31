package typings.orchestrator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dep extends StObject {
    
    var dep: js.Array[String]
  }
  object Dep {
    
    @scala.inline
    def apply(dep: js.Array[String]): Dep = {
      val __obj = js.Dynamic.literal(dep = dep.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dep]
    }
    
    @scala.inline
    implicit class DepMutableBuilder[Self <: Dep] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDep(value: js.Array[String]): Self = StObject.set(x, "dep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepVarargs(value: String*): Self = StObject.set(x, "dep", js.Array(value :_*))
    }
  }
  
  trait MissingTasks extends StObject {
    
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
    
    @scala.inline
    implicit class MissingTasksMutableBuilder[Self <: MissingTasks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMissingTasks(value: js.Array[String]): Self = StObject.set(x, "missingTasks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMissingTasksVarargs(value: String*): Self = StObject.set(x, "missingTasks", js.Array(value :_*))
      
      @scala.inline
      def setRecursiveDependencies(value: js.Array[String]): Self = StObject.set(x, "recursiveDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecursiveDependenciesVarargs(value: String*): Self = StObject.set(x, "recursiveDependencies", js.Array(value :_*))
      
      @scala.inline
      def setSequence(value: js.Array[String]): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSequenceVarargs(value: String*): Self = StObject.set(x, "sequence", js.Array(value :_*))
    }
  }
}
