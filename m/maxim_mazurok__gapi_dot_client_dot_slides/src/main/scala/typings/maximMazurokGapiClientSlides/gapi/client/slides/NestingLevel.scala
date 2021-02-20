package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NestingLevel extends StObject {
  
  /** The style of a bullet at this level of nesting. */
  var bulletStyle: js.UndefOr[TextStyle] = js.native
}
object NestingLevel {
  
  @scala.inline
  def apply(): NestingLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NestingLevel]
  }
  
  @scala.inline
  implicit class NestingLevelMutableBuilder[Self <: NestingLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBulletStyle(value: TextStyle): Self = StObject.set(x, "bulletStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulletStyleUndefined: Self = StObject.set(x, "bulletStyle", js.undefined)
  }
}
