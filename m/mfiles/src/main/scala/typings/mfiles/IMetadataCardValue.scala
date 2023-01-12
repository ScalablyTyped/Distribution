package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMetadataCardValue extends StObject {
  
  val HasIcon: Boolean
  
  val ID: String
  
  val IconURL: String
  
  def IsDeleted(): Boolean
  
  def IsHidden(): Boolean
  
  val IsMultiValue: Boolean
  
  val Item: Double
  
  val Name: String
  
  val State: Any
  
  val Version: Double
}
object IMetadataCardValue {
  
  inline def apply(
    HasIcon: Boolean,
    ID: String,
    IconURL: String,
    IsDeleted: () => Boolean,
    IsHidden: () => Boolean,
    IsMultiValue: Boolean,
    Item: Double,
    Name: String,
    State: Any,
    Version: Double
  ): IMetadataCardValue = {
    val __obj = js.Dynamic.literal(HasIcon = HasIcon.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], IconURL = IconURL.asInstanceOf[js.Any], IsDeleted = js.Any.fromFunction0(IsDeleted), IsHidden = js.Any.fromFunction0(IsHidden), IsMultiValue = IsMultiValue.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMetadataCardValue] (val x: Self) extends AnyVal {
    
    inline def setHasIcon(value: Boolean): Self = StObject.set(x, "HasIcon", value.asInstanceOf[js.Any])
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setIconURL(value: String): Self = StObject.set(x, "IconURL", value.asInstanceOf[js.Any])
    
    inline def setIsDeleted(value: () => Boolean): Self = StObject.set(x, "IsDeleted", js.Any.fromFunction0(value))
    
    inline def setIsHidden(value: () => Boolean): Self = StObject.set(x, "IsHidden", js.Any.fromFunction0(value))
    
    inline def setIsMultiValue(value: Boolean): Self = StObject.set(x, "IsMultiValue", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setState(value: Any): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
  }
}
