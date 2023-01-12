package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IKeyNamePair extends StObject {
  
  def Clone(): IKeyNamePair
  
  val Key: Double
  
  val Name: String
}
object IKeyNamePair {
  
  inline def apply(Clone: () => IKeyNamePair, Key: Double, Name: String): IKeyNamePair = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Key = Key.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyNamePair]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IKeyNamePair] (val x: Self) extends AnyVal {
    
    inline def setClone(value: () => IKeyNamePair): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setKey(value: Double): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
