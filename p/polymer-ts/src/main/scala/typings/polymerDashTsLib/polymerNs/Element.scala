package typings
package polymerDashTsLib.polymerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Element extends js.Object {
  var attached: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var attributeChanged: js.UndefOr[
    js.Function3[/* attrName */ java.lang.String, /* oldVal */ js.Any, /* newVal */ js.Any, scala.Unit]
  ] = js.undefined
  var behaviors: js.UndefOr[js.Array[js.Object]] = js.undefined
  var created: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var detached: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var factoryImpl: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  var listeners: js.UndefOr[js.Object] = js.undefined
  var observers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var properties: js.UndefOr[js.Object] = js.undefined
  var ready: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object Element {
  @scala.inline
  def apply(
    attached: js.Function0[scala.Unit] = null,
    attributeChanged: js.Function3[/* attrName */ java.lang.String, /* oldVal */ js.Any, /* newVal */ js.Any, scala.Unit] = null,
    behaviors: js.Array[js.Object] = null,
    created: js.Function0[scala.Unit] = null,
    detached: js.Function0[scala.Unit] = null,
    factoryImpl: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    listeners: js.Object = null,
    observers: js.Array[java.lang.String] = null,
    properties: js.Object = null,
    ready: js.Function0[scala.Unit] = null
  ): Element = {
    val __obj = js.Dynamic.literal()
    if (attached != null) __obj.updateDynamic("attached")(attached)
    if (attributeChanged != null) __obj.updateDynamic("attributeChanged")(attributeChanged)
    if (behaviors != null) __obj.updateDynamic("behaviors")(behaviors)
    if (created != null) __obj.updateDynamic("created")(created)
    if (detached != null) __obj.updateDynamic("detached")(detached)
    if (factoryImpl != null) __obj.updateDynamic("factoryImpl")(factoryImpl)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (observers != null) __obj.updateDynamic("observers")(observers)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (ready != null) __obj.updateDynamic("ready")(ready)
    __obj.asInstanceOf[Element]
  }
}

