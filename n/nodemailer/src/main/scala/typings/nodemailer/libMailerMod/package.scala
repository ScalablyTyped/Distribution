package typings.nodemailer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMailerMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.nodemailer.Anon_Comment
  import typings.nodemailer.Anon_KeyValue
  import typings.nodemailer.Anon_Prepared
  import typings.std.Error

  type Headers = (StringDictionary[String | js.Array[String] | Anon_Prepared]) | js.Array[Anon_KeyValue]
  type ListHeader = String | Anon_Comment
  type ListHeaders = StringDictionary[ListHeader | (js.Array[js.Array[ListHeader] | ListHeader])]
  type PluginFunction = js.Function2[
    /* mail */ typings.nodemailer.libMailerMailDashMessageMod.^, 
    /* callback */ js.Function1[/* err */ js.UndefOr[Error | Null], Unit], 
    Unit
  ]
}
