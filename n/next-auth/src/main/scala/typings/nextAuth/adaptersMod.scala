package typings.nextAuth

import org.scalablytyped.runtime.Shortcut
import typings.nextAuth.anon.ModelMapping
import typings.nextAuth.anon.Models
import typings.nextAuth.anon.`0`
import typings.nextAuth.clientMod.SessionProvider
import typings.nextAuth.mod.AppOptions
import typings.nextAuth.mod.User
import typings.std.Date
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import typings.typeorm.entitySchemaEntitySchemaOptionsMod.EntitySchemaOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object adaptersMod extends Shortcut {
  
  @JSImport("next-auth/adapters", JSImport.Default)
  @js.native
  val default: Adapters = js.native
  
  trait Adapters extends StObject {
    
    var Default: js.Function2[
        /* typeOrmConfig */ ConnectionOptions, 
        /* options */ js.UndefOr[Models], 
        Adapter[js.Any, Profile, js.Any, js.Any]
      ]
    
    var Prisma: PrismaAdapter
    
    var TypeORM: TypeORMAdapter[js.Any, js.Any, js.Any, js.Any]
  }
  object Adapters {
    
    @JSImport("next-auth/adapters", "Adapters")
    @js.native
    val ^ : Adapters = js.native
    
    extension [Self <: Adapters](x: Self) {
      
      inline def setDefault(
        value: (/* typeOrmConfig */ ConnectionOptions, /* options */ js.UndefOr[Models]) => Adapter[js.Any, Profile, js.Any, js.Any]
      ): Self = StObject.set(x, "Default", js.Any.fromFunction2(value))
      
      inline def setPrisma(value: PrismaAdapter): Self = StObject.set(x, "Prisma", value.asInstanceOf[js.Any])
      
      inline def setTypeORM(value: TypeORMAdapter[js.Any, js.Any, js.Any, js.Any]): Self = StObject.set(x, "TypeORM", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("next-auth/adapters", "TypeORMAccountModel")
  @js.native
  class TypeORMAccountModel protected () extends StObject {
    def this(userId: Double, providerId: String, providerType: String, providerAccountId: String) = this()
    def this(
      userId: Double,
      providerId: String,
      providerType: String,
      providerAccountId: String,
      refreshToken: String
    ) = this()
    def this(
      userId: Double,
      providerId: String,
      providerType: String,
      providerAccountId: String,
      refreshToken: String,
      accessToken: String
    ) = this()
    def this(
      userId: Double,
      providerId: String,
      providerType: String,
      providerAccountId: String,
      refreshToken: Unit,
      accessToken: String
    ) = this()
    def this(
      userId: Double,
      providerId: String,
      providerType: String,
      providerAccountId: String,
      refreshToken: String,
      accessToken: String,
      accessTokenExpires: Date
    ) = this()
    def this(
      userId: Double,
      providerId: String,
      providerType: String,
      providerAccountId: String,
      refreshToken: String,
      accessToken: Unit,
      accessTokenExpires: Date
    ) = this()
    def this(
      userId: Double,
      providerId: String,
      providerType: String,
      providerAccountId: String,
      refreshToken: Unit,
      accessToken: String,
      accessTokenExpires: Date
    ) = this()
    def this(
      userId: Double,
      providerId: String,
      providerType: String,
      providerAccountId: String,
      refreshToken: Unit,
      accessToken: Unit,
      accessTokenExpires: Date
    ) = this()
    
    var accessToken: js.UndefOr[String] = js.native
    
    var accessTokenExpires: js.UndefOr[Date] = js.native
    
    var compoundId: String = js.native
    
    var providerAccountId: String = js.native
    
    var providerId: String = js.native
    
    var providerType: String = js.native
    
    var refreshToken: js.UndefOr[String] = js.native
    
    var userId: Double = js.native
  }
  
  @JSImport("next-auth/adapters", "TypeORMSessionModel")
  @js.native
  class TypeORMSessionModel protected ()
    extends StObject
       with Session {
    def this(userId: Double, expires: Date) = this()
    def this(userId: Double, expires: Date, sessionToken: String) = this()
    def this(userId: Double, expires: Date, sessionToken: String, accessToken: String) = this()
    def this(userId: Double, expires: Date, sessionToken: Unit, accessToken: String) = this()
    
    /* CompleteClass */
    var accessToken: String = js.native
    
    /* CompleteClass */
    var expires: Date = js.native
    
    /* CompleteClass */
    var sessionToken: String = js.native
    
    /* CompleteClass */
    var userId: String | Double | js.Object = js.native
    @JSName("userId")
    var userId_TypeORMSessionModel: Double = js.native
  }
  
  @JSImport("next-auth/adapters", "TypeORMUserModel")
  @js.native
  class TypeORMUserModel ()
    extends StObject
       with User {
    def this(name: String) = this()
    def this(name: String, email: String) = this()
    def this(name: Unit, email: String) = this()
    def this(name: String, email: String, image: String) = this()
    def this(name: String, email: Unit, image: String) = this()
    def this(name: Unit, email: String, image: String) = this()
    def this(name: Unit, email: Unit, image: String) = this()
    def this(name: String, email: String, image: String, emailVerified: Date) = this()
    def this(name: String, email: String, image: Unit, emailVerified: Date) = this()
    def this(name: String, email: Unit, image: String, emailVerified: Date) = this()
    def this(name: String, email: Unit, image: Unit, emailVerified: Date) = this()
    def this(name: Unit, email: String, image: String, emailVerified: Date) = this()
    def this(name: Unit, email: String, image: Unit, emailVerified: Date) = this()
    def this(name: Unit, email: Unit, image: String, emailVerified: Date) = this()
    def this(name: Unit, email: Unit, image: Unit, emailVerified: Date) = this()
    
    var emailVerified: js.UndefOr[Date] = js.native
    
    @JSName("email")
    var email_TypeORMUserModel: js.UndefOr[String] = js.native
    
    @JSName("image")
    var image_TypeORMUserModel: js.UndefOr[String] = js.native
    
    @JSName("name")
    var name_TypeORMUserModel: js.UndefOr[String] = js.native
  }
  
  @JSImport("next-auth/adapters", "TypeORMVerificationRequestModel")
  @js.native
  class TypeORMVerificationRequestModel protected ()
    extends StObject
       with VerificationRequest {
    def this(identifier: String, token: String, expires: Date) = this()
    
    /* CompleteClass */
    var expires: Date = js.native
    
    /* CompleteClass */
    var identifier: String = js.native
    
    /* CompleteClass */
    var token: String = js.native
  }
  
  trait Adapter[TUser /* <: User */, TProfile /* <: Profile */, TSession /* <: Session */, TVerificationRequest /* <: VerificationRequest */] extends StObject {
    
    def getAdapter(appOptions: AppOptions): js.Promise[AdapterInstance[TUser, TProfile, TSession, TVerificationRequest]]
  }
  object Adapter {
    
    inline def apply[TUser /* <: User */, TProfile /* <: Profile */, TSession /* <: Session */, TVerificationRequest /* <: VerificationRequest */](
      getAdapter: AppOptions => js.Promise[AdapterInstance[TUser, TProfile, TSession, TVerificationRequest]]
    ): Adapter[TUser, TProfile, TSession, TVerificationRequest] = {
      val __obj = js.Dynamic.literal(getAdapter = js.Any.fromFunction1(getAdapter))
      __obj.asInstanceOf[Adapter[TUser, TProfile, TSession, TVerificationRequest]]
    }
    
    extension [Self <: Adapter[?, ?, ?, ?], TUser /* <: User */, TProfile /* <: Profile */, TSession /* <: Session */, TVerificationRequest /* <: VerificationRequest */](x: Self & (Adapter[TUser, TProfile, TSession, TVerificationRequest])) {
      
      inline def setGetAdapter(value: AppOptions => js.Promise[AdapterInstance[TUser, TProfile, TSession, TVerificationRequest]]): Self = StObject.set(x, "getAdapter", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait AdapterInstance[TUser, TProfile, TSession, TVerificationRequest] extends StObject {
    
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
  
  trait EmailSessionProvider
    extends StObject
       with SessionProvider {
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    def sendVerificationRequest(params: SendVerificationRequestParams): js.Promise[Unit]
  }
  object EmailSessionProvider {
    
    inline def apply(
      callbackUrl: String,
      id: String,
      name: String,
      sendVerificationRequest: SendVerificationRequestParams => js.Promise[Unit],
      signinUrl: String,
      `type`: String
    ): EmailSessionProvider = {
      val __obj = js.Dynamic.literal(callbackUrl = callbackUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sendVerificationRequest = js.Any.fromFunction1(sendVerificationRequest), signinUrl = signinUrl.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailSessionProvider]
    }
    
    extension [Self <: EmailSessionProvider](x: Self) {
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setSendVerificationRequest(value: SendVerificationRequestParams => js.Promise[Unit]): Self = StObject.set(x, "sendVerificationRequest", js.Any.fromFunction1(value))
    }
  }
  
  trait PrismaAdapter extends StObject {
    
    def Adapter(config: ModelMapping): typings.nextAuth.adaptersMod.Adapter[js.Any, js.Any, js.Any, js.Any]
  }
  object PrismaAdapter {
    
    inline def apply(Adapter: ModelMapping => Adapter[js.Any, js.Any, js.Any, js.Any]): PrismaAdapter = {
      val __obj = js.Dynamic.literal(Adapter = js.Any.fromFunction1(Adapter))
      __obj.asInstanceOf[PrismaAdapter]
    }
    
    extension [Self <: PrismaAdapter](x: Self) {
      
      inline def setAdapter(value: ModelMapping => Adapter[js.Any, js.Any, js.Any, js.Any]): Self = StObject.set(x, "Adapter", js.Any.fromFunction1(value))
    }
  }
  
  trait Profile extends StObject {
    
    var email: String | Null
    
    var id: String
    
    var image: js.UndefOr[String | Null] = js.undefined
    
    var name: String
  }
  object Profile {
    
    inline def apply(id: String, name: String): Profile = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], email = null)
      __obj.asInstanceOf[Profile]
    }
    
    extension [Self <: Profile](x: Self) {
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailNull: Self = StObject.set(x, "email", null)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageNull: Self = StObject.set(x, "image", null)
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type Schema[T] = EntitySchemaOptions[T]
  
  trait SendVerificationRequestParams extends StObject {
    
    var baseUrl: String
    
    var identifier: String
    
    var provider: SessionProvider
    
    var token: String
    
    var url: String
  }
  object SendVerificationRequestParams {
    
    inline def apply(baseUrl: String, identifier: String, provider: SessionProvider, token: String, url: String): SendVerificationRequestParams = {
      val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[SendVerificationRequestParams]
    }
    
    extension [Self <: SendVerificationRequestParams](x: Self) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setProvider(value: SessionProvider): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Session extends StObject {
    
    var accessToken: String
    
    var expires: Date
    
    var sessionToken: String
    
    var userId: String | Double | js.Object
  }
  object Session {
    
    inline def apply(accessToken: String, expires: Date, sessionToken: String, userId: String | Double | js.Object): Session = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Session]
    }
    
    extension [Self <: Session](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setExpires(value: Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String | Double | js.Object): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * TODO: fix auto-type schema
    */
  @js.native
  trait TypeORMAdapter[A /* <: TypeORMAccountModel */, U /* <: TypeORMUserModel */, S /* <: TypeORMSessionModel */, VR /* <: TypeORMVerificationRequestModel */] extends StObject {
    
    def Adapter(typeOrmConfig: ConnectionOptions): typings.nextAuth.adaptersMod.Adapter[U, Profile, S, VR] = js.native
    def Adapter(typeOrmConfig: ConnectionOptions, options: `0`[A, U, S, VR]): typings.nextAuth.adaptersMod.Adapter[U, Profile, S, VR] = js.native
    
    var Models: typings.nextAuth.anon.User = js.native
  }
  
  trait VerificationRequest extends StObject {
    
    var expires: Date
    
    var identifier: String
    
    var token: String
  }
  object VerificationRequest {
    
    inline def apply(expires: Date, identifier: String, token: String): VerificationRequest = {
      val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[VerificationRequest]
    }
    
    extension [Self <: VerificationRequest](x: Self) {
      
      inline def setExpires(value: Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Adapters
  
  /* This means you don't have to write `default`, but can instead just say `adaptersMod.foo` */
  override def _to: Adapters = default
}
