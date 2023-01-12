package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.libComponentsButtonButtonDottypesMod.IButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/SearchBox/SearchBox.types.ISearchBoxProps, 'disableAnimation' | 'clearButtonProps'> */
trait PickISearchBoxPropsdisabl extends StObject {
  
  var clearButtonProps: js.UndefOr[IButtonProps] = js.undefined
  
  var disableAnimation: js.UndefOr[Boolean] = js.undefined
}
object PickISearchBoxPropsdisabl {
  
  inline def apply(): PickISearchBoxPropsdisabl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickISearchBoxPropsdisabl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickISearchBoxPropsdisabl] (val x: Self) extends AnyVal {
    
    inline def setClearButtonProps(value: IButtonProps): Self = StObject.set(x, "clearButtonProps", value.asInstanceOf[js.Any])
    
    inline def setClearButtonPropsUndefined: Self = StObject.set(x, "clearButtonProps", js.undefined)
    
    inline def setDisableAnimation(value: Boolean): Self = StObject.set(x, "disableAnimation", value.asInstanceOf[js.Any])
    
    inline def setDisableAnimationUndefined: Self = StObject.set(x, "disableAnimation", js.undefined)
  }
}
