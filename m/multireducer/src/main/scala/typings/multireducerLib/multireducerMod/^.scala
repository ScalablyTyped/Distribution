package typings
package multireducerLib.multireducerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("multireducer", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def bindActionCreators(actions: js.Any, dispatch: js.Any, reducerKey: java.lang.String): js.Any = js.native
  def default(reducers: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Function2[/* state */ js.Any, /* action */ js.Any, _] = js.native
  def default(reducers: org.scalablytyped.runtime.StringDictionary[js.Any], reducerKey: java.lang.String): js.Function2[/* state */ js.Any, /* action */ js.Any, _] = js.native
  def wrapAction(action: js.Any, reducerKey: java.lang.String): ActionObject = js.native
  def wrapDispatch(dispatch: js.Any, reducerKey: java.lang.String): js.Any = js.native
}

