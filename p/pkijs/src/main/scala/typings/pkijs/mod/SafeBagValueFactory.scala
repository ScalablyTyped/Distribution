package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pkijs", "SafeBagValueFactory")
@js.native
open class SafeBagValueFactory () extends StObject
object SafeBagValueFactory {
  
  @JSImport("pkijs", "SafeBagValueFactory")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def find(id: String): BagTypeConstructor[BagType] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("find")(id.asInstanceOf[js.Any]).asInstanceOf[BagTypeConstructor[BagType] | Null]
  
  /* static member */
  @JSImport("pkijs", "SafeBagValueFactory.getItems")
  @js.native
  def getItems: Any = js.native
  inline def getItems_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getItems")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("pkijs", "SafeBagValueFactory.items")
  @js.native
  def items: Any = js.native
  inline def items_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("items")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def register[T /* <: BagType */](id: String, `type`: BagTypeConstructor[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(id.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
