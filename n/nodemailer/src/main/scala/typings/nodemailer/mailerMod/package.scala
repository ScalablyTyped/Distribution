package typings.nodemailer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mailerMod {
  
  type Headers = (org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String] | typings.nodemailer.anon.Prepared]) | js.Array[typings.nodemailer.anon.Value]
  
  type ListHeader = java.lang.String | typings.nodemailer.anon.Comment
  
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
