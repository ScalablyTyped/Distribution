package typings.meteor.serverRenderMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadableStream
import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sink extends js.Object {
  var appendToBody: js.UndefOr[js.Function1[/* html */ String, Unit]] = js.undefined
  var appendToElementById: js.UndefOr[js.Function2[/* id */ String, /* html */ String, Unit]] = js.undefined
  var appendToHead: js.UndefOr[js.Function1[/* html */ String, Unit]] = js.undefined
  var arch: js.UndefOr[String] = js.undefined
  var body: js.UndefOr[String] = js.undefined
  var head: js.UndefOr[String] = js.undefined
  var htmlById: js.UndefOr[StringDictionary[String]] = js.undefined
  var maybeMadeChanges: js.UndefOr[Boolean] = js.undefined
  var renderIntoElementById: js.UndefOr[
    (js.Function2[/* id */ String, /* html */ String, Unit]) with (js.Function2[/* id */ String, /* html */ ReadableStream, Unit])
  ] = js.undefined
  var request: js.UndefOr[IncomingMessage] = js.undefined
}

object Sink {
  @scala.inline
  def apply(
    appendToBody: /* html */ String => Unit = null,
    appendToElementById: (/* id */ String, /* html */ String) => Unit = null,
    appendToHead: /* html */ String => Unit = null,
    arch: String = null,
    body: String = null,
    head: String = null,
    htmlById: StringDictionary[String] = null,
    maybeMadeChanges: js.UndefOr[Boolean] = js.undefined,
    renderIntoElementById: (js.Function2[/* id */ String, /* html */ String, Unit]) with (js.Function2[/* id */ String, /* html */ ReadableStream, Unit]) = null,
    request: IncomingMessage = null
  ): Sink = {
    val __obj = js.Dynamic.literal()
    if (appendToBody != null) __obj.updateDynamic("appendToBody")(js.Any.fromFunction1(appendToBody))
    if (appendToElementById != null) __obj.updateDynamic("appendToElementById")(js.Any.fromFunction2(appendToElementById))
    if (appendToHead != null) __obj.updateDynamic("appendToHead")(js.Any.fromFunction1(appendToHead))
    if (arch != null) __obj.updateDynamic("arch")(arch.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (head != null) __obj.updateDynamic("head")(head.asInstanceOf[js.Any])
    if (htmlById != null) __obj.updateDynamic("htmlById")(htmlById.asInstanceOf[js.Any])
    if (!js.isUndefined(maybeMadeChanges)) __obj.updateDynamic("maybeMadeChanges")(maybeMadeChanges.asInstanceOf[js.Any])
    if (renderIntoElementById != null) __obj.updateDynamic("renderIntoElementById")(renderIntoElementById.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sink]
  }
}

