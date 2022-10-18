package typings.mobx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distApiExtrasMod {
  
  @JSImport("mobx/dist/api/extras", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getDependencyTree(thing: Any): IDependencyTree = ^.asInstanceOf[js.Dynamic].applyDynamic("getDependencyTree")(thing.asInstanceOf[js.Any]).asInstanceOf[IDependencyTree]
  inline def getDependencyTree(thing: Any, property: String): IDependencyTree = (^.asInstanceOf[js.Dynamic].applyDynamic("getDependencyTree")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[IDependencyTree]
  
  inline def getObserverTree(thing: Any): IObserverTree = ^.asInstanceOf[js.Dynamic].applyDynamic("getObserverTree")(thing.asInstanceOf[js.Any]).asInstanceOf[IObserverTree]
  inline def getObserverTree(thing: Any, property: String): IObserverTree = (^.asInstanceOf[js.Dynamic].applyDynamic("getObserverTree")(thing.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[IObserverTree]
  
  trait IDependencyTree extends StObject {
    
    var dependencies: js.UndefOr[js.Array[IDependencyTree]] = js.undefined
    
    var name: String
  }
  object IDependencyTree {
    
    inline def apply(name: String): IDependencyTree = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDependencyTree]
    }
    
    extension [Self <: IDependencyTree](x: Self) {
      
      inline def setDependencies(value: js.Array[IDependencyTree]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDependenciesVarargs(value: IDependencyTree*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait IObserverTree extends StObject {
    
    var name: String
    
    var observers: js.UndefOr[js.Array[IObserverTree]] = js.undefined
  }
  object IObserverTree {
    
    inline def apply(name: String): IObserverTree = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IObserverTree]
    }
    
    extension [Self <: IObserverTree](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setObservers(value: js.Array[IObserverTree]): Self = StObject.set(x, "observers", value.asInstanceOf[js.Any])
      
      inline def setObserversUndefined: Self = StObject.set(x, "observers", js.undefined)
      
      inline def setObserversVarargs(value: IObserverTree*): Self = StObject.set(x, "observers", js.Array(value*))
    }
  }
}
