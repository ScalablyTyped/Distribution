package typings
package atNteractTransformDashVdomLib.libObjectDashToDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nteract/transform-vdom/lib/object-to-react", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def objectToReactElement(
    obj: VDOMEl,
    onVDOMEvent: js.Function2[
      /* targetName */ java.lang.String, 
      /* event */ atNteractTransformDashVdomLib.libEventDashToDashObjectMod.SerializedEvent[_], 
      scala.Unit
    ]
  ): reactLib.reactMod.ReactElement = js.native
}

