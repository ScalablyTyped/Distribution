package typings.openui5.global.sap.ui.model

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.model.Binding")
@js.native
abstract class Binding protected ()
  extends typings.openui5.sap.ui.model.Binding {
  /**
    * Constructor for Binding class.
    * @param oModel the model
    * @param sPath the path
    * @param oContext the context object
    * @param mParameters undefined
    */
  def this(
    oModel: typings.openui5.sap.ui.model.Model,
    sPath: String,
    oContext: typings.openui5.sap.ui.model.Context
  ) = this()
  def this(
    oModel: typings.openui5.sap.ui.model.Model,
    sPath: String,
    oContext: typings.openui5.sap.ui.model.Context,
    mParameters: js.Any
  ) = this()
}
