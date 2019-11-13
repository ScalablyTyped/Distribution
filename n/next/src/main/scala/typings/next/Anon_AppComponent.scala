package typings.next

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentType
import typings.react.reactMod.FunctionComponent
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AppComponent extends js.Object {
  var App: ComponentType[js.Object] = js.native
  var Component: ComponentType[js.Object] = js.native
  var err: js.UndefOr[Error] = js.native
  var initialProps: js.Any = js.native
  var pageLoader: js.Any = js.native
  def subscription(data: Anon_Component): Unit = js.native
  def subscription(data: Anon_Component, App: ComponentClass[js.Object, _]): Unit = js.native
  def subscription(data: Anon_Component, App: FunctionComponent[js.Object]): Unit = js.native
  def wrapApp(App: ComponentType[js.Object]): js.Any = js.native
}

