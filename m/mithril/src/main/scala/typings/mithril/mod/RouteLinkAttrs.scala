package typings.mithril.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteLinkAttrs extends Attributes {
  var href: String
  var options: js.UndefOr[RouteOptions] = js.undefined
  var selector: js.UndefOr[String | (ComponentTypes[_, js.Object])] = js.undefined
}

object RouteLinkAttrs {
  @scala.inline
  def apply(
    href: String,
    `class`: String = null,
    className: String = null,
    key: String | Double = null,
    onbeforeremove: js.ThisFunction1[js.Any, /* vnode */ VnodeDOM[js.Any, js.Any], js.Promise[_] | Unit] = null,
    onbeforeupdate: js.ThisFunction2[
      js.Any, 
      /* vnode */ Vnode[js.Any, js.Any], 
      /* old */ VnodeDOM[js.Any, js.Any], 
      Boolean | Unit
    ] = null,
    oncreate: js.ThisFunction1[js.Any, /* vnode */ VnodeDOM[js.Any, js.Any], _] = null,
    oninit: js.ThisFunction1[js.Any, /* vnode */ Vnode[js.Any, js.Any], _] = null,
    onremove: js.ThisFunction1[js.Any, /* vnode */ VnodeDOM[js.Any, js.Any], _] = null,
    onupdate: js.ThisFunction1[js.Any, /* vnode */ VnodeDOM[js.Any, js.Any], _] = null,
    options: RouteOptions = null,
    selector: String | (ComponentTypes[_, js.Object]) = null
  ): RouteLinkAttrs = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onbeforeremove != null) __obj.updateDynamic("onbeforeremove")(onbeforeremove.asInstanceOf[js.Any])
    if (onbeforeupdate != null) __obj.updateDynamic("onbeforeupdate")(onbeforeupdate.asInstanceOf[js.Any])
    if (oncreate != null) __obj.updateDynamic("oncreate")(oncreate.asInstanceOf[js.Any])
    if (oninit != null) __obj.updateDynamic("oninit")(oninit.asInstanceOf[js.Any])
    if (onremove != null) __obj.updateDynamic("onremove")(onremove.asInstanceOf[js.Any])
    if (onupdate != null) __obj.updateDynamic("onupdate")(onupdate.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (selector != null) __obj.updateDynamic("selector")(selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteLinkAttrs]
  }
}

