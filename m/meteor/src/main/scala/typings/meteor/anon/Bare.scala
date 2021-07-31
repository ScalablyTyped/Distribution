package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bare extends StObject {
  
  var bare: js.UndefOr[Boolean] = js.undefined
}
object Bare {
  
  @scala.inline
  def apply(): Bare = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bare]
  }
  
  @scala.inline
  implicit class BareMutableBuilder[Self <: Bare] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBare(value: Boolean): Self = StObject.set(x, "bare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBareUndefined: Self = StObject.set(x, "bare", js.undefined)
  }
}
