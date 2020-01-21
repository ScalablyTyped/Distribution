package typings.mendixmodelsdk.datatypesMod.datatypes

import typings.mendixmodelsdk.enumerationsMod.enumerations.IEnumeration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.9.0: introduced
  */
@js.native
trait IEnumerationType extends IDataType {
  /**
    * This property is required and cannot be set to null.
    */
  val enumeration: IEnumeration = js.native
  val enumerationQualifiedName: String = js.native
}

