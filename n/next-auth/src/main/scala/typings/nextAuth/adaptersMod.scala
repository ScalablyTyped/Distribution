package typings.nextAuth

import typings.nextAuth.anon.Expires
import typings.nextAuth.anon.Identifier
import typings.nextAuth.anon.OmitAdapterUserid
import typings.nextAuth.anon.PartialAdapterSessionPick
import typings.nextAuth.anon.PartialAdapterUser
import typings.nextAuth.anon.PickAdapterAccountprovide
import typings.nextAuth.anon.Session
import typings.nextAuth.coreTypesMod.Account
import typings.nextAuth.coreTypesMod.Awaitable
import typings.nextAuth.coreTypesMod.DefaultUser
import typings.nextAuth.providersMod.ProviderType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adaptersMod {
  
  type Adapter[WithVerificationToken] = DefaultAdapter & (/* import warning: importer.ImportType#apply Failed type conversion: WithVerificationToken extends true ? {createVerificationToken (verificationToken : next-auth.next-auth/adapters.VerificationToken): next-auth.next-auth/core/types.Awaitable<next-auth.next-auth/adapters.VerificationToken | null | undefined>, useVerificationToken (params : {  identifier :string,   token :string}): next-auth.next-auth/core/types.Awaitable<next-auth.next-auth/adapters.VerificationToken | null>} : {} */ js.Any)
  
  trait AdapterAccount
    extends StObject
       with Account {
    
    @JSName("userId")
    var userId_AdapterAccount: String
  }
  object AdapterAccount {
    
    inline def apply(provider: String, providerAccountId: String, `type`: ProviderType, userId: String): AdapterAccount = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], providerAccountId = providerAccountId.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdapterAccount]
    }
    
    extension [Self <: AdapterAccount](x: Self) {
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  trait AdapterSession extends StObject {
    
    var expires: js.Date
    
    /** A randomly generated value that is used to get hold of the session. */
    var sessionToken: String
    
    /** Used to connect the session to a particular user */
    var userId: String
  }
  object AdapterSession {
    
    inline def apply(expires: js.Date, sessionToken: String, userId: String): AdapterSession = {
      val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdapterSession]
    }
    
    extension [Self <: AdapterSession](x: Self) {
      
      inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  trait AdapterUser
    extends StObject
       with DefaultUser {
    
    var emailVerified: js.Date | Null
    
    @JSName("email")
    var email_AdapterUser: String
  }
  object AdapterUser {
    
    inline def apply(email: String, id: String): AdapterUser = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], emailVerified = null)
      __obj.asInstanceOf[AdapterUser]
    }
    
    extension [Self <: AdapterUser](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailVerified(value: js.Date): Self = StObject.set(x, "emailVerified", value.asInstanceOf[js.Any])
      
      inline def setEmailVerifiedNull: Self = StObject.set(x, "emailVerified", null)
    }
  }
  
  trait DefaultAdapter extends StObject {
    
    /** Creates a session for the user and returns it. */
    def createSession(session: Expires): Awaitable[AdapterSession]
    
    def createUser(user: OmitAdapterUserid): Awaitable[AdapterUser]
    
    var createVerificationToken: js.UndefOr[
        js.Function1[
          /* verificationToken */ VerificationToken, 
          Awaitable[js.UndefOr[VerificationToken | Null]]
        ]
      ] = js.undefined
    
    /**
      * Deletes a session from the database.
      * It is preferred that this method also returns the session
      * that is being deleted for logging purposes.
      */
    def deleteSession(sessionToken: String): js.Promise[Unit] | (Awaitable[js.UndefOr[AdapterSession | Null]])
    
    /** @todo Implement */
    var deleteUser: js.UndefOr[
        js.Function1[
          /* userId */ String, 
          js.Promise[Unit] | (Awaitable[js.UndefOr[AdapterUser | Null]])
        ]
      ] = js.undefined
    
    def getSessionAndUser(sessionToken: String): Awaitable[Session | Null]
    
    def getUser(id: String): Awaitable[AdapterUser | Null]
    
    /** Using the provider id and the id of the user for a specific account, get the user. */
    def getUserByAccount(providerAccountId: PickAdapterAccountprovide): Awaitable[AdapterUser | Null]
    
    def getUserByEmail(email: String): Awaitable[AdapterUser | Null]
    
    def linkAccount(account: AdapterAccount): js.Promise[Unit] | (Awaitable[js.UndefOr[AdapterAccount | Null]])
    
    /** @todo Implement */
    var unlinkAccount: js.UndefOr[
        js.Function1[
          /* providerAccountId */ PickAdapterAccountprovide, 
          js.Promise[Unit] | Awaitable[js.UndefOr[AdapterAccount]]
        ]
      ] = js.undefined
    
    def updateSession(session: PartialAdapterSessionPick): Awaitable[js.UndefOr[AdapterSession | Null]]
    
    def updateUser(user: PartialAdapterUser): Awaitable[AdapterUser]
    
    /**
      * Return verification token from the database
      * and delete it so it cannot be used again.
      */
    var useVerificationToken: js.UndefOr[js.Function1[/* params */ Identifier, Awaitable[VerificationToken | Null]]] = js.undefined
  }
  object DefaultAdapter {
    
    inline def apply(
      createSession: Expires => Awaitable[AdapterSession],
      createUser: OmitAdapterUserid => Awaitable[AdapterUser],
      deleteSession: String => js.Promise[Unit] | (Awaitable[js.UndefOr[AdapterSession | Null]]),
      getSessionAndUser: String => Awaitable[Session | Null],
      getUser: String => Awaitable[AdapterUser | Null],
      getUserByAccount: PickAdapterAccountprovide => Awaitable[AdapterUser | Null],
      getUserByEmail: String => Awaitable[AdapterUser | Null],
      linkAccount: AdapterAccount => js.Promise[Unit] | (Awaitable[js.UndefOr[AdapterAccount | Null]]),
      updateSession: PartialAdapterSessionPick => Awaitable[js.UndefOr[AdapterSession | Null]],
      updateUser: PartialAdapterUser => Awaitable[AdapterUser]
    ): DefaultAdapter = {
      val __obj = js.Dynamic.literal(createSession = js.Any.fromFunction1(createSession), createUser = js.Any.fromFunction1(createUser), deleteSession = js.Any.fromFunction1(deleteSession), getSessionAndUser = js.Any.fromFunction1(getSessionAndUser), getUser = js.Any.fromFunction1(getUser), getUserByAccount = js.Any.fromFunction1(getUserByAccount), getUserByEmail = js.Any.fromFunction1(getUserByEmail), linkAccount = js.Any.fromFunction1(linkAccount), updateSession = js.Any.fromFunction1(updateSession), updateUser = js.Any.fromFunction1(updateUser))
      __obj.asInstanceOf[DefaultAdapter]
    }
    
    extension [Self <: DefaultAdapter](x: Self) {
      
      inline def setCreateSession(value: Expires => Awaitable[AdapterSession]): Self = StObject.set(x, "createSession", js.Any.fromFunction1(value))
      
      inline def setCreateUser(value: OmitAdapterUserid => Awaitable[AdapterUser]): Self = StObject.set(x, "createUser", js.Any.fromFunction1(value))
      
      inline def setCreateVerificationToken(
        value: /* verificationToken */ VerificationToken => Awaitable[js.UndefOr[VerificationToken | Null]]
      ): Self = StObject.set(x, "createVerificationToken", js.Any.fromFunction1(value))
      
      inline def setCreateVerificationTokenUndefined: Self = StObject.set(x, "createVerificationToken", js.undefined)
      
      inline def setDeleteSession(value: String => js.Promise[Unit] | (Awaitable[js.UndefOr[AdapterSession | Null]])): Self = StObject.set(x, "deleteSession", js.Any.fromFunction1(value))
      
      inline def setDeleteUser(value: /* userId */ String => js.Promise[Unit] | (Awaitable[js.UndefOr[AdapterUser | Null]])): Self = StObject.set(x, "deleteUser", js.Any.fromFunction1(value))
      
      inline def setDeleteUserUndefined: Self = StObject.set(x, "deleteUser", js.undefined)
      
      inline def setGetSessionAndUser(value: String => Awaitable[Session | Null]): Self = StObject.set(x, "getSessionAndUser", js.Any.fromFunction1(value))
      
      inline def setGetUser(value: String => Awaitable[AdapterUser | Null]): Self = StObject.set(x, "getUser", js.Any.fromFunction1(value))
      
      inline def setGetUserByAccount(value: PickAdapterAccountprovide => Awaitable[AdapterUser | Null]): Self = StObject.set(x, "getUserByAccount", js.Any.fromFunction1(value))
      
      inline def setGetUserByEmail(value: String => Awaitable[AdapterUser | Null]): Self = StObject.set(x, "getUserByEmail", js.Any.fromFunction1(value))
      
      inline def setLinkAccount(value: AdapterAccount => js.Promise[Unit] | (Awaitable[js.UndefOr[AdapterAccount | Null]])): Self = StObject.set(x, "linkAccount", js.Any.fromFunction1(value))
      
      inline def setUnlinkAccount(
        value: /* providerAccountId */ PickAdapterAccountprovide => js.Promise[Unit] | Awaitable[js.UndefOr[AdapterAccount]]
      ): Self = StObject.set(x, "unlinkAccount", js.Any.fromFunction1(value))
      
      inline def setUnlinkAccountUndefined: Self = StObject.set(x, "unlinkAccount", js.undefined)
      
      inline def setUpdateSession(value: PartialAdapterSessionPick => Awaitable[js.UndefOr[AdapterSession | Null]]): Self = StObject.set(x, "updateSession", js.Any.fromFunction1(value))
      
      inline def setUpdateUser(value: PartialAdapterUser => Awaitable[AdapterUser]): Self = StObject.set(x, "updateUser", js.Any.fromFunction1(value))
      
      inline def setUseVerificationToken(value: /* params */ Identifier => Awaitable[VerificationToken | Null]): Self = StObject.set(x, "useVerificationToken", js.Any.fromFunction1(value))
      
      inline def setUseVerificationTokenUndefined: Self = StObject.set(x, "useVerificationToken", js.undefined)
    }
  }
  
  trait VerificationToken extends StObject {
    
    var expires: js.Date
    
    var identifier: String
    
    var token: String
  }
  object VerificationToken {
    
    inline def apply(expires: js.Date, identifier: String, token: String): VerificationToken = {
      val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerificationToken]
    }
    
    extension [Self <: VerificationToken](x: Self) {
      
      inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
}
