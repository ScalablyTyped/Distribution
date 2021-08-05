package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.PickISearchBoxPropsdisabl
import typings.officeUiFabricReact.searchBoxTypesMod.ISearchBoxProps
import typings.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchBoxMod {
  
  @JSImport("office-ui-fabric-react/lib/components/SearchBox", "SearchBox")
  @js.native
  val SearchBox: FunctionComponent[ISearchBoxProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/SearchBox", "SearchBoxBase")
  @js.native
  class SearchBoxBase protected ()
    extends typings.officeUiFabricReact.searchBoxBaseMod.SearchBoxBase {
    def this(props: ISearchBoxProps) = this()
  }
  /* static members */
  object SearchBoxBase {
    
    @JSImport("office-ui-fabric-react/lib/components/SearchBox", "SearchBoxBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/SearchBox", "SearchBoxBase.defaultProps")
    @js.native
    def defaultProps: PickISearchBoxPropsdisabl = js.native
    inline def defaultProps_=(x: PickISearchBoxPropsdisabl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
