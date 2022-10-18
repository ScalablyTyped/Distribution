package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the CertBag structure described in [RFC7292](https://datatracker.ietf.org/doc/html/rfc7292)
  */
@js.native
trait CertBag
  extends StObject
     with PkiObject
     with ICertBag
     with BagType {
  
  @JSName("certValue")
  var certValue_CertBag: PkiObject | OctetString = js.native
}
