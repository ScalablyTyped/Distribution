package typings.mendixmodelsdk.codeactionsMod.codeactions

import typings.mendixmodelsdk.domainmodelsMod.domainmodels.IEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * In version 7.21.0: introduced
  */
@js.native
trait IConcreteEntityType extends IEntityType {
  /**
    * This property is required and cannot be set to null.
    */
  val entity: IEntity = js.native
  val entityQualifiedName: String = js.native
}

