package typings
package meteorLib.emailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MailComposer extends js.Object {
  def addHeader(name: java.lang.String, value: java.lang.String): scala.Unit
  def pipe(stream: js.Any): scala.Unit
  def setMessageOption(from: java.lang.String, to: java.lang.String, body: java.lang.String, html: java.lang.String): scala.Unit
  def streamMessage(): scala.Unit
}

