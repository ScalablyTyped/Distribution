package typings.meteor.serverRenderMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadableStream
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sink extends js.Object {
  var appendToBody: js.UndefOr[js.Function1[/* html */ String, Unit]] = js.native
  var appendToElementById: js.UndefOr[js.Function2[/* id */ String, /* html */ String, Unit]] = js.native
  var appendToHead: js.UndefOr[js.Function1[/* html */ String, Unit]] = js.native
  var arch: js.UndefOr[String] = js.native
  var body: js.UndefOr[String] = js.native
  var head: js.UndefOr[String] = js.native
  var htmlById: js.UndefOr[StringDictionary[String]] = js.native
  var maybeMadeChanges: js.UndefOr[Boolean] = js.native
  var renderIntoElementById: (js.UndefOr[js.Function2[/* id */ String, /* html */ String, Unit]]) with (js.UndefOr[js.Function2[/* id */ String, /* html */ ReadableStream, Unit]]) = js.native
  var request: js.UndefOr[IncomingMessage] = js.native
}

object Sink {
  @scala.inline
  def apply(
    renderIntoElementById: (js.UndefOr[js.Function2[/* id */ String, /* html */ String, Unit]]) with (js.UndefOr[js.Function2[/* id */ String, /* html */ ReadableStream, Unit]])
  ): Sink = {
    val __obj = js.Dynamic.literal(renderIntoElementById = renderIntoElementById.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sink]
  }
  @scala.inline
  implicit class SinkOps[Self <: Sink] (val x: Self) extends AnyVal {
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
    def setRenderIntoElementById(
      value: (js.UndefOr[js.Function2[/* id */ String, /* html */ String, Unit]]) with (js.UndefOr[js.Function2[/* id */ String, /* html */ ReadableStream, Unit]])
    ): Self = this.set("renderIntoElementById", value.asInstanceOf[js.Any])
    @scala.inline
    def setAppendToBody(value: /* html */ String => Unit): Self = this.set("appendToBody", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAppendToBody: Self = this.set("appendToBody", js.undefined)
    @scala.inline
    def setAppendToElementById(value: (/* id */ String, /* html */ String) => Unit): Self = this.set("appendToElementById", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAppendToElementById: Self = this.set("appendToElementById", js.undefined)
    @scala.inline
    def setAppendToHead(value: /* html */ String => Unit): Self = this.set("appendToHead", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAppendToHead: Self = this.set("appendToHead", js.undefined)
    @scala.inline
    def setArch(value: String): Self = this.set("arch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArch: Self = this.set("arch", js.undefined)
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setHead(value: String): Self = this.set("head", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHead: Self = this.set("head", js.undefined)
    @scala.inline
    def setHtmlById(value: StringDictionary[String]): Self = this.set("htmlById", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlById: Self = this.set("htmlById", js.undefined)
    @scala.inline
    def setMaybeMadeChanges(value: Boolean): Self = this.set("maybeMadeChanges", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaybeMadeChanges: Self = this.set("maybeMadeChanges", js.undefined)
    @scala.inline
    def setRequest(value: IncomingMessage): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequest: Self = this.set("request", js.undefined)
  }
  
}

