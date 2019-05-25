package typings
package nodemailerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodemailer/lib/dkim/sign", JSImport.Namespace)
@js.native
object libDkimSignMod extends js.Object {
  /** Returns DKIM signature header line */
  def apply(
    headers: js.Array[nodemailerLib.libDkimMessageDashParserMod.Header],
    hashAlgo: java.lang.String,
    bodyHash: java.lang.String
  ): java.lang.String = js.native
  def apply(
    headers: js.Array[nodemailerLib.libDkimMessageDashParserMod.Header],
    hashAlgo: java.lang.String,
    bodyHash: java.lang.String,
    options: nodemailerLib.libDkimMod.SingleKeyOptions
  ): java.lang.String = js.native
  def relaxedHeaders(
    headers: js.Array[nodemailerLib.libDkimMessageDashParserMod.Header],
    hashAlgo: java.lang.String,
    bodyHash: java.lang.String
  ): java.lang.String = js.native
  def relaxedHeaders(
    headers: js.Array[nodemailerLib.libDkimMessageDashParserMod.Header],
    hashAlgo: java.lang.String,
    bodyHash: java.lang.String,
    options: nodemailerLib.libDkimMod.SingleKeyOptions
  ): java.lang.String = js.native
}

