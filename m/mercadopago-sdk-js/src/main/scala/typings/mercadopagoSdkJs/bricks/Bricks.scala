package typings.mercadopagoSdkJs.bricks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bricks extends StObject {
  
  def create[BrickType /* <: BrickTypes */](brick: BrickType, containerId: String, settings: BrickSettings[BrickType]): js.Promise[BrickController]
  
  def isInitialized(): Boolean
}
object Bricks {
  
  inline def apply(
    create: (Any, String, BrickSettings[Any]) => js.Promise[BrickController],
    isInitialized: () => Boolean
  ): Bricks = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction3(create), isInitialized = js.Any.fromFunction0(isInitialized))
    __obj.asInstanceOf[Bricks]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bricks] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: (Any, String, BrickSettings[Any]) => js.Promise[BrickController]): Self = StObject.set(x, "create", js.Any.fromFunction3(value))
    
    inline def setIsInitialized(value: () => Boolean): Self = StObject.set(x, "isInitialized", js.Any.fromFunction0(value))
  }
}
