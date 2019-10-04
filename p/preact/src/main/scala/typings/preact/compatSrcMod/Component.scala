package typings.preact.compatSrcMod

import typings.preact.srcMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact/compat/src", "Component")
@js.native
abstract class Component[P, S] ()
  extends typings.preact.srcMod.Component[P, S] {
  def this(props: P) = this()
  def this(props: P, context: js.Any) = this()
}

/* static members */
@JSImport("preact/compat/src", "Component")
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

