package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the AlgorithmIdentifier structure described in [RFC5280](https://datatracker.ietf.org/doc/html/rfc5280)
  */
@js.native
trait AlgorithmIdentifier
  extends StObject
     with PkiObject
     with IAlgorithmIdentifier {
  
  /**
    * Checks that two "AlgorithmIdentifiers" are equal
    * @param algorithmIdentifier
    */
  def isEqual(algorithmIdentifier: Any): Boolean = js.native
}
