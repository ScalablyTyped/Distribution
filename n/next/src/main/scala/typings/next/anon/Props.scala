package typings.next.anon

import typings.next.typesMod.GetServerSidePropsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Props[P]
  extends StObject
     with GetServerSidePropsResult[P] {
  
  var props: P | js.Promise[P]
}
object Props {
  
  inline def apply[P](props: P | js.Promise[P]): Props[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[P]]
  }
  
  extension [Self <: Props[?], P](x: Self & Props[P]) {
    
    inline def setProps(value: P | js.Promise[P]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
