package typings
package nodemailerLib.libMailerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MailNs {
  type Headers = (org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String] | nodemailerLib.Anon_Prepared]) | js.Array[nodemailerLib.Anon_KeyValue]
  type ListHeader = java.lang.String | nodemailerLib.Anon_Comment
  type PluginFunction = js.Function2[
    /* mail */ nodemailerLib.libMailerMailDashMessageMod.namespaced, 
    /* callback */ js.Function1[/* err */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
    scala.Unit
  ]
}
