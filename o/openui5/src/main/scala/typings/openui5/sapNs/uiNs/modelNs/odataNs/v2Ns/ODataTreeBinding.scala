package typings.openui5.sapNs.uiNs.modelNs.odataNs.v2Ns

import typings.openui5.TypeofFilterType
import typings.openui5.sapNs.uiNs.modelNs.Context
import typings.openui5.sapNs.uiNs.modelNs.Model
import typings.openui5.sapNs.uiNs.modelNs.Sorter
import typings.openui5.sapNs.uiNs.modelNs.TreeBinding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.v2.ODataTreeBinding")
@js.native
class ODataTreeBinding protected () extends TreeBinding {
  def this(oModel: Model, sPath: String, oContext: Context) = this()
  def this(
    oModel: Model,
    sPath: String,
    oContext: Context,
    aApplicationFilters: js.Array[typings.openui5.sapNs.uiNs.modelNs.Filter]
  ) = this()
  def this(
    oModel: Model,
    sPath: String,
    oContext: Context,
    aApplicationFilters: js.Array[typings.openui5.sapNs.uiNs.modelNs.Filter],
    mParameters: js.Any
  ) = this()
  def this(
    oModel: Model,
    sPath: String,
    oContext: Context,
    aApplicationFilters: js.Array[typings.openui5.sapNs.uiNs.modelNs.Filter],
    mParameters: js.Any,
    aSorters: js.Array[Sorter]
  ) = this()
  def filter(aFilters: typings.openui5.sapNs.uiNs.modelNs.Filter, sFilterType: TypeofFilterType): ODataTreeBinding = js.native
  /**
    * Get a download URL with the specified format considering thesort/filter/custom parameters.
    * @since 1.28
    * @param sFormat Value for the $format Parameter
    * @returns URL which can be used for downloading
    */
  def getDownloadUrl(sFormat: String): String = js.native
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
  def getRootContexts(iStartIndex: Double): js.Array[Context] = js.native
  def getRootContexts(iStartIndex: Double, iLength: Double, iThreshold: Double): js.Array[Context] = js.native
  /**
    * Returns the rootLevel
    */
  def getRootLevel(): Double = js.native
  def refresh(bForceUpdate: Boolean, sGroupId: String): Unit = js.native
  /**
    * Sets the rootLevelThe root level is the level of the topmost tree nodes, which will be used as an
    * entry point for OData services.This is only possible (and necessary) for OData services implementing
    * the hierarchy annotation specification,or when providing the annotation information locally as a
    * binding parameter. See the constructor for API documentation on this.
    * @param iRootLevel undefined
    */
  def setRootLevel(iRootLevel: Double): Unit = js.native
}

