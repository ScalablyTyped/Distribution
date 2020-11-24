package typings.ol.priorityQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/structs/PriorityQueue", JSImport.Default)
@js.native
class default[T] protected () extends PriorityQueue[T] {
  def this(priorityFunction: js.Function1[/* p0 */ T, Double], keyFunction: js.Function1[/* p0 */ T, String]) = this()
}
