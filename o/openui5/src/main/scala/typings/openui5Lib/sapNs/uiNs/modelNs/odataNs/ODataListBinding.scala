package typings
package openui5Lib.sapNs.uiNs.modelNs.odataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.ODataListBinding")
@js.native
class ODataListBinding protected ()
  extends openui5Lib.sapNs.uiNs.modelNs.ListBinding {
  def this(oModel: openui5Lib.sapNs.uiNs.modelNs.Model, sPath: java.lang.String, oContext: openui5Lib.sapNs.uiNs.modelNs.Context) = this()
  def this(oModel: openui5Lib.sapNs.uiNs.modelNs.Model, sPath: java.lang.String, oContext: openui5Lib.sapNs.uiNs.modelNs.Context, aSorters: js.Array[_]) = this()
  def this(oModel: openui5Lib.sapNs.uiNs.modelNs.Model, sPath: java.lang.String, oContext: openui5Lib.sapNs.uiNs.modelNs.Context, aSorters: js.Array[_], aFilters: js.Array[_]) = this()
  def this(oModel: openui5Lib.sapNs.uiNs.modelNs.Model, sPath: java.lang.String, oContext: openui5Lib.sapNs.uiNs.modelNs.Context, aSorters: js.Array[_], aFilters: js.Array[_], mParameters: js.Any) = this()
  def getContexts(iStartIndex: scala.Double, iLength: scala.Double, iThreshold: scala.Double): js.Array[openui5Lib.sapNs.uiNs.modelNs.Context] = js.native
  /**
    * Get a download URL with the specified format considering thesort/filter/custom parameters.
    * @since 1.24
    * @param sFormat Value for the $format Parameter
    * @returns URL which can be used for downloading
    */
  def getDownloadUrl(sFormat: java.lang.String): java.lang.String = js.native
}

