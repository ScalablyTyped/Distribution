package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the AttributeTypeAndValue structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@js.native
trait AttributeTypeAndValue
  extends StObject
     with PkiObject
     with IAttributeTypeAndValue {
  
  def isEqual(compareTo: js.typedarray.ArrayBuffer): Boolean = js.native
  /**
    * Compares two AttributeTypeAndValue values, or AttributeTypeAndValue with ArrayBuffer value
    * @param compareTo The value compare to current
    */
  def isEqual(compareTo: AttributeTypeAndValue): Boolean = js.native
}
