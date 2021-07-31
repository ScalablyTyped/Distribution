package typings.nodemailer

import typings.nodemailer.dkimMod.SingleKeyOptions
import typings.nodemailer.messageParserMod.Header
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signMod {
  
  /** Returns DKIM signature header line */
  @scala.inline
  def apply(headers: js.Array[Header], hashAlgo: String, bodyHash: String): String = (^.asInstanceOf[js.Dynamic].apply(headers.asInstanceOf[js.Any], hashAlgo.asInstanceOf[js.Any], bodyHash.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(headers: js.Array[Header], hashAlgo: String, bodyHash: String, options: SingleKeyOptions): String = (^.asInstanceOf[js.Dynamic].apply(headers.asInstanceOf[js.Any], hashAlgo.asInstanceOf[js.Any], bodyHash.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("nodemailer/lib/dkim/sign", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def relaxedHeaders(headers: js.Array[Header], hashAlgo: String, bodyHash: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relaxedHeaders")(headers.asInstanceOf[js.Any], hashAlgo.asInstanceOf[js.Any], bodyHash.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def relaxedHeaders(headers: js.Array[Header], hashAlgo: String, bodyHash: String, options: SingleKeyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relaxedHeaders")(headers.asInstanceOf[js.Any], hashAlgo.asInstanceOf[js.Any], bodyHash.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
}
