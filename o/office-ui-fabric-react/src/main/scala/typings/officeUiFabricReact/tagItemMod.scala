package typings.officeUiFabricReact

import typings.officeUiFabricReact.tagPickerTypesMod.ITagItemProps
import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagItemMod {
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/TagPicker/TagItem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/TagPicker/TagItem", "TagItem")
  @js.native
  val TagItem: FunctionComponent[ITagItemProps] = js.native
  
  @scala.inline
  def TagItemBase(props: ITagItemProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TagItemBase")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
