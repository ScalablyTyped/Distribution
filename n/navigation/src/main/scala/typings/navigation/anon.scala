package typings.navigation

import org.scalablytyped.runtime.StringDictionary
import typings.navigation.mod.Crumb
import typings.navigation.mod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Crumbs extends StObject {
    
    var crumbs: js.Array[Crumb[String, Any]]
    
    var data: Any
    
    var hash: String
    
    var state: State[String, Any]
  }
  object Crumbs {
    
    inline def apply(crumbs: js.Array[Crumb[String, Any]], data: Any, hash: String, state: State[String, Any]): Crumbs = {
      val __obj = js.Dynamic.literal(crumbs = crumbs.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Crumbs]
    }
    
    extension [Self <: Crumbs](x: Self) {
      
      inline def setCrumbs(value: js.Array[Crumb[String, Any]]): Self = StObject.set(x, "crumbs", value.asInstanceOf[js.Any])
      
      inline def setCrumbsVarargs(value: (Crumb[String, Any])*): Self = StObject.set(x, "crumbs", js.Array(value*))
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setState(value: State[String, Any]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data[StateKey /* <: /* keyof NavigationInfo */ String */, NavigationInfo /* <: StringDictionary[Any] */] extends StObject {
    
    var crumbs: js.Array[Crumb[String, Any]]
    
    var data: /* import warning: importer.ImportType#apply Failed type conversion: NavigationInfo[StateKey] */ js.Any
    
    var hash: String
    
    var state: State[
        StateKey & String, 
        /* import warning: importer.ImportType#apply Failed type conversion: NavigationInfo[StateKey] */ js.Any
      ]
  }
  object Data {
    
    inline def apply[StateKey /* <: /* keyof NavigationInfo */ String */, NavigationInfo /* <: StringDictionary[Any] */](
      crumbs: js.Array[Crumb[String, Any]],
      data: /* import warning: importer.ImportType#apply Failed type conversion: NavigationInfo[StateKey] */ js.Any,
      hash: String,
      state: State[
          StateKey & String, 
          /* import warning: importer.ImportType#apply Failed type conversion: NavigationInfo[StateKey] */ js.Any
        ]
    ): Data[StateKey, NavigationInfo] = {
      val __obj = js.Dynamic.literal(crumbs = crumbs.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data[StateKey, NavigationInfo]]
    }
    
    extension [Self <: Data[?, ?], StateKey /* <: /* keyof NavigationInfo */ String */, NavigationInfo /* <: StringDictionary[Any] */](x: Self & (Data[StateKey, NavigationInfo])) {
      
      inline def setCrumbs(value: js.Array[Crumb[String, Any]]): Self = StObject.set(x, "crumbs", value.asInstanceOf[js.Any])
      
      inline def setCrumbsVarargs(value: (Crumb[String, Any])*): Self = StObject.set(x, "crumbs", js.Array(value*))
      
      inline def setData(
        value: /* import warning: importer.ImportType#apply Failed type conversion: NavigationInfo[StateKey] */ js.Any
      ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setState(
        value: State[
              StateKey & String, 
              /* import warning: importer.ImportType#apply Failed type conversion: NavigationInfo[StateKey] */ js.Any
            ]
      ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
