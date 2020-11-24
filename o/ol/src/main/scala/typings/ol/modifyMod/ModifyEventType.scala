package typings.ol.modifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ModifyEventType extends js.Object
@JSImport("ol/interaction/Modify", "ModifyEventType")
@js.native
object ModifyEventType extends js.Object {
  
  @js.native
  sealed trait MODIFYEND extends ModifyEventType
  
  @js.native
  sealed trait MODIFYSTART extends ModifyEventType
}
