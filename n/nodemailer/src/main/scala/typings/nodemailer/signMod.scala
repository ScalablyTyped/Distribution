package typings.nodemailer

import typings.nodemailer.dkimMod.SingleKeyOptions
import typings.nodemailer.messageParserMod.Header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signMod {
  
  /** Returns DKIM signature header line */
  @JSImport("nodemailer/lib/dkim/sign", JSImport.Namespace)
  @js.native
  def apply(headers: js.Array[Header], hashAlgo: String, bodyHash: String): String = js.native
  @JSImport("nodemailer/lib/dkim/sign", JSImport.Namespace)
  @js.native
  def apply(headers: js.Array[Header], hashAlgo: String, bodyHash: String, options: SingleKeyOptions): String = js.native
  
  @JSImport("nodemailer/lib/dkim/sign", "relaxedHeaders")
  @js.native
  def relaxedHeaders(headers: js.Array[Header], hashAlgo: String, bodyHash: String): String = js.native
  @JSImport("nodemailer/lib/dkim/sign", "relaxedHeaders")
  @js.native
  def relaxedHeaders(headers: js.Array[Header], hashAlgo: String, bodyHash: String, options: SingleKeyOptions): String = js.native
}
