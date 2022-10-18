package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the PrivateKeyInfo structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5208)
  */
@js.native
trait PrivateKeyInfo
  extends StObject
     with PkiObject
     with IPrivateKeyInfo
     with BagType {
  
  /**
    * Converts JSON value into current object
    * @param json JSON object
    */
  def fromJSON(json: Any): Unit = js.native
}
