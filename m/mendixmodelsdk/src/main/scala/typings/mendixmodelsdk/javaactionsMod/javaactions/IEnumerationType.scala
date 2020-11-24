package typings.mendixmodelsdk.javaactionsMod.javaactions

import typings.mendixmodelsdk.enumerationsMod.enumerations.IEnumeration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In version 7.21.0: deleted
  * In version 6.6.0: introduced
  */
@js.native
trait IEnumerationType extends IType {
  
  /**
    * This property is required and cannot be set to null.
    */
  val enumeration: IEnumeration = js.native
  
  val enumerationQualifiedName: String = js.native
}
