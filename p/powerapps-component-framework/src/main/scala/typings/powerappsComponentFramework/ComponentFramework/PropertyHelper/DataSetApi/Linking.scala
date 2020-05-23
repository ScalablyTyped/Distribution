package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dataset entity linking.
  */
trait Linking extends js.Object {
  /**
    * Add a new linked entity relationship with the existed query primary entity
    */
  def addLinkedEntity(expression: LinkEntityExposedExpression): Unit
  /**
    * Returns all the linked entities information
    */
  def getLinkedEntities(): js.Array[LinkEntityExposedExpression]
}

object Linking {
  @scala.inline
  def apply(
    addLinkedEntity: LinkEntityExposedExpression => Unit,
    getLinkedEntities: () => js.Array[LinkEntityExposedExpression]
  ): Linking = {
    val __obj = js.Dynamic.literal(addLinkedEntity = js.Any.fromFunction1(addLinkedEntity), getLinkedEntities = js.Any.fromFunction0(getLinkedEntities))
    __obj.asInstanceOf[Linking]
  }
}

