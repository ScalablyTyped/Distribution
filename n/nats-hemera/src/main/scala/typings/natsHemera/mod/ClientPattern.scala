package typings.natsHemera.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientPattern
  extends /* key */ StringDictionary[js.Any] {
  @JSName("expectedMessages$")
  var expectedMessages$: js.UndefOr[Double] = js.native
  @JSName("maxMessages$")
  var maxMessages$: js.UndefOr[Double] = js.native
  @JSName("pubsub$")
  var pubsub$: js.UndefOr[Boolean] = js.native
  @JSName("timeout$")
  var timeout$: js.UndefOr[Double] = js.native
  var topic: String = js.native
}

object ClientPattern {
  @scala.inline
  def apply(topic: String): ClientPattern = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientPattern]
  }
  @scala.inline
  implicit class ClientPatternOps[Self <: ClientPattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpectedMessages$(value: Double): Self = this.set("expectedMessages$", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpectedMessages$: Self = this.set("expectedMessages$", js.undefined)
    @scala.inline
    def setMaxMessages$(value: Double): Self = this.set("maxMessages$", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxMessages$: Self = this.set("maxMessages$", js.undefined)
    @scala.inline
    def setPubsub$(value: Boolean): Self = this.set("pubsub$", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubsub$: Self = this.set("pubsub$", js.undefined)
    @scala.inline
    def setTimeout$(value: Double): Self = this.set("timeout$", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout$: Self = this.set("timeout$", js.undefined)
  }
  
}

