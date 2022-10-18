package typings.pkijs.mod

import typings.asn1js.mod.BaseBlock
import typings.asn1js.mod.ValueBlock
import typings.asn1js.mod.ValueBlockJson
import typings.bytestreamjs.mod.SeqStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignedCertificateTimestamp
  extends StObject
     with PkiObject
     with ISignedCertificateTimestamp {
  
  /**
    * Converts SeqStream data into current class
    * @param stream
    */
  def fromStream(stream: SeqStream): Unit = js.native
  
  @JSName("signature")
  var signature_SignedCertificateTimestamp: BaseBlock[ValueBlock, ValueBlockJson] = js.native
  
  /**
    * Converts current object to SeqStream data
    * @returns SeqStream object
    */
  def toStream(): SeqStream = js.native
  
  /**
    * Verify SignedCertificateTimestamp for specific input data
    * @param logs Array of objects with information about each CT Log (like here: https://ct.grahamedgecombe.com/logs.json)
    * @param data Data to verify signature against. Could be encoded Certificate or encoded PreCert
    * @param dataType Type = 0 (data is encoded Certificate), type = 1 (data is encoded PreCert)
    * @param crypto Crypto engine
    */
  def verify(logs: js.Array[Log], data: js.typedarray.ArrayBuffer): js.Promise[Boolean] = js.native
  def verify(logs: js.Array[Log], data: js.typedarray.ArrayBuffer, dataType: Double): js.Promise[Boolean] = js.native
  def verify(logs: js.Array[Log], data: js.typedarray.ArrayBuffer, dataType: Double, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
  def verify(logs: js.Array[Log], data: js.typedarray.ArrayBuffer, dataType: Unit, crypto: ICryptoEngine): js.Promise[Boolean] = js.native
}
