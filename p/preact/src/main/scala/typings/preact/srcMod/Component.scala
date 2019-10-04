package typings.preact.srcMod

import typings.std.Element
import typings.std.Partial
import typings.std.Pick
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact/src", "Component")
@js.native
abstract class Component[P, S] () extends AnyComponent[P, S] {
  def this(props: P) = this()
  def this(props: P, context: js.Any) = this()
  var base: js.UndefOr[Element | Text] = js.native
  var componentDidCatch: js.UndefOr[js.Function2[/* error */ js.Any, /* errorInfo */ js.Any, Unit]] = js.native
  var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentDidUpdate: js.UndefOr[
    js.Function3[/* previousProps */ P, /* previousState */ S, /* snapshot */ js.Any, Unit]
  ] = js.native
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ P, /* nextContext */ js.Any, Unit]] = js.native
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  var componentWillUpdate: js.UndefOr[
    js.Function3[/* nextProps */ P, /* nextState */ S, /* nextContext */ js.Any, Unit]
  ] = js.native
  var context: js.Any = js.native
  var getChildContext: js.UndefOr[js.Function0[js.Object]] = js.native
  var getSnapshotBeforeUpdate: js.UndefOr[js.Function2[/* oldProps */ P, /* oldState */ S, _]] = js.native
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
  // From https://github.com/DefinitelyTyped/DefinitelyTyped/blob/e836acc75a78cf0655b5dfdbe81d69fdd4d8a252/types/react/index.d.ts#L402
  // // We MUST keep setState() as a unified signature because it allows proper checking of the method return type.
  // // See: https://github.com/DefinitelyTyped/DefinitelyTyped/issues/18365#issuecomment-351013257
  def setState[K /* <: String */](state: js.Function2[/* prevState */ S, /* props */ P, (Pick[S, K]) | Partial[S] | Null]): Unit = js.native
  def setState[K /* <: String */](
    state: js.Function2[/* prevState */ S, /* props */ P, (Pick[S, K]) | Partial[S] | Null],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def setState[K /* <: String */](state: Null, callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: String */](state: Partial[S]): Unit = js.native
  def setState[K /* <: String */](state: Partial[S], callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: String */](state: Pick[S, K]): Unit = js.native
  def setState[K /* <: String */](state: Pick[S, K], callback: js.Function0[Unit]): Unit = js.native
}

/* static members */
@JSImport("preact/src", "Component")
@js.native
object Component extends js.Object {
  var contextType: js.UndefOr[Context[_]] = js.native
  var defaultProps: js.UndefOr[js.Any] = js.native
  var displayName: js.UndefOr[String] = js.native
  var getDerivedStateFromError: js.UndefOr[js.Function1[/* error */ js.Any, js.Object | Null]] = js.native
  // Static members cannot reference class type parameters. This is not
  // supported in TypeScript. Reusing the same type arguments from `Component`
  // will lead to an impossible state where one cannot satisfy the type
  // constraint under no circumstances, see #1356.In general type arguments
  // seem to be a bit buggy and not supported well at the time of this
  // writing with TS 3.3.3333.
  var getDerivedStateFromProps: js.UndefOr[js.Function2[/* props */ js.Object, /* state */ js.Object, js.Object | Null]] = js.native
}

