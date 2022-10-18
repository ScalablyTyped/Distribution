package typings.next.anon

import typings.next.typesMod.GetStaticPropsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsRevalidate[P]
  extends StObject
     with GetStaticPropsResult[P] {
  
  var props: P
  
  var revalidate: js.UndefOr[Double | Boolean] = js.undefined
}
object PropsRevalidate {
  
  inline def apply[P](props: P): PropsRevalidate[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsRevalidate[P]]
  }
  
  extension [Self <: PropsRevalidate[?], P](x: Self & PropsRevalidate[P]) {
    
    inline def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setRevalidate(value: Double | Boolean): Self = StObject.set(x, "revalidate", value.asInstanceOf[js.Any])
    
    inline def setRevalidateUndefined: Self = StObject.set(x, "revalidate", js.undefined)
  }
}
