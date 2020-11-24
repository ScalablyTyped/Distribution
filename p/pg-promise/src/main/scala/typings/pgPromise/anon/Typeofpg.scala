package typings.pgPromise.anon

import org.scalablytyped.runtime.Instantiable1
import typings.pgPromise.pgSubsetMod.IClient
import typings.pgPromise.pgSubsetMod.IConnectionParameters
import typings.pgPromise.pgSubsetMod.IDefaults
import typings.pgPromise.pgSubsetMod.ITypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpg extends js.Object {
  
  val Client: Instantiable1[/* config */ String | IConnectionParameters[IClient], IClient] = js.native
  
  val defaults: IDefaults = js.native
  
  val types: ITypes = js.native
}
object Typeofpg {
  
  @scala.inline
  def apply(
    Client: Instantiable1[/* config */ String | IConnectionParameters[IClient], IClient],
    defaults: IDefaults,
    types: ITypes
  ): Typeofpg = {
    val __obj = js.Dynamic.literal(Client = Client.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofpg]
  }
  
  @scala.inline
  implicit class TypeofpgOps[Self <: Typeofpg] (val x: Self) extends AnyVal {
    
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
    def setClient(value: Instantiable1[/* config */ String | IConnectionParameters[IClient], IClient]): Self = this.set("Client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaults(value: IDefaults): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: ITypes): Self = this.set("types", value.asInstanceOf[js.Any])
  }
}
