package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITraditionalFolder extends StObject {
  
  val ID: Double = js.native
  
  val Name: String = js.native
}
object ITraditionalFolder {
  
  @scala.inline
  def apply(ID: Double, Name: String): ITraditionalFolder = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITraditionalFolder]
  }
  
  @scala.inline
  implicit class ITraditionalFolderMutableBuilder[Self <: ITraditionalFolder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
