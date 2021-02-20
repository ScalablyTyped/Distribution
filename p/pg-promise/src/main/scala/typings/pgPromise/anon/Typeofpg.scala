package typings.pgPromise.anon

import org.scalablytyped.runtime.Instantiable1
import typings.pgPromise.pgSubsetMod.IClient
import typings.pgPromise.pgSubsetMod.IConnectionParameters
import typings.pgPromise.pgSubsetMod.IDefaults
import typings.pgPromise.pgSubsetMod.ITypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofpg extends StObject {
  
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
  implicit class TypeofpgMutableBuilder[Self <: Typeofpg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClient(value: Instantiable1[/* config */ String | IConnectionParameters[IClient], IClient]): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaults(value: IDefaults): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypes(value: ITypes): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
  }
}
