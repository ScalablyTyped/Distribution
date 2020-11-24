package typings.nodeForge.mod.pki

import typings.nodeForge.mod.asn1.Asn1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-forge", "pki.privateKeyInfoToPem")
@js.native
object privateKeyInfoToPem extends js.Object {
  
  def apply(key: Asn1): PEM = js.native
  def apply(key: Asn1, maxline: Double): PEM = js.native
}
