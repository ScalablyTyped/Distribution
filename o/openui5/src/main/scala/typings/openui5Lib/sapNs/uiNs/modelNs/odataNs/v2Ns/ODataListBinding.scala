package typings
package openui5Lib.sapNs.uiNs.modelNs.odataNs.v2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.v2.ODataListBinding")
@js.native
class ODataListBinding protected ()
  extends openui5Lib.sapNs.uiNs.modelNs.ListBinding {
  def this(oModel: openui5Lib.sapNs.uiNs.modelNs.Model, sPath: java.lang.String, oContext: openui5Lib.sapNs.uiNs.modelNs.Context) = this()
  def this(oModel: openui5Lib.sapNs.uiNs.modelNs.Model, sPath: java.lang.String, oContext: openui5Lib.sapNs.uiNs.modelNs.Context, aSorters: js.Array[_]) = this()
  def this(oModel: openui5Lib.sapNs.uiNs.modelNs.Model, sPath: java.lang.String, oContext: openui5Lib.sapNs.uiNs.modelNs.Context, aSorters: js.Array[_], aFilters: js.Array[_]) = this()
  def this(oModel: openui5Lib.sapNs.uiNs.modelNs.Model, sPath: java.lang.String, oContext: openui5Lib.sapNs.uiNs.modelNs.Context, aSorters: js.Array[_], aFilters: js.Array[_], mParameters: js.Any) = this()
  /**
               * Return contexts for the list
               * @param iStartIndex the start index of the requested contexts
               * @param iLength the requested amount of contexts
               * @param iThreshold The threshold value
               * @returns the array of contexts for each row of the bound list
              */
  def getContexts(iStartIndex: scala.Double, iLength: scala.Double, iThreshold: scala.Double): js.Array[openui5Lib.sapNs.uiNs.modelNs.Context] = js.native
  /**
               * Get a download URL with the specified format considering thesort/filter/custom parameters.
               * @since 1.24
               * @param sFormat Value for the $format Parameter
               * @returns URL which can be used for downloading
              */
  def getDownloadUrl(sFormat: java.lang.String): java.lang.String = js.native
  /**
               * Refreshes the binding, check whether the model data has been changed and fire change eventif this is
               * the case. For server side models this should refetch the data from the server.To update a control,
               * even if no data has been changed, e.g. to reset a control after failedvalidation, please use the
               * parameter bForceUpdate.
               * @param bForceUpdate Update the bound control even if no data has been changed
               * @param sGroupId The group Id for the refresh
              */
  def refresh(bForceUpdate: scala.Boolean, sGroupId: java.lang.String): scala.Unit = js.native
}

