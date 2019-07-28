package typings.pouchdbDashCore.PouchDBNs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.debug.debugMod.Debugger
import typings.debug.debugMod.IDebug
import typings.pouchdbDashCore.Anon_Name
import typings.pouchdbDashCore.EventEmitter
import typings.pouchdbDashCore.Fetch
import typings.pouchdbDashCore.PouchDBNs.ConfigurationNs.DatabaseConfiguration
import typings.pouchdbDashCore.pouchdbDashCoreStrings.created
import typings.pouchdbDashCore.pouchdbDashCoreStrings.destroyed
import typings.std.Request
import typings.std.RequestInit
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static
  extends EventEmitter
     with Instantiable0[Database[js.Object]]
     with Instantiable1[/* name */ String, Database[js.Object]]
     with Instantiable2[/* name */ String, /* options */ DatabaseConfiguration, Database[js.Object]] {
  @JSName("debug")
  var debug_Original: IDebug = js.native
  @JSName("fetch")
  var fetch_Original: Fetch = js.native
  var version: String = js.native
  def debug(namespace: String): Debugger = js.native
  /**
    * The returned object is a constructor function that works the same as PouchDB,
    * except that whenever you invoke it (e.g. with new), the given options will be passed in by default.
    */
  def defaults(options: DatabaseConfiguration): Anon_Name = js.native
  def fetch(url: String): js.Promise[Response] = js.native
  def fetch(url: String, opts: RequestInit): js.Promise[Response] = js.native
  def fetch(url: Request): js.Promise[Response] = js.native
  def fetch(url: Request, opts: RequestInit): js.Promise[Response] = js.native
  @JSName("on")
  def on_created(event: created, listener: js.Function1[/* dbName */ String, _]): this.type = js.native
  @JSName("on")
  def on_destroyed(event: destroyed, listener: js.Function1[/* dbName */ String, _]): this.type = js.native
  def plugin(plugin: Plugin): Static = js.native
}

