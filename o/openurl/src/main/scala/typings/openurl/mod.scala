package typings.openurl

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openurl", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def mailto(recipients: js.Array[String], fields: StringDictionary[String]): Unit = js.native
  def mailto(
    recipients: js.Array[String],
    fields: StringDictionary[String],
    recipientsSeparator: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
  def mailto(recipients: js.Array[String], fields: StringDictionary[String], recipientsSeparator: String): Unit = js.native
  def mailto(
    recipients: js.Array[String],
    fields: StringDictionary[String],
    recipientsSeparator: String,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = js.native
  def open(url: String): Unit = js.native
  def open(url: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

