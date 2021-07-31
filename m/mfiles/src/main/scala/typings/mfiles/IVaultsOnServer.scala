package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultsOnServer extends StObject {
  
  val Count: Double
  
  def GetVaultByGUID(GUID: String): IVaultOnServer
  
  def GetVaultByName(Name: String): IVaultOnServer
  
  def GetVaultIndexByGUID(GUID: String): Double
  
  def GetVaultIndexByName(Name: String): Double
  
  def Item(Index: Double): IVaultOnServer
}
object IVaultsOnServer {
  
  @scala.inline
  def apply(
    Count: Double,
    GetVaultByGUID: String => IVaultOnServer,
    GetVaultByName: String => IVaultOnServer,
    GetVaultIndexByGUID: String => Double,
    GetVaultIndexByName: String => Double,
    Item: Double => IVaultOnServer
  ): IVaultsOnServer = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], GetVaultByGUID = js.Any.fromFunction1(GetVaultByGUID), GetVaultByName = js.Any.fromFunction1(GetVaultByName), GetVaultIndexByGUID = js.Any.fromFunction1(GetVaultIndexByGUID), GetVaultIndexByName = js.Any.fromFunction1(GetVaultIndexByName), Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IVaultsOnServer]
  }
  
  @scala.inline
  implicit class IVaultsOnServerMutableBuilder[Self <: IVaultsOnServer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetVaultByGUID(value: String => IVaultOnServer): Self = StObject.set(x, "GetVaultByGUID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVaultByName(value: String => IVaultOnServer): Self = StObject.set(x, "GetVaultByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVaultIndexByGUID(value: String => Double): Self = StObject.set(x, "GetVaultIndexByGUID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVaultIndexByName(value: String => Double): Self = StObject.set(x, "GetVaultIndexByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: Double => IVaultOnServer): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
