package typings.mendixmodelsdk

import typings.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import typings.mendixmodelsdk.transportationMod.ITransportation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configurationMod {
  
  object configuration {
    
    trait IBackendCredentials extends StObject {
      
      /** The OpenID on behalf which the trusted backend service operates. */
      var openid: js.UndefOr[String] = js.undefined
      
      var password: String
      
      var username: String
    }
    object IBackendCredentials {
      
      @scala.inline
      def apply(password: String, username: String): IBackendCredentials = {
        val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
        __obj.asInstanceOf[IBackendCredentials]
      }
      
      @scala.inline
      implicit class IBackendCredentialsMutableBuilder[Self <: IBackendCredentials] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOpenid(value: String): Self = StObject.set(x, "openid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOpenidUndefined: Self = StObject.set(x, "openid", js.undefined)
        
        @scala.inline
        def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      }
    }
    
    trait ICreateWorkingCopyFromTeamServerParameters
      extends StObject
         with ICreateWorkingCopyParametersBase {
      
      @JSName("projectId")
      var projectId_ICreateWorkingCopyFromTeamServerParameters: String
      
      @JSName("teamServerBaseBranch")
      var teamServerBaseBranch_ICreateWorkingCopyFromTeamServerParameters: String
      
      var teamServerGitUrl: js.UndefOr[String] = js.undefined
    }
    object ICreateWorkingCopyFromTeamServerParameters {
      
      @scala.inline
      def apply(name: String, projectId: String, teamServerBaseBranch: String): ICreateWorkingCopyFromTeamServerParameters = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], teamServerBaseBranch = teamServerBaseBranch.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICreateWorkingCopyFromTeamServerParameters]
      }
      
      @scala.inline
      implicit class ICreateWorkingCopyFromTeamServerParametersMutableBuilder[Self <: ICreateWorkingCopyFromTeamServerParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTeamServerBaseBranch(value: String): Self = StObject.set(x, "teamServerBaseBranch", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTeamServerGitUrl(value: String): Self = StObject.set(x, "teamServerGitUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTeamServerGitUrlUndefined: Self = StObject.set(x, "teamServerGitUrl", js.undefined)
      }
    }
    
    trait ICreateWorkingCopyParameters
      extends StObject
         with ICreateWorkingCopyParametersBase {
      
      /**
        * Path to the (template) MPK file.
        */
      var template: String
    }
    object ICreateWorkingCopyParameters {
      
      @scala.inline
      def apply(name: String, template: String): ICreateWorkingCopyParameters = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICreateWorkingCopyParameters]
      }
      
      @scala.inline
      implicit class ICreateWorkingCopyParametersMutableBuilder[Self <: ICreateWorkingCopyParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      }
    }
    
    trait ICreateWorkingCopyParametersBase extends StObject {
      
      var avatarUrl: js.UndefOr[String] = js.undefined
      
      var description: js.UndefOr[String] = js.undefined
      
      /**
        * Indicates whether this working copy is created for the purpose of collaboration between the Desktop modeler and Webmodeler.
        * By setting this, BiDi won't be available anymore for this project and thus requires a modeler with version 7.23.3 or higher.
        */
      var isCollaboration: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Indicates whether the working copy should be long-lived.
        * This parameter can only be set to true when the Mendix project id is set and the Model SDK is used from a trusted backend
        *  - this excludes regular SDK users for the moment.
        */
      var longLived: js.UndefOr[Boolean] = js.undefined
      
      /**
        * Force the working copy state to be marked to contain changes.
        *  - this excludes regular SDK users for the moment.
        */
      var markAsChanged: js.UndefOr[Boolean] = js.undefined
      
      var name: String
      
      /**
        * Mendix project id. Needed for deployment and team server commits
        */
      var projectId: js.UndefOr[String] = js.undefined
      
      /**
        * Indicates whether the new working copy should be the default working copy associated with the provided projectId.
        * This means that this working copy will be opened in the Web Modeler for the given project.
        * This parameter can only be set to true when the Mendix project id is set and the Model SDK is used from a trusted backend
        *  - this excludes regular SDK users for the moment.
        */
      var setAsDefault: js.UndefOr[Boolean] = js.undefined
      
      /**
        * If this working copy is created from an SVN TeamServer checkout, the BaseRevision / BaseBranch can be used by the Desktop Modeler during merge.
        */
      var teamServerBaseBranch: js.UndefOr[String] = js.undefined
      
      /**
        * If this working copy is created from a Git TeamServer checkout, the commit id will be used for the clone operation.
        */
      var teamServerBaseCommitId: js.UndefOr[String] = js.undefined
      
      /**
        * If this working copy is created from an SVN TeamServer checkout, the BaseRevision / BaseBranch can be used by the Desktop Modeler during merge.
        * @type {number}
        */
      var teamServerBaseRevision: js.UndefOr[Double] = js.undefined
    }
    object ICreateWorkingCopyParametersBase {
      
      @scala.inline
      def apply(name: String): ICreateWorkingCopyParametersBase = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[ICreateWorkingCopyParametersBase]
      }
      
      @scala.inline
      implicit class ICreateWorkingCopyParametersBaseMutableBuilder[Self <: ICreateWorkingCopyParametersBase] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAvatarUrl(value: String): Self = StObject.set(x, "avatarUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAvatarUrlUndefined: Self = StObject.set(x, "avatarUrl", js.undefined)
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setIsCollaboration(value: Boolean): Self = StObject.set(x, "isCollaboration", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsCollaborationUndefined: Self = StObject.set(x, "isCollaboration", js.undefined)
        
        @scala.inline
        def setLongLived(value: Boolean): Self = StObject.set(x, "longLived", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLongLivedUndefined: Self = StObject.set(x, "longLived", js.undefined)
        
        @scala.inline
        def setMarkAsChanged(value: Boolean): Self = StObject.set(x, "markAsChanged", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkAsChangedUndefined: Self = StObject.set(x, "markAsChanged", js.undefined)
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
        
        @scala.inline
        def setSetAsDefault(value: Boolean): Self = StObject.set(x, "setAsDefault", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSetAsDefaultUndefined: Self = StObject.set(x, "setAsDefault", js.undefined)
        
        @scala.inline
        def setTeamServerBaseBranch(value: String): Self = StObject.set(x, "teamServerBaseBranch", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTeamServerBaseBranchUndefined: Self = StObject.set(x, "teamServerBaseBranch", js.undefined)
        
        @scala.inline
        def setTeamServerBaseCommitId(value: String): Self = StObject.set(x, "teamServerBaseCommitId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTeamServerBaseCommitIdUndefined: Self = StObject.set(x, "teamServerBaseCommitId", js.undefined)
        
        @scala.inline
        def setTeamServerBaseRevision(value: Double): Self = StObject.set(x, "teamServerBaseRevision", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTeamServerBaseRevisionUndefined: Self = StObject.set(x, "teamServerBaseRevision", js.undefined)
      }
    }
    
    trait ISdkConfig extends StObject {
      
      var client: js.UndefOr[IModelServerClient] = js.undefined
      
      var credentials: js.UndefOr[IBackendCredentials | ISdkCredentials] = js.undefined
      
      var endPoint: js.UndefOr[String] = js.undefined
      
      var transportation: js.UndefOr[ITransportation] = js.undefined
    }
    object ISdkConfig {
      
      @scala.inline
      def apply(): ISdkConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ISdkConfig]
      }
      
      @scala.inline
      implicit class ISdkConfigMutableBuilder[Self <: ISdkConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClient(value: IModelServerClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
        
        @scala.inline
        def setCredentials(value: IBackendCredentials | ISdkCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
        
        @scala.inline
        def setEndPoint(value: String): Self = StObject.set(x, "endPoint", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndPointUndefined: Self = StObject.set(x, "endPoint", js.undefined)
        
        @scala.inline
        def setTransportation(value: ITransportation): Self = StObject.set(x, "transportation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTransportationUndefined: Self = StObject.set(x, "transportation", js.undefined)
      }
    }
    
    trait ISdkCredentials extends StObject {
      
      var apikey: String
      
      var username: String
    }
    object ISdkCredentials {
      
      @scala.inline
      def apply(apikey: String, username: String): ISdkCredentials = {
        val __obj = js.Dynamic.literal(apikey = apikey.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
        __obj.asInstanceOf[ISdkCredentials]
      }
      
      @scala.inline
      implicit class ISdkCredentialsMutableBuilder[Self <: ISdkCredentials] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setApikey(value: String): Self = StObject.set(x, "apikey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      }
    }
  }
}
