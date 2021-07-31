package typings.maximMazurokGapiClientDisplayvideo

import typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.AdvertisersResource
import typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.CombinedAudiencesResource
import typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.CustomBiddingAlgorithmsResource
import typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.CustomListsResource
import typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.FirstAndThirdPartyAudiencesResource
import typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.FloodlightGroupsResource
import typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.GoogleAudiencesResource
import typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.InventorySourceGroupsResource
import typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.InventorySourcesResource
import typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.MediaResource
import typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.PartnersResource
import typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.SdfdownloadtasksResource
import typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.TargetingTypesResource
import typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo.UsersResource
import typings.maximMazurokGapiClientDisplayvideo.maximMazurokGapiClientDisplayvideoStrings.displayvideo
import typings.maximMazurokGapiClientDisplayvideo.maximMazurokGapiClientDisplayvideoStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      object displayvideo {
        
        @JSGlobal("gapi.client.displayvideo.advertisers")
        @js.native
        val advertisers: AdvertisersResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.combinedAudiences")
        @js.native
        val combinedAudiences: CombinedAudiencesResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.customBiddingAlgorithms")
        @js.native
        val customBiddingAlgorithms: CustomBiddingAlgorithmsResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.customLists")
        @js.native
        val customLists: CustomListsResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.firstAndThirdPartyAudiences")
        @js.native
        val firstAndThirdPartyAudiences: FirstAndThirdPartyAudiencesResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.floodlightGroups")
        @js.native
        val floodlightGroups: FloodlightGroupsResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.googleAudiences")
        @js.native
        val googleAudiences: GoogleAudiencesResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.inventorySourceGroups")
        @js.native
        val inventorySourceGroups: InventorySourceGroupsResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.inventorySources")
        @js.native
        val inventorySources: InventorySourcesResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.media")
        @js.native
        val media: MediaResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.partners")
        @js.native
        val partners: PartnersResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.sdfdownloadtasks")
        @js.native
        val sdfdownloadtasks: SdfdownloadtasksResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.targetingTypes")
        @js.native
        val targetingTypes: TargetingTypesResource = js.native
        
        @JSGlobal("gapi.client.displayvideo.users")
        @js.native
        val users: UsersResource = js.native
      }
      
      /** Load Display & Video 360 API v1 */
      @scala.inline
      def load(name: displayvideo, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      @scala.inline
      def load(name: displayvideo, version: v1, callback: js.Function0[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
  }
}
