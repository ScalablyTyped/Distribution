package typings.officeUiFabricReact

import typings.officeUiFabricReact.anon.RequiredPickIShimmeredDet
import typings.officeUiFabricReact.shimmeredDetailsListTypesMod.IShimmeredDetailsListStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shimmeredDetailsListStylesMod {
  
  @JSImport("office-ui-fabric-react/lib/components/DetailsList/ShimmeredDetailsList.styles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getStyles(props: RequiredPickIShimmeredDet): IShimmeredDetailsListStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("getStyles")(props.asInstanceOf[js.Any]).asInstanceOf[IShimmeredDetailsListStyles]
}
