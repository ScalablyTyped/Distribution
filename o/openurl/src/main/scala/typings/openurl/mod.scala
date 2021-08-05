package typings.openurl

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openurl", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mailto(recipients: js.Array[String], fields: StringDictionary[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mailto")(recipients.asInstanceOf[js.Any], fields.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mailto(recipients: js.Array[String], fields: StringDictionary[String], recipientsSeparator: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mailto")(recipients.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], recipientsSeparator.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mailto(
    recipients: js.Array[String],
    fields: StringDictionary[String],
    recipientsSeparator: String,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mailto")(recipients.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], recipientsSeparator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mailto(
    recipients: js.Array[String],
    fields: StringDictionary[String],
    recipientsSeparator: Unit,
    callback: js.Function1[/* err */ Error, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mailto")(recipients.asInstanceOf[js.Any], fields.asInstanceOf[js.Any], recipientsSeparator.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def open(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def open(url: String, callback: js.Function1[/* err */ Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
