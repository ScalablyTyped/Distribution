package typings.naja.najaMod

import typings.naja.Anon_Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnippetListeners extends js.Object {
  @JSName("afterUpdate")
  var afterUpdate_Original: SnippetUpdateListener = js.native
  @JSName("beforeUpdate")
  var beforeUpdate_Original: SnippetUpdateListener = js.native
  def afterUpdate(event: SnippetUpdateEvent): Unit | Anon_Event = js.native
  def beforeUpdate(event: SnippetUpdateEvent): Unit | Anon_Event = js.native
}

