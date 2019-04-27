package typings
package passportDashDiscordLib.passportDashDiscordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-discord", JSImport.Namespace)
@js.native
class ^ protected () extends Strategy {
  def this(options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify discord.StrategyOptions */ js.Any, verify: js.Function4[
      /* accessToken */ java.lang.String, 
      /* refreshToken */ java.lang.String, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify discord.Profile */ /* profile */ js.Any, 
      /* done */ passportDashOauth2Lib.passportDashOauth2Mod.VerifyCallback, 
      scala.Unit
    ]) = this()
  // NOTE: A union of function types prevents contextual typing of arguments.
  // tslint:disable-next-line:unified-signatures
  def this(options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify discord.StrategyOptions */ /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify discord.StrategyOptionsWithRequest */ js.Any, verify: js.Function5[
      (/* req */ expressLib.expressMod.Request) | (/* accessToken */ java.lang.String), 
      /* refreshToken */ /* accessToken */ java.lang.String, 
      (/* params */ js.Any) | (/* refreshToken */ java.lang.String), 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify discord.Profile */ /* profile */ js.Any, 
      /* done */ passportDashOauth2Lib.passportDashOauth2Mod.VerifyCallback, 
      scala.Unit
    ]) = this()
  // NOTE: A union of function types prevents contextual typing of arguments.
  // tslint:disable-next-line:unified-signatures max-line-length
  def this(options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify discord.StrategyOptionsWithRequest */ js.Any, verify: js.Function6[
      /* req */ expressLib.expressMod.Request, 
      /* accessToken */ java.lang.String, 
      /* params */ js.Any, 
      /* refreshToken */ java.lang.String, 
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify discord.Profile */ /* profile */ js.Any, 
      /* done */ passportDashOauth2Lib.passportDashOauth2Mod.VerifyCallback, 
      scala.Unit
    ]) = this()
}

