package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataOperationModeMod {
  
  /**
    * Different modes for executing service operations (filtering, sorting)
    */
  @JSImport("sap/ui/model/odata/OperationMode", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[OperationMode & String] = js.native
    
    /* "Auto" */ val Auto: typings.openui5.sapUiModelOdataOperationModeMod.OperationMode.Auto & String = js.native
    
    /* "Client" */ val Client: typings.openui5.sapUiModelOdataOperationModeMod.OperationMode.Client & String = js.native
    
    /* "Default" */ val Default: typings.openui5.sapUiModelOdataOperationModeMod.OperationMode.Default & String = js.native
    
    /* "Server" */ val Server: typings.openui5.sapUiModelOdataOperationModeMod.OperationMode.Server & String = js.native
  }
  
  @js.native
  sealed trait OperationMode extends StObject
  /**
    * Different modes for executing service operations (filtering, sorting)
    */
  @JSImport("sap/ui/model/odata/OperationMode", "OperationMode")
  @js.native
  object OperationMode extends StObject {
    
    /**
      * @deprecated (since 1.102.0) - because filtering and sorting may lead to different results when executed
      * on the client and on the server, and thus to inconsistent behavior. If it is certain that the collection
      * is completely loaded on the client, use {@link sap.ui.model.odata.OperationMode.Client}; otherwise, use
      * {@link sap.ui.model.odata.OperationMode.Default} or {@link sap.ui.model.odata.OperationMode.Server}.
      *
      * With operation mode `Auto`, operations are either processed on the client or on the server. The exact
      * behavior depends on the configured {@link sap.ui.model.odata.CountMode CountMode}, on the `threshold`
      * and on the size of the data:
      * 	 - Count Modes `Request` and `Both`
      *  Initially the binding will issue a `$count` request without any filters/sorters.  If
      * the count is lower or equal to the threshold, the binding will behave like in operation mode `Client`,
      * and a data request for all entries is issued.
      * 	 - If the count exceeds the threshold, the binding will behave like in operation mode `Server`.
      *
      *
      *
      * 	 - Count Modes `Inline` or `InlineRepeat`
      *  The initial request tries to fetch as many entries as configured with the `threshold` parameter, without
      * specifying any filters/sorters. In addition, the query parameter `$inlinecount` is added. The binding
      * assumes, that the threshold given by the application can be met, but it adapts its behavior depending
      * on the response:  If the response returns fewer (or just as many) entries as the threshold,
      * the binding will behave exactly like when using the operation mode `Client`. Initially configured filters/sorters
      * will be applied afterwards on the client.
      * 	 - If the `$inlinecount` is higher than the threshold, the binding will behave like in operation mode
      *     `Server`. In this case a new data request containing the initially set filters/sorters will be issued.
      *      It is up to the application to chose an appropriate threshold value. Ideally, it should be high
      *     enough to fetch all data in the most common scenarios (to avoid a fallback to operation mode `Server`,
      *     requiring an additional request), but it also should be low enough to ensure a fast response in case
      *     there is much more data than expected.
      * 	 - Count mode `None` is not supported together with operation mode `Auto`
      */
    @js.native
    sealed trait Auto
      extends StObject
         with OperationMode
    
    /**
      * Operations are executed on the client. This only works if all entries are loaded on the client. The initial
      * request fetches the complete collection, filtering and sorting does not trigger further requests.
      */
    @js.native
    sealed trait Client
      extends StObject
         with OperationMode
    
    /**
      * By default, all operations are executed on the server in the OData service request (`Server` mode). Only
      * if the collection is already expanded and all entries are available on the client, all operations are
      * executed on the client (`Client` mode).
      */
    @js.native
    sealed trait Default
      extends StObject
         with OperationMode
    
    /**
      * Operations are executed on the server in the OData service request, by appending corresponding URL parameters
      * (`$filter`, `$orderby`). Each change in filtering or sorting triggers a new request to the server.
      */
    @js.native
    sealed trait Server
      extends StObject
         with OperationMode
  }
}
