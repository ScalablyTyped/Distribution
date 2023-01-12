package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Foo extends StObject {
  
  var foo: String
}
object Foo {
  
  inline def apply(foo: String): Foo = {
    val __obj = js.Dynamic.literal(foo = foo.asInstanceOf[js.Any])
    __obj.asInstanceOf[Foo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Foo] (val x: Self) extends AnyVal {
    
    inline def setFoo(value: String): Self = StObject.set(x, "foo", value.asInstanceOf[js.Any])
  }
}
