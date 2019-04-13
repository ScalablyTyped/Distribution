package typings
package mithrilLib.mithrilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This represents the attributes available for configuring virtual elements, beyond the applicable DOM attributes. */
trait Attributes
  extends Lifecycle[js.Any, js.Any]
     with /** Any other virtual element properties, including attributes and event handlers. */
/* property */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /** The class name(s) for this virtual element, as a space-separated list. */
  var `class`: js.UndefOr[java.lang.String] = js.undefined
  /** The class name(s) for this virtual element, as a space-separated list. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** A key to optionally associate with this element. */
  var key: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Attributes {
  @scala.inline
  def apply(
    StringDictionary: /** Any other virtual element properties, including attributes and event handlers. */
  /* property */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    `class`: java.lang.String = null,
    className: java.lang.String = null,
    key: java.lang.String | scala.Double = null,
    onbeforeremove: js.ThisFunction1[js.Any, /* vnode */ VnodeDOM[js.Any, js.Any], js.Promise[_] | scala.Unit] = null,
    onbeforeupdate: js.ThisFunction2[
      js.Any, 
      /* vnode */ Vnode[js.Any, js.Any], 
      /* old */ VnodeDOM[js.Any, js.Any], 
      scala.Boolean | scala.Unit
    ] = null,
    oncreate: js.ThisFunction1[js.Any, /* vnode */ VnodeDOM[js.Any, js.Any], _] = null,
    oninit: js.ThisFunction1[js.Any, /* vnode */ Vnode[js.Any, js.Any], _] = null,
    onremove: js.ThisFunction1[js.Any, /* vnode */ VnodeDOM[js.Any, js.Any], _] = null,
    onupdate: js.ThisFunction1[js.Any, /* vnode */ VnodeDOM[js.Any, js.Any], _] = null
  ): Attributes = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (className != null) __obj.updateDynamic("className")(className)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (onbeforeremove != null) __obj.updateDynamic("onbeforeremove")(onbeforeremove)
    if (onbeforeupdate != null) __obj.updateDynamic("onbeforeupdate")(onbeforeupdate)
    if (oncreate != null) __obj.updateDynamic("oncreate")(oncreate)
    if (oninit != null) __obj.updateDynamic("oninit")(oninit)
    if (onremove != null) __obj.updateDynamic("onremove")(onremove)
    if (onupdate != null) __obj.updateDynamic("onupdate")(onupdate)
    __obj.asInstanceOf[Attributes]
  }
}

