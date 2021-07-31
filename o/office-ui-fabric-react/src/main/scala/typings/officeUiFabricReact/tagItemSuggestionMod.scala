package typings.officeUiFabricReact

import typings.officeUiFabricReact.tagPickerTypesMod.ITagItemSuggestionProps
import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagItemSuggestionMod {
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/TagPicker/TagItemSuggestion", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/TagPicker/TagItemSuggestion", "TagItemSuggestion")
  @js.native
  val TagItemSuggestion: FunctionComponent[ITagItemSuggestionProps] = js.native
  
  @scala.inline
  def TagItemSuggestionBase(props: ITagItemSuggestionProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TagItemSuggestionBase")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
