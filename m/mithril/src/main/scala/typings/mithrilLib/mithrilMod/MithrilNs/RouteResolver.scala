package typings
package mithrilLib.mithrilMod.MithrilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RouteResolver[Attrs, State] extends js.Object {
  /** The onmatch hook is called when the router needs to find a component to render. */
  var onmatch: js.UndefOr[
    js.ThisFunction2[
      /* this */ this.type, 
      /* args */ Attrs, 
      /* requestedPath */ java.lang.String, 
      (ComponentTypes[_, _]) | js.Promise[_] | scala.Unit
    ]
  ] = js.undefined
  /** The render method is called on every redraw for a matching route. */
  var render: js.UndefOr[
    js.ThisFunction1[/* this */ this.type, /* vnode */ Vnode[Attrs, State], Children]
  ] = js.undefined
}

