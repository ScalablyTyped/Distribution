package typings.microsoftteams

import typings.microsoftteams.microsoftteamsNumbers.`0`
import typings.microsoftteams.microsoftteamsNumbers.`1`
import typings.microsoftteams.microsoftteamsNumbers.`2`
import typings.microsoftteams.microsoftteamsNumbers.`3`
import typings.microsoftteams.microsoftteamsNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the root namespace for the JavaScript SDK.
  */
object microsoftTeams {
  
  trait Context extends StObject {
    
    /**
      * The Microsoft Teams ID for the channel with which the content is associated.
      */
    var channelId: js.UndefOr[String] = js.undefined
    
    /**
      * The name for the channel with which the content is associated.
      */
    var channelName: js.UndefOr[String] = js.undefined
    
    /**
      * The developer-defined unique ID for the entity this content points to.
      */
    var entityId: String
    
    /**
      * The Office 365 group ID for the team with which the content is associated.
      * This field is available only when the identity permission is requested in the manifest.
      */
    var groupId: js.UndefOr[String] = js.undefined
    
    /**
      * Indication whether the tab is in full-screen mode.
      */
    var isFullScreen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The current locale that the user has configured for the app formatted as
      * languageId-countryId (for example, en-us).
      */
    var locale: String
    
    /**
      * The developer-defined unique ID for the sub-entity this content points to.
      * This field should be used to restore to a specific state within an entity, such as scrolling to or activating a specific piece of content.
      */
    var subEntityId: js.UndefOr[String] = js.undefined
    
    /**
      * The Microsoft Teams ID for the team with which the content is associated.
      */
    var teamId: js.UndefOr[String] = js.undefined
    
    /**
      * The name for the team with which the content is associated.
      */
    var teamName: js.UndefOr[String] = js.undefined
    
    /**
      * The type of the team.
      */
    var teamType: js.UndefOr[TeamType] = js.undefined
    
    /**
      * The current UI theme.
      */
    var theme: js.UndefOr[String] = js.undefined
    
    /**
      * The Azure AD tenant ID of the current user.
      * Because a malicious party can host malicious content in a browser, this value should
      * be used only as a hint as to who the user is and never as proof of identity.
      * This field is available only when the identity permission is requested in the manifest.
      */
    var tid: js.UndefOr[String] = js.undefined
    
    /**
      * The UPN of the current user.
      * Because a malicious party can host malicious content in a browser, this value should
      * be used only as a hint as to who the user is and never as proof of identity.
      * This field is available only when the identity permission is requested in the manifest.
      */
    var upn: js.UndefOr[String] = js.undefined
  }
  object Context {
    
