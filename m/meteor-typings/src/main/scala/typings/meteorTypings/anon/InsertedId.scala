package typings.meteorTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsertedId extends StObject {
  
  var insertedId: js.UndefOr[String] = js.undefined
  
  var numberAffected: js.UndefOr[Double] = js.undefined
}
object InsertedId {
  
  @scala.inline
  def apply(): InsertedId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InsertedId]
  }
  
  @scala.inline
  implicit class InsertedIdMutableBuilder[Self <: InsertedId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInsertedId(value: String): Self = StObject.set(x, "insertedId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertedIdUndefined: Self = StObject.set(x, "insertedId", js.undefined)
    
    @scala.inline
    def setNumberAffected(value: Double): Self = StObject.set(x, "numberAffected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberAffectedUndefined: Self = StObject.set(x, "numberAffected", js.undefined)
  }
}
