package typings
package phinLib.phinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhinFactory extends js.Object {
  def apply(
    optsOrUrl: (phinLib.phinMod.PhinNs.Options with (phinLib.Anon_False | phinLib.Anon_FalseJson | phinLib.Anon_Stream)) | phinLib.phinMod.PhinNs.Options
  ): js.Promise[phinLib.phinMod.PhinNs.BufferResponse] = js.native
  def apply(optsOrUrl: java.lang.String): js.Promise[phinLib.phinMod.PhinNs.BufferResponse] = js.native
  def defaults(defaultOpts: phinLib.phinMod.PhinNs.DefaultOpts with phinLib.Anon_Json): phinLib.Anon_OptsOrUrlAnonFalseJsonParseStream = js.native
  @JSName("defaults")
  def defaults_Anon_Opts(defaultOpts: phinLib.phinMod.PhinNs.DefaultOpts with phinLib.Anon_None): phinLib.Anon_Opts = js.native
  @JSName("defaults")
  def defaults_Anon_OptsOrUrl(defaultOpts: phinLib.phinMod.PhinNs.DefaultOpts with phinLib.Anon_FalseJson): phinLib.Anon_OptsOrUrl = js.native
  @JSName("defaults")
  def defaults_Anon_OptsOrUrlAnonFalse(defaultOpts: phinLib.phinMod.PhinNs.DefaultOpts with phinLib.Anon_False): phinLib.Anon_OptsOrUrlAnonFalse = js.native
  @JSName("defaults")
  def defaults_Anon_OptsOrUrlAnonFalseJsonParseStream1840517126(defaultOpts: phinLib.phinMod.PhinNs.DefaultOpts): phinLib.Anon_OptsOrUrlAnonFalseJsonParseStream1840517126 = js.native
  def promisified(
    optsOrUrl: (phinLib.phinMod.PhinNs.Options with (phinLib.Anon_False | phinLib.Anon_FalseJson | phinLib.Anon_Stream)) | phinLib.phinMod.PhinNs.Options
  ): js.Promise[phinLib.phinMod.PhinNs.BufferResponse] = js.native
  def promisified(optsOrUrl: java.lang.String): js.Promise[phinLib.phinMod.PhinNs.BufferResponse] = js.native
  def unpromisified(
    optsOrUrl: (phinLib.phinMod.PhinNs.Options with (phinLib.Anon_False | phinLib.Anon_FalseJson | phinLib.Anon_Stream)) | phinLib.phinMod.PhinNs.Options,
    cb: js.Function2[
      /* err */ js.Any, 
      (/* resp */ phinLib.AnyResponse) | (/* resp */ phinLib.phinMod.PhinNs.BufferResponse) | (/* resp */ phinLib.phinMod.PhinNs.JsonResponse) | (/* resp */ phinLib.phinMod.PhinNs.StreamResponse), 
      _
    ]
  ): scala.Unit = js.native
  def unpromisified(
    optsOrUrl: java.lang.String,
    cb: js.Function2[/* err */ js.Any, /* resp */ phinLib.phinMod.PhinNs.BufferResponse, _]
  ): scala.Unit = js.native
}

