package typings.openfin.boundsChangedMod

import typings.openfin.baseMod.Reply
import typings.openfin.openfinStrings.`bounds-changed`
import typings.openfin.openfinStrings.window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoundsChangedReply extends Reply[window, `bounds-changed`] {
  
  var changeType: BoundsChangeType = js.native
  
  var deferred: Boolean = js.native
  
  var height: Double = js.native
  
  var left: Double = js.native
  
  var top: Double = js.native
  
  var width: Double = js.native
}
