package typings.passportDashDiscord.passportDashDiscordMod

import typings.express.expressMod.Request
import typings.passportDashOauth2.passportDashOauth2Mod.VerifyCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-discord", JSImport.Namespace)
@js.native
class ^ protected () extends Strategy {
  def this(
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify discord.StrategyOptions */ js.Any,
    verify: js.Function4[
        /* accessToken */ String, 
        /* refreshToken */ String, 
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify discord.Profile */ /* profile */ js.Any, 
        /* done */ VerifyCallback, 
        Unit
      ]
  ) = this()
  // NOTE: A union of function types prevents contextual typing of arguments.
  // tslint:disable-next-line:unified-signatures
  def this(
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify discord.StrategyOptions */ /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify discord.StrategyOptionsWithRequest */ js.Any,
    verify: js.Function5[
        (/* req */ Request) | (/* accessToken */ String), 
        /* refreshToken */ /* accessToken */ String, 
        (/* params */ js.Any) | (/* refreshToken */ String), 
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify discord.Profile */ /* profile */ js.Any, 
        /* done */ VerifyCallback, 
        Unit
      ]
  ) = this()
  // NOTE: A union of function types prevents contextual typing of arguments.
  // tslint:disable-next-line:unified-signatures max-line-length
  def this(
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify discord.StrategyOptionsWithRequest */ js.Any,
    verify: js.Function6[
        /* req */ Request, 
        /* accessToken */ String, 
        /* params */ js.Any, 
        /* refreshToken */ String, 
        /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify discord.Profile */ /* profile */ js.Any, 
        /* done */ VerifyCallback, 
        Unit
      ]
  ) = this()
}

