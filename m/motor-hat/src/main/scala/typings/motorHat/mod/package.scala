package typings.motorHat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function2[/* err */ js.UndefOr[typings.std.Error], /* result */ js.UndefOr[js.Any], scala.Unit]
  
  type PinDefinition = typings.motorHat.mod.PinDefinitionObject | js.Array[scala.Double]
}
