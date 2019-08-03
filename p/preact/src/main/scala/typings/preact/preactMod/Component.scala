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
  var __b: js.Any = js.native
  var __c: js.Any = js.native
  var __d: js.Any = js.native
  var __h: js.Any = js.native
  var __k: js.Any = js.native
  // Add these variables to avoid descendants shadowing them (some from properties.json for minification)
  var __key: js.Any = js.native
  var __l: js.Any = js.native
  var __n: js.Any = js.native
  var __p: js.Any = js.native
  var __r: js.Any = js.native
  var __ref: js.Any = js.native
  var __s: js.Any = js.native
  var __u: js.Any = js.native
  var __x: js.Any = js.native
  var _component: js.Any = js.native
  var _dirty: js.Any = js.native
  var _disable: js.Any = js.native
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
  var nextBase: js.Any = js.native
  var prevContext: js.Any = js.native
  var prevProps: js.Any = js.native
  var prevState: js.Any = js.native
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
  def setState[K /* <: String */](): Unit = js.native
  def setState[K /* <: String */](state: S): Unit = js.native
  def setState[K /* <: String */](state: S, callback: js.Function0[Unit]): Unit = js.native
  // From https://github.com/DefinitelyTyped/DefinitelyTyped/blob/e836acc75a78cf0655b5dfdbe81d69fdd4d8a252/types/react/index.d.ts#L402
  // // We MUST keep setState() as a unified signature because it allows proper checking of the method return type.
  // // See: https://github.com/DefinitelyTyped/DefinitelyTyped/issues/18365#issuecomment-351013257
  // // Also, the ` | S` allows intellisense to not be dumbisense
  def setState[K /* <: String */](state: js.Function2[/* prevState */ S, /* props */ P, (Pick[S, K]) | S | Null]): Unit = js.native
  def setState[K /* <: String */](
    state: js.Function2[/* prevState */ S, /* props */ P, (Pick[S, K]) | S | Null],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def setState[K /* <: String */](state: Null, callback: js.Function0[Unit]): Unit = js.native
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

