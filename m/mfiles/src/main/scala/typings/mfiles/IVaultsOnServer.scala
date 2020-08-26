package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultsOnServer extends js.Object {
  val Count: Double = js.native
  def GetVaultByGUID(GUID: String): IVaultOnServer = js.native
  def GetVaultByName(Name: String): IVaultOnServer = js.native
  def GetVaultIndexByGUID(GUID: String): Double = js.native
  def GetVaultIndexByName(Name: String): Double = js.native
  def Item(Index: Double): IVaultOnServer = js.native
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
  implicit class IVaultsOnServerOps[Self <: IVaultsOnServer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetVaultByGUID(value: String => IVaultOnServer): Self = this.set("GetVaultByGUID", js.Any.fromFunction1(value))
    @scala.inline
    def setGetVaultByName(value: String => IVaultOnServer): Self = this.set("GetVaultByName", js.Any.fromFunction1(value))
    @scala.inline
    def setGetVaultIndexByGUID(value: String => Double): Self = this.set("GetVaultIndexByGUID", js.Any.fromFunction1(value))
    @scala.inline
    def setGetVaultIndexByName(value: String => Double): Self = this.set("GetVaultIndexByName", js.Any.fromFunction1(value))
    @scala.inline
    def setItem(value: Double => IVaultOnServer): Self = this.set("Item", js.Any.fromFunction1(value))
  }
  
}

