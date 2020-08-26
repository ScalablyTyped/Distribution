package typings.mithril.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteResolver[Attrs, State] extends js.Object {
  /** The onmatch hook is called when the router needs to find a component to render. */
  var onmatch: js.UndefOr[
    js.ThisFunction2[
      /* this */ this.type, 
      /* args */ Attrs, 
      /* requestedPath */ String, 
      (ComponentTypes[_, _]) | js.Promise[_] | Unit
    ]
  ] = js.native
  /** The render method is called on every redraw for a matching route. */
  var render: js.UndefOr[
    js.ThisFunction1[/* this */ this.type, /* vnode */ Vnode[Attrs, State], Children]
  ] = js.native
}

object RouteResolver {
  @scala.inline
  def apply[Attrs, State](): RouteResolver[Attrs, State] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteResolver[Attrs, State]]
  }
  @scala.inline
  implicit class RouteResolverOps[Self <: RouteResolver[_, _], Attrs, State] (val x: Self with (RouteResolver[Attrs, State])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnmatch(
      value: js.ThisFunction2[
          RouteResolver[Attrs, State], 
          /* args */ Attrs, 
          /* requestedPath */ String, 
          (ComponentTypes[_, _]) | js.Promise[_] | Unit
        ]
    ): Self = this.set("onmatch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmatch: Self = this.set("onmatch", js.undefined)
    @scala.inline
    def setRender(value: js.ThisFunction1[RouteResolver[Attrs, State], /* vnode */ Vnode[Attrs, State], Children]): Self = this.set("render", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
  
}

