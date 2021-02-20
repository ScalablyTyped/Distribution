package typings.next.anon

import typings.next.mod.GetStaticPropsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props[P] extends GetStaticPropsResult[P] {
  
  var props: P = js.native
  
  var revalidate: js.UndefOr[Double | Boolean] = js.native
}
object Props {
  
  @scala.inline
  def apply[P](props: P): Props[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[P]]
  }
  
  @scala.inline
  implicit class PropsMutableBuilder[Self <: Props[_], P] (val x: Self with Props[P]) extends AnyVal {
    
    @scala.inline
    def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevalidate(value: Double | Boolean): Self = StObject.set(x, "revalidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevalidateUndefined: Self = StObject.set(x, "revalidate", js.undefined)
  }
}
