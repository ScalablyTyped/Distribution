package typings.multireducer

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("multireducer", JSImport.Default)
  @js.native
  def default(reducers: StringDictionary[js.Any]): js.Function2[/* state */ js.Any, /* action */ js.Any, _] = js.native
  @JSImport("multireducer", JSImport.Default)
  @js.native
  def default(reducers: StringDictionary[js.Any], reducerKey: String): js.Function2[/* state */ js.Any, /* action */ js.Any, _] = js.native
  
  @JSImport("multireducer", "bindActionCreators")
  @js.native
  def bindActionCreators(actions: js.Any, dispatch: js.Any, reducerKey: String): js.Any = js.native
  
  @JSImport("multireducer", "wrapAction")
  @js.native
  def wrapAction(action: js.Any, reducerKey: String): ActionObject = js.native
  
  @JSImport("multireducer", "wrapDispatch")
  @js.native
  def wrapDispatch(dispatch: js.Any, reducerKey: String): js.Any = js.native
  
  @js.native
  trait ActionObject
    extends /* rest */ StringDictionary[js.Any] {
    
    var meta: MetaObject = js.native
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
