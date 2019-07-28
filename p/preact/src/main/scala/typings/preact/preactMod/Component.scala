package typings.preact.preactMod

import typings.std.HTMLElement
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact", "Component")
@js.native
abstract class Component[P, S] () extends js.Object {
  def this(props: P) = this()
  def this(props: P, context: js.Any) = this()
  var base: js.UndefOr[HTMLElement] = js.native
  var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentDidUpdate: js.UndefOr[
    js.Function3[/* previousProps */ P, /* previousState */ S, /* previousContext */ js.Any, Unit]
  ] = js.native
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ P, /* nextContext */ js.Any, Unit]] = js.native
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ P, /* nextState */ S, /* nextContext */ js.Any, Unit]
  ] = js.native
  var context: js.Any = js.native
  var getChildContext: js.UndefOr[js.Function0[js.Object]] = js.native
  var props: RenderableProps[P, _] = js.native
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[/* nextProps */ P, /* nextState */ S, /* nextContext */ js.Any, Boolean]
  ] = js.native
  var state: S = js.native
  def forceUpdate(): Unit = js.native
  def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
  def render(): ComponentChild = js.native
  def render(props: RenderableProps[P, _]): ComponentChild = js.native
  def render(props: RenderableProps[P, _], state: S): ComponentChild = js.native
  def render(props: RenderableProps[P, _], state: S, context: js.Any): ComponentChild = js.native
  def setState[K /* <: String */](fn: js.Function2[/* prevState */ S, /* props */ P, Pick[S, K]]): Unit = js.native
  def setState[K /* <: String */](fn: js.Function2[/* prevState */ S, /* props */ P, Pick[S, K]], callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: String */](state: Pick[S, K]): Unit = js.native
  def setState[K /* <: String */](state: Pick[S, K], callback: js.Function0[Unit]): Unit = js.native
}

/* static members */
@JSImport("preact", "Component")
@js.native
object Component extends js.Object {
  var defaultProps: js.UndefOr[js.Any] = js.native
  var displayName: js.UndefOr[String] = js.native
}

