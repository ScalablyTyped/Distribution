package typings
package meteorLib.serverDashRenderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sink extends js.Object {
  var appendToBody: js.UndefOr[js.Function1[/* html */ java.lang.String, scala.Unit]] = js.undefined
  var appendToElementById: js.UndefOr[js.Function2[/* id */ java.lang.String, /* html */ java.lang.String, scala.Unit]] = js.undefined
  var appendToHead: js.UndefOr[js.Function1[/* html */ java.lang.String, scala.Unit]] = js.undefined
  var arch: js.UndefOr[java.lang.String] = js.undefined
  var body: js.UndefOr[java.lang.String] = js.undefined
  var head: js.UndefOr[java.lang.String] = js.undefined
  var htmlById: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var maybeMadeChanges: js.UndefOr[scala.Boolean] = js.undefined
  var renderIntoElementById: js.UndefOr[
    (js.Function2[/* id */ java.lang.String, /* html */ java.lang.String, scala.Unit]) with (js.Function2[/* id */ java.lang.String, /* html */ nodeLib.NodeJSNs.ReadableStream, scala.Unit])
  ] = js.undefined
  var request: js.UndefOr[nodeLib.httpMod.IncomingMessage] = js.undefined
}

object Sink {
  @scala.inline
  def apply(
    appendToBody: /* html */ java.lang.String => scala.Unit = null,
    appendToElementById: (/* id */ java.lang.String, /* html */ java.lang.String) => scala.Unit = null,
    appendToHead: /* html */ java.lang.String => scala.Unit = null,
    arch: java.lang.String = null,
    body: java.lang.String = null,
    head: java.lang.String = null,
    htmlById: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    maybeMadeChanges: js.UndefOr[scala.Boolean] = js.undefined,
    renderIntoElementById: (js.Function2[/* id */ java.lang.String, /* html */ java.lang.String, scala.Unit]) with (js.Function2[/* id */ java.lang.String, /* html */ nodeLib.NodeJSNs.ReadableStream, scala.Unit]) = null,
    request: nodeLib.httpMod.IncomingMessage = null
  ): Sink = {
    val __obj = js.Dynamic.literal()
    if (appendToBody != null) __obj.updateDynamic("appendToBody")(js.Any.fromFunction1(appendToBody))
    if (appendToElementById != null) __obj.updateDynamic("appendToElementById")(js.Any.fromFunction2(appendToElementById))
    if (appendToHead != null) __obj.updateDynamic("appendToHead")(js.Any.fromFunction1(appendToHead))
    if (arch != null) __obj.updateDynamic("arch")(arch)
    if (body != null) __obj.updateDynamic("body")(body)
    if (head != null) __obj.updateDynamic("head")(head)
    if (htmlById != null) __obj.updateDynamic("htmlById")(htmlById)
    if (!js.isUndefined(maybeMadeChanges)) __obj.updateDynamic("maybeMadeChanges")(maybeMadeChanges)
    if (renderIntoElementById != null) __obj.updateDynamic("renderIntoElementById")(renderIntoElementById)
    if (request != null) __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[Sink]
  }
}

