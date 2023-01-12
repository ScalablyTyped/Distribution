package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `30` extends StObject {
  
  /**
    * The name of a target which loads a component. This target is used in the Route which is specified by
    * `sName`.
    */
  var anyName: js.UndefOr[ComponentTargetInfo] = js.undefined
}
object `30` {
  
  inline def apply(): `30` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`30`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `30`] (val x: Self) extends AnyVal {
    
    inline def setAnyName(value: ComponentTargetInfo): Self = StObject.set(x, "anyName", value.asInstanceOf[js.Any])
    
    inline def setAnyNameUndefined: Self = StObject.set(x, "anyName", js.undefined)
  }
}