    @scala.inline
    def apply(entityId: String, locale: String): Context = {
      val __obj = js.Dynamic.literal(entityId = entityId.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
      
      @scala.inline
      def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelNameUndefined: Self = StObject.set(x, "channelName", js.undefined)
      
      @scala.inline
      def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
      
      @scala.inline
      def setIsFullScreen(value: Boolean): Self = StObject.set(x, "isFullScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFullScreenUndefined: Self = StObject.set(x, "isFullScreen", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubEntityId(value: String): Self = StObject.set(x, "subEntityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubEntityIdUndefined: Self = StObject.set(x, "subEntityId", js.undefined)
      
      @scala.inline
      def setTeamId(value: String): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamIdUndefined: Self = StObject.set(x, "teamId", js.undefined)
      
      @scala.inline
      def setTeamName(value: String): Self = StObject.set(x, "teamName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamNameUndefined: Self = StObject.set(x, "teamName", js.undefined)
      
      @scala.inline
      def setTeamType(value: TeamType): Self = StObject.set(x, "teamType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamTypeUndefined: Self = StObject.set(x, "teamType", js.undefined)
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTid(value: String): Self = StObject.set(x, "tid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTidUndefined: Self = StObject.set(x, "tid", js.undefined)
      
      @scala.inline
      def setUpn(value: String): Self = StObject.set(x, "upn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpnUndefined: Self = StObject.set(x, "upn", js.undefined)
    }
  }
  
  trait DeepLinkParameters extends StObject {
    
    /**
      * The developer-defined unique ID for the sub-entity to which this deep link points in the current entity.
      * This field should be used to restore to a specific state within an entity, such as scrolling to or activating a specific piece of content.
      */
    var subEntityId: String
    
    /**
      * The label for the sub-entity that should be displayed when the deep link is rendered in a client.
      */
    var subEntityLabel: String
    
    /**
      * The fallback URL to which to navigate the user if the client cannot render the page.
      * This URL should lead directly to the sub-entity.
      */
    var subEntityWebUrl: js.UndefOr[String] = js.undefined
  }
  object DeepLinkParameters {
    
    @scala.inline
    def apply(subEntityId: String, subEntityLabel: String): DeepLinkParameters = {
      val __obj = js.Dynamic.literal(subEntityId = subEntityId.asInstanceOf[js.Any], subEntityLabel = subEntityLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeepLinkParameters]
    }
    
    @scala.inline
    implicit class DeepLinkParametersMutableBuilder[Self <: DeepLinkParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSubEntityId(value: String): Self = StObject.set(x, "subEntityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubEntityLabel(value: String): Self = StObject.set(x, "subEntityLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubEntityWebUrl(value: String): Self = StObject.set(x, "subEntityWebUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubEntityWebUrlUndefined: Self = StObject.set(x, "subEntityWebUrl", js.undefined)
    }
  }
  
  trait TabInformation extends StObject {
    
    var teamTabs: js.Array[TabInstance]
  }
  object TabInformation {
    
    @scala.inline
    def apply(teamTabs: js.Array[TabInstance]): TabInformation = {
      val __obj = js.Dynamic.literal(teamTabs = teamTabs.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabInformation]
    }
    
    @scala.inline
    implicit class TabInformationMutableBuilder[Self <: TabInformation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTeamTabs(value: js.Array[TabInstance]): Self = StObject.set(x, "teamTabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamTabsVarargs(value: TabInstance*): Self = StObject.set(x, "teamTabs", js.Array(value :_*))
    }
  }
  
  trait TabInstance extends StObject {
    
    var channelId: js.UndefOr[String] = js.undefined
    
    var channelIsFavorite: js.UndefOr[Boolean] = js.undefined
    
    var channelName: js.UndefOr[String] = js.undefined
    
    var entityId: js.UndefOr[String] = js.undefined
    
    var groupId: js.UndefOr[String] = js.undefined
    
    var internalTabInstanceId: js.UndefOr[String] = js.undefined
    
    var lastViewUnixEpochTime: js.UndefOr[String] = js.undefined
    
    var tabName: String
    
    var teamId: js.UndefOr[String] = js.undefined
    
    var teamIsFavorite: js.UndefOr[Boolean] = js.undefined
    
    var teamName: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var websiteUrl: js.UndefOr[String] = js.undefined
  }
  object TabInstance {
    
    @scala.inline
    def apply(tabName: String): TabInstance = {
      val __obj = js.Dynamic.literal(tabName = tabName.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabInstance]
    }
    
    @scala.inline
    implicit class TabInstanceMutableBuilder[Self <: TabInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelIdUndefined: Self = StObject.set(x, "channelId", js.undefined)
      
      @scala.inline
      def setChannelIsFavorite(value: Boolean): Self = StObject.set(x, "channelIsFavorite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelIsFavoriteUndefined: Self = StObject.set(x, "channelIsFavorite", js.undefined)
      
      @scala.inline
      def setChannelName(value: String): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelNameUndefined: Self = StObject.set(x, "channelName", js.undefined)
      
      @scala.inline
      def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
      
      @scala.inline
      def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
      
      @scala.inline
      def setInternalTabInstanceId(value: String): Self = StObject.set(x, "internalTabInstanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalTabInstanceIdUndefined: Self = StObject.set(x, "internalTabInstanceId", js.undefined)
      
      @scala.inline
      def setLastViewUnixEpochTime(value: String): Self = StObject.set(x, "lastViewUnixEpochTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastViewUnixEpochTimeUndefined: Self = StObject.set(x, "lastViewUnixEpochTime", js.undefined)
      
      @scala.inline
      def setTabName(value: String): Self = StObject.set(x, "tabName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamId(value: String): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamIdUndefined: Self = StObject.set(x, "teamId", js.undefined)
      
      @scala.inline
      def setTeamIsFavorite(value: Boolean): Self = StObject.set(x, "teamIsFavorite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamIsFavoriteUndefined: Self = StObject.set(x, "teamIsFavorite", js.undefined)
      
      @scala.inline
      def setTeamName(value: String): Self = StObject.set(x, "teamName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTeamNameUndefined: Self = StObject.set(x, "teamName", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
    }
  }
  
  trait TabInstanceParameters extends StObject {
    
    /**
      * Flag allowing to select favorite channels only
      */
    var favoriteChannelsOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Flag allowing to select favorite teams only
      */
    var favoriteTeamsOnly: js.UndefOr[Boolean] = js.undefined
  }
  object TabInstanceParameters {
    
    @scala.inline
    def apply(): TabInstanceParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabInstanceParameters]
    }
    
    @scala.inline
    implicit class TabInstanceParametersMutableBuilder[Self <: TabInstanceParameters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFavoriteChannelsOnly(value: Boolean): Self = StObject.set(x, "favoriteChannelsOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFavoriteChannelsOnlyUndefined: Self = StObject.set(x, "favoriteChannelsOnly", js.undefined)
      
      @scala.inline
      def setFavoriteTeamsOnly(value: Boolean): Self = StObject.set(x, "favoriteTeamsOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFavoriteTeamsOnlyUndefined: Self = StObject.set(x, "favoriteTeamsOnly", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.microsoftteams.microsoftteamsNumbers.`0`
    - typings.microsoftteams.microsoftteamsNumbers.`1`
    - typings.microsoftteams.microsoftteamsNumbers.`2`
    - typings.microsoftteams.microsoftteamsNumbers.`3`
    - typings.microsoftteams.microsoftteamsNumbers.`4`
  */
  trait TeamType extends StObject
  object TeamType {
    
    @scala.inline
    def Class: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def Edu: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def Plc: `3` = 3.asInstanceOf[`3`]
    
    @scala.inline
    def Staff: `4` = 4.asInstanceOf[`4`]
    
    @scala.inline
    def Standard: `0` = 0.asInstanceOf[`0`]
  }
  
  /**
    * Namespace to interact with the authentication-specific part of the SDK.
    * This object is used for starting or completing authentication flows.
    */
  object authentication {
    
    trait AuthTokenRequest extends StObject {
      
      /**
        * A function that is called if the token request fails, with the reason for the failure.
        */
      var failureCallback: js.UndefOr[js.Function1[/* reason */ String, Unit]] = js.undefined
      
      /**
        * An array of resource URIs identifying the target resources for which the token should be requested.
        */
      var resources: js.Array[String]
      
      /**
        * A function that is called if the token request succeeds, with the resulting token.
        */
      var successCallback: js.UndefOr[js.Function1[/* token */ String, Unit]] = js.undefined
    }
    object AuthTokenRequest {
      
      @scala.inline
      def apply(resources: js.Array[String]): AuthTokenRequest = {
        val __obj = js.Dynamic.literal(resources = resources.asInstanceOf[js.Any])
        __obj.asInstanceOf[AuthTokenRequest]
      }
      
      @scala.inline
      implicit class AuthTokenRequestMutableBuilder[Self <: AuthTokenRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFailureCallback(value: /* reason */ String => Unit): Self = StObject.set(x, "failureCallback", js.Any.fromFunction1(value))
        
        @scala.inline
        def setFailureCallbackUndefined: Self = StObject.set(x, "failureCallback", js.undefined)
        
        @scala.inline
        def setResources(value: js.Array[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResourcesVarargs(value: String*): Self = StObject.set(x, "resources", js.Array(value :_*))
        
        @scala.inline
        def setSuccessCallback(value: /* token */ String => Unit): Self = StObject.set(x, "successCallback", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSuccessCallbackUndefined: Self = StObject.set(x, "successCallback", js.undefined)
      }
    }
    
    trait AuthenticateParameters extends StObject {
      
      /**
        * A function that is called if the authentication fails, with the reason for the failure returned from the authentication pop-up.
        */
      var failureCallback: js.UndefOr[js.Function1[/* reason */ js.UndefOr[String], Unit]] = js.undefined
      
      /**
        * The preferred height for the pop-up. This value can be ignored if outside the acceptable bounds.
        */
      var height: js.UndefOr[Double] = js.undefined
      
      /**
        * A function that is called if the authentication succeeds, with the result returned from the authentication pop-up.
        */
      var successCallback: js.UndefOr[js.Function1[/* result */ js.UndefOr[String], Unit]] = js.undefined
      
      /**
        * The URL for the authentication pop-up.
        */
      var url: String
      
      /**
        * The preferred width for the pop-up. This value can be ignored if outside the acceptable bounds.
        */
      var width: js.UndefOr[Double] = js.undefined
    }
    object AuthenticateParameters {
      
      @scala.inline
      def apply(url: String): AuthenticateParameters = {
        val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
        __obj.asInstanceOf[AuthenticateParameters]
      }
      
      @scala.inline
      implicit class AuthenticateParametersMutableBuilder[Self <: AuthenticateParameters] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFailureCallback(value: /* reason */ js.UndefOr[String] => Unit): Self = StObject.set(x, "failureCallback", js.Any.fromFunction1(value))
        
        @scala.inline
        def setFailureCallbackUndefined: Self = StObject.set(x, "failureCallback", js.undefined)
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
        
        @scala.inline
        def setSuccessCallback(value: /* result */ js.UndefOr[String] => Unit): Self = StObject.set(x, "successCallback", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSuccessCallbackUndefined: Self = StObject.set(x, "successCallback", js.undefined)
        
        @scala.inline
        def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      }
    }
    
    trait UserProfile extends StObject {
      
      /**
        * Identifies how the subject of the token was authenticated.
        */
      var amr: js.Array[String]
      
      /**
        * The intended recipient of the token. The application that receives the token must verify that the audience
        * value is correct and reject any tokens intended for a different audience.
        */
      var aud: String
      
      /**
        * Defines the time interval within which a token is valid. The service that validates the token should verify
        * that the current date is within the token lifetime; otherwise it should reject the token. The service might
        * allow for up to five minutes beyond the token lifetime to account for any differences in clock time ("time
        * skew") between Azure AD and the service.
        */
      var exp: Double
      
      /**
        * Provides the last name, surname, or family name of the user as defined in the Azure AD user object.
        */
      var family_name: String
      
      /**
        * Provides the first or "given" name of the user, as set on the Azure AD user object.
        */
      var given_name: String
      
      /**
        * Stores the time at which the token was issued. It is often used to measure token freshness.
        */
      var iat: Double
      
      /**
        * Identifies the security token service (STS) that constructs and returns the token. In the tokens that Azure AD
        * returns, the issuer is sts.windows.net. The GUID in the issuer claim value is the tenant ID of the Azure AD
        * directory. The tenant ID is an immutable and reliable identifier of the directory.
        */
      var iss: String
      
      var nbf: Double
      
      /**
        * Contains a unique identifier of an object in Azure AD. This value is immutable and cannot be reassigned or
        * reused. Use the object ID to identify an object in queries to Azure AD.
        */
      var oid: String
      
      /**
        * Identifies the principal about which the token asserts information, such as the user of an application.
        * This value is immutable and cannot be reassigned or reused, so it can be used to perform authorization
        * checks safely. Because the subject is always present in the tokens the Azure AD issues, we recommended
        * using this value in a general-purpose authorization system.
        */
      var sub: String
      
      /**
        * An immutable, non-reusable identifier that identifies the directory tenant that issued the token. You can
        * use this value to access tenant-specific directory resources in a multitenant application. For example,
        * you can use this value to identify the tenant in a call to the Graph API.
        */
      var tid: String
      
      /**
        * Provides a human-readable value that identifies the subject of the token. This value is not guaranteed to
        * be unique within a tenant and is designed to be used only for display purposes.
        */
      var unique_name: String
      
      /**
        * Stores the user name of the user principal.
        */
      var upn: String
      
      /**
        * Stores the version number of the token.
        */
      var ver: String
    }
    object UserProfile {
      
      @scala.inline
      def apply(
        amr: js.Array[String],
        aud: String,
        exp: Double,
        family_name: String,
        given_name: String,
        iat: Double,
        iss: String,
        nbf: Double,
        oid: String,
        sub: String,
        tid: String,
        unique_name: String,
        upn: String,
        ver: String
      ): UserProfile = {
        val __obj = js.Dynamic.literal(amr = amr.asInstanceOf[js.Any], aud = aud.asInstanceOf[js.Any], exp = exp.asInstanceOf[js.Any], family_name = family_name.asInstanceOf[js.Any], given_name = given_name.asInstanceOf[js.Any], iat = iat.asInstanceOf[js.Any], iss = iss.asInstanceOf[js.Any], nbf = nbf.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], tid = tid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], upn = upn.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
        __obj.asInstanceOf[UserProfile]
      }
      
      @scala.inline
      implicit class UserProfileMutableBuilder[Self <: UserProfile] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAmr(value: js.Array[String]): Self = StObject.set(x, "amr", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAmrVarargs(value: String*): Self = StObject.set(x, "amr", js.Array(value :_*))
        
        @scala.inline
        def setAud(value: String): Self = StObject.set(x, "aud", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExp(value: Double): Self = StObject.set(x, "exp", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFamily_name(value: String): Self = StObject.set(x, "family_name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGiven_name(value: String): Self = StObject.set(x, "given_name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIat(value: Double): Self = StObject.set(x, "iat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIss(value: String): Self = StObject.set(x, "iss", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNbf(value: Double): Self = StObject.set(x, "nbf", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOid(value: String): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSub(value: String): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTid(value: String): Self = StObject.set(x, "tid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpn(value: String): Self = StObject.set(x, "upn", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVer(value: String): Self = StObject.set(x, "ver", value.asInstanceOf[js.Any])
      }
    }
    
    trait UserRequest extends StObject {
      
      /**
        * A function that is called if the token request fails, with the reason for the failure.
        */
      var failureCallback: js.UndefOr[js.Function1[/* reason */ String, Unit]] = js.undefined
      
      /**
        * A function that is called if the token request succeeds, with the resulting token.
        */
      var successCallback: js.UndefOr[js.Function1[/* user */ UserProfile, Unit]] = js.undefined
    }
    object UserRequest {
      
      @scala.inline
      def apply(): UserRequest = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[UserRequest]
      }
      
      @scala.inline
      implicit class UserRequestMutableBuilder[Self <: UserRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFailureCallback(value: /* reason */ String => Unit): Self = StObject.set(x, "failureCallback", js.Any.fromFunction1(value))
        
        @scala.inline
        def setFailureCallbackUndefined: Self = StObject.set(x, "failureCallback", js.undefined)
        
        @scala.inline
        def setSuccessCallback(value: /* user */ UserProfile => Unit): Self = StObject.set(x, "successCallback", js.Any.fromFunction1(value))
        
        @scala.inline
        def setSuccessCallbackUndefined: Self = StObject.set(x, "successCallback", js.undefined)
      }
    }
  }
  
  /**
    * Namespace to interact with the settings-specific part of the SDK.
    * This object is usable only on the settings frame.
    */
  object settings {
    
    @js.native
    trait RemoveEvent extends StObject {
      
      /**
        * Indicates that removal of the underlying resource failed and that the content cannot be removed.
        * @param reason Specifies a reason for the failure. If provided, this string is displayed to the user; otherwise a generic error is displayed.
        */
      def notifyFailure(): Unit = js.native
      def notifyFailure(reason: String): Unit = js.native
      
      /**
        * Indicates that the underlying resource has been removed and the content can be removed.
        */
      def notifySuccess(): Unit = js.native
    }
    
    @js.native
    trait SaveEvent extends StObject {
      
      /**
        * Indicates that creation of the underlying resource failed and that the settings cannot be saved.
        * @param reason Specifies a reason for the failure. If provided, this string is displayed to the user; otherwise a generic error is displayed.
        */
      def notifyFailure(): Unit = js.native
      def notifyFailure(reason: String): Unit = js.native
      
      /**
        * Indicates that the underlying resource has been created and the settings can be saved.
        */
      def notifySuccess(): Unit = js.native
    }
    
    trait Settings extends StObject {
      
      /**
        * Sets the URL to use for the content of this instance.
        */
      var contentUrl: String
      
      /**
        * The developer-defined unique ID for the entity to which this content points.
        */
      var entityId: String
      
      /**
        * Sets the URL for the removal configuration experience.
        */
      var removeUrl: js.UndefOr[String] = js.undefined
      
      /**
        * A suggested display name for the new content.
        * In the settings for an existing instance being updated, this call has no effect.
        */
      var suggestedDisplayName: js.UndefOr[String] = js.undefined
      
      /**
        * Sets the URL to use for the external link to view the underlying resource in a browser.
        */
      var websiteUrl: js.UndefOr[String] = js.undefined
    }
    object Settings {
      
      @scala.inline
      def apply(contentUrl: String, entityId: String): Settings = {
        val __obj = js.Dynamic.literal(contentUrl = contentUrl.asInstanceOf[js.Any], entityId = entityId.asInstanceOf[js.Any])
        __obj.asInstanceOf[Settings]
      }
      
      @scala.inline
      implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEntityId(value: String): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRemoveUrl(value: String): Self = StObject.set(x, "removeUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRemoveUrlUndefined: Self = StObject.set(x, "removeUrl", js.undefined)
        
        @scala.inline
        def setSuggestedDisplayName(value: String): Self = StObject.set(x, "suggestedDisplayName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSuggestedDisplayNameUndefined: Self = StObject.set(x, "suggestedDisplayName", js.undefined)
        
        @scala.inline
        def setWebsiteUrl(value: String): Self = StObject.set(x, "websiteUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWebsiteUrlUndefined: Self = StObject.set(x, "websiteUrl", js.undefined)
      }
    }
  }
}
