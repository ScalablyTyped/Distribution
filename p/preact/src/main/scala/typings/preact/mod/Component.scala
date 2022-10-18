package typings.preact.mod

import typings.std.Element
import typings.std.Partial
import typings.std.Pick
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("preact", "Component")
@js.native
open class Component[P, S] ()
  extends StObject
     with AnyComponent[P, S] {
  def this(props: P) = this()
  def this(props: P, context: Any) = this()
  def this(props: Unit, context: Any) = this()
  
  var base: js.UndefOr[Element | Text] = js.native
  
  var componentDidCatch: js.UndefOr[js.Function2[/* error */ Any, /* errorInfo */ ErrorInfo, Unit]] = js.native
  
  var componentDidMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentDidUpdate: js.UndefOr[
    js.Function3[/* previousProps */ P, /* previousState */ S, /* snapshot */ Any, Unit]
  ] = js.native
  
  var componentWillMount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillReceiveProps: js.UndefOr[js.Function2[/* nextProps */ P, /* nextContext */ Any, Unit]] = js.native
  
  var componentWillUnmount: js.UndefOr[js.Function0[Unit]] = js.native
  
  var componentWillUpdate: js.UndefOr[js.Function3[/* nextProps */ P, /* nextState */ S, /* nextContext */ Any, Unit]] = js.native
  
  var context: Any = js.native
  
  def forceUpdate(): Unit = js.native
  def forceUpdate(callback: js.Function0[Unit]): Unit = js.native
  
  var getChildContext: js.UndefOr[js.Function0[js.Object]] = js.native
  
  var getSnapshotBeforeUpdate: js.UndefOr[js.Function2[/* oldProps */ P, /* oldState */ S, Any]] = js.native
  
  var props: RenderableProps[P, Any] = js.native
  
  def render(): ComponentChild = js.native
  def render(props: Unit, state: S): ComponentChild = js.native
  def render(props: Unit, state: S, context: Any): ComponentChild = js.native
  def render(props: Unit, state: Unit, context: Any): ComponentChild = js.native
  def render(props: RenderableProps[P, Any]): ComponentChild = js.native
  def render(props: RenderableProps[P, Any], state: S): ComponentChild = js.native
  def render(props: RenderableProps[P, Any], state: S, context: Any): ComponentChild = js.native
  def render(props: RenderableProps[P, Any], state: Unit, context: Any): ComponentChild = js.native
  
  // From https://github.com/DefinitelyTyped/DefinitelyTyped/blob/e836acc75a78cf0655b5dfdbe81d69fdd4d8a252/types/react/index.d.ts#L402
  // // We MUST keep setState() as a unified signature because it allows proper checking of the method return type.
  // // See: https://github.com/DefinitelyTyped/DefinitelyTyped/issues/18365#issuecomment-351013257
  def setState[K /* <: /* keyof S */ String */](): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](state: Partial[S] | (Pick[S, K])): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](state: Partial[S] | (Pick[S, K]), callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](state: js.Function2[/* prevState */ S, /* props */ P, (Pick[S, K]) | Partial[S] | Null]): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](
    state: js.Function2[/* prevState */ S, /* props */ P, (Pick[S, K]) | Partial[S] | Null],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](state: Null, callback: js.Function0[Unit]): Unit = js.native
  
  var shouldComponentUpdate: js.UndefOr[
    js.Function3[/* nextProps */ P, /* nextState */ S, /* nextContext */ Any, Boolean]
  ] = js.native
  
  var state: S = js.native
}
/* static members */
object Component {
  
  @JSImport("preact", "Component")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("preact", "Component.contextType")
  @js.native
  def contextType: js.UndefOr[Context[Any]] = js.native
  inline def contextType_=(x: js.UndefOr[Context[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  
  @JSImport("preact", "Component.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[Any] = js.native
  inline def defaultProps_=(x: js.UndefOr[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("preact", "Component.displayName")
  @js.native
  def displayName: js.UndefOr[String] = js.native
  inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("preact", "Component.getDerivedStateFromError")
  @js.native
  def getDerivedStateFromError: js.UndefOr[js.Function1[/* error */ Any, js.Object | Null]] = js.native
  inline def getDerivedStateFromError_=(x: js.UndefOr[js.Function1[/* error */ Any, js.Object | Null]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
  
  // Static members cannot reference class type parameters. This is not
  // supported in TypeScript. Reusing the same type arguments from `Component`
  // will lead to an impossible state where one cannot satisfy the type
  // constraint under no circumstances, see #1356.In general type arguments
  // seem to be a bit buggy and not supported well at the time of this
  // writing with TS 3.3.3333.
  @JSImport("preact", "Component.getDerivedStateFromProps")
  @js.native
  def getDerivedStateFromProps: js.UndefOr[js.Function2[/* props */ js.Object, /* state */ js.Object, js.Object | Null]] = js.native
  inline def getDerivedStateFromProps_=(x: js.UndefOr[js.Function2[/* props */ js.Object, /* state */ js.Object, js.Object | Null]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
}
