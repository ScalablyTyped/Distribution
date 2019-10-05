package typings.phin.phinMod

import typings.phin.Anon_False
import typings.phin.Anon_FalseJson
import typings.phin.Anon_Json
import typings.phin.Anon_None
import typings.phin.Anon_Stream
import typings.phin.Fn_Opts
import typings.phin.Fn_OptsOrUrl
import typings.phin.Fn_OptsOrUrlAnonFalse
import typings.phin.Fn_OptsOrUrlAnonFalseJsonParseStream
import typings.phin.Fn_OptsOrUrlAnonFalseJsonParseStream24331797
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhinFactory extends js.Object {
  def apply(optsOrUrl: (Options with (Anon_False | Anon_FalseJson | Anon_Stream)) | Options): js.Promise[BufferResponse] = js.native
  def apply(optsOrUrl: String): js.Promise[BufferResponse] = js.native
  def defaults(defaultOpts: DefaultOpts with Anon_FalseJson): Fn_OptsOrUrl = js.native
  @JSName("defaults")
  def defaults_Fn_Opts(defaultOpts: DefaultOpts with Anon_None): Fn_Opts = js.native
  @JSName("defaults")
  def defaults_Fn_OptsOrUrlAnonFalse(defaultOpts: DefaultOpts with Anon_False): Fn_OptsOrUrlAnonFalse = js.native
  @JSName("defaults")
  def defaults_Fn_OptsOrUrlAnonFalseJsonParseStream(defaultOpts: DefaultOpts with Anon_Json): Fn_OptsOrUrlAnonFalseJsonParseStream = js.native
  @JSName("defaults")
  def defaults_Fn_OptsOrUrlAnonFalseJsonParseStream24331797(defaultOpts: DefaultOpts): Fn_OptsOrUrlAnonFalseJsonParseStream24331797 = js.native
  def promisified(optsOrUrl: (Options with (Anon_False | Anon_FalseJson | Anon_Stream)) | Options): js.Promise[BufferResponse] = js.native
  def promisified(optsOrUrl: String): js.Promise[BufferResponse] = js.native
  def unpromisified(
    optsOrUrl: (Options with (Anon_False | Anon_FalseJson | Anon_Stream)) | Options,
    cb: js.Function2[
      /* err */ js.Any, 
      (/* resp */ AnyResponse) | (/* resp */ BufferResponse) | (/* resp */ JsonResponse) | (/* resp */ StreamResponse), 
      _
    ]
  ): Unit = js.native
  def unpromisified(optsOrUrl: String, cb: js.Function2[/* err */ js.Any, /* resp */ BufferResponse, _]): Unit = js.native
}

