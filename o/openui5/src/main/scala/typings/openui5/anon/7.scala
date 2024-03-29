package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  /**
    * The name of a target which loads a component. This target is used in the Route which is specified by
    * `sName`.
    */
  var anyName: js.UndefOr[ComponentTargetInfo] = js.undefined
}
object `7` {
  
  inline def apply(): `7` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`7`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `7`] (val x: Self) extends AnyVal {
    
    inline def setAnyName(value: ComponentTargetInfo): Self = StObject.set(x, "anyName", value.asInstanceOf[js.Any])
    
    inline def setAnyNameUndefined: Self = StObject.set(x, "anyName", js.undefined)
  }
}
