package typings
package phinLib.phinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhinFactory extends js.Object {
  def apply(
    optsOrUrl: (Options with (phinLib.Anon_False | phinLib.Anon_FalseJson | phinLib.Anon_Stream)) | Options
  ): js.Promise[BufferResponse] = js.native
  def apply(optsOrUrl: java.lang.String): js.Promise[BufferResponse] = js.native
  def defaults(defaultOpts: DefaultOpts with phinLib.Anon_Json): phinLib.Anon_OptsOrUrlAnonFalseJsonParseStream = js.native
  @JSName("defaults")
  def defaults_Anon_Opts(defaultOpts: DefaultOpts with phinLib.Anon_None): phinLib.Anon_Opts = js.native
  @JSName("defaults")
  def defaults_Anon_OptsOrUrl(defaultOpts: DefaultOpts with phinLib.Anon_FalseJson): phinLib.Anon_OptsOrUrl = js.native
  @JSName("defaults")
  def defaults_Anon_OptsOrUrlAnonFalse(defaultOpts: DefaultOpts with phinLib.Anon_False): phinLib.Anon_OptsOrUrlAnonFalse = js.native
  @JSName("defaults")
  def defaults_Anon_OptsOrUrlAnonFalseJsonParseStream1840517126(defaultOpts: DefaultOpts): phinLib.Anon_OptsOrUrlAnonFalseJsonParseStream1840517126 = js.native
  def promisified(
    optsOrUrl: (Options with (phinLib.Anon_False | phinLib.Anon_FalseJson | phinLib.Anon_Stream)) | Options
  ): js.Promise[BufferResponse] = js.native
  def promisified(optsOrUrl: java.lang.String): js.Promise[BufferResponse] = js.native
  def unpromisified(
    optsOrUrl: (Options with (phinLib.Anon_False | phinLib.Anon_FalseJson | phinLib.Anon_Stream)) | Options,
    cb: js.Function2[
      /* err */ js.Any, 
      (/* resp */ phinLib.AnyResponse) | (/* resp */ BufferResponse) | (/* resp */ JsonResponse) | (/* resp */ StreamResponse), 
      _
    ]
  ): scala.Unit = js.native
  def unpromisified(optsOrUrl: java.lang.String, cb: js.Function2[/* err */ js.Any, /* resp */ BufferResponse, _]): scala.Unit = js.native
}

