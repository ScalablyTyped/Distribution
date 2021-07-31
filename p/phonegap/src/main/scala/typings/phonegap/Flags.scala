package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flags extends StObject {
  
  var create: Boolean
  
  var exclusive: js.UndefOr[Boolean] = js.undefined
}
object Flags {
  
  @scala.inline
  def apply(create: Boolean): Flags = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flags]
  }
  
  @scala.inline
  implicit class FlagsMutableBuilder[Self <: Flags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreate(value: Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
  }
}
