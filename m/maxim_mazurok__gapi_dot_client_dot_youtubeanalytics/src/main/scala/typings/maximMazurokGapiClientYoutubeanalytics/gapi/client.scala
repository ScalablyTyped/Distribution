package typings.maximMazurokGapiClientYoutubeanalytics.gapi

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutubeanalytics.anon.Accesstoken
import typings.maximMazurokGapiClientYoutubeanalytics.anon.Alt
import typings.maximMazurokGapiClientYoutubeanalytics.anon.Callback
import typings.maximMazurokGapiClientYoutubeanalytics.anon.Currency
import typings.maximMazurokGapiClientYoutubeanalytics.anon.Fields
import typings.maximMazurokGapiClientYoutubeanalytics.anon.Id
import typings.maximMazurokGapiClientYoutubeanalytics.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object client {
  
  object youtubeanalytics {
    
    @js.native
    trait EmptyResponse extends StObject {
      
      /** Apiary error details */
      var errors: js.UndefOr[Errors] = js.native
    }
    object EmptyResponse {
      
      @scala.inline
      def apply(): EmptyResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[EmptyResponse]
      }
      
      @scala.inline
      implicit class EmptyResponseMutableBuilder[Self <: EmptyResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      }
    }
    
    @js.native
    trait ErrorProto extends StObject {
      
      /** Error arguments, to be used when building user-friendly error messages given the error domain and code. Different error codes require different arguments. */
      var argument: js.UndefOr[js.Array[String]] = js.native
      
      /** Error code in the error domain. This should correspond to a value of the enum type whose name is in domain. See the core error domain in error_domain.proto. */
      var code: js.UndefOr[String] = js.native
      
      /** Debugging information, which should not be shared externally. */
      var debugInfo: js.UndefOr[String] = js.native
      
      /** Error domain. RoSy services can define their own domain and error codes. This should normally be the name of an enum type, such as: gdata.CoreErrorDomain */
      var domain: js.UndefOr[String] = js.native
      
      /**
        * A short explanation for the error, which can be shared outside Google. Please set domain, code and arguments whenever possible instead of this error message so that external APIs
        * can build safe error messages themselves. External messages built in a RoSy interface will most likely refer to information and concepts that are not available externally and should
        * not be exposed. It is safer if external APIs can understand the errors and decide what the error message should look like.
        */
      var externalErrorMessage: js.UndefOr[String] = js.native
      
      /**
        * Location of the error, as specified by the location type. If location_type is PATH, this should be a path to a field that's relative to the request, using FieldPath notation
        * (net/proto2/util/public/field_path.h). Examples: authenticated_user.gaia_id resource.address[2].country
        */
      var location: js.UndefOr[String] = js.native
      
      var locationType: js.UndefOr[String] = js.native
    }
    object ErrorProto {
      
      @scala.inline
      def apply(): ErrorProto = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ErrorProto]
      }
      
      @scala.inline
      implicit class ErrorProtoMutableBuilder[Self <: ErrorProto] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setArgument(value: js.Array[String]): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
        
        @scala.inline
        def setArgumentVarargs(value: String*): Self = StObject.set(x, "argument", js.Array(value :_*))
        
        @scala.inline
        def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
        
        @scala.inline
        def setDebugInfo(value: String): Self = StObject.set(x, "debugInfo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDebugInfoUndefined: Self = StObject.set(x, "debugInfo", js.undefined)
        
        @scala.inline
        def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
        
        @scala.inline
        def setExternalErrorMessage(value: String): Self = StObject.set(x, "externalErrorMessage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExternalErrorMessageUndefined: Self = StObject.set(x, "externalErrorMessage", js.undefined)
        
        @scala.inline
        def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
        
        @scala.inline
        def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      }
    }
    
    @js.native
    trait Errors extends StObject {
      
      /** Global error code. Deprecated and ignored. Set custom error codes in ErrorProto.domain and ErrorProto.code instead. */
      var code: js.UndefOr[String] = js.native
      
      /** Specific error description and codes */
      var error: js.UndefOr[js.Array[ErrorProto]] = js.native
      
      /** Request identifier generated by the service, which can be used to identify the error in the logs */
      var requestId: js.UndefOr[String] = js.native
    }
    object Errors {
      
      @scala.inline
      def apply(): Errors = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Errors]
      }
      
      @scala.inline
      implicit class ErrorsMutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
        
        @scala.inline
        def setError(value: js.Array[ErrorProto]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
        
        @scala.inline
        def setErrorVarargs(value: ErrorProto*): Self = StObject.set(x, "error", js.Array(value :_*))
        
        @scala.inline
        def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
      }
    }
    
    @js.native
    trait Group extends StObject {
      
      /** The `contentDetails` object contains additional information about the group, such as the number and type of items that it contains. */
      var contentDetails: js.UndefOr[GroupContentDetails] = js.native
      
      /** Apiary error details */
      var errors: js.UndefOr[Errors] = js.native
      
      /** The Etag of this resource. */
      var etag: js.UndefOr[String] = js.native
      
      /** The ID that YouTube uses to uniquely identify the group. */
      var id: js.UndefOr[String] = js.native
      
      /** Identifies the API resource's type. The value will be `youtube#group`. */
      var kind: js.UndefOr[String] = js.native
      
      /** The `snippet` object contains basic information about the group, including its creation date and name. */
      var snippet: js.UndefOr[GroupSnippet] = js.native
    }
    object Group {
      
      @scala.inline
      def apply(): Group = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Group]
      }
      
      @scala.inline
      implicit class GroupMutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContentDetails(value: GroupContentDetails): Self = StObject.set(x, "contentDetails", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContentDetailsUndefined: Self = StObject.set(x, "contentDetails", js.undefined)
        
        @scala.inline
        def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setSnippet(value: GroupSnippet): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
      }
    }
    
    @js.native
    trait GroupContentDetails extends StObject {
      
      /** The number of items in the group. */
      var itemCount: js.UndefOr[String] = js.native
      
      /** The type of resources that the group contains. Valid values for this property are: * `youtube#channel` * `youtube#playlist` * `youtube#video` * `youtubePartner#asset` */
      var itemType: js.UndefOr[String] = js.native
    }
    object GroupContentDetails {
      
      @scala.inline
      def apply(): GroupContentDetails = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GroupContentDetails]
      }
      
      @scala.inline
      implicit class GroupContentDetailsMutableBuilder[Self <: GroupContentDetails] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setItemCount(value: String): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemCountUndefined: Self = StObject.set(x, "itemCount", js.undefined)
        
        @scala.inline
        def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      }
    }
    
    @js.native
    trait GroupItem extends StObject {
      
      /** Apiary error details */
      var errors: js.UndefOr[Errors] = js.native
      
      /** The Etag of this resource. */
      var etag: js.UndefOr[String] = js.native
      
      /** The ID that YouTube uses to uniquely identify the group that contains the item. */
      var groupId: js.UndefOr[String] = js.native
      
      /**
        * The ID that YouTube uses to uniquely identify the `channel`, `video`, `playlist`, or `asset` resource that is included in the group. Note that this ID refers specifically to the
        * inclusion of that resource in a particular group and is different than the channel ID, video ID, playlist ID, or asset ID that uniquely identifies the resource itself. The
        * `resource.id` property's value specifies the unique channel, video, playlist, or asset ID.
        */
      var id: js.UndefOr[String] = js.native
      
      /** Identifies the API resource's type. The value will be `youtube#groupItem`. */
      var kind: js.UndefOr[String] = js.native
      
      /** The `resource` object contains information that identifies the item being added to the group. */
      var resource: js.UndefOr[GroupItemResource] = js.native
    }
    object GroupItem {
      
      @scala.inline
      def apply(): GroupItem = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GroupItem]
      }
      
      @scala.inline
      implicit class GroupItemMutableBuilder[Self <: GroupItem] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setResource(value: GroupItemResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      }
    }
    
    @js.native
    trait GroupItemResource extends StObject {
      
      /** The channel, video, playlist, or asset ID that YouTube uses to uniquely identify the item that is being added to the group. */
      var id: js.UndefOr[String] = js.native
      
      /** Identifies the type of resource being added to the group. Valid values for this property are: * `youtube#channel` * `youtube#playlist` * `youtube#video` * `youtubePartner#asset` */
      var kind: js.UndefOr[String] = js.native
    }
    object GroupItemResource {
      
      @scala.inline
      def apply(): GroupItemResource = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GroupItemResource]
      }
      
      @scala.inline
      implicit class GroupItemResourceMutableBuilder[Self <: GroupItemResource] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    @js.native
    trait GroupItemsResource extends StObject {
      
      /** Removes an item from a group. */
      def delete(): Request[EmptyResponse] = js.native
      def delete(request: Accesstoken): Request[EmptyResponse] = js.native
      
      /** Creates a group item. */
      def insert(request: Alt): Request[GroupItem] = js.native
      def insert(request: Callback, body: GroupItem): Request[GroupItem] = js.native
      
      /** Returns a collection of group items that match the API request parameters. */
      def list(): Request[ListGroupItemsResponse] = js.native
      def list(request: Fields): Request[ListGroupItemsResponse] = js.native
    }
    
    @js.native
    trait GroupSnippet extends StObject {
      
      /** The date and time that the group was created. The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format. */
      var publishedAt: js.UndefOr[String] = js.native
      
      /** The group name. The value must be a non-empty string. */
      var title: js.UndefOr[String] = js.native
    }
    object GroupSnippet {
      
      @scala.inline
      def apply(): GroupSnippet = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[GroupSnippet]
      }
      
      @scala.inline
      implicit class GroupSnippetMutableBuilder[Self <: GroupSnippet] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      }
    }
    
    @js.native
    trait GroupsResource extends StObject {
      
      /** Deletes a group. */
      def delete(): Request[EmptyResponse] = js.native
      def delete(request: Accesstoken): Request[EmptyResponse] = js.native
      
      def insert(request: Callback, body: Group): Request[Group] = js.native
      /** Creates a group. */
      def insert(request: Key): Request[Group] = js.native
      
      /**
        * Returns a collection of groups that match the API request parameters. For example, you can retrieve all groups that the authenticated user owns, or you can retrieve one or more
        * groups by their unique IDs.
        */
      def list(): Request[ListGroupsResponse] = js.native
      def list(request: Id): Request[ListGroupsResponse] = js.native
      
      def update(request: Callback, body: Group): Request[Group] = js.native
      /** Modifies a group. For example, you could change a group's title. */
      def update(request: Key): Request[Group] = js.native
    }
    
    @js.native
    trait ListGroupItemsResponse extends StObject {
      
      /** Apiary error details */
      var errors: js.UndefOr[Errors] = js.native
      
      /** The Etag of this resource. */
      var etag: js.UndefOr[String] = js.native
      
      /** A list of groups that match the API request parameters. Each item in the list represents a `groupItem` resource. */
      var items: js.UndefOr[js.Array[GroupItem]] = js.native
      
      /** Identifies the API resource's type. The value will be `youtube#groupItemListResponse`. */
      var kind: js.UndefOr[String] = js.native
    }
    object ListGroupItemsResponse {
      
      @scala.inline
      def apply(): ListGroupItemsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListGroupItemsResponse]
      }
      
      @scala.inline
      implicit class ListGroupItemsResponseMutableBuilder[Self <: ListGroupItemsResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setItems(value: js.Array[GroupItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: GroupItem*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      }
    }
    
    @js.native
    trait ListGroupsResponse extends StObject {
      
      /** Apiary error details */
      var errors: js.UndefOr[Errors] = js.native
      
      /** The Etag of this resource. */
      var etag: js.UndefOr[String] = js.native
      
      /** A list of groups that match the API request parameters. Each item in the list represents a `group` resource. */
      var items: js.UndefOr[js.Array[Group]] = js.native
      
      /** Identifies the API resource's type. The value will be `youtube#groupListResponse`. */
      var kind: js.UndefOr[String] = js.native
      
      /** The token that can be used as the value of the `pageToken` parameter to retrieve the next page in the result set. */
      var nextPageToken: js.UndefOr[String] = js.native
    }
    object ListGroupsResponse {
      
      @scala.inline
      def apply(): ListGroupsResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListGroupsResponse]
      }
      
      @scala.inline
      implicit class ListGroupsResponseMutableBuilder[Self <: ListGroupsResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setItems(value: js.Array[Group]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: Group*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    @js.native
    trait QueryResponse extends StObject {
      
      /**
        * This value specifies information about the data returned in the `rows` fields. Each item in the `columnHeaders` list identifies a field returned in the `rows` value, which contains
        * a list of comma-delimited data. The `columnHeaders` list will begin with the dimensions specified in the API request, which will be followed by the metrics specified in the API
        * request. The order of both dimensions and metrics will match the ordering in the API request. For example, if the API request contains the parameters
        * `dimensions=ageGroup,gender&metrics=viewerPercentage`, the API response will return columns in this order: `ageGroup`, `gender`, `viewerPercentage`.
        */
      var columnHeaders: js.UndefOr[js.Array[ResultTableColumnHeader]] = js.native
      
      /** When set, indicates that the operation failed. */
      var errors: js.UndefOr[Errors] = js.native
      
      /** This value specifies the type of data included in the API response. For the query method, the kind property value will be `youtubeAnalytics#resultTable`. */
      var kind: js.UndefOr[String] = js.native
      
      /**
        * The list contains all rows of the result table. Each item in the list is an array that contains comma-delimited data corresponding to a single row of data. The order of the
        * comma-delimited data fields will match the order of the columns listed in the `columnHeaders` field. If no data is available for the given query, the `rows` element will be omitted
        * from the response. The response for a query with the `day` dimension will not contain rows for the most recent days.
        */
      var rows: js.UndefOr[js.Array[js.Array[_]]] = js.native
    }
    object QueryResponse {
      
      @scala.inline
      def apply(): QueryResponse = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[QueryResponse]
      }
      
      @scala.inline
      implicit class QueryResponseMutableBuilder[Self <: QueryResponse] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumnHeaders(value: js.Array[ResultTableColumnHeader]): Self = StObject.set(x, "columnHeaders", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnHeadersUndefined: Self = StObject.set(x, "columnHeaders", js.undefined)
        
        @scala.inline
        def setColumnHeadersVarargs(value: ResultTableColumnHeader*): Self = StObject.set(x, "columnHeaders", js.Array(value :_*))
        
        @scala.inline
        def setErrors(value: Errors): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setRows(value: js.Array[js.Array[_]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
        
        @scala.inline
        def setRowsVarargs(value: js.Array[js.Any]*): Self = StObject.set(x, "rows", js.Array(value :_*))
      }
    }
    
    @js.native
    trait ReportsResource extends StObject {
      
      /** Retrieve your YouTube Analytics reports. */
      def query(): Request[QueryResponse] = js.native
      def query(request: Currency): Request[QueryResponse] = js.native
    }
    
    @js.native
    trait ResultTableColumnHeader extends StObject {
      
      /** The type of the column (`DIMENSION` or `METRIC`). */
      var columnType: js.UndefOr[String] = js.native
      
      /** The type of the data in the column (`STRING`, `INTEGER`, `FLOAT`, etc.). */
      var dataType: js.UndefOr[String] = js.native
      
      /** The name of the dimension or metric. */
      var name: js.UndefOr[String] = js.native
    }
    object ResultTableColumnHeader {
      
      @scala.inline
      def apply(): ResultTableColumnHeader = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ResultTableColumnHeader]
      }
      
      @scala.inline
      implicit class ResultTableColumnHeaderMutableBuilder[Self <: ResultTableColumnHeader] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumnType(value: String): Self = StObject.set(x, "columnType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setColumnTypeUndefined: Self = StObject.set(x, "columnType", js.undefined)
        
        @scala.inline
        def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      }
    }
  }
}
