package typings.mobx.libInternalMod

import typings.mobx.libTypesModifiersMod.IEnhancer
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/internal", "ObservableObjectAdministration")
@js.native
class ObservableObjectAdministration protected ()
  extends typings.mobx.libTypesObservableobjectMod.ObservableObjectAdministration {
  def this(
    target: js.Any,
    values: Map[String | Double | js.Symbol, ObservableValue[_] | ComputedValue[_]],
    name: String,
    defaultEnhancer: IEnhancer[_]
  ) = this()
}

