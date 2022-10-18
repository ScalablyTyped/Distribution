package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the RelativeDistinguishedNames structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@js.native
trait RelativeDistinguishedNames
  extends StObject
     with PkiObject
     with IRelativeDistinguishedNames {
  
  /**
    * Compares two RDN values, or RDN with ArrayBuffer value
    * @param compareTo The value compare to current
    */
  def isEqual(compareTo: Any): Boolean = js.native
}
