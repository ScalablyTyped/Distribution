package typings.nextAuth.adaptersMod

import typings.nextAuth.clientMod.SessionProvider
import typings.nextAuth.mod.AppOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdapterInstance[TUser, TProfile, TSession, TVerificationRequest] extends js.Object {
  
  def createSession(user: TUser): js.Promise[TSession] = js.native
  
  def createUser(profile: TProfile): js.Promise[TUser] = js.native
  
  var createVerificationRequest: js.UndefOr[
    js.Function6[
      /* email */ String, 
      /* url */ String, 
      /* token */ String, 
      /* secret */ String, 
      /* provider */ EmailSessionProvider, 
      /* options */ AppOptions, 
      js.Promise[TVerificationRequest]
    ]
  ] = js.native
  
  def deleteSession(sessionToken: String): js.Promise[Unit] = js.native
  
  var deleteVerificationRequest: js.UndefOr[
    js.Function4[
      /* email */ String, 
      /* verificationToken */ String, 
      /* secret */ String, 
      /* provider */ SessionProvider, 
      js.Promise[Unit]
    ]
  ] = js.native
  
  def getSession(sessionToken: String): js.Promise[TSession | Null] = js.native
  
  def getUser(id: String): js.Promise[TUser | Null] = js.native
  
  def getUserByEmail(email: String): js.Promise[TUser | Null] = js.native
  
  def getUserByProviderAccountId(providerId: String, providerAccountId: String): js.Promise[TUser | Null] = js.native
  
  var getVerificationRequest: js.UndefOr[
    js.Function4[
      /* email */ String, 
      /* verificationToken */ String, 
      /* secret */ String, 
      /* provider */ SessionProvider, 
      js.Promise[TVerificationRequest | Null]
    ]
  ] = js.native
  
  def linkAccount(
    userId: String,
    providerId: String,
    providerType: String,
    providerAccountId: String,
    refreshToken: String,
    accessToken: String,
    accessTokenExpires: Double
  ): js.Promise[Unit] = js.native
  
  def updateSession(session: TSession): js.Promise[TSession] = js.native
  def updateSession(session: TSession, force: Boolean): js.Promise[TSession] = js.native
  
  def updateUser(user: TUser): js.Promise[TUser] = js.native
}
