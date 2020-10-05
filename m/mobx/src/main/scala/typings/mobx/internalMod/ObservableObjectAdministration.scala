package typings.mobx.internalMod

import typings.mobx.modifiersMod.IEnhancer
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/internal", "ObservableObjectAdministration")
@js.native
class ObservableObjectAdministration protected ()
  extends typings.mobx.observableobjectMod.ObservableObjectAdministration {
  def this(
    target: js.Any,
    values: Map[
        String | Double | js.Symbol, 
        typings.mobx.observablevalueMod.ObservableValue[_] | typings.mobx.computedvalueMod.ComputedValue[_]
      ],
    name: String,
    defaultEnhancer: IEnhancer[_]
  ) = this()
}

