package typings.nodemailer

import typings.nodemailer.nodemailerBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mimeTypesMod {
  
  @JSImport("nodemailer/lib/mime-funcs/mime-types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def detectExtension(mimeType: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("detectExtension")(mimeType.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def detectExtension_false(mimeType: `false`): String = ^.asInstanceOf[js.Dynamic].applyDynamic("detectExtension")(mimeType.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def detectMimeType(filename: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("detectMimeType")(filename.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def detectMimeType_false(filename: `false`): String = ^.asInstanceOf[js.Dynamic].applyDynamic("detectMimeType")(filename.asInstanceOf[js.Any]).asInstanceOf[String]
}
