package typings.officeUiFabricReact

import typings.officeUiFabricReact.suggestionsTypesMod.ISuggestionsStyleProps
import typings.officeUiFabricReact.suggestionsTypesMod.ISuggestionsStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object suggestionsStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/pickers/Suggestions/Suggestions.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStyles(props: ISuggestionsStyleProps): ISuggestionsStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ISuggestionsStyles]
}
