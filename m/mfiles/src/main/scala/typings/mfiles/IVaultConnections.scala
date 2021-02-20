package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultConnections extends StObject {
  
  def Add(Index: Double, VaultConnection: IVaultConnection): Unit = js.native
  
  val Count: Double = js.native
  
  def GetVaultConnectionByName(VaultConnectionName: String): IVaultConnection = js.native
  
  def GetVaultConnectionIndexByName(VaultConnectionName: String): Double = js.native
  
  def Item(Index: Double): IVaultConnection = js.native
  
  def Remove(Index: Double): Unit = js.native
}
object IVaultConnections {
  
  @scala.inline
  def apply(
    Add: (Double, IVaultConnection) => Unit,
    Count: Double,
    GetVaultConnectionByName: String => IVaultConnection,
    GetVaultConnectionIndexByName: String => Double,
    Item: Double => IVaultConnection,
    Remove: Double => Unit
  ): IVaultConnections = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count.asInstanceOf[js.Any], GetVaultConnectionByName = js.Any.fromFunction1(GetVaultConnectionByName), GetVaultConnectionIndexByName = js.Any.fromFunction1(GetVaultConnectionIndexByName), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IVaultConnections]
  }
  
  @scala.inline
  implicit class IVaultConnectionsMutableBuilder[Self <: IVaultConnections] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, IVaultConnection) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetVaultConnectionByName(value: String => IVaultConnection): Self = StObject.set(x, "GetVaultConnectionByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVaultConnectionIndexByName(value: String => Double): Self = StObject.set(x, "GetVaultConnectionIndexByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: Double => IVaultConnection): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
