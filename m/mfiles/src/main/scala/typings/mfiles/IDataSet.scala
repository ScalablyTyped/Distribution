package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataSet extends StObject {
  
  def Clone(): IDataSet
  
  val ID: Double
  
  val Name: String
}
object IDataSet {
  
  @scala.inline
  def apply(Clone: () => IDataSet, ID: Double, Name: String): IDataSet = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataSet]
  }
  
  @scala.inline
  implicit class IDataSetMutableBuilder[Self <: IDataSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IDataSet): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
