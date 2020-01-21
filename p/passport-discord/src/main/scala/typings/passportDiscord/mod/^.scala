package typings.passportDiscord.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.passportOauth2.mod.VerifyCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-discord", JSImport.Namespace)
@js.native
class ^ protected () extends Strategy {
  def this(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify discord.StrategyOptions */ js.Any,
    verify: js.Function4[
        /* accessToken */ String, 
        /* refreshToken */ String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify discord.Profile */ /* profile */ js.Any, 
        /* done */ VerifyCallback, 
        Unit
      ]
  ) = this()
  // NOTE: A union of function types prevents contextual typing of arguments.
  // tslint:disable-next-line:unified-signatures
  def this(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify discord.StrategyOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify discord.StrategyOptionsWithRequest */ js.Any,
    verify: js.Function5[
        (/* req */ Request_[ParamsDictionary]) | (/* accessToken */ String), 
        /* refreshToken */ /* accessToken */ String, 
        (/* params */ js.Any) | (/* refreshToken */ String), 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify discord.Profile */ /* profile */ js.Any, 
        /* done */ VerifyCallback, 
        Unit
      ]
  ) = this()
  // NOTE: A union of function types prevents contextual typing of arguments.
  // tslint:disable-next-line:unified-signatures max-line-length
  def this(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify discord.StrategyOptionsWithRequest */ js.Any,
    verify: js.Function6[
        /* req */ Request_[ParamsDictionary], 
        /* accessToken */ String, 
        /* params */ js.Any, 
        /* refreshToken */ String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify discord.Profile */ /* profile */ js.Any, 
        /* done */ VerifyCallback, 
        Unit
      ]
  ) = this()
}

