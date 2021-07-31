package typings.officeUiFabricReact

import typings.officeUiFabricReact.tagPickerTypesMod.ITagItemStyleProps
import typings.officeUiFabricReact.tagPickerTypesMod.ITagItemStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagItemStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/TagPicker/TagItem.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: ITagItemStyleProps): ITagItemStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ITagItemStyles]
}
