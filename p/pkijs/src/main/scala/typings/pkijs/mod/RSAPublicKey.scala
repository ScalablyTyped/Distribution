package typings.pkijs.mod

import typings.asn1js.mod.AsnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the RSAPublicKey structure described in [RFC3447](https://datatracker.ietf.org/doc/html/rfc3447)
  */
@js.native
trait RSAPublicKey
  extends StObject
     with PkiObject
     with IRSAPublicKey {
  
  /**
    * Converts JSON value into current object
    * @param json JSON object
    */
  def fromJSON(json: RSAPublicKeyJson): Unit = js.native
  
  def fromSchema(schema: AsnType): Unit = js.native
}
