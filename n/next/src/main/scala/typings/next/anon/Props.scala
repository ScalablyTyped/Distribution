package typings.next.anon

import typings.next.mod.GetStaticPropsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Props[P]
  extends StObject
     with GetStaticPropsResult[P] {
  
  var props: P
  
  var revalidate: js.UndefOr[Double | Boolean] = js.undefined
}
object Props {
  
  inline def apply[P](props: P): Props[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[P]]
  }
  
  extension [Self <: Props[?], P](x: Self & Props[P]) {
    
    inline def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setRevalidate(value: Double | Boolean): Self = StObject.set(x, "revalidate", value.asInstanceOf[js.Any])
    
    inline def setRevalidateUndefined: Self = StObject.set(x, "revalidate", js.undefined)
  }
}
