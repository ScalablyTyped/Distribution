package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindOperatorsUnordered extends StObject {
  
  var length: scala.Double
  
  def remove(): UnorderedBulkOperation
  
  def removeOne(): UnorderedBulkOperation
  
  def replaceOne(doc: js.Object): UnorderedBulkOperation
  
  def update(doc: js.Object): UnorderedBulkOperation
  
  def updateOne(doc: js.Object): UnorderedBulkOperation
  
  def upsert(): FindOperatorsUnordered
}
object FindOperatorsUnordered {
  
  @scala.inline
  def apply(
    length: scala.Double,
    remove: () => UnorderedBulkOperation,
    removeOne: () => UnorderedBulkOperation,
    replaceOne: js.Object => UnorderedBulkOperation,
    update: js.Object => UnorderedBulkOperation,
    updateOne: js.Object => UnorderedBulkOperation,
    upsert: () => FindOperatorsUnordered
  ): FindOperatorsUnordered = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), removeOne = js.Any.fromFunction0(removeOne), replaceOne = js.Any.fromFunction1(replaceOne), update = js.Any.fromFunction1(update), updateOne = js.Any.fromFunction1(updateOne), upsert = js.Any.fromFunction0(upsert))
    __obj.asInstanceOf[FindOperatorsUnordered]
  }
  
  @scala.inline
  implicit class FindOperatorsUnorderedMutableBuilder[Self <: FindOperatorsUnordered] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: scala.Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: () => UnorderedBulkOperation): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveOne(value: () => UnorderedBulkOperation): Self = StObject.set(x, "removeOne", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReplaceOne(value: js.Object => UnorderedBulkOperation): Self = StObject.set(x, "replaceOne", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdate(value: js.Object => UnorderedBulkOperation): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateOne(value: js.Object => UnorderedBulkOperation): Self = StObject.set(x, "updateOne", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpsert(value: () => FindOperatorsUnordered): Self = StObject.set(x, "upsert", js.Any.fromFunction0(value))
  }
}
