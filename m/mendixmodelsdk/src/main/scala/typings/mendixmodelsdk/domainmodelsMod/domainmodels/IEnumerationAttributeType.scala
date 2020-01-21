package typings.mendixmodelsdk.domainmodelsMod.domainmodels

import typings.mendixmodelsdk.enumerationsMod.enumerations.IEnumeration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEnumerationAttributeType extends IAttributeType {
  /**
    * This property is required and cannot be set to null.
    */
  val enumeration: IEnumeration = js.native
  val enumerationQualifiedName: String = js.native
}

