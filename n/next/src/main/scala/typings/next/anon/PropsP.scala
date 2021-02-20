package typings.next.anon

import typings.next.mod.GetServerSidePropsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsP[P] extends GetServerSidePropsResult[P] {
  
  var props: P = js.native
}
object PropsP {
  
  @scala.inline
  def apply[P](props: P): PropsP[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsP[P]]
  }
  
  @scala.inline
  implicit class PropsPMutableBuilder[Self <: PropsP[_], P] (val x: Self with PropsP[P]) extends AnyVal {
    
    @scala.inline
    def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
