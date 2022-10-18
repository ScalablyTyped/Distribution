package typings.pkijs.mod

import typings.asn1js.mod.OctetString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Class from RFC5208
  */
@JSImport("pkijs", "KeyBag")
@js.native
/**
  * Constructor for Attribute class
  * @param parameters
  */
open class KeyBag ()
  extends StObject
     with PrivateKeyInfo {
  def this(parameters: js.Object) = this()
  
  /* CompleteClass */
  var privateKey: OctetString = js.native
  
  /* CompleteClass */
  var privateKeyAlgorithm: AlgorithmIdentifier = js.native
  
  /* CompleteClass */
  var version: Double = js.native
}
