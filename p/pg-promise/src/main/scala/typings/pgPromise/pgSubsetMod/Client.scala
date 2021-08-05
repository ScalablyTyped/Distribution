package typings.pgPromise.pgSubsetMod

import org.scalablytyped.runtime.Instantiable1
import typings.pgPromise.pgSubsetMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("pg-promise/typescript/pg-subset", "Client")
@js.native
class Client protected () extends IClient {
  def this(config: String) = this()
  def this(config: IConnectionParameters[IClient]) = this()
}
object Client {
  
  inline def apply: Instantiable1[/* config */ String | IConnectionParameters[IClient], IClient] = ^.asInstanceOf[js.Dynamic].selectDynamic("Client").asInstanceOf[Instantiable1[/* config */ String | IConnectionParameters[IClient], IClient]]
}
