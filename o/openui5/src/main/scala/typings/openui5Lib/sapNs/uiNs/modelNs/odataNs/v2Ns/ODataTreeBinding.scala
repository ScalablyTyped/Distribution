package typings
package openui5Lib.sapNs.uiNs.modelNs.odataNs.v2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.v2.ODataTreeBinding")
@js.native
class ODataTreeBinding protected ()
  extends openui5Lib.sapNs.uiNs.modelNs.TreeBinding {
  def this(oModel: openui5Lib.sapNs.uiNs.modelNs.Model, sPath: java.lang.String, oContext: openui5Lib.sapNs.uiNs.modelNs.Context) = this()
  def this(oModel: openui5Lib.sapNs.uiNs.modelNs.Model, sPath: java.lang.String, oContext: openui5Lib.sapNs.uiNs.modelNs.Context, aApplicationFilters: js.Array[openui5Lib.sapNs.uiNs.modelNs.Filter]) = this()
  def this(oModel: openui5Lib.sapNs.uiNs.modelNs.Model, sPath: java.lang.String, oContext: openui5Lib.sapNs.uiNs.modelNs.Context, aApplicationFilters: js.Array[openui5Lib.sapNs.uiNs.modelNs.Filter], mParameters: js.Any) = this()
  def this(oModel: openui5Lib.sapNs.uiNs.modelNs.Model, sPath: java.lang.String, oContext: openui5Lib.sapNs.uiNs.modelNs.Context, aApplicationFilters: js.Array[openui5Lib.sapNs.uiNs.modelNs.Filter], mParameters: js.Any, aSorters: js.Array[openui5Lib.sapNs.uiNs.modelNs.Sorter]) = this()
  def filter(aFilters: openui5Lib.sapNs.uiNs.modelNs.Filter, sFilterType: openui5Lib.Anon_Application): ODataTreeBinding = js.native
  /**
    * Get a download URL with the specified format considering thesort/filter/custom parameters.
    * @since 1.28
    * @param sFormat Value for the $format Parameter
    * @returns URL which can be used for downloading
    */
  def getDownloadUrl(sFormat: java.lang.String): java.lang.String = js.native
  /**
    * Returns root contexts for the tree. You can specify the start index and the length for paging
    * requests.This function is not available when the annotation "hierarchy-node-descendant-count-for" is
    * exposed on the service.
    * @param iStartIndex the start index of the requested contexts
    * @param iLength the requested amount of contexts. If none given, the default value is the size limit
    * of the underlying												 sap.ui.model.odata.v2.ODataModel instance.
    * @param iThreshold the number of entities which should be retrieved in addition to the given length.	
    * 		  A higher threshold reduces the number of backend requests, yet these request blow up in size,
    * since more data is loaded.
    * @returns an array containing the contexts for the entities returned by the backend, might be fewer
    * than requested								  if the backend does not have enough data.
    */
  def getRootContexts(iStartIndex: scala.Double): js.Array[openui5Lib.sapNs.uiNs.modelNs.Context] = js.native
  def getRootContexts(iStartIndex: scala.Double, iLength: scala.Double, iThreshold: scala.Double): js.Array[openui5Lib.sapNs.uiNs.modelNs.Context] = js.native
  /**
    * Returns the rootLevel
    */
  def getRootLevel(): scala.Double = js.native
  def refresh(bForceUpdate: scala.Boolean, sGroupId: java.lang.String): scala.Unit = js.native
  /**
    * Sets the rootLevelThe root level is the level of the topmost tree nodes, which will be used as an
    * entry point for OData services.This is only possible (and necessary) for OData services implementing
    * the hierarchy annotation specification,or when providing the annotation information locally as a
    * binding parameter. See the constructor for API documentation on this.
    * @param iRootLevel undefined
    */
  def setRootLevel(iRootLevel: scala.Double): scala.Unit = js.native
}

