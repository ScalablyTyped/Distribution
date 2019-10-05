package typings.openui5.sap.ui.model.odata

import typings.openui5.sap.ui.model.Context
import typings.openui5.sap.ui.model.ListBinding
import typings.openui5.sap.ui.model.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.ODataListBinding")
@js.native
class ODataListBinding protected () extends ListBinding {
  def this(oModel: Model, sPath: String, oContext: Context) = this()
  def this(oModel: Model, sPath: String, oContext: Context, aSorters: js.Array[_]) = this()
  def this(oModel: Model, sPath: String, oContext: Context, aSorters: js.Array[_], aFilters: js.Array[_]) = this()
  def this(
    oModel: Model,
    sPath: String,
    oContext: Context,
    aSorters: js.Array[_],
    aFilters: js.Array[_],
    mParameters: js.Any
  ) = this()
  def getContexts(iStartIndex: Double, iLength: Double, iThreshold: Double): js.Array[Context] = js.native
  /**
    * Get a download URL with the specified format considering thesort/filter/custom parameters.
    * @since 1.24
    * @param sFormat Value for the $format Parameter
    * @returns URL which can be used for downloading
    */
  def getDownloadUrl(sFormat: String): String = js.native
}

