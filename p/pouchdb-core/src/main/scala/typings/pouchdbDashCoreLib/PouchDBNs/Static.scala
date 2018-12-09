package typings
package pouchdbDashCoreLib.PouchDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static
  extends pouchdbDashCoreLib.EventEmitter
     with ScalablyTyped.runtime.Instantiable0[Database[js.Object]]
     with ScalablyTyped.runtime.Instantiable1[/* name */ java.lang.String, Database[js.Object]]
     with ScalablyTyped.runtime.Instantiable2[
      /* name */ java.lang.String, 
      /* options */ pouchdbDashCoreLib.PouchDBNs.ConfigurationNs.DatabaseConfiguration, 
      Database[js.Object]
    ] {
  @JSName("debug")
  var debug_Original: debugLib.debugMod.debugNs.IDebug = js.native
  @JSName("fetch")
  var fetch_Original: pouchdbDashCoreLib.Fetch = js.native
  var version: java.lang.String = js.native
  def debug(namespace: java.lang.String): debugLib.debugMod.debugNs.IDebugger = js.native
  /**
           * The returned object is a constructor function that works the same as PouchDB,
           * except that whenever you invoke it (e.g. with new), the given options will be passed in by default.
           */
  def defaults(options: pouchdbDashCoreLib.PouchDBNs.ConfigurationNs.DatabaseConfiguration): pouchdbDashCoreLib.Anon_Name = js.native
  def fetch(url: java.lang.String): js.Promise[stdLib.Response] = js.native
  def fetch(url: java.lang.String, opts: stdLib.RequestInit): js.Promise[stdLib.Response] = js.native
  def fetch(url: stdLib.Request): js.Promise[stdLib.Response] = js.native
  def fetch(url: stdLib.Request, opts: stdLib.RequestInit): js.Promise[stdLib.Response] = js.native
  @JSName("on")
  def on_created(
    event: pouchdbDashCoreLib.pouchdbDashCoreLibStrings.created,
    listener: js.Function1[/* dbName */ java.lang.String, _]
  ): this.type = js.native
  @JSName("on")
  def on_destroyed(
    event: pouchdbDashCoreLib.pouchdbDashCoreLibStrings.destroyed,
    listener: js.Function1[/* dbName */ java.lang.String, _]
  ): this.type = js.native
  def plugin(plugin: Plugin): Static = js.native
}

