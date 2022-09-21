package typings.maximMazurokGapiClientLicensing

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientLicensing.anon.Accesstoken
import typings.maximMazurokGapiClientLicensing.anon.Alt
import typings.maximMazurokGapiClientLicensing.anon.Callback
import typings.maximMazurokGapiClientLicensing.anon.CustomerId
import typings.maximMazurokGapiClientLicensing.anon.Fields
import typings.maximMazurokGapiClientLicensing.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gapi {
  
  object client {
    
    object licensing {
      
      // tslint:disable-next-line:no-empty-interface
      trait Empty extends StObject
      
      trait LicenseAssignment extends StObject {
        
        /** ETag of the resource. */
        var etags: js.UndefOr[String] = js.undefined
        
        /** Identifies the resource as a LicenseAssignment, which is `licensing#licenseAssignment`. */
        var kind: js.UndefOr[String] = js.undefined
        
        /** A product's unique identifier. For more information about products in this version of the API, see Product and SKU IDs. */
        var productId: js.UndefOr[String] = js.undefined
        
        /** Display Name of the product. */
        var productName: js.UndefOr[String] = js.undefined
        
        /** Link to this page. */
        var selfLink: js.UndefOr[String] = js.undefined
        
        /** A product SKU's unique identifier. For more information about available SKUs in this version of the API, see Products and SKUs. */
        var skuId: js.UndefOr[String] = js.undefined
        
        /** Display Name of the sku of the product. */
        var skuName: js.UndefOr[String] = js.undefined
        
        /**
          * The user's current primary email address. If the user's email address changes, use the new email address in your API requests. Since a `userId` is subject to change, do not use a
          * `userId` value as a key for persistent data. This key could break if the current user's email address changes. If the `userId` is suspended, the license status changes.
          */
        var userId: js.UndefOr[String] = js.undefined
      }
      object LicenseAssignment {
        
        inline def apply(): LicenseAssignment = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[LicenseAssignment]
        }
        
        extension [Self <: LicenseAssignment](x: Self) {
          
          inline def setEtags(value: String): Self = StObject.set(x, "etags", value.asInstanceOf[js.Any])
          
          inline def setEtagsUndefined: Self = StObject.set(x, "etags", js.undefined)
          
          inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
          
          inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
          
          inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
          
          inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
          
          inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
          
          inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
          
          inline def setSkuId(value: String): Self = StObject.set(x, "skuId", value.asInstanceOf[js.Any])
          
          inline def setSkuIdUndefined: Self = StObject.set(x, "skuId", js.undefined)
          
          inline def setSkuName(value: String): Self = StObject.set(x, "skuName", value.asInstanceOf[js.Any])
          
          inline def setSkuNameUndefined: Self = StObject.set(x, "skuName", js.undefined)
          
          inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
          
          inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
        }
      }
      
      trait LicenseAssignmentInsert extends StObject {
        
        /** Email id of the user */
        var userId: js.UndefOr[String] = js.undefined
      }
      object LicenseAssignmentInsert {
        
        inline def apply(): LicenseAssignmentInsert = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[LicenseAssignmentInsert]
        }
        
        extension [Self <: LicenseAssignmentInsert](x: Self) {
          
          inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
          
          inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
        }
      }
      
      trait LicenseAssignmentList extends StObject {
        
        /** ETag of the resource. */
        var etag: js.UndefOr[String] = js.undefined
        
        /** The LicenseAssignments in this page of results. */
        var items: js.UndefOr[js.Array[LicenseAssignment]] = js.undefined
        
        /** Identifies the resource as a collection of LicenseAssignments. */
        var kind: js.UndefOr[String] = js.undefined
        
        /**
          * The token that you must submit in a subsequent request to retrieve additional license results matching your query parameters. The `maxResults` query string is related to the
          * `nextPageToken` since `maxResults` determines how many entries are returned on each next page.
          */
        var nextPageToken: js.UndefOr[String] = js.undefined
      }
      object LicenseAssignmentList {
        
        inline def apply(): LicenseAssignmentList = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[LicenseAssignmentList]
        }
        
        extension [Self <: LicenseAssignmentList](x: Self) {
          
          inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
          
          inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
          
          inline def setItems(value: js.Array[LicenseAssignment]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
          
          inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
          
          inline def setItemsVarargs(value: LicenseAssignment*): Self = StObject.set(x, "items", js.Array(value*))
          
          inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
          
          inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
          
          inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
          
          inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
        }
      }
      
      @js.native
      trait LicenseAssignmentsResource extends StObject {
        
        /** Revoke a license. */
        def delete(): Request[js.Object] = js.native
        def delete(request: Accesstoken): Request[js.Object] = js.native
        
        /** Get a specific user's license by product SKU. */
        def get(): Request[LicenseAssignment] = js.native
        def get(request: Accesstoken): Request[LicenseAssignment] = js.native
        
        /** Assign a license. */
        def insert(request: Alt): Request[LicenseAssignment] = js.native
        def insert(request: Callback, body: LicenseAssignmentInsert): Request[LicenseAssignment] = js.native
        
        /** List all users assigned licenses for a specific product SKU. */
        def listForProduct(): Request[LicenseAssignmentList] = js.native
        def listForProduct(request: CustomerId): Request[LicenseAssignmentList] = js.native
        
        /** List all users assigned licenses for a specific product SKU. */
        def listForProductAndSku(): Request[LicenseAssignmentList] = js.native
        def listForProductAndSku(request: Fields): Request[LicenseAssignmentList] = js.native
        
        def patch(request: Accesstoken, body: LicenseAssignment): Request[LicenseAssignment] = js.native
        /** Reassign a user's product SKU with a different SKU in the same product. This method supports patch semantics. */
        def patch(request: Key): Request[LicenseAssignment] = js.native
        
        def update(request: Accesstoken, body: LicenseAssignment): Request[LicenseAssignment] = js.native
        /** Reassign a user's product SKU with a different SKU in the same product. */
        def update(request: Key): Request[LicenseAssignment] = js.native
      }
    }
  }
}
