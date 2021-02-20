package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IKeyNamePair extends StObject {
  
  def Clone(): IKeyNamePair = js.native
  
  val Key: Double = js.native
  
  val Name: String = js.native
}
object IKeyNamePair {
  
  @scala.inline
  def apply(Clone: () => IKeyNamePair, Key: Double, Name: String): IKeyNamePair = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Key = Key.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyNamePair]
  }
  
  @scala.inline
  implicit class IKeyNamePairMutableBuilder[Self <: IKeyNamePair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IKeyNamePair): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setKey(value: Double): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
