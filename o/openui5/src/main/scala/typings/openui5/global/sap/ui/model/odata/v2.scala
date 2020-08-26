package typings.openui5.global.sap.ui.model.odata

import typings.openui5.sap.ui.model.Context
import typings.openui5.sap.ui.model.Model
import typings.openui5.sap.ui.model.Sorter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.v2")
@js.native
object v2 extends js.Object {
  @js.native
  class ODataAnnotations ()
    extends typings.openui5.sap.ui.model.odata.v2.ODataAnnotations
  
  @js.native
  abstract class ODataContextBinding protected ()
    extends typings.openui5.sap.ui.model.odata.v2.ODataContextBinding {
    /**
      * Constructor for odata.ODataContextBinding
      * @param oModel undefined
      * @param sPath undefined
      * @param oContext undefined
      * @param mParameters a map which contains additional parameters for the binding.
      */
    def this(oModel: Model, sPath: String, oContext: js.Any) = this()
    def this(oModel: Model, sPath: String, oContext: js.Any, mParameters: js.Any) = this()
  }
  
  @js.native
  class ODataListBinding protected ()
    extends typings.openui5.sap.ui.model.odata.v2.ODataListBinding {
    def this(oModel: Model, sPath: String, oContext: Context) = this()
    def this(oModel: Model, sPath: String, oContext: Context, aSorters: js.Array[_]) = this()
    def this(
      oModel: Model,
      sPath: String,
      oContext: Context,
      aSorters: js.UndefOr[scala.Nothing],
      aFilters: js.Array[_]
    ) = this()
    def this(oModel: Model, sPath: String, oContext: Context, aSorters: js.Array[_], aFilters: js.Array[_]) = this()
    def this(
      oModel: Model,
      sPath: String,
      oContext: Context,
      aSorters: js.UndefOr[scala.Nothing],
      aFilters: js.UndefOr[scala.Nothing],
      mParameters: js.Any
    ) = this()
    def this(
      oModel: Model,
      sPath: String,
      oContext: Context,
      aSorters: js.UndefOr[scala.Nothing],
      aFilters: js.Array[_],
      mParameters: js.Any
    ) = this()
    def this(
      oModel: Model,
      sPath: String,
      oContext: Context,
      aSorters: js.Array[_],
      aFilters: js.UndefOr[scala.Nothing],
      mParameters: js.Any
    ) = this()
    def this(
      oModel: Model,
      sPath: String,
      oContext: Context,
      aSorters: js.Array[_],
      aFilters: js.Array[_],
      mParameters: js.Any
    ) = this()
  }
  
  @js.native
  class ODataModel protected ()
    extends typings.openui5.sap.ui.model.odata.v2.ODataModel {
    /**
      * Constructor for a new ODataModel.
      * @param sServiceUrl base uri of the service to request data from; additional URL parameters appended
      * here will be appended to every request                                can be passed with the mParameters object as well:
      * [mParameters.serviceUrl] A serviceURl is required!
      * @param mParameters (optional) a map which contains the following parameter properties:
      */
    def this(sServiceUrl: String) = this()
    def this(sServiceUrl: String, mParameters: js.Any) = this()
  }
  
  @js.native
  class ODataTreeBinding protected ()
    extends typings.openui5.sap.ui.model.odata.v2.ODataTreeBinding {
    def this(oModel: Model, sPath: String, oContext: Context) = this()
    def this(
      oModel: Model,
      sPath: String,
      oContext: Context,
      aApplicationFilters: js.Array[typings.openui5.sap.ui.model.Filter]
    ) = this()
    def this(
      oModel: Model,
      sPath: String,
      oContext: Context,
      aApplicationFilters: js.UndefOr[scala.Nothing],
      mParameters: js.Any
    ) = this()
    def this(
      oModel: Model,
      sPath: String,
      oContext: Context,
      aApplicationFilters: js.Array[typings.openui5.sap.ui.model.Filter],
      mParameters: js.Any
    ) = this()
    def this(
      oModel: Model,
      sPath: String,
      oContext: Context,
      aApplicationFilters: js.UndefOr[scala.Nothing],
      mParameters: js.UndefOr[scala.Nothing],
      aSorters: js.Array[Sorter]
    ) = this()
    def this(
      oModel: Model,
      sPath: String,
      oContext: Context,
      aApplicationFilters: js.UndefOr[scala.Nothing],
      mParameters: js.Any,
      aSorters: js.Array[Sorter]
    ) = this()
    def this(
      oModel: Model,
      sPath: String,
      oContext: Context,
      aApplicationFilters: js.Array[typings.openui5.sap.ui.model.Filter],
      mParameters: js.UndefOr[scala.Nothing],
      aSorters: js.Array[Sorter]
    ) = this()
    def this(
      oModel: Model,
      sPath: String,
      oContext: Context,
      aApplicationFilters: js.Array[typings.openui5.sap.ui.model.Filter],
      mParameters: js.Any,
      aSorters: js.Array[Sorter]
    ) = this()
  }
  
  @js.native
  object ODataAnnotations extends js.Object {
    @js.native
    class constructor protected ()
      extends typings.openui5.sap.ui.model.odata.v2.ODataAnnotations.constructor {
      /**
        * Creates a new instance of the ODataAnnotations annotation loader.
        * @param oMetadata Metadata object with the metadata information needed to parse the annotations
        * @param mOptions Obligatory options
        */
      def this(oMetadata: typings.openui5.sap.ui.model.odata.ODataMetadata, mOptions: js.Any) = this()
    }
    
  }
  
}

