package typings.passportDashGithub.passportDashGithubMod

import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.passportDashOauth2.passportDashOauth2Mod.OAuth2Strategy
import typings.passportDashOauth2.passportDashOauth2Mod.VerifyCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("passport-github", JSImport.Namespace)
@js.native
class ^ protected () extends OAuth2Strategy {
  def this(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify github.StrategyOptions */ js.Any,
    verify: js.Function4[
        /* accessToken */ String, 
        /* refreshToken */ String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify github.Profile */ /* profile */ js.Any, 
        /* done */ VerifyCallback, 
        Unit
      ]
  ) = this()
  // NOTE: A union of function types prevents contextual typing of arguments.
  // tslint:disable-next-line:unified-signatures
  def this(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify github.StrategyOptions */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify github.StrategyOptionsWithRequest */ js.Any,
    verify: js.Function5[
        (/* req */ Request[ParamsDictionary]) | (/* accessToken */ String), 
        /* refreshToken */ /* accessToken */ String, 
        (/* params */ js.Any) | (/* refreshToken */ String), 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify github.Profile */ /* profile */ js.Any, 
        /* done */ VerifyCallback, 
        Unit
      ]
  ) = this()
  // NOTE: A union of function types prevents contextual typing of arguments.
  // tslint:disable-next-line:unified-signatures max-line-length
  def this(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify github.StrategyOptionsWithRequest */ js.Any,
    verify: js.Function6[
        /* req */ Request[ParamsDictionary], 
        /* accessToken */ String, 
        /* params */ js.Any, 
        /* refreshToken */ String, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify github.Profile */ /* profile */ js.Any, 
        /* done */ VerifyCallback, 
        Unit
      ]
  ) = this()
}

