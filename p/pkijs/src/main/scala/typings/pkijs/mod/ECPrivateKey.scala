package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the PrivateKeyInfo structure described in [RFC5915](https://datatracker.ietf.org/doc/html/rfc5915)
  */
@js.native
trait ECPrivateKey
  extends StObject
     with PkiObject
     with IECPrivateKey {
  
  /**
    * Converts JSON value into current object
    * @param json JSON object
    */
  def fromJSON(json: Any): Unit = js.native
}
