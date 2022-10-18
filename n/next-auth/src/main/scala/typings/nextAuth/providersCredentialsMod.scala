package typings.nextAuth

import typings.nextAuth.anon.PickRequestInternalbodyqu
import typings.nextAuth.coreTypesMod.Awaitable
import typings.nextAuth.coreTypesMod.User
import typings.nextAuth.nextAuthStrings.Credentials
import typings.nextAuth.nextAuthStrings.credentials_
import typings.nextAuth.providersMod.CommonProviderOptions
import typings.std.Partial
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersCredentialsMod {
  
  @JSImport("next-auth/providers/credentials", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[C /* <: Record[String, CredentialInput] */](options: UserCredentialsConfig[C]): CredentialsConfig[C] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[CredentialsConfig[C]]
  
  trait CredentialInput extends StObject {
    
    var label: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object CredentialInput {
    
    inline def apply(): CredentialInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CredentialInput]
    }
    
    extension [Self <: CredentialInput](x: Self) {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  @js.native
  trait CredentialsConfig[C /* <: Record[String, CredentialInput] */]
    extends StObject
       with CommonProviderOptions {
    
    def authorize(credentials: Unit, req: PickRequestInternalbodyqu): Awaitable[User | Null] = js.native
    def authorize(credentials: Record[/* keyof C */ String, String], req: PickRequestInternalbodyqu): Awaitable[User | Null] = js.native
    
    var credentials: C = js.native
    
    @JSName("type")
    var type_CredentialsConfig: credentials_ = js.native
  }
  
  type CredentialsProvider = js.Function1[
    /* options */ Partial[CredentialsConfig[Record[String, CredentialInput]]], 
    CredentialsConfig[Record[String, CredentialInput]]
  ]
  
  type CredentialsProviderType = Credentials
  
  /* Inlined std.Partial<std.Omit<next-auth.next-auth/providers/credentials.CredentialsConfig<C>, 'options'>> & std.Pick<next-auth.next-auth/providers/credentials.CredentialsConfig<C>, 'authorize' | 'credentials'> */
  trait UserCredentialsConfig[C /* <: Record[String, CredentialInput] */] extends StObject {
    
    var authorize: (js.UndefOr[
        js.Function2[
          /* credentials */ js.UndefOr[Record[/* keyof C */ String, String]], 
          /* req */ PickRequestInternalbodyqu, 
          Awaitable[User | Null]
        ]
      ]) & (js.Function2[
        /* credentials */ js.UndefOr[Record[/* keyof C */ String, String]], 
        /* req */ PickRequestInternalbodyqu, 
        Awaitable[User | Null]
      ])
    
    var credentials: js.UndefOr[C] & C
    
    var id: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var `type`: js.UndefOr[credentials_] = js.undefined
  }
  object UserCredentialsConfig {
    
    inline def apply[C /* <: Record[String, CredentialInput] */](
      authorize: (js.UndefOr[
          js.Function2[
            /* credentials */ js.UndefOr[Record[/* keyof C */ String, String]], 
            /* req */ PickRequestInternalbodyqu, 
            Awaitable[User | Null]
          ]
        ]) & (js.Function2[
          /* credentials */ js.UndefOr[Record[/* keyof C */ String, String]], 
          /* req */ PickRequestInternalbodyqu, 
          Awaitable[User | Null]
        ]),
      credentials: js.UndefOr[C] & C
    ): UserCredentialsConfig[C] = {
      val __obj = js.Dynamic.literal(authorize = authorize.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserCredentialsConfig[C]]
    }
    
    extension [Self <: UserCredentialsConfig[?], C /* <: Record[String, CredentialInput] */](x: Self & UserCredentialsConfig[C]) {
      
      inline def setAuthorize(
        value: (js.UndefOr[
              js.Function2[
                /* credentials */ js.UndefOr[Record[/* keyof C */ String, String]], 
                /* req */ PickRequestInternalbodyqu, 
                Awaitable[User | Null]
              ]
            ]) & (js.Function2[
              /* credentials */ js.UndefOr[Record[/* keyof C */ String, String]], 
              /* req */ PickRequestInternalbodyqu, 
              Awaitable[User | Null]
            ])
      ): Self = StObject.set(x, "authorize", value.asInstanceOf[js.Any])
      
      inline def setCredentials(value: js.UndefOr[C] & C): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setType(value: credentials_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
