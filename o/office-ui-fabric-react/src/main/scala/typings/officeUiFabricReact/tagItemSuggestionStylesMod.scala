package typings.officeUiFabricReact

import typings.officeUiFabricReact.tagPickerTypesMod.ITagItemSuggestionStyleProps
import typings.officeUiFabricReact.tagPickerTypesMod.ITagItemSuggestionStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagItemSuggestionStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/TagPicker/TagItemSuggestion.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: ITagItemSuggestionStyleProps): ITagItemSuggestionStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ITagItemSuggestionStyles]
}
