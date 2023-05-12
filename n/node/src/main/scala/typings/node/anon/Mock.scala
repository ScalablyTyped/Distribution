package typings.node.anon

import typings.node.nodeColontestMod.MockFunctionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mock[F /* <: js.Function */] extends StObject {
  
  var mock: MockFunctionContext[F]
}
object Mock {
  
  inline def apply[F /* <: js.Function */](mock: MockFunctionContext[F]): Mock[F] = {
    val __obj = js.Dynamic.literal(mock = mock.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mock[F]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mock[?], F /* <: js.Function */] (val x: Self & Mock[F]) extends AnyVal {
    
    inline def setMock(value: MockFunctionContext[F]): Self = StObject.set(x, "mock", value.asInstanceOf[js.Any])
  }
}
