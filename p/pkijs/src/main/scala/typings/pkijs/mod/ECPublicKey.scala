package typings.pkijs.mod

import typings.std.BufferSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the PrivateKeyInfo structure described in [RFC5480](https://datatracker.ietf.org/doc/html/rfc5480)
  */
@js.native
trait ECPublicKey
  extends StObject
     with PkiObject
     with IECPublicKey {
  
  /**
    * Converts JSON value into current object
    * @param json JSON object
    */
  def fromJSON(json: Any): Unit = js.native
  
  def fromSchema(schema1: BufferSource): Any = js.native
}
