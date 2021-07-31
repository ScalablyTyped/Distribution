package typings.microsoftLiveConnect.Microsoft.Live

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Convenience interface for when you have a bunch of objects of different
  * types in a single collection. You discriminate between them using their
  * 'type' field.
  */
trait IObject extends StObject {
  
  /**
    * The object's type.
    */
  var `type`: String
}
object IObject {
  
  @scala.inline
  def apply(`type`: String): IObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObject]
  }
  
  @scala.inline
  implicit class IObjectMutableBuilder[Self <: IObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
