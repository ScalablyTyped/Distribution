package typings.next.anon

import typings.next.mod.GetServerSidePropsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropsP[P]
  extends StObject
     with GetServerSidePropsResult[P] {
  
  var props: P
}
object PropsP {
  
  @scala.inline
  def apply[P](props: P): PropsP[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsP[P]]
  }
  
  @scala.inline
  implicit class PropsPMutableBuilder[Self <: PropsP[?], P] (val x: Self & PropsP[P]) extends AnyVal {
    
    @scala.inline
    def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
