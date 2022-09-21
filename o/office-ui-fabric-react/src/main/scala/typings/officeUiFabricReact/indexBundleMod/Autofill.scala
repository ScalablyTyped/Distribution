package typings.officeUiFabricReact.indexBundleMod

import typings.officeUiFabricReact.anon.EnableAutofillOnKeyPress
import typings.officeUiFabricReact.autofillTypesMod.IAutofillProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/index.bundle", "Autofill")
@js.native
open class Autofill protected ()
  extends typings.officeUiFabricReact.mod.Autofill {
  def this(props: IAutofillProps) = this()
}
/* static members */
object Autofill {
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "Autofill")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("office-ui-fabric-react/lib/index.bundle", "Autofill.defaultProps")
  @js.native
  def defaultProps: EnableAutofillOnKeyPress = js.native
  inline def defaultProps_=(x: EnableAutofillOnKeyPress): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
}
