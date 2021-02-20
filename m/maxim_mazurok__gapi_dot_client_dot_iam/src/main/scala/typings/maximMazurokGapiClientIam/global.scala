package typings.maximMazurokGapiClientIam

import typings.maximMazurokGapiClientIam.gapi.client.iam.IamPoliciesResource
import typings.maximMazurokGapiClientIam.gapi.client.iam.OrganizationsResource
import typings.maximMazurokGapiClientIam.gapi.client.iam.PermissionsResource
import typings.maximMazurokGapiClientIam.gapi.client.iam.ProjectsResource
import typings.maximMazurokGapiClientIam.gapi.client.iam.RolesResource
import typings.maximMazurokGapiClientIam.maximMazurokGapiClientIamStrings.iam
import typings.maximMazurokGapiClientIam.maximMazurokGapiClientIamStrings.v1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object gapi {
    
    object client {
      
      object iam {
        
        @JSGlobal("gapi.client.iam.iamPolicies")
        @js.native
        val iamPolicies: IamPoliciesResource = js.native
        
        @JSGlobal("gapi.client.iam.organizations")
        @js.native
        val organizations: OrganizationsResource = js.native
        
        @JSGlobal("gapi.client.iam.permissions")
        @js.native
        val permissions: PermissionsResource = js.native
        
        @JSGlobal("gapi.client.iam.projects")
        @js.native
        val projects: ProjectsResource = js.native
        
        @JSGlobal("gapi.client.iam.roles")
        @js.native
        val roles: RolesResource = js.native
      }
      
      /** Load Identity and Access Management (IAM) API v1 */
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: iam, version: v1): js.Thenable[Unit] = js.native
      @JSGlobal("gapi.client.load")
      @js.native
      def load(name: iam, version: v1, callback: js.Function0[_]): Unit = js.native
    }
  }
}
