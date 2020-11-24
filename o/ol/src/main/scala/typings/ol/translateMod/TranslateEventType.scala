package typings.ol.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TranslateEventType extends js.Object
@JSImport("ol/interaction/Translate", "TranslateEventType")
@js.native
object TranslateEventType extends js.Object {
  
  @js.native
  sealed trait TRANSLATEEND extends TranslateEventType
  
  @js.native
  sealed trait TRANSLATESTART extends TranslateEventType
  
  @js.native
  sealed trait TRANSLATING extends TranslateEventType
}
