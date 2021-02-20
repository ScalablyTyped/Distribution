package typings.mobx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extrasMod {
  
  @JSImport("mobx/lib/api/extras", "getDependencyTree")
  @js.native
  def getDependencyTree(thing: js.Any): IDependencyTree = js.native
  @JSImport("mobx/lib/api/extras", "getDependencyTree")
  @js.native
  def getDependencyTree(thing: js.Any, property: String): IDependencyTree = js.native
  
  @JSImport("mobx/lib/api/extras", "getObserverTree")
  @js.native
  def getObserverTree(thing: js.Any): IObserverTree = js.native
  @JSImport("mobx/lib/api/extras", "getObserverTree")
  @js.native
  def getObserverTree(thing: js.Any, property: String): IObserverTree = js.native
  
  @js.native
  trait IDependencyTree extends StObject {
    
    var dependencies: js.UndefOr[js.Array[IDependencyTree]] = js.native
    
    var name: String = js.native
  }
  object IDependencyTree {
    
    @scala.inline
    def apply(name: String): IDependencyTree = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDependencyTree]
    }
    
    @scala.inline
    implicit class IDependencyTreeMutableBuilder[Self <: IDependencyTree] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDependencies(value: js.Array[IDependencyTree]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDependenciesVarargs(value: IDependencyTree*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IObserverTree extends StObject {
    
    var name: String = js.native
    
    var observers: js.UndefOr[js.Array[IObserverTree]] = js.native
  }
  object IObserverTree {
    
    @scala.inline
    def apply(name: String): IObserverTree = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IObserverTree]
    }
    
    @scala.inline
    implicit class IObserverTreeMutableBuilder[Self <: IObserverTree] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObservers(value: js.Array[IObserverTree]): Self = StObject.set(x, "observers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObserversUndefined: Self = StObject.set(x, "observers", js.undefined)
      
      @scala.inline
      def setObserversVarargs(value: IObserverTree*): Self = StObject.set(x, "observers", js.Array(value :_*))
    }
  }
}
