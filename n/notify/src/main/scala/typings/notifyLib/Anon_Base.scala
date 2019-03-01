package typings
package notifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base
  extends /* className */ org.scalablytyped.runtime.StringDictionary[notifyLib.NotifyNs.ClassCSS] {
  var base: js.UndefOr[notifyLib.NotifyNs.ClassCSS] = js.undefined
}

object Anon_Base {
  @scala.inline
  def apply(
    StringDictionary: /* className */ org.scalablytyped.runtime.StringDictionary[notifyLib.NotifyNs.ClassCSS] = null,
    base: notifyLib.NotifyNs.ClassCSS = null
  ): Anon_Base = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (base != null) __obj.updateDynamic("base")(base)
    __obj.asInstanceOf[Anon_Base]
  }
}

