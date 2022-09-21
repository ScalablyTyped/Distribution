package typings.maximMazurokGapiClientRecommender

import typings.maximMazurokGapiClientRecommender.gapi.client.recommender.BillingAccountsResource
import typings.maximMazurokGapiClientRecommender.gapi.client.recommender.FoldersResource
import typings.maximMazurokGapiClientRecommender.gapi.client.recommender.OrganizationsResource
import typings.maximMazurokGapiClientRecommender.gapi.client.recommender.ProjectsResource
import typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.recommender
import typings.maximMazurokGapiClientRecommender.maximMazurokGapiClientRecommenderStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      @JSGlobal("gapi.client")
      @js.native
      val ^ : js.Any = js.native
      
      /** Load Recommender API v1 */
      inline def load(name: recommender, version: v1): js.Thenable[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Thenable[Unit]]
      inline def load(name: recommender, version: v1, callback: js.Function0[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object recommender {
        
        @JSGlobal("gapi.client.recommender.billingAccounts")
        @js.native
        val billingAccounts: BillingAccountsResource = js.native
        
        @JSGlobal("gapi.client.recommender.folders")
        @js.native
        val folders: FoldersResource = js.native
        
        @JSGlobal("gapi.client.recommender.organizations")
        @js.native
        val organizations: OrganizationsResource = js.native
        
        @JSGlobal("gapi.client.recommender.projects")
        @js.native
        val projects: ProjectsResource = js.native
      }
    }
  }
}
