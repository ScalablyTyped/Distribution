package typings.mithril.mithrilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteResolver[Attrs, State] extends js.Object {
  /** The onmatch hook is called when the router needs to find a component to render. */
  var onmatch: js.UndefOr[
    js.ThisFunction2[
      /* this */ this.type, 
      /* args */ Attrs, 
      /* requestedPath */ String, 
      (ComponentTypes[_, _]) | js.Promise[_] | Unit
    ]
  ] = js.undefined
  /** The render method is called on every redraw for a matching route. */
  var render: js.UndefOr[
    js.ThisFunction1[/* this */ this.type, /* vnode */ Vnode[Attrs, State], Children]
  ] = js.undefined
}

object RouteResolver {
  @scala.inline
  def apply[Attrs, State](
    onmatch: js.ThisFunction2[
      RouteResolver[Attrs, State], 
      /* args */ Attrs, 
      /* requestedPath */ String, 
      (ComponentTypes[_, _]) | js.Promise[_] | Unit
    ] = null,
    render: js.ThisFunction1[RouteResolver[Attrs, State], /* vnode */ Vnode[Attrs, State], Children] = null
  ): RouteResolver[Attrs, State] = {
    val __obj = js.Dynamic.literal()
    if (onmatch != null) __obj.updateDynamic("onmatch")(onmatch)
    if (render != null) __obj.updateDynamic("render")(render)
    __obj.asInstanceOf[RouteResolver[Attrs, State]]
  }
}

