package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Dataset entity linking.
  */
@js.native
trait Linking extends js.Object {
  
  /**
    * Add a new linked entity relationship with the existed query primary entity
    */
  def addLinkedEntity(expression: LinkEntityExposedExpression): Unit = js.native
  
  /**
    * Returns all the linked entities information
    */
  def getLinkedEntities(): js.Array[LinkEntityExposedExpression] = js.native
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
  
  @scala.inline
  implicit class LinkingOps[Self <: Linking] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddLinkedEntity(value: LinkEntityExposedExpression => Unit): Self = this.set("addLinkedEntity", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetLinkedEntities(value: () => js.Array[LinkEntityExposedExpression]): Self = this.set("getLinkedEntities", js.Any.fromFunction0(value))
  }
}
