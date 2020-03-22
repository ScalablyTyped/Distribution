package typings.nodemailer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mailerMod {
  type Headers = (org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String] | typings.nodemailer.AnonPrepared]) | js.Array[typings.nodemailer.AnonValue]
  type ListHeader = java.lang.String | typings.nodemailer.AnonComment
  type ListHeaders = org.scalablytyped.runtime.StringDictionary[
    typings.nodemailer.mailerMod.ListHeader | (js.Array[
      js.Array[typings.nodemailer.mailerMod.ListHeader] | typings.nodemailer.mailerMod.ListHeader
    ])
  ]
  type PluginFunction = js.Function2[
    /* mail */ typings.nodemailer.mailMessageMod.^, 
    /* callback */ js.Function1[/* err */ js.UndefOr[typings.std.Error | scala.Null], scala.Unit], 
    scala.Unit
  ]
}
