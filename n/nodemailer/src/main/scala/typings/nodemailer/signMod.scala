package typings.nodemailer

import typings.nodemailer.dkimMod.SingleKeyOptions
import typings.nodemailer.messageParserMod.Header
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodemailer/lib/dkim/sign", JSImport.Namespace)
@js.native
object signMod extends js.Object {
  
  /** Returns DKIM signature header line */
  def apply(headers: js.Array[Header], hashAlgo: String, bodyHash: String): String = js.native
  def apply(headers: js.Array[Header], hashAlgo: String, bodyHash: String, options: SingleKeyOptions): String = js.native
  
  def relaxedHeaders(headers: js.Array[Header], hashAlgo: String, bodyHash: String): String = js.native
  def relaxedHeaders(headers: js.Array[Header], hashAlgo: String, bodyHash: String, options: SingleKeyOptions): String = js.native
}
