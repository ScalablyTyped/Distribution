package typings.officeUiFabricReact

import typings.officeUiFabricReact.searchBoxTypesMod.ISearchBoxStyleProps
import typings.officeUiFabricReact.searchBoxTypesMod.ISearchBoxStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchBoxStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/SearchBox/SearchBox.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: ISearchBoxStyleProps): ISearchBoxStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[ISearchBoxStyles]
}
