package typings.openurl2

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openurl2", JSImport.Namespace)
@js.native
object openurl2Mod extends js.Object {
  def mailto(recipients: js.Array[String], fields: StringDictionary[String]): Unit = js.native
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

