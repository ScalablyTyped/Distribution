package typings.multireducer

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("multireducer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(reducers: StringDictionary[Any]): js.Function2[/* state */ Any, /* action */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(reducers.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* state */ Any, /* action */ Any, Any]]
  inline def default(reducers: StringDictionary[Any], reducerKey: String): js.Function2[/* state */ Any, /* action */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(reducers.asInstanceOf[js.Any], reducerKey.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* state */ Any, /* action */ Any, Any]]
  
  inline def bindActionCreators(actions: Any, dispatch: Any, reducerKey: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bindActionCreators")(actions.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], reducerKey.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def wrapAction(action: Any, reducerKey: String): ActionObject = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapAction")(action.asInstanceOf[js.Any], reducerKey.asInstanceOf[js.Any])).asInstanceOf[ActionObject]
  
  inline def wrapDispatch(dispatch: Any, reducerKey: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapDispatch")(dispatch.asInstanceOf[js.Any], reducerKey.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait ActionObject
    extends StObject
       with /* rest */ StringDictionary[Any] {
    
    var meta: MetaObject
  }
  object ActionObject {
    
    inline def apply(meta: MetaObject): ActionObject = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionObject] (val x: Self) extends AnyVal {
      
      inline def setMeta(value: MetaObject): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  type MetaObject = StringDictionary[String]
}
