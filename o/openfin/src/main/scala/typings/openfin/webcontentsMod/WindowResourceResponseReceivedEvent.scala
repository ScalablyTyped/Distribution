package typings.openfin.webcontentsMod

import typings.openfin.eventsBaseMod.WindowEvent
import typings.openfin.openfinStrings.`object`
import typings.openfin.openfinStrings.image
import typings.openfin.openfinStrings.mainFrame
import typings.openfin.openfinStrings.other
import typings.openfin.openfinStrings.script
import typings.openfin.openfinStrings.styleSheet
import typings.openfin.openfinStrings.subFrame
import typings.openfin.openfinStrings.xhr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowResourceResponseReceivedEvent[Topic, Type] extends WindowEvent[Topic, Type] {
  var headers: js.Any = js.native
  var httpResponseCode: Double = js.native
  var newUrl: String = js.native
  var originalUrl: String = js.native
  var referrer: String = js.native
  var requestMethod: String = js.native
  var resourceType: mainFrame | subFrame | styleSheet | script | image | `object` | xhr | other = js.native
  var status: Boolean = js.native
}

object WindowResourceResponseReceivedEvent {
  @scala.inline
  def apply[Topic, Type](
    headers: js.Any,
    httpResponseCode: Double,
    name: String,
    newUrl: String,
    originalUrl: String,
    referrer: String,
    requestMethod: String,
    resourceType: mainFrame | subFrame | styleSheet | script | image | `object` | xhr | other,
    status: Boolean,
    topic: Topic,
    `type`: Type,
    uuid: String
  ): WindowResourceResponseReceivedEvent[Topic, Type] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], httpResponseCode = httpResponseCode.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newUrl = newUrl.asInstanceOf[js.Any], originalUrl = originalUrl.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], requestMethod = requestMethod.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowResourceResponseReceivedEvent[Topic, Type]]
  }
  @scala.inline
  implicit class WindowResourceResponseReceivedEventOps[Self <: WindowResourceResponseReceivedEvent[_, _], Topic, Type] (val x: Self with (WindowResourceResponseReceivedEvent[Topic, Type])) extends AnyVal {
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
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpResponseCode(value: Double): Self = this.set("httpResponseCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewUrl(value: String): Self = this.set("newUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginalUrl(value: String): Self = this.set("originalUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestMethod(value: String): Self = this.set("requestMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: mainFrame | subFrame | styleSheet | script | image | `object` | xhr | other): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Boolean): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

