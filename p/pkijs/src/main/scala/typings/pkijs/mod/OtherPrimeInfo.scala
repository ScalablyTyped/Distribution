package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the OtherPrimeInfo structure described in [RFC3447](https://datatracker.ietf.org/doc/html/rfc3447)
  */
@js.native
trait OtherPrimeInfo
  extends StObject
     with PkiObject
     with IOtherPrimeInfo {
  
  /**
    * Converts JSON value into current object
    * @param json JSON object
    */
  def fromJSON(json: OtherPrimeInfoJson): Unit = js.native
}
