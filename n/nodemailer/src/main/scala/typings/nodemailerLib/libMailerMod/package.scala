package typings
package nodemailerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMailerMod {
  type Headers = (org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String] | nodemailerLib.Anon_Prepared]) | js.Array[nodemailerLib.Anon_KeyValue]
  type ListHeader = java.lang.String | nodemailerLib.Anon_Comment
  type ListHeaders = org.scalablytyped.runtime.StringDictionary[ListHeader | (js.Array[js.Array[ListHeader] | ListHeader])]
  type PluginFunction = js.Function2[
    /* mail */ nodemailerLib.libMailerMailDashMessageMod.^, 
    /* callback */ js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit], 
    scala.Unit
  ]
}
