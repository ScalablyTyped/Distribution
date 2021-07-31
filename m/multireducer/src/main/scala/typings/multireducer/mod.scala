package typings.multireducer

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("multireducer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(reducers: StringDictionary[js.Any]): js.Function2[/* state */ js.Any, /* action */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(reducers.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* state */ js.Any, /* action */ js.Any, js.Any]]
  @scala.inline
  def default(reducers: StringDictionary[js.Any], reducerKey: String): js.Function2[/* state */ js.Any, /* action */ js.Any, js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(reducers.asInstanceOf[js.Any], reducerKey.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* state */ js.Any, /* action */ js.Any, js.Any]]
  
  @scala.inline
  def bindActionCreators(actions: js.Any, dispatch: js.Any, reducerKey: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bindActionCreators")(actions.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], reducerKey.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def wrapAction(action: js.Any, reducerKey: String): ActionObject = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapAction")(action.asInstanceOf[js.Any], reducerKey.asInstanceOf[js.Any])).asInstanceOf[ActionObject]
  
  @scala.inline
  def wrapDispatch(dispatch: js.Any, reducerKey: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapDispatch")(dispatch.asInstanceOf[js.Any], reducerKey.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  trait ActionObject
    extends StObject
       with /* rest */ StringDictionary[js.Any] {
    
    var meta: MetaObject
  }
  object ActionObject {
    
    @scala.inline
    def apply(meta: MetaObject): ActionObject = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionObject]
    }
    
    @scala.inline
    implicit class ActionObjectMutableBuilder[Self <: ActionObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMeta(value: MetaObject): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  type MetaObject = StringDictionary[String]
}
