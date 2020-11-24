package typings.ol.igcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IGCZ extends js.Object
/**
  * IGC altitude/z. One of 'barometric', 'gps', 'none'.
  */
@JSImport("ol/format/IGC", "IGCZ")
@js.native
object IGCZ extends js.Object {
  
  @js.native
  sealed trait BAROMETRIC extends IGCZ
  
  @js.native
  sealed trait GPS extends IGCZ
  
  @js.native
  sealed trait NONE extends IGCZ
}
