package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Shown extends StObject {
  
  /**
    * When shown is true, it indicates the permission guide
    * pop-up will be shown; when it is false, it indicates
    * the user has allowed the permission.
    */
  var shown: Boolean = js.native
}
object Shown {
  
  @scala.inline
  def apply(shown: Boolean): Shown = {
    val __obj = js.Dynamic.literal(shown = shown.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shown]
  }
  
  @scala.inline
  implicit class ShownMutableBuilder[Self <: Shown] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShown(value: Boolean): Self = StObject.set(x, "shown", value.asInstanceOf[js.Any])
  }
}
