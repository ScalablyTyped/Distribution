package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/SearchBox/SearchBox.types.ISearchBoxProps, 'disableAnimation' | 'clearButtonProps'> */
@js.native
trait PickISearchBoxPropsdisabl extends StObject {
  
  var clearButtonProps: js.UndefOr[IButtonProps] = js.native
  
  var disableAnimation: js.UndefOr[Boolean] = js.native
}
object PickISearchBoxPropsdisabl {
  
  @scala.inline
  def apply(): PickISearchBoxPropsdisabl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickISearchBoxPropsdisabl]
  }
  
  @scala.inline
  implicit class PickISearchBoxPropsdisablMutableBuilder[Self <: PickISearchBoxPropsdisabl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearButtonProps(value: IButtonProps): Self = StObject.set(x, "clearButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearButtonPropsUndefined: Self = StObject.set(x, "clearButtonProps", js.undefined)
    
    @scala.inline
    def setDisableAnimation(value: Boolean): Self = StObject.set(x, "disableAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableAnimationUndefined: Self = StObject.set(x, "disableAnimation", js.undefined)
  }
}
