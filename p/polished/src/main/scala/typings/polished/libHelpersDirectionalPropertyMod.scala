package typings.polished

import typings.polished.libTypesStyleMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelpersDirectionalPropertyMod {
  
  @JSImport("polished/lib/helpers/directionalProperty", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(property: String, values: (Null | Unit | String | Double)*): Styles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(scala.List(property.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Styles]
}
