package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITraditionalFolder extends StObject {
  
  val ID: Double
  
  val Name: String
}
object ITraditionalFolder {
  
  inline def apply(ID: Double, Name: String): ITraditionalFolder = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITraditionalFolder]
  }
  
  extension [Self <: ITraditionalFolder](x: Self) {
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
